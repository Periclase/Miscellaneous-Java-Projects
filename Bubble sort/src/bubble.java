import java.util.*;


public class bubble {

	public static void main(String[] args) {
		int rng = 0;
		int num = 0;
		int counter = 0;
		int v1 = 0;
		int v2= 0;
		int[] l;
		boolean run = true;
		Random r = new Random();
		Scanner s = new Scanner (System.in);
		System.out.print("How many elements do you want to sort?");
		num=s.nextInt();
		System.out.print("What is the range of elements?");
		rng=s.nextInt();
		l = new int [num];
		for(int i = 0; i<num; i++){
			l[i]=r.nextInt(rng);
		}
		System.out.print("Numbers to sort: ");
		for(int i = 0; i<num; i++){
			System.out.print(" "+l[i]+" ");
		}
		while (run == true){
			counter = 0;
			for(int i = 0; i<num-1; i++){
				if (l[i]>l[i+1]){
					v1=l[i];
					l[i]=l[i+1];
					l[i+1]=v1;
					counter=counter+1;		
				}
				else{
					counter=counter+0;
				}
			}
			if (counter==0){
				run = false;
			}
			else{
				run = true;
			}
		}
		System.out.println("");
		System.out.print("Sorted Numbers: ");
		for(int i = 0; i<num; i++){
			System.out.print(" "+l[i]+" ");
		}
	}
}

