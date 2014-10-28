import java.util.Scanner;
public class diamond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = "";
		int b = 0;
		int m = 1;
		Scanner s = new Scanner (System.in);
		System.out.print("Character");
		c=s.next();
		System.out.print("Scale");
		b=s.nextInt();
		for(int i = b-1; i>-1; i--){
		
			for(int v = 0; v<i; v++) System.out.print(" ");
			System.out.print(c);
			if (i!= b-1){
				
				for(int v = 0; v<m; v++) System.out.print(" ");
				m=m+2;
				System.out.println(c);
		}
			else System.out.println(" ");
		}
		for(int i = 1; i<b; i++){
			
			for(int v = 0; v<i; v++) System.out.print(" ");
			System.out.print(c);
			if (i!= b-1){
				
				for(int v = 0; v<m-4; v++) System.out.print(" ");
				m=m-2;
				System.out.println(c);
		}
			else System.out.println(" ");
		}
	}
}
