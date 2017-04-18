package bai_1;

public class MyVariable {

	public final static String PREFIX = "DEV"; // static/class variable

	private String title;

	public void showAge() {
		int age = 0;// this is local variable
		age = age + 7;
		System.out.println("Age is : " + age);
	}

	public static void main(String args[]) {

		MyVariable localVariable = new MyVariable();
		System.out.println(MyVariable.PREFIX);
		localVariable.showAge();
	}
}
