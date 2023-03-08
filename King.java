import java.util.ArrayList;

public class King {
	
	public static int i = 0;
	
	public static void king() {
		
		if (Main.pieceToMove == GUI.wKingA || Main.pieceToMove == GUI.bKingA) {
        	
        	if (Main.possibleMove == null) {
                Main.possibleMove = new ArrayList<Integer>();
        	}
        	
        	ArrayList<Integer> possibleMoves = new ArrayList<Integer>();
        	
        	String possibleButtonNumbers = "";
        	
        	//Center of the board
        	if(GUI.buttonNumber.equals("10")) { //2 row
        		possibleButtonNumbers = "10";
        		i = 0;
        	} else if(GUI.buttonNumber.equals("11")) {
        		possibleButtonNumbers = "11";
        		i = 1;
        	} else if(GUI.buttonNumber.equals("12")) {
        		possibleButtonNumbers = "12";
        		i = 2;
        	} else if(GUI.buttonNumber.equals("13")) {
        		possibleButtonNumbers = "13";
        		i = 3;
        	} else if(GUI.buttonNumber.equals("14")) {
        		possibleButtonNumbers = "14";
        		i = 4;
        	} else if(GUI.buttonNumber.equals("15")) {
        		possibleButtonNumbers = "15";
        		i = 5;
        	} else if(GUI.buttonNumber.equals("18")) { //3 row
        		possibleButtonNumbers = "18";
        		i = 8;
        	} else if(GUI.buttonNumber.equals("19")) {
        		possibleButtonNumbers = "19";
        		i = 9;
        	} else if(GUI.buttonNumber.equals("20")) {
        		possibleButtonNumbers = "20";
        		i = 10;
        	} else if(GUI.buttonNumber.equals("21")) {
        		possibleButtonNumbers = "21";
        		i = 11;
        	} else if(GUI.buttonNumber.equals("22")) {
        		possibleButtonNumbers = "22";
        		i = 12;
        	} else if(GUI.buttonNumber.equals("23")) {
        		possibleButtonNumbers = "23";
        		i = 13;
        	} else if(GUI.buttonNumber.equals("26")) { //3 row
        		possibleButtonNumbers = "26";
        		i = 16;
        	} else if(GUI.buttonNumber.equals("27")) {
        		possibleButtonNumbers = "27";
        		i = 17;
        	} else if(GUI.buttonNumber.equals("28")) {
        		possibleButtonNumbers = "28";
        		i = 18;
        	} else if(GUI.buttonNumber.equals("29")) {
        		possibleButtonNumbers = "29";
        		i = 19;
        	} else if(GUI.buttonNumber.equals("30")) {
        		possibleButtonNumbers = "30";
        		i = 20;
        	} else if(GUI.buttonNumber.equals("31")) {
        		possibleButtonNumbers = "31";
        		i = 21;
        	} else if(GUI.buttonNumber.equals("34")) { //4 row
        		possibleButtonNumbers = "34";
        		i = 24;
        	} else if(GUI.buttonNumber.equals("35")) {
        		possibleButtonNumbers = "35";
        		i = 25;
        	} else if(GUI.buttonNumber.equals("36")) {
        		possibleButtonNumbers = "36";
        		i = 26;
        	} else if(GUI.buttonNumber.equals("37")) {
        		possibleButtonNumbers = "37";
        		i = 27;
        	} else if(GUI.buttonNumber.equals("38")) {
        		possibleButtonNumbers = "38";
        		i = 28;
        	} else if(GUI.buttonNumber.equals("39")) {
        		possibleButtonNumbers = "39";
        		i = 29;
        	}  else if(GUI.buttonNumber.equals("42")) { //7 row
        		possibleButtonNumbers = "42";
        		i = 32;
        	} else if(GUI.buttonNumber.equals("43")) {
        		possibleButtonNumbers = "43";
        		i = 33;
        	} else if(GUI.buttonNumber.equals("44")) {
        		possibleButtonNumbers = "44";
        		i = 34;
        	} else if(GUI.buttonNumber.equals("45")) {
        		possibleButtonNumbers = "45";
        		i = 35;
        	} else if(GUI.buttonNumber.equals("46")) {
        		possibleButtonNumbers = "46";
        		i = 36;
        	} else if(GUI.buttonNumber.equals("47")) {
        		possibleButtonNumbers = "47";
        		i = 37;
        	}  else if(GUI.buttonNumber.equals("50")) { //6 row
        		possibleButtonNumbers = "50";
        		i = 40;
        	} else if(GUI.buttonNumber.equals("51")) {
        		possibleButtonNumbers = "51";
        		i = 41;
        	} else if(GUI.buttonNumber.equals("52")) {
        		possibleButtonNumbers = "52";
        		i = 42;
        	} else if(GUI.buttonNumber.equals("53")) {
        		possibleButtonNumbers = "53";
        		i = 43;
        	} else if(GUI.buttonNumber.equals("54")) {
        		possibleButtonNumbers = "54";
        		i = 44;
        	} else if(GUI.buttonNumber.equals("55")) {
        		possibleButtonNumbers = "55";
        		i = 45;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers)) {
				possibleMoves.add(1 + i);
                possibleMoves.add(2 + i);
                possibleMoves.add(3 + i);
                possibleMoves.add(9 + i);
                possibleMoves.add(11 + i);
                possibleMoves.add(17 + i);
                possibleMoves.add(18 + i);
                possibleMoves.add(19 + i);
                
                Main.possibleMove = possibleMoves;      
        
            }
		
		}
	}
}
