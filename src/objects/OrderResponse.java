package objects;

public class OrderResponse {
	private boolean hasError;
    private String error;
    
    public OrderResponse(boolean hasError, String error) {
    	this.hasError = hasError;
    	this. error = error;
    }
    
	public boolean isHasError() {
		return hasError;
	}
	
	public String getError() {
		return error;
	}
}
