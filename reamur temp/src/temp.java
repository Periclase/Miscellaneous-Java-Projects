import java.util.Scanner;
public class temp {

	public static void main(String[] args) {
		float FT = 0;
		float RT = 0;
		Scanner s = new Scanner (System.in);
		System.out.print ("input the Reaumur temperature");
		RT=s.nextFloat();
		FT = (float) (RT*2.25+32);
		System.out.println("The temperature in farenheight is" + " " + FT );
	}

}
