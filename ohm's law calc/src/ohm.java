import java.util.Scanner;
public class ohm {
	
	public static void main(String[] args) {
		float i=0;
		float r=0;
		float v=0;
		Scanner s = new Scanner(System.in);
		System.out.print("input the voltage");
		v=s.nextFloat();
		System.out.print("input the resistance in ohms");
		r=s.nextFloat();
		s.close();
		i=v/r;
		i=i*1000;
		System.out.println("your amperage is"+" "+i+" "+"milliamps");
	}

}
