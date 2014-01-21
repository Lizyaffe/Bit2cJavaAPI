package objects;

public class AddOrderResponse {
	private OrderResponse OrderResponse;
	private od NewOrder;
	
	public AddOrderResponse(OrderResponse OrderResponse, od NewOrder) {
		this.OrderResponse = OrderResponse;
		this.NewOrder = NewOrder;
	}
	
	public OrderResponse getOrderResponse() {
		return OrderResponse;
	}
	
	public od getNewOrder() {
		return NewOrder;
	}
}
