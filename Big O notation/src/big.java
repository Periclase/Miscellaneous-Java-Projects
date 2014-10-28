import java.util.Scanner;


public class big {

	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter a number:");
		int counter = 0;
		int n = s.nextInt();
		for(int i = 0; i<n; i++){
			for(int t = 0; t<n; t++){
				counter=counter+1;
			}
		}
		System.out.println("Result: "+counter);
	}

}
