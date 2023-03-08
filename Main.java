import java.util.ArrayList;

//Chess version 1.0
//Author @Patryk_Siekiera

public class Main {
	
	//Gets piece's name from GUI / kind of input
	public static String pieceToMove;
	
	//Tells if its white's or black's turn
	public static int turnTeller = 0; // 0 - white, 1 - black

	public static void main(String[] args){
				
		//GUI section
		GUI gui = new GUI();
		gui.GUIframe(600, 600);
		gui.GUIsettings2();		
	}

	public static ArrayList<Integer> possibleMove = null;
	
	//Engine - rules
	public static void engine() {
		//System.out.println("Picked piece: " + pieceToMove + " turn: " + turnTeller);
	}
}
