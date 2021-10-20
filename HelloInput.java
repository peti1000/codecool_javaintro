import java.util.Scanner;

public class HelloInput {
	static void getHelloMessage(){
		String name = askForName();
		if(name == ""){
			System.out.println("Hello, World!");
		} else {
			System.out.println("Hello " + name);
	
		}
	}
	
	static String askForName(){
		Scanner myObj = new Scanner(System.in);
		System.out.println("What's your name?");
		
		String userName = myObj.nextLine();
		return userName;
		
		
	}
	
	
    public static void main(String[] args) {
		
		//System.out.println("Hello " + userName);
		
		getHelloMessage();
		//askForName();
    }
}