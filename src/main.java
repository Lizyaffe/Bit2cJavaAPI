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
        String key = "e0e86808-5616-4d34-a506-5884b2fe47c7";
        String secret = "fead327fd3d40eca9ceec09d95cc464add75f22e434306fb7fa1b47de3c07149";
        Bit2cClient client = new Bit2cClient(url, key, secret);

        ArrayList<ExchangesTrade> trades = client.GetTrades(PairType.LtcBtc, null, null);
        System.out.println(trades.get(2).getTid());
        Ticker ticker = client.GetTicker(PairType.LtcBtc);
        System.out.println(ticker.getAv());
        OrderBook data = client.GetOrderBook(PairType.BtcNis);
        System.out.println(data.getAsks().get(0).get(0));

        CheckoutLinkModel model = new CheckoutLinkModel(0.123, "Mysale", CoinType.BTC, "", "", true);
        CheckoutResponse checkout_button_id = client.CreateCheckout(model);
        System.out.println(checkout_button_id.getError());
        UserBalance data1 = client.Balance();
        System.out.println(data1.getBalanceNIS());
        AddOrderResponse data2 = client.AddOrder(new OrderData(1, true ,PairType.BtcNis ,1000 ,1000));
        System.out.println(data2.getNewOrder().isT());
        Orders data3 = client.MyOrders(PairType.BtcNis);
        System.out.println(data3.getAsks().size());
        if (data3.getBids().size() > 0 ) client.CancelOrder(data3.getBids().get(0).getId());
        ArrayList<AccountRaw> data4 = client.AccountHistory(null, null);
        System.out.println(data4.size());
	}
}
