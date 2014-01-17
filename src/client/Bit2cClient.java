package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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

public class Bit2cClient {
	private String Key;
    private String secret;
    private int _nonce;
    private String nonce; // TODO - create get function
    private String URL; // TODO - create get and set function
    private HttpURLConnection client; // TODO - create get and set function

    private String GetQueryString(Object obj)
    {
//        var properties = from p in obj.GetType().GetProperties()
//                         where p.GetValue(obj, null) != null
//                         select p.Name + "=" + p.GetValue(obj, null).ToString();
//
//        return String.Join("&", properties.ToArray());
    	return null;
    }

//    private T Deserialize<T>(string json)
//    {
//        T obj = Activator.CreateInstance<T>();
//        MemoryStream ms = new MemoryStream(Encoding.Unicode.GetBytes(json));
//        DataContractJsonSerializer serializer = new DataContractJsonSerializer(obj.GetType());
//        obj = (T)serializer.ReadObject(ms);
//        ms.Close();
//        return obj;
//    }

    private static String ComputeHash(String secret, String message)
    {
//        var key = Encoding.ASCII.GetBytes(secret.ToUpper());
//        string hashString;
//
//        using (var hmac = new HMACSHA512(key))
//        {
//            var hash = hmac.ComputeHash(Encoding.ASCII.GetBytes(message));
//            hashString = Convert.ToBase64String(hash);
//        }
//
//        return hashString;
    	return null;
    }

