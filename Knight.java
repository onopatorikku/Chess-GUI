import java.util.ArrayList;

public class Knight {
	
	public static int i = 0;
	public static int j = 0;

	public static void knight() {
		
		if (Main.pieceToMove == GUI.wKnightA || Main.pieceToMove == GUI.bKnightA) {
        	
        	if (Main.possibleMove == null) {
                Main.possibleMove = new ArrayList<Integer>();
        	}
        	
        	ArrayList<Integer> possibleMoves = new ArrayList<Integer>();
        	
        	String possibleButtonNumbers = "";
        	String possibleButtonNumbers1 = "";
        	String possibleButtonNumbers2 = "";
        	String possibleButtonNumbers3 = "";
        	String possibleButtonNumbers4 = "";
        	//Corners
        	String possibleButtonNumbers5 = "";
        	String possibleButtonNumbers6 = "";
        	String possibleButtonNumbers7 = "";
        	String possibleButtonNumbers8 = "";
        	//Circle 2
        	String possibleButtonNumbers9 = "";
        	String possibleButtonNumbers10 = "";
        	String possibleButtonNumbers11 = "";
        	String possibleButtonNumbers12 = "";
        	String possibleButtonNumbers13 = "";
        	String possibleButtonNumbers14 = "";
        	String possibleButtonNumbers15 = "";
        	String possibleButtonNumbers16 = "";
        	String possibleButtonNumbers17 = "";
        	
        	//4x4 Middle of the board
        	if(GUI.buttonNumber.equals("19")) { //1
        		possibleButtonNumbers = "19";
        		i = 0;
        	} else if (GUI.buttonNumber.equals("20")) {
        		possibleButtonNumbers = "20";
        		i = 1;
        	} else if (GUI.buttonNumber.equals("21")) {
        		possibleButtonNumbers = "21";
        		i = 2;
        	} else if (GUI.buttonNumber.equals("22")) {
        		possibleButtonNumbers = "22";
        		i = 3;
        	} else if (GUI.buttonNumber.equals("27")) { //2
        		possibleButtonNumbers = "27";
        		i = 8;
        	} else if (GUI.buttonNumber.equals("28")) {
        		possibleButtonNumbers = "28";
        		i = 9;
        	} else if (GUI.buttonNumber.equals("29")) {
        		possibleButtonNumbers = "29";
        		i = 10;
        	} else if (GUI.buttonNumber.equals("30")) {
        		possibleButtonNumbers = "30";
        		i = 11;
        	} else if (GUI.buttonNumber.equals("35")) { //3
        		possibleButtonNumbers = "35";
        		i = 16;
        	} else if (GUI.buttonNumber.equals("36")) {
        		possibleButtonNumbers = "36";
        		i = 17;
        	} else if (GUI.buttonNumber.equals("37")) {
        		possibleButtonNumbers = "37";
        		i = 18;
        	} else if (GUI.buttonNumber.equals("38")) {
        		possibleButtonNumbers = "38";
        		i = 19;
        	} else if (GUI.buttonNumber.equals("43")) { //4
        		possibleButtonNumbers = "43";
        		i = 24;
        	} else if (GUI.buttonNumber.equals("44")) {
        		possibleButtonNumbers = "44";
        		i = 25;
        	} else if (GUI.buttonNumber.equals("45")) {
        		possibleButtonNumbers = "45";
        		i = 26;
        	} else if (GUI.buttonNumber.equals("46")) {
        		possibleButtonNumbers = "46";
        		i = 27;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers)) {
				possibleMoves.add(2 + i);
                possibleMoves.add(4 + i);
                possibleMoves.add(9 + i);
                possibleMoves.add(13 + i);
                possibleMoves.add(25 + i);
                possibleMoves.add(29 + i);
                possibleMoves.add(34 + i);
                possibleMoves.add(36 + i);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	//Circle around 4x4
        	if(GUI.buttonNumber.equals("18")) {// Left
        		possibleButtonNumbers1 = "18";
        		i = 0;
        	} else if(GUI.buttonNumber.equals("26")) {
        		possibleButtonNumbers1 = "26";
        		i = 8;
        	} else if(GUI.buttonNumber.equals("34")) {
        		possibleButtonNumbers1 = "34";
        		i = 16;
        	} else if(GUI.buttonNumber.equals("42")) {
        		possibleButtonNumbers1 = "42";
        		i = 24;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers1)) {
				possibleMoves.add(1 + i);
                possibleMoves.add(3 + i);
                possibleMoves.add(12 + i);
                possibleMoves.add(28 + i);
                possibleMoves.add(33 + i);
                possibleMoves.add(35 + i);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("23")) {//Right
        		possibleButtonNumbers2 = "23";
        		i = 0;
        	} else if(GUI.buttonNumber.equals("31")) {
        		possibleButtonNumbers2 = "31";
        		i = 8;
        	} else if(GUI.buttonNumber.equals("39")) {
        		possibleButtonNumbers2 = "39";
        		i = 16;
        	} else if(GUI.buttonNumber.equals("47")) {
        		possibleButtonNumbers2 = "47";
        		i = 24;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers2)) {
                possibleMoves.add(6 + i);
                possibleMoves.add(8 + i);
                possibleMoves.add(13 + i);
                possibleMoves.add(29 + i);
                possibleMoves.add(38 + i);
                possibleMoves.add(40 + i);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("11")) {//Top
        		possibleButtonNumbers3 = "11";
        		i = 0;
        	} else if(GUI.buttonNumber.equals("12")) {
        		possibleButtonNumbers3 = "12";
        		i = 1;
        	} else if(GUI.buttonNumber.equals("13")) {
        		possibleButtonNumbers3 = "13";
        		i = 2;
        	} else if(GUI.buttonNumber.equals("14")) {
        		possibleButtonNumbers3 = "14";
        		i = 3;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers3)) {
                possibleMoves.add(1 + i);
                possibleMoves.add(5 + i);
                possibleMoves.add(17 + i);
                possibleMoves.add(21 + i);
                possibleMoves.add(26 + i);
                possibleMoves.add(28 + i);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("51")) {// Bottom
        		possibleButtonNumbers4 = "51";
        		i = 0;
        	} else if(GUI.buttonNumber.equals("52")) {
        		possibleButtonNumbers4 = "52";
        		i = 1;
        	} else if(GUI.buttonNumber.equals("53")) {
        		possibleButtonNumbers4 = "53";
        		i = 2;
        	} else if(GUI.buttonNumber.equals("54")) {
        		possibleButtonNumbers4 = "54";
        		i = 3;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers4)) {
				possibleMoves.add(2 + i);
                possibleMoves.add(4 + i);
                possibleMoves.add(9 + i);
                possibleMoves.add(13 + i);
                possibleMoves.add(57 + i);
                possibleMoves.add(61 + i);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	//Corners
        	if(GUI.buttonNumber.equals("10")) {//1
        		possibleButtonNumbers5 = "10";
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers5)) {
                possibleMoves.add(4);
                possibleMoves.add(20);
                possibleMoves.add(25);
                possibleMoves.add(27);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("15")) {//2
        		possibleButtonNumbers6 = "15";
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers6)) {
                possibleMoves.add(5);
                possibleMoves.add(21);
                possibleMoves.add(30);
                possibleMoves.add(32);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("50")) {//3
        		possibleButtonNumbers7 = "50";
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers7)) {
                possibleMoves.add(33);
                possibleMoves.add(35);
                possibleMoves.add(44);
                possibleMoves.add(60);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("55")) {//4
        		possibleButtonNumbers8 = "55";
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers8)) {
                possibleMoves.add(38);
                possibleMoves.add(40);
                possibleMoves.add(45);
                possibleMoves.add(61);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	//Circle 2
        	if(GUI.buttonNumber.equals("9")) {// Left
        		possibleButtonNumbers9 = "9";
        		i = -8;
        	} else if(GUI.buttonNumber.equals("17")) {
        		possibleButtonNumbers9 = "17";
        		i = 0;
        	} else if(GUI.buttonNumber.equals("25")) {
        		possibleButtonNumbers9 = "25";
        		i = 8;
        	} else if(GUI.buttonNumber.equals("33")) {
        		possibleButtonNumbers9 = "33";
        		i = 16;
        	} else if(GUI.buttonNumber.equals("41")) {
        		possibleButtonNumbers9 = "41";
        		i = 24;
        	} else if(GUI.buttonNumber.equals("49")) {
        		possibleButtonNumbers9 = "49";
        		i = 32;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers9)) {
				possibleMoves.add(2 + i);
                possibleMoves.add(11 + i);
                possibleMoves.add(27 + i);
                possibleMoves.add(34 + i);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("16")) {// Right
        		possibleButtonNumbers10 = "16";
        		i = -8;
        	} else if(GUI.buttonNumber.equals("24")) {
        		possibleButtonNumbers10 = "24";
        		i = 0;
        	} else if(GUI.buttonNumber.equals("32")) {
        		possibleButtonNumbers10 = "32";
        		i = 8;
        	} else if(GUI.buttonNumber.equals("40")) {
        		possibleButtonNumbers10 = "40";
        		i = 16;
        	} else if(GUI.buttonNumber.equals("48")) {
        		possibleButtonNumbers10 = "48";
        		i = 24;
        	} else if(GUI.buttonNumber.equals("56")) {
        		possibleButtonNumbers10 = "56";
        		i = 32;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers10)) {
				possibleMoves.add(7 + i);
                possibleMoves.add(14 + i);
                possibleMoves.add(30 + i);
                possibleMoves.add(39 + i);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("3")) {//Top
        		possibleButtonNumbers11 = "3";
        		i = 0;
        	} else if(GUI.buttonNumber.equals("4")) {
        		possibleButtonNumbers11 = "4";
        		i = 1;
        	} else if(GUI.buttonNumber.equals("5")) {
        		possibleButtonNumbers11 = "5";
        		i = 2;
        	} else if(GUI.buttonNumber.equals("6")) {
        		possibleButtonNumbers11 = "6";
        		i = 3;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers11)) {
                possibleMoves.add(9 + i);
                possibleMoves.add(13 + i);
                possibleMoves.add(18 + i);
                possibleMoves.add(20 + i);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("59")) {// Bottom
        		possibleButtonNumbers12 = "59";
        		i = 0;
        	} else if(GUI.buttonNumber.equals("60")) {
        		possibleButtonNumbers12 = "60";
        		i = 1;
        	} else if(GUI.buttonNumber.equals("61")) {
        		possibleButtonNumbers12 = "61";
        		i = 2;
        	} else if(GUI.buttonNumber.equals("62")) {
        		possibleButtonNumbers12 = "62";
        		i = 3;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers12)) {
				possibleMoves.add(42 + i);
                possibleMoves.add(44 + i);
                possibleMoves.add(49 + i);
                possibleMoves.add(53 + i);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	//Corners
        	if(GUI.buttonNumber.equals("2")) {//1
        		possibleButtonNumbers13 = "2";
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers13)) {
				possibleMoves.add(12);
                possibleMoves.add(17);
                possibleMoves.add(19);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("7")) {//2
        		possibleButtonNumbers14 = "7";
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers14)) {
				possibleMoves.add(13);
                possibleMoves.add(22);
                possibleMoves.add(24);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("58")) {//3
        		possibleButtonNumbers15 = "58";
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers15)) {
				possibleMoves.add(41);
                possibleMoves.add(43);
                possibleMoves.add(52);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("63")) {//4
        		possibleButtonNumbers16 = "63";
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers16)) {
				possibleMoves.add(46);
                possibleMoves.add(48);
                possibleMoves.add(53);
                
                Main.possibleMove = possibleMoves;      
        
            }
        	
        	if(GUI.buttonNumber.equals("1")) {//1
        		possibleButtonNumbers17 = "1";
        		i = 0;
        		j = 0;
        	} else if(GUI.buttonNumber.equals("8")) {//1
        		possibleButtonNumbers17 = "8";
        		i = 3;
        		j = 5;
        	}  else if(GUI.buttonNumber.equals("57")) {//1
        		possibleButtonNumbers17 = "57";
        		i = 31;
        		j = 33;
        	}  else if(GUI.buttonNumber.equals("64")) {//1
        		possibleButtonNumbers17 = "64";
        		i = 36;
        		j = 36;
        	}
        	
        	if (GUI.buttonNumber.equals(possibleButtonNumbers17)) {
				possibleMoves.add(11 + i);
                possibleMoves.add(18 + j);
                
                Main.possibleMove = possibleMoves;      
        
            }       	
		}
	}
}
