import java.util.ArrayList;

public class Rook {
	
	public static int x = 0;
	public static int ownPosition = 0;

	public static void rook() {
		
		//Rook moves
		if(Main.pieceToMove == GUI.wRookA || Main.pieceToMove == GUI.bRookA) {
			if (Main.possibleMove == null) {
                Main.possibleMove = new ArrayList<Integer>();
        	}
			
			ArrayList<Integer> possibleMoves = new ArrayList<Integer>(); 
        	
			String possibleButtonNumbers = "";
			String possibleButtonNumbers1 = "";
			String possibleButtonNumbers2 = "";
			String possibleButtonNumbers3 = "";
			String possibleButtonNumbers4 = "";
			String possibleButtonNumbers5 = "";
			String possibleButtonNumbers6 = "";
			String possibleButtonNumbers7 = "";
        	
        	//Row 1
        	if(GUI.buttonNumber.equals("1")) {
        		possibleButtonNumbers = "1";
        		x = 1;
        	} else if(GUI.buttonNumber.equals("2")) {
        		possibleButtonNumbers = "2";
        		x = 2;
        	} else if(GUI.buttonNumber.equals("3")) {
        		possibleButtonNumbers = "3";
        		x = 3;
        	} else if(GUI.buttonNumber.equals("4")) {
        		possibleButtonNumbers = "4";
        		x = 4;
        	} else if(GUI.buttonNumber.equals("5")) {
        		possibleButtonNumbers = "5";
        		x = 5;
        	} else if(GUI.buttonNumber.equals("6")) {
        		possibleButtonNumbers = "6";
        		x = 6;
        	} else if(GUI.buttonNumber.equals("7")) {
        		possibleButtonNumbers = "7";
        		x = 7;
        	} else if(GUI.buttonNumber.equals("8")) {
        		possibleButtonNumbers = "8";
        		x = 8;
        	}
			
            if (GUI.buttonNumber.equals(possibleButtonNumbers)) {
                
            	ownPosition = x;
				for (int i = 1; i <= 8; i++) {
					if(i != ownPosition) {
						possibleMoves.add(i);
					}
                }
                for (int i = x; i <= 64; i += 8) {
                	if(i != ownPosition) {
                		possibleMoves.add(i);
					}
                    
                }
                Main.possibleMove = possibleMoves;
            }
            
            //Row 2
            if(GUI.buttonNumber.equals("9")) {
        		possibleButtonNumbers1 = "9";
        		x = 9;
        	} else if(GUI.buttonNumber.equals("10")) {
        		possibleButtonNumbers1 = "10";
        		x = 10;
        	} else if(GUI.buttonNumber.equals("11")) {
        		possibleButtonNumbers1 = "11";
        		x = 11;
        	} else if(GUI.buttonNumber.equals("12")) {
        		possibleButtonNumbers1 = "12";
        		x = 12;
        	} else if(GUI.buttonNumber.equals("13")) {
        		possibleButtonNumbers1 = "13";
        		x = 13;
        	} else if(GUI.buttonNumber.equals("14")) {
        		possibleButtonNumbers1 = "14";
        		x = 14;
        	} else if(GUI.buttonNumber.equals("15")) {
        		possibleButtonNumbers1 = "15";
        		x = 15;
        	} else if(GUI.buttonNumber.equals("16")) {
        		possibleButtonNumbers1 = "16";
        		x = 16;
        	}
			
            if (GUI.buttonNumber.equals(possibleButtonNumbers1)) {
            	
            	ownPosition = x;
				for (int i = 9; i <= 16; i++) {
					if(i != ownPosition) {
						possibleMoves.add(i);
					}
                }
                for (int i = x - 8; i <= 64; i += 8) {
                	if(i != ownPosition) {
                		possibleMoves.add(i);
					}
                    
                }
                Main.possibleMove = possibleMoves;
            }
            
            //row 3
            if(GUI.buttonNumber.equals("17")) {
        		possibleButtonNumbers2 = "17";
        		x = 17;
        	} else if(GUI.buttonNumber.equals("18")) {
        		possibleButtonNumbers2 = "18";
        		x = 18;
        	} else if(GUI.buttonNumber.equals("19")) {
        		possibleButtonNumbers2 = "19";
        		x = 19;
        	} else if(GUI.buttonNumber.equals("20")) {
        		possibleButtonNumbers2 = "20";
        		x = 20;
        	} else if(GUI.buttonNumber.equals("21")) {
        		possibleButtonNumbers2 = "21";
        		x = 21;
        	} else if(GUI.buttonNumber.equals("22")) {
        		possibleButtonNumbers2 = "22";
        		x = 22;
        	} else if(GUI.buttonNumber.equals("23")) {
        		possibleButtonNumbers2 = "23";
        		x = 23;
        	} else if(GUI.buttonNumber.equals("24")) {
        		possibleButtonNumbers2 = "24";
        		x = 24;
        	}
			
            if (GUI.buttonNumber.equals(possibleButtonNumbers2)) {
            	
            	ownPosition = x;
				for (int i = 17; i <= 24; i++) {
					if(i != ownPosition) {
						possibleMoves.add(i);
					}
                }
                for (int i = x - 16; i <= 64; i += 8) {
                	if(i != ownPosition) {
                		possibleMoves.add(i);
					}
                    
                }
                Main.possibleMove = possibleMoves;
            }
            
            //row 4
            if(GUI.buttonNumber.equals("25")) {
        		possibleButtonNumbers3 = "25";
        		x = 25;
        	} else if(GUI.buttonNumber.equals("26")) {
        		possibleButtonNumbers3 = "26";
        		x = 26;
        	} else if(GUI.buttonNumber.equals("27")) {
        		possibleButtonNumbers3 = "27";
        		x = 27;
        	} else if(GUI.buttonNumber.equals("28")) {
        		possibleButtonNumbers3 = "28";
        		x = 28;
        	} else if(GUI.buttonNumber.equals("29")) {
        		possibleButtonNumbers3 = "29";
        		x = 29;
        	} else if(GUI.buttonNumber.equals("30")) {
        		possibleButtonNumbers3 = "30";
        		x = 30;
        	} else if(GUI.buttonNumber.equals("31")) {
        		possibleButtonNumbers3 = "31";
        		x = 31;
        	} else if(GUI.buttonNumber.equals("32")) {
        		possibleButtonNumbers3 = "32";
        		x = 32;
        	}
			
            if (GUI.buttonNumber.equals(possibleButtonNumbers3)) {
            	
            	ownPosition = x;
				for (int i = 25; i <= 32; i++) {
					if(i != ownPosition) {
						possibleMoves.add(i);
					}
                }
                for (int i = x - 24; i <= 64; i += 8) {
                	if(i != ownPosition) {
                		possibleMoves.add(i);
					}
                    
                }
                Main.possibleMove = possibleMoves;
            }
            
            //row 5
            if(GUI.buttonNumber.equals("33")) {
        		possibleButtonNumbers4 = "33";
        		x = 33;
        	} else if(GUI.buttonNumber.equals("34")) {
        		possibleButtonNumbers4 = "34";
        		x = 34;
        	} else if(GUI.buttonNumber.equals("35")) {
        		possibleButtonNumbers4 = "35";
        		x = 35;
        	} else if(GUI.buttonNumber.equals("36")) {
        		possibleButtonNumbers4 = "36";
        		x = 36;
        	} else if(GUI.buttonNumber.equals("37")) {
        		possibleButtonNumbers4 = "37";
        		x = 37;
        	} else if(GUI.buttonNumber.equals("38")) {
        		possibleButtonNumbers4 = "38";
        		x = 38;
        	} else if(GUI.buttonNumber.equals("39")) {
        		possibleButtonNumbers4 = "39";
        		x = 39;
        	} else if(GUI.buttonNumber.equals("40")) {
        		possibleButtonNumbers4 = "40";
        		x = 40;
        	}
			
            if (GUI.buttonNumber.equals(possibleButtonNumbers4)) {
            	
            	ownPosition = x;
				for (int i = 33; i <= 40; i++) {
					if(i != ownPosition) {
						possibleMoves.add(i);
					}
                }
                for (int i = x - 32; i <= 64; i += 8) {
                	if(i != ownPosition) {
                		possibleMoves.add(i);
					}
                    
                }
                Main.possibleMove = possibleMoves;
            }
            
            //row 6
            if(GUI.buttonNumber.equals("41")) {
        		possibleButtonNumbers5 = "41";
        		x = 41;
        	} else if(GUI.buttonNumber.equals("42")) {
        		possibleButtonNumbers5 = "42";
        		x = 42;
        	} else if(GUI.buttonNumber.equals("43")) {
        		possibleButtonNumbers5 = "43";
        		x = 43;
        	} else if(GUI.buttonNumber.equals("44")) {
        		possibleButtonNumbers5 = "44";
        		x = 44;
        	} else if(GUI.buttonNumber.equals("45")) {
        		possibleButtonNumbers5 = "45";
        		x = 45;
        	} else if(GUI.buttonNumber.equals("46")) {
        		possibleButtonNumbers5 = "46";
        		x = 46;
        	} else if(GUI.buttonNumber.equals("47")) {
        		possibleButtonNumbers5 = "47";
        		x = 47;
        	} else if(GUI.buttonNumber.equals("48")) {
        		possibleButtonNumbers5 = "48";
        		x = 48;
        	}
			
            if (GUI.buttonNumber.equals(possibleButtonNumbers5)) {
            	
            	ownPosition = x;
				for (int i = 41; i <= 48; i++) {
					if(i != ownPosition) {
						possibleMoves.add(i);
					}
                }
                for (int i = x - 40; i <= 64; i += 8) {
                	if(i != ownPosition) {
                		possibleMoves.add(i);
					}
                    
                }
                Main.possibleMove = possibleMoves;
            }
            
            //row 7
            if(GUI.buttonNumber.equals("49")) {
        		possibleButtonNumbers6 = "49";
        		x = 49;
        	} else if(GUI.buttonNumber.equals("50")) {
        		possibleButtonNumbers6 = "50";
        		x = 50;
        	} else if(GUI.buttonNumber.equals("51")) {
        		possibleButtonNumbers6 = "51";
        		x = 51;
        	} else if(GUI.buttonNumber.equals("52")) {
        		possibleButtonNumbers6 = "52";
        		x = 52;
        	} else if(GUI.buttonNumber.equals("53")) {
        		possibleButtonNumbers6 = "53";
        		x = 53;
        	} else if(GUI.buttonNumber.equals("54")) {
        		possibleButtonNumbers6 = "54";
        		x = 54;
        	} else if(GUI.buttonNumber.equals("55")) {
        		possibleButtonNumbers6 = "55";
        		x = 55;
        	} else if(GUI.buttonNumber.equals("56")) {
        		possibleButtonNumbers6 = "56";
        		x = 56;
        	}
			
            if (GUI.buttonNumber.equals(possibleButtonNumbers6)) {
            	
            	ownPosition = x;
				for (int i = 49; i <= 56; i++) {
					if(i != ownPosition) {
						possibleMoves.add(i);
					}
                }
                for (int i = x - 48; i <= 64; i += 8) {
                	if(i != ownPosition) {
                		possibleMoves.add(i);
					}
                    
                }
                Main.possibleMove = possibleMoves;
            }
            
            //row 8
            if(GUI.buttonNumber.equals("57")) {
        		possibleButtonNumbers7 = "57";
        		x = 57;
        	} else if(GUI.buttonNumber.equals("58")) {
        		possibleButtonNumbers7 = "58";
        		x = 58;
        	} else if(GUI.buttonNumber.equals("59")) {
        		possibleButtonNumbers7 = "59";
        		x = 59;
        	} else if(GUI.buttonNumber.equals("60")) {
        		possibleButtonNumbers7 = "60";
        		x = 60;
        	} else if(GUI.buttonNumber.equals("61")) {
        		possibleButtonNumbers7 = "61";
        		x = 61;
        	} else if(GUI.buttonNumber.equals("62")) {
        		possibleButtonNumbers7 = "62";
        		x = 62;
        	} else if(GUI.buttonNumber.equals("63")) {
        		possibleButtonNumbers7 = "63";
        		x = 63;
        	} else if(GUI.buttonNumber.equals("64")) {
        		possibleButtonNumbers7 = "64";
        		x = 64;
        	}
			
            if (GUI.buttonNumber.equals(possibleButtonNumbers7)) {
            	
            	ownPosition = x;
				for (int i = 57; i <= 64; i++) {
					if(i != ownPosition) {
						possibleMoves.add(i);
					}
                }
                for (int i = x - 56; i <= 64; i += 8) {
                	if(i != ownPosition) {
                		possibleMoves.add(i);
					}
                    
                }
                Main.possibleMove = possibleMoves;
            }   
		}
	}
}
