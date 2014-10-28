import java.util.Scanner;


public class tower {
	public static int moves = 0;
	public static void main(String[] args) {
		int input = 0;
		Scanner s = new Scanner (System.in);
		System.out.print("How many discs do you want the program to use?");
		input=s.nextInt();
		int rmoves= tower(input,"A","C","B");
		System.out.println("Moves Required: "+rmoves);
		
	}
	public static int tower(int n,String A,String C,String B){
		if (n==1){
			System.out.println("Move disk 1 from tower "+A+" to tower "+C);
			moves++;
		}
		else{
			tower(n-1,A,B,C);
			System.out.println("Move disk "+n+" from tower "+A+" to tower "+C);
			moves++;
			tower(n-1,B,C,A);
		}
		return moves;
	}

}


