package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import objects.AccountRaw;
import objects.AddOrderResponse;
import objects.CheckoutLinkModel;
import objects.CheckoutResponse;
import objects.ExchangesTrade;
import objects.OrderBook;
import objects.OrderData;
import objects.Orders;
import objects.PairType;
import objects.Ticker;
import objects.UserBalance;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Bit2cClient {
	private String Key;
    private String secret;
    private long nonce = 0;
    private String URL;
    private HttpURLConnection client; // TODO - create get and set function

    public Bit2cClient(String url, String key, String secret)
    {
    	this.URL = url;
		this.Key = key; 
		this.secret = secret;
    }

    public ArrayList<ExchangesTrade> GetTrades(PairType Pair, Long since, Double date)
    {
    	ArrayList<ExchangesTrade> result = new ArrayList<ExchangesTrade>();
    	
    	try {
    		this.client = (HttpURLConnection)(new URL(this.URL + "Exchanges/" + Pair.toString() + "/trades.json")).openConnection();
			this.client.getContent();
			BufferedReader streamReader = new BufferedReader(new InputStreamReader(this.client.getInputStream(), "UTF-8")); 
		    StringBuilder responseStrBuilder = new StringBuilder();

		    String inputStr = "";
		    while ((inputStr = streamReader.readLine()) != null)
		        responseStrBuilder.append(inputStr);
		    
		    Gson gson = new Gson();
		    ArrayList<LinkedTreeMap> fromJSON = gson.fromJson(responseStrBuilder.toString(), ArrayList.class);
		    for (int i = 0; i < fromJSON.size(); i++) {
		    	result.add(new ExchangesTrade((Double)fromJSON.get(i).get("date"), (Double)fromJSON.get(i).get("price"), (Double)fromJSON.get(i).get("amount"), (Double)fromJSON.get(i).get("tid")));
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return result;
    }

    public Ticker GetTicker(PairType Pair)
    {
    	try {
    		this.client = (HttpURLConnection)(new URL(this.URL + "Exchanges/" + Pair.toString() + "/Ticker.json")).openConnection();
			this.client.getContent();
			BufferedReader streamReader = new BufferedReader(new InputStreamReader(this.client.getInputStream(), "UTF-8")); 
		    StringBuilder responseStrBuilder = new StringBuilder();

		    String inputStr = "";
		    while ((inputStr = streamReader.readLine()) != null)
		        responseStrBuilder.append(inputStr);
		    
		    Gson gson = new Gson();
		    Ticker fromJSON = gson.fromJson(responseStrBuilder.toString(), Ticker.class);
		    return fromJSON;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }

    public OrderBook GetOrderBook(PairType Pair)
    {
    	OrderBook result = new OrderBook();
    	
    	try {
    		this.client = (HttpURLConnection)(new URL(this.URL + "Exchanges/" + Pair.toString() + "/orderbook.json")).openConnection();
			this.client.getContent();
			BufferedReader streamReader = new BufferedReader(new InputStreamReader(this.client.getInputStream(), "UTF-8")); 
		    StringBuilder responseStrBuilder = new StringBuilder();

		    String inputStr = "";
		    while ((inputStr = streamReader.readLine()) != null)
		        responseStrBuilder.append(inputStr);
		    
		    Gson gson = new Gson();
		    LinkedTreeMap<String, ArrayList<ArrayList<Double>>> data = gson.fromJson(responseStrBuilder.toString(), LinkedTreeMap.class);
		    result = new OrderBook(data.get("asks"), data.get("bids"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return result;
    }

    public AddOrderResponse AddOrder(OrderData data)
    {
    	HashMap<String, String> params = new HashMap<String, String>();
    	params.put("Amount", String.valueOf(data.amount));
    	params.put("IsBid", String.valueOf(data.isBid));
    	params.put("Pair", String.valueOf(data.pair));
    	params.put("Price", String.valueOf(data.price));
    	params.put("Total", String.valueOf(data.total));
    	String response = Query("Order/AddOrder", params);
    	
    	Gson gson = new Gson();
    	AddOrderResponse fromJSON = gson.fromJson(response, AddOrderResponse.class);
    	return fromJSON;
    }

    public Orders MyOrders(PairType pair)
    {
    	HashMap<String, String> params = new HashMap<String, String>();
    	params.put("pair", String.valueOf(pair));
    	String response = Query("Order/MyOrders", params);
    	
    	Gson gson = new Gson();
    	Orders fromJSON = gson.fromJson(response, Orders.class);
    	return fromJSON;
    }

    public UserBalance Balance()
    {
    	String data = Query("Account/Balance", new HashMap<String, String>());
    	
    	Gson gson = new Gson();
		UserBalance fromJSON = gson.fromJson(data, UserBalance.class);
		return fromJSON;
    }

    public ArrayList<AccountRaw> AccountHistory(Date fromTime, Date toTime)
    {
    	HashMap<String, String> params = new HashMap<String, String>();
    	params.put("fromTime", String.valueOf(fromTime));
    	params.put("toTime", String.valueOf(toTime));
    	String response = Query("Order/AccountHistory", params);
    	
    	Gson gson = new Gson();
    	ArrayList<AccountRaw> fromJSON = gson.fromJson(response, ArrayList.class);
    	return fromJSON;
    }
    
    public CheckoutResponse CancelOrder(double id)
    {
    	HashMap<String, String> params = new HashMap<String, String>();
    	params.put("id", String.valueOf(id));
    	String response = Query("Order/CancelOrder", params);
    	
    	Gson gson = new Gson();
    	CheckoutResponse fromJSON = gson.fromJson(response, CheckoutResponse.class);
    	return fromJSON;
    }

    public CheckoutResponse CreateCheckout(CheckoutLinkModel data)
    {
    	HashMap<String, String> params = new HashMap<String, String>();
    	params.put("Price", String.valueOf(data.price));
    	params.put("Description", String.valueOf(data.description));
    	params.put("CoinType", String.valueOf(data.coinType));
    	params.put("ReturnURL", String.valueOf(data.returnURL));
    	params.put("CancelURL", String.valueOf(data.cancelURL));
    	params.put("NotifyByEmail", String.valueOf(data.notifyByEmail));
    	String response = Query("Merchant/CreateCheckout", params);
    	
    	Gson gson = new Gson();
    	CheckoutResponse fromJSON = gson.fromJson(response, CheckoutResponse.class);
		return fromJSON;
    }
    
    public String Query(String path, HashMap<String, String> args) {
        try {
        	this.nonce = this.nonce != 0 ? nonce + 1 : System.currentTimeMillis()/1000;
            args.put("nonce", String.valueOf(nonce));
            String post_data = this.buildQueryString(args);
            Mac mac = Mac.getInstance("HmacSHA512");
            mac.init(new SecretKeySpec(this.secret.toUpperCase().getBytes(), "HmacSHA512"));
            String signature = (new BASE64Encoder()).encode(mac.doFinal(post_data.getBytes())).replaceAll("\r\n", "");
            
            // build URL
            URL queryUrl = new URL(this.URL + path);
            
            // create connection
            HttpURLConnection connection = (HttpURLConnection)queryUrl.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Timeout", "15000");
            connection.setRequestProperty("content-type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("content-length", String.valueOf(post_data.length()));
            connection.setDoOutput(true);
            connection.setRequestProperty("Key", this.Key);
            connection.setRequestProperty("Sign", signature);
 
//            System.out.println("URL: " + queryUrl);
//            System.out.println("Data: " + post_data);
//            System.out.println("Key: " + this.Key);
//            System.out.println("Sign: " + signature);
            
            // write post
            connection.getOutputStream().write(post_data.getBytes());
 
            // read info
            byte buffer[] = new byte[16384];
            int len = connection.getInputStream().read(buffer, 0, 16384);
            return new String(buffer, 0, len, "UTF-8");
        } catch (Exception ex) {
        	System.out.println(ex);
        }
        return "";
    }
 
    protected String buildQueryString(HashMap<String, String> args) {
        String result = new String();
        for (String hashkey : args.keySet()) {
            if (result.length() > 0) result += '&';
            try {
                result += URLEncoder.encode(hashkey, "UTF-8") + "="
                        + URLEncoder.encode(args.get(hashkey), "UTF-8");
            } catch (Exception ex) {
//                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
}
