package SmartFractyl.reversi.main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ReversiMain extends JFrame{
	
	public JFrame
	frame;
	
	public static int [][] Board = new int [8][8];
	public static JButton [][] Buttons = new JButton [8][8];
	
	public static void main(String[] args) {
		initFrame();
		initBoard();
	}
	
	public static ActionListener actionListener = new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Buttons[]
		};
	};

	
	public static void initFrame(){
		JFrame frame = new JFrame ("Reversi");
		GridLayout grid = new GridLayout (8,8);
		JPanel playArea = new JPanel();
		playArea.setLayout(grid);
		frame.add(playArea, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Reversi: Java Edition");
		frame.setSize(300,300);
		
		initButton(playArea);
		frame.setVisible(true);
	}
	
	public static void initBoard(){
		
		for (int i = 0; i<=Board.length-1; i++){
			for (int k = 0; k<=Board[i].length-1; k++){
				
				Board[i][k]=-1;
			}
		}
		
	}
	
	public static void initButton(JPanel panel){
		for (int i = 0; i<=Board.length-1; i++){
			for (int k = 0; k<=Board[i].length-1; k++){
				if((i==3 && k==3) || (i==4 && k==4)){
					Buttons[i][k]= new JButton("●");
				}
				else if((i==4 && k==3) || (i==3 && k==4)){
					Buttons[i][k]= new JButton("○");
				}
				else{
					Buttons[i][k]= new JButton("");
				}
				
				Buttons[i][k].addActionListener(actionListener);
				panel.add(Buttons[i][k]);
			}
		}
		
	}
	
	
	
	
	
}	
