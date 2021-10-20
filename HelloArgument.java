import java.util.Scanner;

public class HelloArgument {
	public static void main(String[] args) {
		
		sayHello();
    }
	static String getUserName(){
		Scanner myObj = new Scanner(System.in);
		System.out.println("What's your name?");
		
		String askForName = myObj.nextLine();
		return askForName;
		
	}
    
	static String getHelloMessage(){
		String name = getUserName();
		if(name == ""){
			return "Hello, World!";
		} else {
			return "Hello " + name;
	
		}
	}
	
	static void sayHello() {
		//String userName = getUserName();
		String message = getHelloMessage();
		System.out.println(message);
	
	}
	
	
	
}