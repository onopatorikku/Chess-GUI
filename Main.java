import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args){
		
		//Chess board
		String[][] board = new String[8][8];
		
		//white pieces
		board[6][0] = "wPawn";
		board[6][0] = "wPawn";
		board[6][1] = "wPawn";
		board[6][2] = "wPawn";
		board[6][3] = "wPawn";
		board[6][4] = "wPawn";
		board[6][5] = "wPawn";
		board[6][6] = "wPawn";
		board[6][7] = "wPawn";
		
		board[7][0] = "wRook";
		board[7][7] = "wRook";
		
		board[7][2] = "wBishop";
		board[7][5] = "wBishop";
		
		board[7][1] = "wKnight";
		board[7][6] = "wKnight";
		
		board[7][3] = "wQueen";
		board[7][4] = "wKing";
		
		//Space between
		
		
		//black pieces
		board[1][0] = "bPawn";
		board[1][0] = "bPawn";
		board[1][1] = "bPawn";
		board[1][2] = "bPawn";
		board[1][3] = "bPawn";
		board[1][4] = "bPawn";
		board[1][5] = "bPawn";
		board[1][6] = "bPawn";
		board[1][7] = "bPawn";
	
		board[0][0] = "wRook";
		board[0][7] = "wRook";
		
		board[0][2] = "wBishop";
		board[0][5] = "wBishop";
		
		board[0][1] = "wKnight";
		board[0][6] = "wKnight";
		
		board[0][3] = "wQueen";
		board[0][4] = "wKing";
		
		//array print
		System.out.println(Arrays.deepToString(board).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
				
		//GUI section
		GUI gui = new GUI();
		gui.GUIframe(600, 600);
		gui.GUIsettings2();		
	}
}