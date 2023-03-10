import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GUI extends JFrame implements ActionListener{
	
	private JFrame frame;
	private int width;
	private int height;
	JPanel panel = new JPanel();
	GridLayout layout = new GridLayout(0,8);
	
	// Pieces' ASCII
	public static String empty = ""; //For squares without any piece
	
	public static String wPawnA = "\u2659";
	public static String wRookA = "\u2656";
	public static String wBishopA = "\u2657";
	public static String wKnightA = "\u2658";
	public static String wKingA = "\u2654";
	public static String wQueenA = "\u2655";
	
	public static String bPawnA = "\u265F";
	public static String bRookA = "\u265C";
	public static String bBishopA = "\u265D";
	public static String bKnightA = "\u265E";
	public static String bKingA = "\u265A";
	public static String bQueenA = "\u265B";
	
	// squares content - place for pieces with the starting positions, can be separate later
	String sq1content = bRookA;
	String sq2content = bKnightA;
	String sq3content = bBishopA;
	String sq4content = bQueenA;
	String sq5content = bKingA;
	String sq6content = bBishopA;
	String sq7content = bKnightA;
	String sq8content = bRookA;
	String sq9content = bPawnA;
	String sq10content = bPawnA;
	String sq11content = bPawnA;
	String sq12content = bPawnA;
	String sq13content = bPawnA;
	String sq14content = bPawnA;
	String sq15content = bPawnA;
	String sq16content = bPawnA;
	String sq17content = empty;
	String sq18content = empty;
	String sq19content = empty;
	String sq20content = empty;
	String sq21content = empty;
	String sq22content = empty;
	String sq23content = empty;
	String sq24content = empty;
	String sq25content = empty;
	String sq26content = empty;
	String sq27content = empty;
	String sq28content = empty;
	String sq29content = empty;
	String sq30content = empty;
	String sq31content = empty;
	String sq32content = empty;
	String sq33content = empty;
	String sq34content = empty;
	String sq35content = empty;
	String sq36content = empty;
	String sq37content = empty;
	String sq38content = empty;
	String sq39content = empty;
	String sq40content = empty;
	String sq41content = empty;
	String sq42content = empty;
	String sq43content = empty;
	String sq44content = empty;
	String sq45content = empty;
	String sq46content = empty;
	String sq47content = empty;
	String sq48content = empty;
	String sq49content = wPawnA;
	String sq50content = wPawnA;
	String sq51content = wPawnA;
	String sq52content = wPawnA;
	String sq53content = wPawnA;
	String sq54content = wPawnA;
	String sq55content = wPawnA;
	String sq56content = wPawnA;
	String sq57content = wRookA;
	String sq58content = wKnightA;
	String sq59content = wBishopA;
	String sq60content = wQueenA;
	String sq61content = wKingA;
	String sq62content = wBishopA;
	String sq63content = wKnightA;
	String sq64content = wRookA;
	
	//squares
	JButton square1 = new JButton(sq1content);
	JButton square2 = new JButton(sq2content);
	JButton square3 = new JButton(sq3content);
	JButton square4 = new JButton(sq4content);
	JButton square5 = new JButton(sq5content);
	JButton square6 = new JButton(sq6content);
	JButton square7 = new JButton(sq7content);
	JButton square8 = new JButton(sq8content);
	JButton square9 = new JButton(sq9content);
	JButton square10 = new JButton(sq10content);
	JButton square11 = new JButton(sq11content);
	JButton square12 = new JButton(sq12content);
	JButton square13 = new JButton(sq13content);
	JButton square14 = new JButton(sq14content);
	JButton square15 = new JButton(sq15content);
	JButton square16 = new JButton(sq16content);
	JButton square17 = new JButton(sq17content);
	JButton square18 = new JButton(sq18content);
	JButton square19 = new JButton(sq19content);
	JButton square20 = new JButton(sq20content);
	JButton square21 = new JButton(sq21content);
	JButton square22 = new JButton(sq22content);
	JButton square23 = new JButton(sq23content);
	JButton square24 = new JButton(sq24content);
	JButton square25 = new JButton(sq25content);
	JButton square26 = new JButton(sq26content);
	JButton square27 = new JButton(sq27content);
	JButton square28 = new JButton(sq28content);
	JButton square29 = new JButton(sq29content);
	JButton square30 = new JButton(sq30content);
	JButton square31 = new JButton(sq31content);
	JButton square32 = new JButton(sq32content);
	JButton square33 = new JButton(sq33content);
	JButton square34 = new JButton(sq34content);
	JButton square35 = new JButton(sq35content);
	JButton square36 = new JButton(sq36content);
	JButton square37 = new JButton(sq37content);
	JButton square38 = new JButton(sq38content);
	JButton square39 = new JButton(sq39content);
	JButton square40 = new JButton(sq40content);
	JButton square41 = new JButton(sq41content);
	JButton square42 = new JButton(sq42content);
	JButton square43 = new JButton(sq43content);
	JButton square44 = new JButton(sq44content);
	JButton square45 = new JButton(sq45content);
	JButton square46 = new JButton(sq46content);
	JButton square47 = new JButton(sq47content);
	JButton square48 = new JButton(sq48content);
	JButton square49 = new JButton(sq49content);
	JButton square50 = new JButton(sq50content);
	JButton square51 = new JButton(sq51content);
	JButton square52 = new JButton(sq52content);
	JButton square53 = new JButton(sq53content);
	JButton square54 = new JButton(sq54content);
	JButton square55 = new JButton(sq55content);
	JButton square56 = new JButton(sq56content);
	JButton square57 = new JButton(sq57content);
	JButton square58 = new JButton(sq58content);
	JButton square59 = new JButton(sq59content);
	JButton square60 = new JButton(sq60content);
	JButton square61 = new JButton(sq61content);
	JButton square62 = new JButton(sq62content);
	JButton square63 = new JButton(sq63content);
	JButton square64 = new JButton(sq64content);
	
	public void boardColors() {
		square1.setBackground(Color.getHSBColor(32, 6, 100));
		square2.setBackground(Color.LIGHT_GRAY);
		square3.setBackground(Color.getHSBColor(32, 6, 100));
		square4.setBackground(Color.LIGHT_GRAY);
		square5.setBackground(Color.getHSBColor(32, 6, 100));
		square6.setBackground(Color.LIGHT_GRAY);
		square7.setBackground(Color.getHSBColor(32, 6, 100));
		square8.setBackground(Color.LIGHT_GRAY);
		
		square9.setBackground(Color.LIGHT_GRAY);
		square10.setBackground(Color.getHSBColor(32, 6, 100));
		square11.setBackground(Color.LIGHT_GRAY);
		square12.setBackground(Color.getHSBColor(32, 6, 100));
		square13.setBackground(Color.LIGHT_GRAY);
		square14.setBackground(Color.getHSBColor(32, 6, 100));
		square15.setBackground(Color.LIGHT_GRAY);
		square16.setBackground(Color.getHSBColor(32, 6, 100));
		
		square17.setBackground(Color.getHSBColor(32, 6, 100));
		square18.setBackground(Color.LIGHT_GRAY);
		square19.setBackground(Color.getHSBColor(32, 6, 100));
		square20.setBackground(Color.LIGHT_GRAY);
		square21.setBackground(Color.getHSBColor(32, 6, 100));
		square22.setBackground(Color.LIGHT_GRAY);
		square23.setBackground(Color.getHSBColor(32, 6, 100));
		square24.setBackground(Color.LIGHT_GRAY);
		
		square25.setBackground(Color.LIGHT_GRAY);
		square26.setBackground(Color.getHSBColor(32, 6, 100));
		square27.setBackground(Color.LIGHT_GRAY);
		square28.setBackground(Color.getHSBColor(32, 6, 100));
		square29.setBackground(Color.LIGHT_GRAY);
		square30.setBackground(Color.getHSBColor(32, 6, 100));
		square31.setBackground(Color.LIGHT_GRAY);
		square32.setBackground(Color.getHSBColor(32, 6, 100));
		
		square33.setBackground(Color.getHSBColor(32, 6, 100));
		square34.setBackground(Color.LIGHT_GRAY);
		square35.setBackground(Color.getHSBColor(32, 6, 100));
		square36.setBackground(Color.LIGHT_GRAY);
		square37.setBackground(Color.getHSBColor(32, 6, 100));
		square38.setBackground(Color.LIGHT_GRAY);
		square39.setBackground(Color.getHSBColor(32, 6, 100));
		square40.setBackground(Color.LIGHT_GRAY);
		
		square41.setBackground(Color.LIGHT_GRAY);
		square42.setBackground(Color.getHSBColor(32, 6, 100));
		square43.setBackground(Color.LIGHT_GRAY);
		square44.setBackground(Color.getHSBColor(32, 6, 100));
		square45.setBackground(Color.LIGHT_GRAY);
		square46.setBackground(Color.getHSBColor(32, 6, 100));
		square47.setBackground(Color.LIGHT_GRAY);
		square48.setBackground(Color.getHSBColor(32, 6, 100));
		
		square49.setBackground(Color.getHSBColor(32, 6, 100));
		square50.setBackground(Color.LIGHT_GRAY);
		square51.setBackground(Color.getHSBColor(32, 6, 100));
		square52.setBackground(Color.LIGHT_GRAY);
		square53.setBackground(Color.getHSBColor(32, 6, 100));
		square54.setBackground(Color.LIGHT_GRAY);
		square55.setBackground(Color.getHSBColor(32, 6, 100));
		square56.setBackground(Color.LIGHT_GRAY);
		
		square57.setBackground(Color.LIGHT_GRAY);
		square58.setBackground(Color.getHSBColor(32, 6, 100));
		square59.setBackground(Color.LIGHT_GRAY);
		square60.setBackground(Color.getHSBColor(32, 6, 100));
		square61.setBackground(Color.LIGHT_GRAY);
		square62.setBackground(Color.getHSBColor(32, 6, 100));
		square63.setBackground(Color.LIGHT_GRAY);
		square64.setBackground(Color.getHSBColor(32, 6, 100));
		
		square1.setBorder(defaultBorder);
		square2.setBorder(defaultBorder);
		square3.setBorder(defaultBorder);
		square4.setBorder(defaultBorder);
		square5.setBorder(defaultBorder);
		square6.setBorder(defaultBorder);
		square7.setBorder(defaultBorder);
		square8.setBorder(defaultBorder);
		square9.setBorder(defaultBorder);
		square10.setBorder(defaultBorder);
		square11.setBorder(defaultBorder);
		square12.setBorder(defaultBorder);
		square13.setBorder(defaultBorder);
		square14.setBorder(defaultBorder);
		square15.setBorder(defaultBorder);
		square16.setBorder(defaultBorder);
		square17.setBorder(defaultBorder);
		square18.setBorder(defaultBorder);
		square19.setBorder(defaultBorder);
		square20.setBorder(defaultBorder);
		square21.setBorder(defaultBorder);
		square22.setBorder(defaultBorder);
		square23.setBorder(defaultBorder);
		square24.setBorder(defaultBorder);
		square25.setBorder(defaultBorder);
		square26.setBorder(defaultBorder);
		square27.setBorder(defaultBorder);
		square28.setBorder(defaultBorder);
		square29.setBorder(defaultBorder);
		square30.setBorder(defaultBorder);
		square31.setBorder(defaultBorder);
		square32.setBorder(defaultBorder);
		square33.setBorder(defaultBorder);
		square34.setBorder(defaultBorder);
		square35.setBorder(defaultBorder);
		square36.setBorder(defaultBorder);
		square37.setBorder(defaultBorder);
		square38.setBorder(defaultBorder);
		square39.setBorder(defaultBorder);
		square40.setBorder(defaultBorder);
		square41.setBorder(defaultBorder);
		square42.setBorder(defaultBorder);
		square43.setBorder(defaultBorder);
		square44.setBorder(defaultBorder);
		square45.setBorder(defaultBorder);
		square46.setBorder(defaultBorder);
		square47.setBorder(defaultBorder);
		square48.setBorder(defaultBorder);
		square49.setBorder(defaultBorder);
		square50.setBorder(defaultBorder);
		square51.setBorder(defaultBorder);
		square52.setBorder(defaultBorder);
		square53.setBorder(defaultBorder);
		square54.setBorder(defaultBorder);
		square55.setBorder(defaultBorder);
		square56.setBorder(defaultBorder);
		square57.setBorder(defaultBorder);
		square58.setBorder(defaultBorder);
		square59.setBorder(defaultBorder);
		square60.setBorder(defaultBorder);
		square61.setBorder(defaultBorder);
		square62.setBorder(defaultBorder);
		square63.setBorder(defaultBorder);
		square64.setBorder(defaultBorder);		
	}
	
	public void GUIframe(int w, int h) {
		frame = new JFrame();
		width = w;
		height = h;
	}
	
	public void GUIsettings2() {
		frame.setSize(width, height);
		frame.setMinimumSize(new Dimension(600, 600));
		frame.setTitle("Chess 1.0");
		
		panel.setLayout(layout);
		frame.add(panel);
		
		//Pieces' style
		JButton baseButton = new JButton();
		Font buttonFont = new Font(baseButton.getFont().getName(), baseButton.getFont().getStyle(), 40);
		square1.setFont(buttonFont);
		square2.setFont(buttonFont);
		square3.setFont(buttonFont);
		square4.setFont(buttonFont);
		square5.setFont(buttonFont);
		square6.setFont(buttonFont);
		square7.setFont(buttonFont);
		square8.setFont(buttonFont);
		square9.setFont(buttonFont);
		square10.setFont(buttonFont);
		square11.setFont(buttonFont);
		square12.setFont(buttonFont);
		square13.setFont(buttonFont);
		square14.setFont(buttonFont);
		square15.setFont(buttonFont);
		square16.setFont(buttonFont);
		square17.setFont(buttonFont);
		square18.setFont(buttonFont);
		square19.setFont(buttonFont);
		square20.setFont(buttonFont);
		square21.setFont(buttonFont);
		square22.setFont(buttonFont);
		square23.setFont(buttonFont);
		square24.setFont(buttonFont);
		square25.setFont(buttonFont);
		square26.setFont(buttonFont);
		square27.setFont(buttonFont);
		square28.setFont(buttonFont);
		square29.setFont(buttonFont);
		square30.setFont(buttonFont);
		square31.setFont(buttonFont);
		square32.setFont(buttonFont);
		square33.setFont(buttonFont);
		square34.setFont(buttonFont);
		square35.setFont(buttonFont);
		square36.setFont(buttonFont);
		square37.setFont(buttonFont);
		square38.setFont(buttonFont);
		square39.setFont(buttonFont);
		square40.setFont(buttonFont);
		square41.setFont(buttonFont);
		square42.setFont(buttonFont);
		square43.setFont(buttonFont);
		square44.setFont(buttonFont);
		square45.setFont(buttonFont);
		square46.setFont(buttonFont);
		square47.setFont(buttonFont);
		square48.setFont(buttonFont);
		square49.setFont(buttonFont);
		square50.setFont(buttonFont);
		square51.setFont(buttonFont);
		square52.setFont(buttonFont);
		square53.setFont(buttonFont);
		square54.setFont(buttonFont);
		square55.setFont(buttonFont);
		square56.setFont(buttonFont);
		square57.setFont(buttonFont);
		square58.setFont(buttonFont);
		square59.setFont(buttonFont);
		square60.setFont(buttonFont);
		square61.setFont(buttonFont);
		square62.setFont(buttonFont);
		square63.setFont(buttonFont);
		square64.setFont(buttonFont);
		
		//Names needed for the engine
		square1.setName("1");
		square2.setName("2");
		square3.setName("3");
		square4.setName("4");
		square5.setName("5");
		square6.setName("6");
		square7.setName("7");
		square8.setName("8");
		square9.setName("9");
		square10.setName("10");
		square11.setName("11");
		square12.setName("12");
		square13.setName("13");
		square14.setName("14");
		square15.setName("15");
		square16.setName("16");
		square17.setName("17");
		square18.setName("18");
		square19.setName("19");
		square20.setName("20");
		square21.setName("21");
		square22.setName("22");
		square23.setName("23");
		square24.setName("24");
		square25.setName("25");
		square26.setName("26");
		square27.setName("27");
		square28.setName("28");
		square29.setName("29");
		square30.setName("30");
		square31.setName("31");
		square32.setName("32");
		square33.setName("33");
		square34.setName("34");
		square35.setName("35");
		square36.setName("36");
		square37.setName("37");
		square38.setName("38");
		square39.setName("39");
		square40.setName("40");
		square41.setName("41");
		square42.setName("42");
		square43.setName("43");
		square44.setName("44");
		square45.setName("45");
		square46.setName("46");
		square47.setName("47");
		square48.setName("48");
		square49.setName("49");
		square50.setName("50");
		square51.setName("51");
		square52.setName("52");
		square53.setName("53");
		square54.setName("54");
		square55.setName("55");
		square56.setName("56");
		square57.setName("57");
		square58.setName("58");
		square59.setName("59");
		square60.setName("60");
		square61.setName("61");
		square62.setName("62");
		square63.setName("63");
		square64.setName("64");
		
		//Board coloring
		boardColors();
		
		square1.addActionListener(this);
		square2.addActionListener(this);
		square3.addActionListener(this);
		square4.addActionListener(this);
		square5.addActionListener(this);
		square6.addActionListener(this);
		square7.addActionListener(this);
		square8.addActionListener(this);
		square9.addActionListener(this);
		square10.addActionListener(this);
		square11.addActionListener(this);
		square12.addActionListener(this);
		square13.addActionListener(this);
		square14.addActionListener(this);
		square15.addActionListener(this);
		square16.addActionListener(this);
		square17.addActionListener(this);
		square18.addActionListener(this);
		square19.addActionListener(this);
		square20.addActionListener(this);
		square21.addActionListener(this);
		square22.addActionListener(this);
		square23.addActionListener(this);
		square24.addActionListener(this);
		square25.addActionListener(this);
		square26.addActionListener(this);
		square27.addActionListener(this);
		square28.addActionListener(this);
		square29.addActionListener(this);
		square30.addActionListener(this);
		square31.addActionListener(this);
		square32.addActionListener(this);
		square33.addActionListener(this);
		square34.addActionListener(this);
		square35.addActionListener(this);
		square36.addActionListener(this);
		square37.addActionListener(this);
		square38.addActionListener(this);
		square39.addActionListener(this);
		square40.addActionListener(this);
		square41.addActionListener(this);
		square42.addActionListener(this);
		square43.addActionListener(this);
		square44.addActionListener(this);
		square45.addActionListener(this);
		square46.addActionListener(this);
		square47.addActionListener(this);
		square48.addActionListener(this);
		square49.addActionListener(this);
		square50.addActionListener(this);
		square51.addActionListener(this);
		square52.addActionListener(this);
		square53.addActionListener(this);
		square54.addActionListener(this);
		square55.addActionListener(this);
		square56.addActionListener(this);
		square57.addActionListener(this);
		square58.addActionListener(this);
		square59.addActionListener(this);
		square60.addActionListener(this);
		square61.addActionListener(this);
		square62.addActionListener(this);
		square63.addActionListener(this);
		square64.addActionListener(this);		
		
		panel.add(square1);
		panel.add(square2);
		panel.add(square3);
		panel.add(square4);
		panel.add(square5);
		panel.add(square6);
		panel.add(square7);
		panel.add(square8);
		panel.add(square9);
		panel.add(square10);
		panel.add(square11);
		panel.add(square12);
		panel.add(square13);
		panel.add(square14);
		panel.add(square15);
		panel.add(square16);
		panel.add(square17);
		panel.add(square18);
		panel.add(square19);
		panel.add(square20);
		panel.add(square21);
		panel.add(square22);
		panel.add(square23);
		panel.add(square24);
		panel.add(square25);
		panel.add(square26);
		panel.add(square27);
		panel.add(square28);
		panel.add(square29);
		panel.add(square30);
		panel.add(square31);
		panel.add(square32);
		panel.add(square33);
		panel.add(square34);
		panel.add(square35);
		panel.add(square36);
		panel.add(square37);
		panel.add(square38);
		panel.add(square39);
		panel.add(square40);
		panel.add(square41);
		panel.add(square42);
		panel.add(square43);
		panel.add(square44);
		panel.add(square45);
		panel.add(square46);
		panel.add(square47);
		panel.add(square48);
		panel.add(square49);
		panel.add(square50);
		panel.add(square51);
		panel.add(square52);
		panel.add(square53);
		panel.add(square54);
		panel.add(square55);
		panel.add(square56);
		panel.add(square57);
		panel.add(square58);
		panel.add(square59);
		panel.add(square60);
		panel.add(square61);
		panel.add(square62);
		panel.add(square63);
		panel.add(square64);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	//Counter for making moves
	public static int counter = 0;
	public static String pieceCopy;
	public static String squareChecker = "";
	public static Object buttonNumber = "";
	
	//Border for possible moves, default border
	LineBorder borderMove = new LineBorder(Color.GREEN, 3);
	LineBorder defaultBorder = new LineBorder(Color.DARK_GRAY);
	
	//Making pieces movable and output to the engine
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		buttonNumber = ((JComponent) source).getName();
		String pickedPiece = ((AbstractButton) source).getText();
		System.out.println(buttonNumber);
		
		//White's turn
		if(Main.turnTeller == 0) {
				
			if((counter == 0) && (((AbstractButton) source).getText() != "") && (pickedPiece == wPawnA || pickedPiece == wRookA || pickedPiece == wKnightA || pickedPiece == wBishopA || pickedPiece == wQueenA || pickedPiece == wKingA || pickedPiece == empty)) {
			
				counter = 1;
				//To mark picked piece
				((JComponent) source).setBackground(Color.GREEN);
			
				//Copying piece
				pieceCopy = ((AbstractButton) source).getText();
				// picking from the previous square
				((AbstractButton) source).setText(empty);
			
				//Moves sender to the engine / output to engine
				Main.pieceToMove = pieceCopy;
				
				//Pieces in game
				Pawn.pawn();
				Rook.rook();
				Knight.knight();
				Bishop.bishop();
				Queen.queen();
				King.king();
				
				//Bishop marking
				if(Main.possibleMove.contains(1)) {
				    square1.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(2)) {
				    square2.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(3)) {
				    square3.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(4)) {
				    square4.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(5)) {
				    square5.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(6)) {
				    square6.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(7)) {
				    square7.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(8)) {
				    square8.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(9)) {
				    square9.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(10)) {
					square10.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(11)) {
					square11.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(12)) {
					square12.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(13)) {
					square13.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(14)) {
					square14.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(15)) {
					square15.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(16)) {
					square16.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(17)) {
					square17.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(18)) {
					square18.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(19)) {
					square19.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(20)) {
					square20.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(21)) {
					square21.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(22)) {
					square22.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(23)) {
					square23.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(24)) {
					square24.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(25)) {
					square25.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(26)) {
					square26.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(27)) {
					square27.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(28)) {
					square28.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(29)) {
					square29.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(30)) {
					square30.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(31)) {
					square31.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(32)) {
					square32.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(33)) {
					square33.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(34)) {
					square34.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(35)) {
					square35.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(36)) {
					square36.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(37)) {
					square37.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(38)) {
					square38.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(39)) {
					square39.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(40)) {
					square40.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(41)) {
					square41.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(42)) {
					square42.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(43)) {
					square43.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(44)) {
					square44.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(45)) {
					square45.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(46)) {
					square46.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(47)) {
					square47.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(48)) {
					square48.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(49)) {
					square49.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(50)) {
					square50.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(51)) {
					square51.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(52)) {
					square52.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(53)) {
					square53.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(54)) {
					square54.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(55)) {
					square55.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(56)) {
					square56.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(57)) {
					square57.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(58)) {
					square58.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(59)) {
					square59.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(60)) {
					square60.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(61)) {
					square61.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(62)) {
					square62.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(63)) {
					square63.setBorder(borderMove);
				}
				if(Main.possibleMove.contains(64)) {
					square64.setBorder(borderMove);
				}
				
				Main.engine();
				
			} else if((counter == 1) && (pickedPiece != wPawnA) && (pickedPiece != wRookA) && (pickedPiece != wKnightA) && (pickedPiece != wBishopA) && (pickedPiece != wQueenA) && (pickedPiece != wKingA)) {
				
				counter = 0;
				Object source2 = e.getSource();
				squareChecker.equals(source2);
				
				//Pasting piece - GUI
				((AbstractButton) source2).setText(pieceCopy); // putting on the new square
				
				//Refreshing the board to delete the mark - GUI
				boardColors();
			
				//Changes turns at the end of each move
				if(Main.turnTeller == 0) {
					Main.turnTeller = 1;
				} else {
					Main.turnTeller = 0;
				}
			} //Black's turn
		} else if (Main.turnTeller == 1) {
			
			if((counter == 0) && (((AbstractButton) source).getText()) != "" && (pickedPiece == bPawnA || pickedPiece == bRookA || pickedPiece == bKnightA || pickedPiece == bBishopA || pickedPiece == bQueenA || pickedPiece == bKingA || pickedPiece == empty)) {
				
				counter = 1;
				((JComponent) source).setBackground(Color.GREEN); //To mark picked piece
				
			
				//Copying piece
				pieceCopy = ((AbstractButton) source).getText();
			
				((AbstractButton) source).setText(empty); // picking from the previous square
			
				//Moves sender to the engine / output to engine
				Main.pieceToMove = pieceCopy;
				Main.engine();
			
			} else if((counter == 1) && (pickedPiece != bPawnA) && (pickedPiece != bRookA) && (pickedPiece != bKnightA) && (pickedPiece != bBishopA) && (pickedPiece != bQueenA) && (pickedPiece != bKingA)) {
				
				counter = 0;
				Object source2 = e.getSource();
				squareChecker.equals(source2);
			
				//Pasting piece
				((AbstractButton) source2).setText(pieceCopy); // putting on the new square
			
				//Refreshing the board colors to delete the mark
				boardColors();
				
				//Changes turns at the end of each move
				if(Main.turnTeller == 0) {
					Main.turnTeller = 1;
				} else {
					Main.turnTeller = 0;
				}			
			}
		}
	}
}
