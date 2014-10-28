import java.util.Scanner;
public class tax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int p = 5000;
		int m = 0;
		int c = 1000;
		int x = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Total income ");
		i=s.nextInt();
		System.out.print("number of children ");
		m=s.nextInt();
		int n=i-p-m*c;
		if (n<0){
			n=0;
		}
		x=n/3;
		System.out.println("income:"+i);
		System.out.println("taxable:"+n);
		System.out.println("tax:"+x);
		System.out.println("income after tax:"+(i-x));
	}

}
