import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("This is a calculator.\nType one of the commands: add, subtract, multiply, divide, power");
		String command = key.nextLine();
		if(command.equalsIgnoreCase("add")) {
			System.out.println("Type the two numbers you want to add, separated by a +");
			add(key.nextLine());
		} else if( command.equalsIgnoreCase("subtract") ) {
			System.out.println("Type the two numbers you want to subtract, separated by a -");
			subtract(key.nextLine());
		} else if ( command.equalsIgnoreCase("multiply") ) {
			System.out.println("Type the two numbers you want to multiply, separated by a *");
			multiply(key.nextLine());
		} else if( command.equalsIgnoreCase("divide") ) {
			System.out.println("Type the two numbers you want to divide, separated by a /");
			divide(key.nextLine());
		} else if( command.equalsIgnoreCase("power") ) {
			System.out.println("Type the two numbers you want, separated by ^");
			power(key.nextLine());
		} 
		
	}
	
	public static void add(String number) {
		double num1 = Double.parseDouble( number.substring(0,  number.indexOf("+")  ) );
		double num2 = Double.parseDouble( number.substring(number.indexOf("+")+1    ) );
		System.out.println("The result is: "+(num1+num2));
	}
	
	public static void subtract(String number) {
		double num1 = Double.parseDouble( number.substring(0,  number.indexOf("-")  ) );
		double num2 = Double.parseDouble( number.substring(number.indexOf("-")+1    ) );
		System.out.println("The result is: "+(num1-num2));
	}
	
	public static void multiply(String number) {
		double num1 = Double.parseDouble( number.substring(0,  number.indexOf("*")  ) );
		double num2 = Double.parseDouble( number.substring(number.indexOf("*")+1    ) );
		System.out.println("The result is: "+(num1*num2));
	}
	
	public static void divide(String number) {
		double num1 = Double.parseDouble( number.substring(0,  number.indexOf("/")  ) );
		double num2 = Double.parseDouble( number.substring(number.indexOf("/")+1    ) );
		System.out.println("The result is: "+(num1/num2));
	}
	
	public static void power(String number) {
		double num1 = Double.parseDouble( number.substring(0, number.indexOf("^"))  );
		double num2 = Double.parseDouble(  number.substring(number.indexOf("^")+1));
		System.out.println("The result is: "+Math.pow(num1, num2));
	}
	


}
