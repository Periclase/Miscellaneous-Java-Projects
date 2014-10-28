import java.util.Scanner;
public class calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		int add=0;
		int sub=0;
		int mul=0;
		int div=0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("input your first number");
		num1=s.nextInt();
		System.out.print("input your second number");
		num2=s.nextInt();
		
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		
		
		System.out.println(num1 + "+" + num2 + "=" + add);
		System.out.println(num1 + "-" + num2 + "=" + sub);
		System.out.println(num1 + "*" + num2 + "=" + mul);
		System.out.println(num1 + "/" + num2 + "=" + div + " " + "Remainder" + "=" + num1%num2);
	}

}
