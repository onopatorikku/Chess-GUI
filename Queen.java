import java.util.ArrayList;

public class Queen {

	public static void queen() {
		
		//Queen moves
		if(Main.pieceToMove == GUI.wQueenA || Main.pieceToMove == GUI.bQueenA) {
			if (Main.possibleMove == null) {
                Main.possibleMove = new ArrayList<Integer>();
        	}
			
			ArrayList<Integer> possibleMoves = new ArrayList<Integer>(); 
        	
            if (GUI.buttonNumber.equals("1")) {
				//From Rook
                for (int i = 1; i <= 8; i++) {
                    possibleMoves.add(i);
                }
                for (int i = 1; i <= 57; i += 8) {
                    possibleMoves.add(i);
                }
                //From Bishop
                for (int i = 1; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;
                
            }
		}
	}

}
