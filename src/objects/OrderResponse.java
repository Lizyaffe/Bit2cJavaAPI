package objects;

public class OrderResponse {
	private boolean HasError;
    private String Error;
    
	public boolean isHasError() {
		return HasError;
	}
	public void setHasError(boolean hasError) {
		HasError = hasError;
	}
	
	public String getError() {
		return Error;
	}
	public void setError(String error) {
		Error = error;
	}
}
