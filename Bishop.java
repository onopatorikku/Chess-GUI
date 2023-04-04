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
            } else if (GUI.buttonNumber.equals("9")) {
                for (int i = 9; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 9; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("10")) {
            	for (int i = 10; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 10; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 10; i <= 17; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 10; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("11")) {
            	for (int i = 11; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 11; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 11; i <= 25; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 11; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("12")) {
            	for (int i = 12; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 12; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 12; i <= 33; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 12; i <= 56; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("13")) {
            	for (int i = 13; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 13; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 13; i <= 41; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 13; i <= 48; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("14")) {
            	for (int i = 14; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 14; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 14; i <= 49; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 14; i <= 40; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("15")) {
            	for (int i = 15; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 15; i >= 8; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 15; i <= 57; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 15; i <= 24; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("16")) {
            	for (int i = 16; i >= 7; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 16; i <= 58; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("17")) {
                for (int i = 17; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 17; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("18")) {
            	for (int i = 18; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 18; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 18; i <= 25; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 18; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("19")) {
            	for (int i = 19; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 19; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 19; i <= 33; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 19; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("20")) {
            	for (int i = 20; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 20; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 20; i <= 41; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 20; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("21")) {
            	for (int i = 21; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 21; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 21; i <= 49; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 21; i <= 48; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("22")) {
            	for (int i = 22; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 22; i >= 8; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 22; i <= 57; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 22; i <= 40; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("23")) {
            	for (int i = 23; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 23; i >= 10; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 23; i <= 58; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 23; i <= 32; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("24")) {
            	for (int i = 24; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 24; i <= 59; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("25")) {
                for (int i = 25; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 25; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("26")) {
            	for (int i = 26; i >= 17; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 26; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 26; i <= 33; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 26; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("27")) {
            	for (int i = 27; i >= 9; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 27; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 27; i <= 41; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 27; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("28")) {
            	for (int i = 28; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 28; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 28; i <= 49; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 28; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("29")) {
            	for (int i = 29; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 29; i >= 8; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 29; i <= 57; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 29; i <= 56; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("30")) {
            	for (int i = 30; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 30; i >= 10; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 30; i <= 58; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 30; i <= 48; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("31")) {
            	for (int i = 31; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 31; i >= 24; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 31; i <= 59; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 31; i <= 40; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("32")) {
            	for (int i = 32; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 32; i <= 60; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("33")) {
                for (int i = 33; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 33; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("34")) {
            	for (int i = 34; i >= 17; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 34; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 34; i <= 42; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 34; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("35")) {
            	for (int i = 35; i >= 9; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 35; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 35; i <= 49; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 35; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("36")) {
            	for (int i = 36; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 36; i >= 8; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 36; i <= 57; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 36; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("37")) {
            	for (int i = 37; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 37; i >= 16; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 37; i <= 58; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 37; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("38")) {
            	for (int i = 38; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 38; i >= 24; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 38; i <= 59; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 38; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("39")) {
            	for (int i = 39; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 39; i >= 32; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 39; i <= 60; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 39; i <= 48; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("40")) {
            	for (int i = 40; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 40; i <= 64; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("41")) {
                for (int i = 41; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 41; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("42")) {
            	for (int i = 42; i >= 33; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 42; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 42; i <= 49; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 42; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("43")) {
            	for (int i = 43; i >= 18; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 43; i >= 8; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 43; i <= 57; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 43; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("44")) {
            	for (int i = 44; i >= 17; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 44; i >= 16; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 44; i <= 58; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 44; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("45")) {
            	for (int i = 45; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 45; i >= 24; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 45; i <= 59; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 45; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("46")) {
            	for (int i = 46; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 46; i >= 32; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 46; i <= 64; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 46; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("47")) {
            	for (int i = 47; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 47; i >= 40; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 47; i <= 64; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 47; i <= 56; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("48")) {
            	for (int i = 48; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 48; i <= 64; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("49")) {
                for (int i = 49; i >= 1; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 49; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("50")) {
            	for (int i = 50; i >= 33; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 50; i >= 8; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 50; i <= 57; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 50; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("51")) {
            	for (int i = 51; i >= 25; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 51; i >= 10; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 51; i <= 64; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 51; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("52")) {
            	for (int i = 52; i >= 17; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 52; i >= 24; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 52; i <= 64; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 52; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("53")) {
            	for (int i = 53; i >= 10; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 53; i >= 26; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 53; i <= 64; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 53; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("54")) {
            	for (int i = 54; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 54; i >= 40; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 54; i <= 64; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 54; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("55")) {
            	for (int i = 55; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 55; i >= 48; i = i - 7) {
                    possibleMoves.add(i);
                }
                for (int i = 55; i <= 64; i += 7) {
                    possibleMoves.add(i);
                }
                for (int i = 55; i <= 64; i += 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("56")) {
            	for (int i = 56; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 56; i <= 64; i += 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("57")) {
                for (int i = 57; i >= 8; i = i - 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("58")) {
            	for (int i = 58; i >= 49; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 58; i >= 16; i = i - 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("59")) {
            	for (int i = 59; i >= 41; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 59; i >= 24; i = i - 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("60")) {
            	for (int i = 60; i >= 33; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 60; i >= 32; i = i - 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("61")) {
            	for (int i = 61; i >= 25; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 61; i >= 40; i = i - 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("62")) {
            	for (int i = 62; i >= 9; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 62; i >= 48; i = i - 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("63")) {
            	for (int i = 63; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                for (int i = 63; i >= 56; i = i - 7) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            } else if (GUI.buttonNumber.equals("64")) {
            	for (int i = 64; i >= 1; i = i - 9) {
                    possibleMoves.add(i);
                }
                Main.possibleMove = possibleMoves;   
            }          
        }
    }
}
