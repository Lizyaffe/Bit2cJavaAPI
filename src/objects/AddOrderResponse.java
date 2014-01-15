package objects;

public class AddOrderResponse {
	private OrderResponse OrderResponse;
	
	private od NewOrder;
	
	public OrderResponse getOrderResponse() {
		return OrderResponse;
	}
	public void setOrderResponse(OrderResponse orderResponse) {
		OrderResponse = orderResponse;
	}
	
	public od getNewOrder() {
		return NewOrder;
	}
	public void setNewOrder(od newOrder) {
		NewOrder = newOrder;
	}
}
