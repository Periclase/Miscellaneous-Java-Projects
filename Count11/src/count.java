import java.util.Scanner;
public class count {
	public static int n = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Input a String");
		String input = s.next();
		int result=count11(input,0);
		System.out.println("Total Amount of Elevens: "+result);
		
	}
	public static int count11(String c, int counter){
		if (c.startsWith("11")){
			return count11(c.substring(2), counter+1);
		}
		else if (!c.isEmpty()){
			return count11(c.substring(1), counter);
		}
		else{
			return counter;
		}
	}

}
