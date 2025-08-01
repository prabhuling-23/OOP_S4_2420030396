package mypack;

public class GreaterValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal");
        }
	}

}
