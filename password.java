package day7;

public class password {
static String correctpassword ="231";
static void trypassword(String password) {
	System.out.println("Trying :"+password);
	if(password.equals(correctpassword)) {
		System.out.println("password found:"+ password);
		return;
		
	}
	System.out.println("wrong password.go back and try another");
}
	public static void main(String[] args) {
	trypassword("123");
	trypassword("132");
	trypassword("213");
	trypassword("231");
	}

}
