package objects;

import java.util.UUID;

public class CheckoutResponse {
	private String error;
    private UUID id;
    
    public CheckoutResponse(String error, UUID id) {
		this.error = error;
		this.id = id;
	}
    
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
}
