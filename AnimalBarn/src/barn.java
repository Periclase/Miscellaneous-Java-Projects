import java.util.Scanner;
import java.util.Random;
public class barn {

	public static void main(String[] args) {
		Boolean run = true;
		String action = "";
		cuttlefish fish1 = new cuttlefish(23.45,"harold (default)",true);
		cuttlefish fish2 = new cuttlefish(0,"<No Animal>",false);
		cuttlefish fish3 = new cuttlefish(0,"<No Animal>",false);
		Random r = new Random();
		fish1.length=r.nextDouble()*500;
		fish1.harness=r.nextBoolean();
		System.out.println("===Welcome to the Cuttlefish Barn!===");
		System.out.println("Your barn has generated a random cuttlefish, here it is!:");
		System.out.println("The cuttlefish's length is " + fish1.length + "cm");
		System.out.println("The cuttlefish's name is " + fish1.name);
		System.out.println("The cuttlefish's has a harness: " + fish1.harness);
		Scanner s = new Scanner (System.in);
		while(run==true){
			System.out.print("Would you like to buy a new animal, sell an animal, view your animals, or exit? (b/s/v/e)");
			action=s.next();
			if (action.equals("b")){
				String bn = "";
				int slot = 0;
				System.out.println("===Buy an animal===");
				System.out.print("Which slot would you like to put your new cuttlefish in? (1/2/3)");
				slot=s.nextInt();
					if (slot==1){
						System.out.print("Name your new cuttlefish: ");
						bn=s.next();
						System.out.println("You have successfully purchased a new cuttlefish!");
						System.out.println("Here is the new cuttlefish's stats:");
						fish1.length=r.nextDouble()*500;
						fish1.harness=r.nextBoolean();
						fish1.name=bn;
						System.out.println("The cuttlefish's length is " + fish1.length + "cm");
						System.out.println("The cuttlefish's name is " + fish1.name);
						System.out.println("The cuttlefish's has a harness: " + fish1.harness);
					}
					if (slot==2){
						System.out.print("Name your new cuttlefish: ");
						bn=s.next();
						System.out.println("You have successfully purchased a new cuttlefish!");
						System.out.println("Here is the new cuttlefish's stats:");
						fish2.length=r.nextDouble()*500;
						fish2.harness=r.nextBoolean();
						fish2.name=bn;
						System.out.println("The cuttlefish's length is " + fish2.length + "cm");
						System.out.println("The cuttlefish's name is " + fish2.name);
						System.out.println("The cuttlefish's has a harness: " + fish2.harness);
					}
					if (slot==3){
						System.out.print("Name your new cuttlefish: ");
						bn=s.next();
						System.out.println("You have successfully purchased a new cuttlefish!");
						System.out.println("Here is the new cuttlefish's stats:");
						fish3.length=r.nextDouble()*500;
						fish3.harness=r.nextBoolean();
						fish3.name=bn;
						System.out.println("The cuttlefish's length is " + fish3.length + "cm");
						System.out.println("The cuttlefish's name is " + fish3.name);
						System.out.println("The cuttlefish's has a harness: " + fish3.harness);
					}
				}
			if (action.equals("s")){
				String sn = "";
				int slot = 0;
				System.out.println("===Sell and animal===");
				System.out.print("Which cuttlefish would you like to sell? (1/2/3)");
				slot=s.nextInt();
				if (slot==1){
					System.out.println("Animal in slot 1 sucessfully sold");
					fish1.length=0;
					fish1.harness=false;
					fish1.name="<No Animal>";
					}
				if (slot==2){
					System.out.println("Animal in slot 2 sucessfully sold");
					fish2.length=0;
					fish2.harness=false;
					fish2.name="<No Animal>";
					}
				if (slot==3){
					System.out.println("Animal in slot 3 sucessfully sold");
					fish3.length=0;
					fish3.harness=false;
					fish3.name="<No Animal>";
					}
				}
			if (action.equals("v")){
					System.out.println("===View your animals===");
					System.out.println("Fish 1:");
					System.out.println("	The cuttlefish's length is " + fish1.length + "cm");
					System.out.println("	The cuttlefish's name is " + fish1.name);
					System.out.println("	The cuttlefish's has a harness: " + fish1.harness);
					System.out.println("Fish 2:");
					System.out.println("	The cuttlefish's length is " + fish2.length + "cm");
					System.out.println("	The cuttlefish's name is " + fish2.name);
					System.out.println("	The cuttlefish's has a harness: " + fish2.harness);
					System.out.println("Fish 3:");
					System.out.println("	The cuttlefish's length is " + fish3.length + "cm");
					System.out.println("	The cuttlefish's name is " + fish3.name);
					System.out.println("	The cuttlefish's has a harness: " + fish3.harness);
				}
			if (action.equals("e")){
					System.out.println("goodbye!");
					run=false;
				}
			else{
					System.out.println("Invalid input, try again");
				}
			}
		}
	} 
	


 