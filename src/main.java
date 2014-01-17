import java.util.ArrayList;

import objects.AccountRaw;
import objects.AddOrderResponse;
import objects.CheckoutLinkModel;
import objects.CheckoutResponse;
import objects.CoinType;
import objects.ExchangesTrade;
import objects.OrderBook;
import objects.OrderData;
import objects.Orders;
import objects.PairType;
import objects.Ticker;
import objects.UserBalance;
import client.Bit2cClient;

public class main {
	public static void main(String[] args) {
		String url = "https://www.bit2c.co.il/"; // local -  http://localhost:53825/
        String key = "5f5a6554-e4d9-405b-a638-394fca5521af";
        String secret = "fac0edac8c9240712583239ee3a3661ba2304f44a7043de4fe27ce565ff7fc82";
        Bit2cClient client = new Bit2cClient(url, key, secret);

        //public calls no need for "secret" or Key
        ArrayList<ExchangesTrade> trades = client.GetTrades(PairType.LtcBtc, null, null);
        System.out.println(trades.get(2).getTid());
        Ticker ticker = client.GetTicker(PairType.LtcBtc);
        System.out.println(ticker.getAv());
//        OrderBook data = client.GetOrderBook(PairType.BtcNis);
//
//        CheckoutLinkModel model = new CheckoutLinkModel(0.123, "Mysale", CoinType.BTC, null, null, true);
//        CheckoutResponse checkout_button_id = client.CreateCheckout(model);
//
//        UserBalance data1 = client.Balance();
//        AddOrderResponse data2 = client.AddOrder(new OrderData(1, true ,PairType.BtcNis ,1000 ,1000));
//        Orders data3 = client.MyOrders(PairType.BtcNis);
//        client.CancelOrder(data3.getBids().get(0).getId());
//        ArrayList<AccountRaw> data4 = client.AccountHistory(null, null);
	}
}
