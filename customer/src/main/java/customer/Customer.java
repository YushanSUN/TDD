package customer;

import exception.InvalidPasswordException;

public class Customer {
	private String id;
	private String password;
	
	public Customer(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public boolean matchPassword(final String password1) throws InvalidPasswordException {
		if (password1 == null || "".equals(password1))
		throw new InvalidPasswordException();
		// The password entered by the customer is not the same stored in database
		return password1.equals(getPassword());
	}
	
	public String getPassword(){
		return password;
	}
	
	
}
