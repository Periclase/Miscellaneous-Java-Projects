import java.util.*;
import java.lang.Math.*;
public class blackjack {
	static card[] acard;
	public static void main(String[] args) {
		acard = new card[13];
		acard [0] = new card(11,1,1,"A",0);
		acard [1] = new card(2,0,2,"2",0);
		acard [2] = new card(3,0,3,"3",0);
		acard [3] = new card(4,0,4,"4",0);
		acard [4] = new card(5,0,5,"5",0);
		acard [5] = new card(6,0,6,"6",0);
		acard [6] = new card(7,0,7,"7",0);
		acard [7] = new card(8,0,8,"8",0);
		acard [8] = new card(9,0,9,"9",0);
		acard [9] = new card(10,0,10,"10",0);
		acard [10] = new card(10,0,11,"JACK",0);
		acard [11] = new card(10,0,12,"QUEEN",0);
		acard [12] = new card(10,0,13,"KING",0);
		Random r = new Random();
		boolean play = true;
		boolean game = true;
		while (play == true){
			Scanner s = new Scanner (System.in);
			int dealer = 0;
			int user = 0;
			int dc = 0;
			int dc2 = 0;
			int uc2 = 0;
			int uc = 0;
			String pa = "";
			String dec = "hit";
			int ace = 0;
			boolean decb = false;
			boolean cards = true;
			int com_u = 0;
			int com_d = 0;
			int comp = 0;
			String diff = "";
			System.out.println("===Welcome to blackjack===");
			game=true;
			while (game == true){
				if (dealer>21 && user<=21){
					System.out.println("The dealer busted, you win!!");
					System.out.print("Would you like to play again(y/n)?");
					pa=s.next();
					if (pa.equals("y")){
						game=false;
					}
					else{
						game=false;
						play=false;
					}
				}
				else if(user>21 && dealer<=21){
					System.out.println("You Busted, the dealer wins...");
					System.out.print("Would you like to play again(y/n)?");
					pa=s.next();
					if (pa.equals("y")){
						game=false;
					}
					else{
						game=false;
						play=false;
					}
				}
				else if(user>21 && dealer>21){
					System.out.println("Both players lose, its a tie...");
					System.out.print("Would you like to play again(y/n)?");
					pa=s.next();
					if (pa.equals("y")){
						game=false;
					}
					else{
						game=false;
						play=false;
					}
				
				}	
				else if (user==21 && dealer==21){
					System.out.println("You tied with the dealer, but you win!!!");
					System.out.print("Would you like to play again(y/n)?");
					pa=s.next();
					if (pa.equals("y")){
						game=false;
					}
					else{
						game=false;
						play=false;
					}
				
				}
				else if (user==21 && dealer!=21){
					System.out.println("You reached 21 points, you win!!!");
					System.out.print("Would you like to play again(y/n)?");
					pa=s.next();
					if (pa.equals("y")){
						game=false;
					}
					else{
						game=false;
						play=false;
					}
				}
				else if (user!=21 && dealer==21){
					System.out.println("The dealer reached 21 points, you lose...");
					System.out.print("Would you like to play again(y/n)?");
					pa=s.next();
					if (pa.equals("y")){
						game=false;
					}
					else{
						game=false;
						play=false;
					}
				}
				else if(dec.equalsIgnoreCase("stand")){
					com_u = 21-user;
					com_d = 21-dealer;
					com_u = Math.abs(com_u);
					com_d = Math.abs(com_d);
					if (com_d>com_u){
						System.out.println("You were closer to 21, you win!!!");
					}
					else{
						System.out.println("The dealer was closer to 21, you lose...");
					}
					System.out.print("Would you like to play again(y/n)?");
					pa=s.next();
					if (pa.equals("y")){
						game=false;
					}
					else{
						game=false;
						play=false;
					}
				}
				else if(dec.equalsIgnoreCase("hit")){
					if (cards==true){
						uc=r.nextInt(13);
						uc2=r.nextInt(13);
						if (acard[uc].name.equals("A")){
							user=user+acard[uc2].value;
							System.out.println("You Have been dealt two cards to start, the cards are: "+acard[uc].name + " and "+acard[uc2].name);
							System.out.print("Would you like your ace to be worth 1 or 11?");
							ace=s.nextInt();
							if (ace==1){
								user=user+acard[uc].value2;
								System.out.println("Your ace is now worth 1");
							}
							else{
								user=user+acard[uc].value;
								System.out.println("Your ace is now worth 11");
							}
							System.out.println("Your total card value is now: "+user);
							dc=r.nextInt(13);
							dc2=r.nextInt(13);
							dealer=dealer+acard[dc].value;
							dealer=dealer+acard[dc2].value;
							System.out.println("The dealer's Total is: "+dealer);
							decb = false;
							while (decb==false){
								System.out.print("Would you like to hit or stand?");
								dec=s.next();
								if (dec.equalsIgnoreCase("hit")){
										decb=true;
									}		
								else if(dec.equalsIgnoreCase("stand")){
										decb=true;
									}
								else{
									System.out.println("Invalid input, try again");
									}
								}
							cards=false;
						}
						else if (acard[uc2].name.equals("A")){
							user=user+acard[uc].value;
							System.out.println("You Have been dealt two cards to start, the cards are: "+acard[uc].name + " and "+acard[uc2].name);
							System.out.print("Would you like your ace to be worth 1 or 11?");
							ace=s.nextInt();
							if (ace==1){
								user=user+acard[uc2].value2;
								System.out.println("Your ace is now worth 1");
							}
							else{
								user=user+acard[uc2].value;
								System.out.println("Your ace is now worth 11");
							}
							System.out.println("Your total card value is now: "+user);
							dc=r.nextInt(13);
							dc2=r.nextInt(13);
							dealer=dealer+acard[dc].value;
							dealer=dealer+acard[dc2].value;
							System.out.println("The dealer's Total is: "+dealer);
							decb = false;
							while (decb==false){
								System.out.print("Would you like to hit or stand?");
								dec=s.next();
								if (dec.equalsIgnoreCase("hit")){
										decb=true;
									}		
								else if(dec.equalsIgnoreCase("stand")){
										decb=true;
									}
								else{
									System.out.println("Invalid input, try again");
									}
								}
							cards=false;
						}
						else{
							user=user+acard[uc].value;
							user=user+acard[uc2].value;
							System.out.println("You Have been dealt two cards to start, the cards are: "+acard[uc].name + " and "+acard[uc2].name);
							System.out.println("Your total card value is now: "+user);
							dc=r.nextInt(13);
							dc2=r.nextInt(13);
							dealer=dealer+acard[dc].value;
							dealer=dealer+acard[dc2].value;
							System.out.println("The dealer's Total is: "+dealer);
							decb = false;
							while (decb==false){
								System.out.print("Would you like to hit or stand?");
								dec=s.next();
								if (dec.equalsIgnoreCase("hit")){
										decb=true;
									}		
								else if(dec.equalsIgnoreCase("stand")){
										decb=true;
									}
								else{
									System.out.println("Invalid input, try again");
									}
								}
							cards=false;
						}
					}
					else{
						uc=r.nextInt(13);
						if (acard[uc].name.equals("A")){
							System.out.println("You Have been dealt an additional card, the card is: "+acard[uc].name);
							System.out.print("Would you like your ace to be worth 1 or 11?");
							ace=s.nextInt();
							if (ace==1){
								user=user+acard[uc].value2;
								System.out.println("Your ace is now worth 1");
							}
							else{
								user=user+acard[uc].value;
								System.out.println("Your ace is now worth 11");
							}
							System.out.println("Your total card value is now: "+user);
							dc=r.nextInt(13);
							dealer=dealer+acard[dc].value;
							System.out.println("The dealer's Total is: "+dealer);
							decb = false;
							while (decb==false){
								System.out.print("Would you like to hit or stand?");
								dec=s.next();
								if (dec.equalsIgnoreCase("hit")){
										decb=true;
									}		
								else if(dec.equalsIgnoreCase("stand")){
										decb=true;
									}
								else{
									System.out.println("Invalid input, try again");
									}
								}
						}
						else{
							user=user+acard[uc].value;
							System.out.println("You Have been dealt an additional card, the card is: "+acard[uc].name);
							System.out.println("Your total card value is now: "+user);
							dc=r.nextInt(13);
							dealer=dealer+acard[dc].value;
							System.out.println("The dealer's Total is: "+dealer);
							decb = false;
							while (decb==false){
								System.out.print("Would you like to hit or stand?");
								dec=s.next();
								if (dec.equalsIgnoreCase("hit")){
										decb=true;
									}		
								else if(dec.equalsIgnoreCase("stand")){
										decb=true;
									}
								else{
									System.out.println("Invalid input, try again");
									}
								}
							}	
						}
						
					}
				}
			}
		}
		

	}


