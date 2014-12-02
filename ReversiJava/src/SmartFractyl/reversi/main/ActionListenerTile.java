package SmartFractyl.reversi.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ActionListenerTile implements ActionListener{
	private int i;
	private int k;
	
	public ActionListenerTile(int p1, int p2){
		i = p1;
		k = p2;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (GameLogic.isGameOver()){
			JOptionPane.showMessageDialog(ReversiMain.frame, "Game Over");
		}
		if(GameLogic.canMakeLegalMove(i, k)){
			if(GameLogic.isPlayer1Turn){
				ReversiMain.Board[i][k]=0;
				ReversiMain.Buttons[i][k].setText("○");
				GameLogic.onPlay();
			}
			else if(!GameLogic.isPlayer1Turn){
				ReversiMain.Board[i][k]=1;
				ReversiMain.Buttons[i][k].setText("●");
				GameLogic.onPlay();
			}
			
		}
		
	}
	
	

}
