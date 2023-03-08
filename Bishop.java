import java.util.ArrayList;

public class Bishop {
    public static void bishop() {
    	//Bishop moves
        if (Main.pieceToMove == GUI.wBishopA || Main.pieceToMove == GUI.bBishopA) {
        	
        	if (Main.possibleMove == null) {
                Main.possibleMove = new ArrayList<Integer>();
        	}
        	
        	ArrayList<Integer> possibleMoves = new ArrayList<Integer>();
        	
        	//row 1
            if (GUI.buttonNumber.equals("1")) {
                for (int i = 1; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;
            } else if (GUI.buttonNumber.equals("2")) {
                for (int i = 2; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                for (int i = 2; i <= 9; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;
            } else if (GUI.buttonNumber.equals("3")) {
                for (int i = 3; i <= 48; i += 9) {
                    possibleMoves.add(i);
                }
                for (int i = 3; i <= 17; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;
            } else if (GUI.buttonNumber.equals("4")) {
                for (int i = 4; i <= 40; i += 9) {
                    possibleMoves.add(i);
                }
                for (int i = 4; i <= 25; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;
            } else if (GUI.buttonNumber.equals("5")) {
                for (int i = 5; i <= 32; i += 9) {
                    possibleMoves.add(i);
                }
                for (int i = 5; i <= 33; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;
            } else if (GUI.buttonNumber.equals("6")) {
                for (int i = 6; i <= 24; i += 9) {
                    possibleMoves.add(i);
                }
                for (int i = 6; i <= 41; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;  
            } else if (GUI.buttonNumber.equals("7")) {
                for (int i = 7; i <= 16; i += 9) {
                    possibleMoves.add(i);
                }
                for (int i = 7; i <= 49; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("8")) {
                for (int i = 8; i <= 57; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;
            }
            
        }
    }
}
