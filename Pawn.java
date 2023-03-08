import java.util.ArrayList;

public class Pawn {
	
	public static int i = 0;
	public static int j = 0;
	public static int sqNumber = 0;

	public static void pawn() {
		
		if(Main.pieceToMove == GUI.wPawnA) {
			if (Main.possibleMove == null) {
                Main.possibleMove = new ArrayList<Integer>();
        	}
			
			ArrayList<Integer> possibleMoves = new ArrayList<Integer>();
        	
			String possibleButtonNumbers = "";
			
			// Row 7
			if (GUI.buttonNumber.equals("49")) {
        		possibleButtonNumbers  = "49";
        		i = 0;
        		j = 0;
        	} else if (GUI.buttonNumber.equals("50")) {
        		possibleButtonNumbers  = "50";
        		i = 1;
        		j = 1;
        	} else if (GUI.buttonNumber.equals("51")) {
        		possibleButtonNumbers  = "51";
        		i = 2;
        		j = 2;
        	} else if (GUI.buttonNumber.equals("52")) {
        		possibleButtonNumbers  = "52";
        		i = 3;
        		j = 3;
        	} else if (GUI.buttonNumber.equals("53")) {
        		possibleButtonNumbers  = "53";
        		i = 4;
        		j = 4;
        	} else if (GUI.buttonNumber.equals("54")) {
        		possibleButtonNumbers  = "54";
        		i = 5;
        		j = 5;
        	} else if (GUI.buttonNumber.equals("55")) {
        		possibleButtonNumbers  = "55";
        		i = 6;
        		j = 6;
        	} else if (GUI.buttonNumber.equals("56")) {
        		possibleButtonNumbers  = "56";
        		i = 7;
        		j = 7;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers)) {
				possibleMoves.add(41 + i);
                possibleMoves.add(33 + j);
                
                Main.possibleMove = possibleMoves;      
        
            }
		
		}
	}
}
