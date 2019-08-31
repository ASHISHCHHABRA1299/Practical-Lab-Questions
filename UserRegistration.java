package exception;

public class UserRegistration {
	String username;
	String userCountry;

	void RegisterUser(String username, String userCountry) throws InvalidCountryException {
		this.username = username;
		this.userCountry = userCountry;
		if (!this.userCountry.equals("India")) {
			throw new InvalidCountryException("User Outside India cannot be registered");
		} else {
			System.out.println("User registration done successfully");
		}
	}

	public static void main(String[] args) {
		UserRegistration u = new UserRegistration();
		try {
			u.RegisterUser("Mickey", "India");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
}
