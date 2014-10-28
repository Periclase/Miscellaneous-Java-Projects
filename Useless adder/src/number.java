import java.util.Scanner;
public class number {

		
	public static void main(String[] args) {
		String n = "y";
		while(n=="y"){
		int input=0;
		Scanner scaninput = new Scanner(System.in);
		System.out.print("Enter a number!!!");
		input=scaninput.nextInt();
		int result=0;
		for (int i=0; i<=input;i++){
			result=i+result;
		}
		System.out.println("Your output!!!:" + result);
		System.out.print("would you like to run again? (y/n)");
		n=scaninput.next();
			}
		}

	}
