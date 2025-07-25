package day6;

interface Calculator_Interface{
	double operation(double a,double b);
	default double subtract(double a,double b) {
		return a-b;
	}
	static double multiply(double a,double b) {
		return a*b;
	}
	
}

class Calculator_Operation implements Calculator_Interface{
	public double operation(double a,double b) {
		return a+b;
	}
	
}

public class CalculationInterfaceMain{
	public static void main(String[] args) {
		Calculator_Interface ci = new Calculator_Operation();
		System.out.println(ci.operation(4.0,5.0));
		System.out.println(ci.subtract(5.0, 2.0));
		System.out.println(Calculator_Interface.multiply(5,8));
	}
}


