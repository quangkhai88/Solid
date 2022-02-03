package solid.di.after;

public class Client {
	
	public static void main(String ...args) {
		
		Phone tablePhone = new TablePhone();
		Phone smartPhone = new SmartPhone();
		
		User user = new User(tablePhone);
		user.call("01234");
		
		user.setPhone(smartPhone);
		user.call("01234");
		
	}

}
