public class HelloReturn {
	static String returnMessage(){
		return "Hello, World!";
	}
	static void printMessage(){
		String message = returnMessage();
		System.out.println(message);
	}
    public static void main(String[] args) {
		returnMessage();
		printMessage();
    }
}