package SmartFractyl.reversi.main;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoArea {
	static double startTime = (int) System.nanoTime()/Math.pow(10, 9); 
	static JLabel timeElapsed = new JLabel("");
	static double timePassed = 0;
	static double nowTime = 0;
	
	
	public static void initInfoArea(JFrame frame){
		JPanel infoArea = new JPanel();
		JButton endGame = new JButton("End Game");
		JLabel player1Status = new JLabel("P1's Pieces: ");
		JLabel player2Status = new JLabel("P2's Pieces: ");
		
		infoArea.add(endGame, BorderLayout.WEST);
		infoArea.add(player1Status);
		infoArea.add(player2Status);
		infoArea.add(timeElapsed, BorderLayout.EAST);
		frame.add(infoArea, BorderLayout.NORTH);
		displayCurrentTime();

	}
	
	public static void displayCurrentTime(){
		
		nowTime = (int) System.nanoTime()/Math.pow(10, 9);
		timePassed = (int) startTime-nowTime;
		
		timeElapsed.setText("Time Elapsed: "+ timePassed); 
		displayCurrentTime();
	}
}
