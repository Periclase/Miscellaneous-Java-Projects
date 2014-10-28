import java.io.*;
import java.util.Scanner;
public class input {
	
	public static void main(String[] args) {
		FileOutputStream fw;
		FileInputStream fr;
		String filename = "";
		String contents = "";
		String choice = "";
		boolean run = true;
		Scanner s = new Scanner (System.in);
		System.out.println("==Text Modifier==");
		while (run==true){
			System.out.print("Would you like to read or write a file or exit? (r/w/e)");
			choice=s.next();
			if (choice.equals("w")){
				System.out.print("Filename: ");
				filename=s.next();
				System.out.print("Contents: ");
				contents=s.next();
				try {
					fw = new FileOutputStream (filename);
					new PrintStream(fw).println (contents);
					fw.close();
				} catch (IOException e) {
					System.err.print("Error: Unable to write to file");
					run=false;
				}
			}
			else if (choice.equals("r")){
				System.out.print("Filename: ");
				filename=s.next();
				try{
				    fr = new FileInputStream (filename);
				    System.out.println( new DataInputStream(fr).readLine());
				    fr.close();		
				}catch (IOException e)
				{
					System.err.println ("Error: Unable to read from file");
					run=false;
				}
			}
			else if (choice.equals("e")){
				run=false;
			}
			else{
				System.err.println("Error: Invalid input");
			}
		}
	}

}
