package week1.Day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Addition of Numbers:" + obj.add(12, 30, 45));
		System.out.println("Subtraction of Numbers:" + obj.sub(90, 45));
		System.out.println("Multiplication of Numbers:" + obj.mul(63.8, 40.1));
		System.out.println("Division of Numbers:" + obj.div(70, 7));
	}

}