    public Bit2cClient(String url, String key, String secret)
    {
    	try {
			this.URL = url;
			this.Key = key; 
			this.secret = secret;
			this.client = (HttpURLConnection)(new URL(this.URL)).openConnection();
			this.client.addRequestProperty("key", key);
			_nonce = (int)System.currentTimeMillis() / 1000;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
    	ArrayList<OrderBook> result = new ArrayList<OrderBook>();
    	
    	try {
    		this.client = (HttpURLConnection)(new URL(this.URL + "Exchanges/" + Pair.toString() + "/trades.json")).openConnection();
			this.client.getContent();
			BufferedReader streamReader = new BufferedReader(new InputStreamReader(this.client.getInputStream(), "UTF-8")); 
		    StringBuilder responseStrBuilder = new StringBuilder();

		    String inputStr = "";
		    while ((inputStr = streamReader.readLine()) != null)
		        responseStrBuilder.append(inputStr);
		    
		    Gson gson = new Gson();
//		    ArrayList<LinkedTreeMap> fromJSON = gson.fromJson(responseStrBuilder.toString(), ArrayList.class);
//		    for (int i = 0; i < fromJSON.size(); i++) {
//		    	result.add(new OrderBook((Double)fromJSON.get(i).get("date"), (Double)fromJSON.get(i).get("price"), (Double)fromJSON.get(i).get("amount"), (Double)fromJSON.get(i).get("tid")));
//			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }

    public AddOrderResponse AddOrder(OrderData data)
    {
//        try
//        {
//            data.Amount = decimal.Round(data.Amount, 4);
//            var json = Newtonsoft.Json.JsonConvert.SerializeObject(data);
//            string qString = GetQueryString(data) + "&nonce=" + nonce;
//            var sign = ComputeHash(this.secret,qString);
//            var url = URL + "Order/AddOrder"; 
//            string result = Query(qString, url, Key, sign,"POST");
//            AddOrderResponse response = Deserialize<AddOrderResponse>(result);
//            return response;
//        }
//        catch (Exception ex)
//        {
//            throw;
//        }
    	return null;
    }

    public Orders MyOrders(PairType pair)
    {
//        try
//        {
//            string qString = "nonce=" + nonce;
//            var sign = ComputeHash(this.secret, qString);
//            var url = URL + "Order/MyOrders";
//            string result = Query(qString, url, Key, sign, "POST");
//            Orders response = Deserialize<Orders>(result);
//            return response;
//        }
//        catch (Exception ex)
//        {
//            throw;
//        }
    	return null;
    }

    public void ClearMyOrders(PairType pair)
    {
//        try
//        {
//            var response2 = client.DownloadString(URL + "Order/MyOrders?pair=" + pair.ToString());
//            Orders myOrders = Deserialize<Orders>(response2);
//            foreach (var item in myOrders.asks)
//            {
//                if (item.pair == pair)
//                {
//                    CancelOrder(item.id);
//                }
//            }
//            foreach (var item in myOrders.bids)
//            {
//                if (item.pair == pair)
//                {
//                    CancelOrder(item.id);
//                }
//            }
//        }
//        catch (Exception ex)
//        {
//            
//            throw;
//        }
    }

    public UserBalance Balance()
    {
//        try
//        {
//            string qString = "nonce=" + nonce;
//            var sign = ComputeHash(this.secret, qString);
//            var url = URL + "Account/Balance";
//            string result = Query(qString, url, Key, sign, "POST");
//            UserBalance response = Deserialize<UserBalance>(result);
//            return response;
//        }
//        catch (Exception ex)
//        {
//            
//            throw;
//        }
    	return null;
    }

    public ArrayList<AccountRaw> AccountHistory(Date fromTime, Date toTime)
    {
//        try
//        {
//            string ft = fromTime.HasValue ? fromTime.Value.ToString("dd/MM/yyyy HH:mm:ss.fff") : null;
//            string tt = toTime.HasValue ? toTime.Value.ToString("dd/MM/yyyy HH:mm:ss.fff") : null;
//            string qString = string.Format("fromTime={0}&toTime={1}&nonce={2}",ft,tt,nonce);
//            var sign = ComputeHash(this.secret, qString);
//            var url = URL + "Order/AccountHistory"; 
//            string result = Query(qString, url, Key, sign, "POST");
//            List<AccountRaw> response = Deserialize<List<AccountRaw>>(result);
//            return response;
//        }
//        catch (Exception ex)
//        {
//            
//            throw;
//        }
    	return null;
    }
    public void CancelOrder(double id)
    {
//        try
//        {
//            string qString = "id=" + id.ToString() + "&nonce=" + nonce;
//            var sign = ComputeHash(this.secret, qString);
//            var url = URL + "Order/CancelOrder";
//            string result = Query(qString, url, Key, sign, "POST");
//            OrderResponse response = Deserialize<OrderResponse>(result);
//        }
//        catch (Exception ex)
//        {
//            
//            throw;
//        }
    }

    public CheckoutResponse CreateCheckout(CheckoutLinkModel data)
    {
//        try
//        {
//            var json = Newtonsoft.Json.JsonConvert.SerializeObject(data);
//            string qString = GetQueryString(data) + "&nonce=" + nonce;
//            var sign = ComputeHash(this.secret, qString);
//            var url = URL + "Merchant/CreateCheckout";
//            string result = Query(qString, url, Key, sign, "POST");
//            CheckoutResponse response = Deserialize<CheckoutResponse>(result);
//            return response;
//        }
//        catch (Exception ex)
//        {
//            throw;
//        }
    	return null;
    }

    private String Query(String qString, String url, String key, String sign, String method)
    {
//        var data = Encoding.ASCII.GetBytes(qString);
//
//        var request = WebRequest.Create(new Uri(url)) as HttpWebRequest;
//        if (request == null)
//            throw new Exception("Non HTTP WebRequest");
//
//        request.Method = method;
//        request.Timeout = 15000;
//        request.ContentType = "application/x-www-form-urlencoded";
//        request.ContentLength = data.Length;
//
//        request.Headers.Add("Key", key);
//        request.Headers.Add("Sign", sign);
//        var reqStream = request.GetRequestStream();
//        reqStream.Write(data, 0, data.Length);
//        reqStream.Close();
//
//        var response = request.GetResponse();
//        var resStream = response.GetResponseStream();
//        var resStreamReader = new StreamReader(resStream);
//        var resString = resStreamReader.ReadToEnd();
//
//        return resString;
    	return null;
    }
}
