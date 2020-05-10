import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class Echiquier extends JFrame {

	/*
	 *les methode sont classé dans l'ordre alphabétique... 
	 * 
	 *  la déclaration des variable (en protected pour ne pas avoide soucis 
	 *  avec le mode consol mais à faire passer en privat dès que ce sera sur
	 *   qu'il ne servira à rien)
	 *  
	 */
	protected Piece position[][] = new Piece[8][8];

	protected String buttona = "";
	protected String buttonb = "";
	protected String tour ="blanc";
	protected String roiEchec ="";

	protected Font police3 = new Font(Font.SERIF, Font.BOLD, 30);
	protected Font police2 = new Font(Font.SERIF, Font.BOLD, 20);

	protected JLabel labelListe[] = new JLabel[8];
	protected JLabel label0 = new JLabel(tour);
	protected JLabel label1 = new JLabel("");
	protected JLabel label2 = new JLabel("");
	protected JLabel label3 = new JLabel("");
	protected JLabel label4 = new JLabel("");
	protected JLabel label5 = new JLabel("");
	protected JLabel label6 = new JLabel("");
	protected JLabel label7 = new JLabel("OK");

	protected JButton buttonListe[] = new JButton[64];	
	protected JButton button00 = new JButton(getPieceName(0,0));
	protected JButton button10 = new JButton(getPieceName(1,0));
	protected JButton button20 = new JButton(getPieceName(2,0));
	protected JButton button30 = new JButton(getPieceName(3,0));
	protected JButton button40 = new JButton(getPieceName(4,0));
	protected JButton button50 = new JButton(getPieceName(5,0));
	protected JButton button60 = new JButton(getPieceName(6,0));
	protected JButton button70 = new JButton(getPieceName(7,0));
	protected JButton button01 = new JButton(getPieceName(0,1));
	protected JButton button11 = new JButton(getPieceName(1,1));
	protected JButton button21 = new JButton(getPieceName(2,1));
	protected JButton button31 = new JButton(getPieceName(3,1));
	protected JButton button41 = new JButton(getPieceName(4,1));
	protected JButton button51 = new JButton(getPieceName(5,1));
	protected JButton button61 = new JButton(getPieceName(6,1));
	protected JButton button71 = new JButton(getPieceName(7,1));
	protected JButton button02 = new JButton(getPieceName(0,2));
	protected JButton button12 = new JButton(getPieceName(1,2));
	protected JButton button22 = new JButton(getPieceName(2,2));
	protected JButton button32 = new JButton(getPieceName(3,2));
	protected JButton button42 = new JButton(getPieceName(4,2));
	protected JButton button52 = new JButton(getPieceName(5,2));
	protected JButton button62 = new JButton(getPieceName(6,2));
	protected JButton button72 = new JButton(getPieceName(7,2));
	protected JButton button03 = new JButton(getPieceName(0,3));
	protected JButton button13 = new JButton(getPieceName(1,3));
	protected JButton button23 = new JButton(getPieceName(2,3));
	protected JButton button33 = new JButton(getPieceName(3,3));
	protected JButton button43 = new JButton(getPieceName(4,3));
	protected JButton button53 = new JButton(getPieceName(5,3));
	protected JButton button63 = new JButton(getPieceName(6,3));
	protected JButton button73 = new JButton(getPieceName(7,3));
	protected JButton button04 = new JButton(getPieceName(0,4));
	protected JButton button14 = new JButton(getPieceName(1,4));
	protected JButton button24 = new JButton(getPieceName(2,4));
	protected JButton button34 = new JButton(getPieceName(3,4));
	protected JButton button44 = new JButton(getPieceName(4,4));
	protected JButton button54 = new JButton(getPieceName(5,4));
	protected JButton button64 = new JButton(getPieceName(6,4));
	protected JButton button74 = new JButton(getPieceName(7,4));
	protected JButton button05 = new JButton(getPieceName(0,5));
	protected JButton button15 = new JButton(getPieceName(1,5));
	protected JButton button25 = new JButton(getPieceName(2,5));
	protected JButton button35 = new JButton(getPieceName(3,5));
	protected JButton button45 = new JButton(getPieceName(4,5));
	protected JButton button55 = new JButton(getPieceName(5,5));
	protected JButton button65 = new JButton(getPieceName(6,5));
	protected JButton button75 = new JButton(getPieceName(7,5));
	protected JButton button06 = new JButton(getPieceName(0,6));
	protected JButton button16 = new JButton(getPieceName(1,6));
	protected JButton button26 = new JButton(getPieceName(2,6));
	protected JButton button36 = new JButton(getPieceName(3,6));
	protected JButton button46 = new JButton(getPieceName(4,6));
	protected JButton button56 = new JButton(getPieceName(5,6));
	protected JButton button66 = new JButton(getPieceName(6,6));
	protected JButton button76 = new JButton(getPieceName(7,6));
	protected JButton button07 = new JButton(getPieceName(0,7));
	protected JButton button17 = new JButton(getPieceName(1,7));
	protected JButton button27 = new JButton(getPieceName(2,7));
	protected JButton button37 = new JButton(getPieceName(3,7));
	protected JButton button47 = new JButton(getPieceName(4,7));
	protected JButton button57 = new JButton(getPieceName(5,7));
	protected JButton button67 = new JButton(getPieceName(6,7));
	protected JButton button77 = new JButton(getPieceName(7,7));

//constructeur
	public Echiquier() {
		for (int i=0; i<=7; i++ ) {

			this.position[i][1]= new Pion("blanc");
		}
		this.position[0][0] = new Tour("blanc");
		this.position[1][0] = new Cavalier("blanc");
		this.position[2][0] = new Fou("blanc");
		this.position[3][0] = new Reine("blanc");
		this.position[4][0] = new Roi("blanc");
		this.position[5][0] = new Fou("blanc");
		this.position[6][0] = new Cavalier("blanc");
		this.position[7][0] = new Tour("blanc");

		for (int i=0; i<=7; i++ ) {
			this.position[i][6]= new Pion("noire");
		}
		this.position[0][7] = new Tour("noire");
		this.position[1][7] = new Cavalier("noire");
		this.position[2][7] = new Fou("noire");
		this.position[3][7] = new Reine("noire");
		this.position[4][7] = new Roi("noire");
		this.position[5][7] = new Fou("noire");
		this.position[6][7] = new Cavalier("noire");
		this.position[7][7] = new Tour("noire");


		this.buttonListe[0]=button07;
		this.buttonListe[1]=button17;
		this.buttonListe[2]=button27;
		this.buttonListe[3]=button37;
		this.buttonListe[4]=button47;
		this.buttonListe[5]=button57;
		this.buttonListe[6]=button67;
		this.buttonListe[7]=button77;
		this.buttonListe[8]=button06;
		this.buttonListe[9]=button16;
		this.buttonListe[10]=button26;
		this.buttonListe[11]=button36;
		this.buttonListe[12]=button46;
		this.buttonListe[13]=button56;
		this.buttonListe[14]=button66;
		this.buttonListe[15]=button76;
		this.buttonListe[16]=button05;
		this.buttonListe[17]=button15;
		this.buttonListe[18]=button25;
		this.buttonListe[19]=button35;
		this.buttonListe[20]=button45;
		this.buttonListe[21]=button55;
		this.buttonListe[22]=button65;
		this.buttonListe[23]=button75;		
		this.buttonListe[24]=button04;
		this.buttonListe[25]=button14;
		this.buttonListe[26]=button24;
		this.buttonListe[27]=button34;
		this.buttonListe[28]=button44;
		this.buttonListe[29]=button54;
		this.buttonListe[30]=button64;
		this.buttonListe[31]=button74;
		this.buttonListe[32]=button03;
		this.buttonListe[33]=button13;
		this.buttonListe[34]=button23;
		this.buttonListe[35]=button33;
		this.buttonListe[36]=button43;
		this.buttonListe[37]=button53;
		this.buttonListe[38]=button63;
		this.buttonListe[39]=button73;
		this.buttonListe[40]=button02;
		this.buttonListe[41]=button12;
		this.buttonListe[42]=button22;
		this.buttonListe[43]=button32;
		this.buttonListe[44]=button42;
		this.buttonListe[45]=button52;
		this.buttonListe[46]=button62;
		this.buttonListe[47]=button72;
		this.buttonListe[48]=button01;
		this.buttonListe[49]=button11;
		this.buttonListe[50]=button21;
		this.buttonListe[51]=button31;
		this.buttonListe[52]=button41;
		this.buttonListe[53]=button51;
		this.buttonListe[54]=button61;
		this.buttonListe[55]=button71;
		this.buttonListe[56]=button00;
		this.buttonListe[57]=button10;
		this.buttonListe[58]=button20;
		this.buttonListe[59]=button30;
		this.buttonListe[60]=button40;
		this.buttonListe[61]=button50;
		this.buttonListe[62]=button60;
		this.buttonListe[63]=button70;

		this.labelListe[0]=label0;
		this.labelListe[1]=label1;
		this.labelListe[2]=label2;
		this.labelListe[3]=label3;
		this.labelListe[4]=label4;
		this.labelListe[5]=label5;
		this.labelListe[6]=label6;
		this.labelListe[7]=label7;
	}

//métode servant à savoir si l on se situe en echec ou pas :
	public String arbitre(String tour) {
		String res="OK";
		String listePosition[] = new String[33];
		String listeColor[] = new String[33];
		int compteur = 0;
		int compt = 0;
		String listeRoi[] = new String[2];
		listeRoi[0] = "  ";
		listeRoi[1] = "  ";
// tous d'abord je cherche ou se situe les roi sur l'échiquier
		for(int u=0; u<=7; u++ ) {     //y
			for(int o=0; o<=7; o++ ) { //x
				if (this.position[o][u]!= null){
					listePosition[compteur]=converter(o)+""+u;
					listeColor[compteur]=this.position[o][u].getColor();
					compteur++;

					String lettre = String.valueOf(this.position[o][u]);
					char lettre0 = lettre.charAt(0);
					char lettre1 = lettre.charAt(1);
					lettre = lettre0+""+lettre1;
					if (lettre.equals("Ro")) {
						listeRoi[compt]=converter(o)+""+u;
						System.out.println("------------Roi "+converter(o)+u+"   "+position[o][u].getColor());	
						compt++;

					}
				}
			}
		}
		//puis je verifie si je peux en manger un
		for (int i=0; i<2; i++) {
			char loc0 = listeRoi[i].charAt(0);
			int loc1 = Integer.parseInt(String.valueOf(listeRoi[i].charAt(1)));

			int a=0;
			while(listePosition[a]!= null && a<=32) {

				String lettre = String.valueOf(listePosition[a]);
				char lettre0 = lettre.charAt(0);
				int num1 = Integer.parseInt(String.valueOf(lettre.charAt(1)));
				move(lettre0,num1,loc0,loc1,tour);	

				String pos = String.valueOf(this.position[converter(lettre0)][num1]);
				char pos0 = pos.charAt(0);
				char pos1 = pos.charAt(1);

				if ((pos0+""+pos1).equals("nu")) {

					this.position[converter(lettre0)][num1]=this.position[converter(loc0)][loc1];
					this.position[converter(loc0)][loc1]=new Roi(this.position[converter(lettre0)][num1].getColorInverse());
					res = "echec";
					
					//Mate ?
				}
				a++;				
			}
		}
		if (res.equals("OK")) {
			roiEchec ="";
		}else{
			roiEchec = res+inverse(tour);
		}
		System.out.println(roiEchec);
		return res;
	}
	/*
	 * 
	tentation de la création de la méthode pour savoir si l'on est en echec et mate
	
	public boolean mate() {
		boolean res=true;

		for(int varb=0; varb<8; varb++) {
			for(int vara=0; vara<8; vara++) {
				for(int vard=0; vard<8; vard++) {
					for(int varc=0; varc<8; varc++) {
						if(move(vara,varb,varc,vard,tour)== true) {
							arbitre(tour);
							if (roiEchec.equals("")) {
								res=false;
								System.out.println("####");
							}
							move(varb,vara,vard,varc,tour);
						}
					}
				}
			}
		}
		return res;
	}
	*/

	
	/*
	 * methode gérand chaque appuis des bouton du tableau, coeur du programme
	 * en mode graphique
	 */
	public void buttonVariable(String a) {
		boolean moveOk=false;
		int compteur=0;
		int pos0=0 ;
		int pos1=0 ;
		int pos2=0 ;
		int pos3=0 ;

		if (buttona.equals("")) {
			buttona = a;

			for(int varb=7; varb>=0; varb--) {
				for(int vara=0; vara<8; vara++) {

					int rus0 = Integer.parseInt(String.valueOf(buttona.charAt(0)));
					int rus1 = Integer.parseInt(String.valueOf(buttona.charAt(1)));

					if(vara==rus0 && varb==rus1 ) {
						buttonListe[compteur].setBackground(Color.LIGHT_GRAY);
					}
					compteur++;

				}				
			}
		}else{
			buttonb = a;
			colormaj();
			//System.out.println("buttonb OK");

			pos0 = Integer.parseInt(String.valueOf(buttona.charAt(0)));
			pos1 = Integer.parseInt(String.valueOf(buttona.charAt(1)));
			pos2 = Integer.parseInt(String.valueOf(buttonb.charAt(0)));
			pos3 = Integer.parseInt(String.valueOf(buttonb.charAt(1)));

			//move(pos0, pos1, pos2, pos3, tour);

			try {

				if(arbitre(tour).equals("OK")){
					moveOk = move(pos0, pos1, pos2, pos3, tour);
				}
			}finally {

				if(moveOk == true) {
					tour = position[pos2][pos3].getColorInverse();
					label0.setText(tour);

					System.out.println("Au tour des "+tour+" de jouer :");
				}
				buttona = "";
				buttonb = "";
			}

			label7.setText(arbitre(inverse(tour)));
			buttonSetText();
		}
	}
	
	// pour permettre la maj du texte sur les bouton...
	public void buttonSetText() {
		button00.setText(getPieceName(0,0));
		button10.setText(getPieceName(1,0));
		button20.setText(getPieceName(2,0));
		button30.setText(getPieceName(3,0));
		button40.setText(getPieceName(4,0));
		button50.setText(getPieceName(5,0));
		button60.setText(getPieceName(6,0));
		button70.setText(getPieceName(7,0));
		button01.setText(getPieceName(0,1));
		button11.setText(getPieceName(1,1));
		button21.setText(getPieceName(2,1));
		button31.setText(getPieceName(3,1));
		button41.setText(getPieceName(4,1));
		button51.setText(getPieceName(5,1));
		button61.setText(getPieceName(6,1));
		button71.setText(getPieceName(7,1));
		button02.setText(getPieceName(0,2));
		button12.setText(getPieceName(1,2));
		button22.setText(getPieceName(2,2));
		button32.setText(getPieceName(3,2));
		button42.setText(getPieceName(4,2));
		button52.setText(getPieceName(5,2));
		button62.setText(getPieceName(6,2));
		button72.setText(getPieceName(7,2));
		button03.setText(getPieceName(0,3));
		button13.setText(getPieceName(1,3));
		button23.setText(getPieceName(2,3));
		button33.setText(getPieceName(3,3));
		button43.setText(getPieceName(4,3));
		button53.setText(getPieceName(5,3));
		button63.setText(getPieceName(6,3));
		button73.setText(getPieceName(7,3));
		button04.setText(getPieceName(0,4));
		button14.setText(getPieceName(1,4));
		button24.setText(getPieceName(2,4));
		button34.setText(getPieceName(3,4));
		button44.setText(getPieceName(4,4));
		button54.setText(getPieceName(5,4));
		button64.setText(getPieceName(6,4));
		button74.setText(getPieceName(7,4));
		button05.setText(getPieceName(0,5));
		button15.setText(getPieceName(1,5));
		button25.setText(getPieceName(2,5));
		button35.setText(getPieceName(3,5));
		button45.setText(getPieceName(4,5));
		button55.setText(getPieceName(5,5));
		button65.setText(getPieceName(6,5));
		button75.setText(getPieceName(7,5));
		button06.setText(getPieceName(0,6));
		button16.setText(getPieceName(1,6));
		button26.setText(getPieceName(2,6));
		button36.setText(getPieceName(3,6));
		button46.setText(getPieceName(4,6));
		button56.setText(getPieceName(5,6));
		button66.setText(getPieceName(6,6));
		button76.setText(getPieceName(7,6));
		button07.setText(getPieceName(0,7));
		button17.setText(getPieceName(1,7));
		button27.setText(getPieceName(2,7));
		button37.setText(getPieceName(3,7));
		button47.setText(getPieceName(4,7));
		button57.setText(getPieceName(5,7));
		button67.setText(getPieceName(6,7));
		button77.setText(getPieceName(7,7));


	}

//verrification si il y a une collision 
	public boolean collision(int a, int b, int c, int d, String tour) {
		boolean res = false;

		if (a==c && b<d) {
			for(int u = 1; u<(d-b) ; u++ ) {
				//System.out.println("verif en "+a+(b+u));   //OK  haut
				if (this.getPiecePosition( a,b+u ) != null || getPositionColor(c, d) == this.position[a][b].getColor()){
					res = true;
				}
			}
		}
		if (a==c && b>d) {
			for(int u = 1; u<(b-d) ; u++ ) {
				//System.out.println("verif en "+a+(b-u));   //OK  bas
				if (this.getPiecePosition( a,b-u)  != null || getPositionColor(c, d) == this.position[a][b].getColor()){
					res = true;
				}
			}
		}
		if (b==d && a<c) {
			for(int u = 1; u<(c-a) ; u++ ) {
				//System.out.println("verif en "+(a+u)+b );    //OK droite
				if (this.getPiecePosition( a+u,b ) != null || getPositionColor(c, d) == this.position[a][b].getColor()){
					res = true;
				}
			}
		}
		if (b==d && a>c) {
			for(int u = 1; u<(a-c) ; u++ ) {
				//System.out.println("verif en "+(a-u)+b );    //OK gauche
				if (this.getPiecePosition( a-u,b ) != null || getPositionColor(c, d) == this.position[a][b].getColor()){
					res = true;
				}
			}
		}
		if (a<c && b<d) {
			for(int u = 1; u<(d-b) ; u++ ) {
				//System.out.println("verif en "+(a+u)+(b+u));   //OK  haut-doite
				if (this.getPiecePosition(a+u,b+u) != null || getPositionColor(c, d) == this.position[a][b].getColor()){
					res = true;
				}
			}
		}

		if (a>c && b<d) {
			for(int u = 1; u<(d-b) ; u++ ) {
				//System.out.println("verif en "+(a-u)+(b+u));   //OK haut-gauche
				if (this.getPiecePosition(a-u,b+u) != null || getPositionColor(c, d) == this.position[a][b].getColor()){
					res = true;
				}
			}
		}
		if (a<c && b>d) {
			for(int u = 1; u<(b-d) ; u++ ) {
				//System.out.println("verif en "+(a+u)+(b-u));   //OK  bas-droite
				if (this.getPiecePosition(a+u,b-u) != null || getPositionColor(c, d) == this.position[a][b].getColor()){
					res = true;
				}
			}
		}
		if (a>c && b>d) {
			for(int u = 1; u<(b-d) ; u++ ) {
				//System.out.println("verif en "+(a-u)+(b-u));   //OK  bas-gauche
				if (this.getPiecePosition(a-u,b-u) != null || getPositionColor(c, d) == this.position[a][b].getColor()){
					res = true;
				}
			}
		}

		if ((this.getPieceName(a,b).equals("\u2658")) || (this.getPieceName(a,b).equals("\u265E"))) {
			res = false;
		}
		if (this.position[c][d]!=null) {
			if ((this.position[a][b].getColor()=="blanc" && this.position[c][d].getColor()=="blanc")||(this.position[a][b].getColor()=="noire" && this.position[c][d].getColor()=="noire")) {
				res=true;
			}
		}
		if (this.position[a][b].getColor()!= tour) {
			res=true;
		}
		return res;
	}
	//méthode pour la mise à jour des couleur sur l'echiquier graphique
	public void colormaj() {
		Color beige = new Color(241, 203, 153);
		Color brun = new Color(221, 140,31);

		for (int li=0; li<64; li++) {
			if (li<8 ||(li>15 && li<24) ||(li>31 && li<40)||(li>47 && li<56)){
				if (li%2==0) {
					buttonListe[li].setBackground(brun);
				}else {
					buttonListe[li].setBackground(beige);
				}
			}else{
				if (li%2==0) {
					buttonListe[li].setBackground(beige);
				}else {
					buttonListe[li].setBackground(brun);
				}
			}
		}
		for(int lu=0; lu<8; lu++) {
			labelListe[lu].setForeground(Color.white);
			labelListe[lu].setOpaque(true);
			labelListe[lu].setBackground(Color.GREEN);
		}
	}

	/*
	 * la methode converter me permettais en mode console de lire
	 * les instruction du type A0,C5... et pouvoir à l'avenir prérenplire à partir
	 * de partis touver sur internet l'echiquier
	 */
	public int converter(char a) {
		int  res = 0;
		switch(a) {
		case 'A':
			res = 0;
			break;
		case 'B':
			res = 1;
			break;
		case 'C':
			res = 2;
			break;
		case 'D':
			res = 3;
			break;
		case 'E':
			res = 4;
			break;
		case 'F':
			res = 5;
			break;
		case 'G':
			res = 6;
			break;
		case 'H':
			res = 7;
			break;
		case 'a':
			res = 0;
			break;
		case 'b':
			res = 1;
			break;
		case 'c':
			res = 2;
			break;
		case 'd':
			res = 3;
			break;
		case 'e':
			res = 4;
			break;
		case 'f':
			res = 5;
			break;
		case 'g':
			res = 6;
			break;
		case 'h':
			res = 7;
			break;
		}
		return res;
	}
	public String converter(int a) {
		String res ="";

		switch(a) {
		case 0:
			res = "A";
			break;
		case 1:
			res = "B";
			break;
		case 2:
			res = "C";
			break;
		case 3:
			res = "D";
			break;
		case 4:
			res = "E";
			break;
		case 5:
			res = "F";
			break;
		case 6:
			res = "G";
			break;
		case 7:
			res = "H";
			break;
		}
		return res;
	}

/*
 *création de la phenetre graphique 
 */
	public void fenetre(){
		buttonSetText();
		this.setTitle("Jeu d'échec");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("chessKing.png"));

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screen.width - getSize().width)/2,100);  //(screen.width - getSize().width)/2,(screen.height - getSize().height)/2);
		this.setSize(600,675);
		this.setVisible(true);	
		this.setLayout(new GridLayout(9, 8));
		
		for(int no=0; no<8; no++) {
			add(labelListe[no]);
			labelListe[no].setFont(police2);
		}
		for(int ni=0; ni<64; ni++) {
			add(buttonListe[ni]);
			buttonListe[ni].setFont(police3);
		}



		button07.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("07");}});
		button17.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("17");}});
		button27.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("27");}});
		button37.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("37");}});
		button47.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("47");}});
		button57.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("57");}});
		button67.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("67");}});
		button77.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("77");}});
		button06.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("06");}});
		button16.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("16");}});
		button26.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("26");}});
		button36.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("36");}});
		button46.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("46");}});
		button56.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("56");}});
		button66.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("66");}});
		button76.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("76");}});
		button05.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("05");}});
		button15.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("15");}});
		button25.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("25");}});
		button35.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("35");}});
		button45.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("45");}});
		button55.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("55");}});
		button65.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("65");}});
		button75.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("75");}});
		button04.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("04");}});
		button14.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("14");}});
		button24.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("24");}});
		button34.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("34");}});
		button44.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("44");}});
		button54.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("54");}});
		button64.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("64");}});
		button74.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("74");}});
		button03.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("03");}});
		button13.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("13");}});
		button23.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("23");}});
		button33.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("33");}});
		button43.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("43");}});
		button53.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("53");}});
		button63.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("63");}});
		button73.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("73");}});
		button02.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("02");}});
		button12.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("12");}});
		button22.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("22");}});
		button32.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("32");}});
		button42.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("42");}});
		button52.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("52");}});
		button62.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("62");}});
		button72.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("72");}});
		button01.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("01");}});
		button11.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("11");}});
		button21.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("21");}});
		button31.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("31");}});
		button41.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("41");}});
		button51.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("51");}});
		button61.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("61");}});
		button71.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("71");}});
		button00.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("00");}});
		button10.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("10");}});
		button20.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("20");}});
		button30.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("30");}});
		button40.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("40");}});
		button50.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("50");}});
		button60.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("60");}});
		button70.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {buttonVariable("70");}});

		colormaj();

	}

	public String getPieceName(int n, int m) {
		if (this.position[n][m] != null) {
			return this.position[n][m].getName();
		}else {
			return "";
		}
	}
	public Piece getPiecePosition(int n, int m) {
		return this.position[n][m];
	}
	public String getPositionColor(int c, int d) {
		String res="";
		if (this.position[c][d]!=null) {
			res = this.position[c][d].getColor();
		}
		return res;
	}

	//permet d'inverser la couleur du tour
	public String inverse(String tour) {
		String res = "blanc";
		if(tour.equals("blanc")) {
			res="noire";
		}
		return res;
	}
//methode de déplacement...
	public boolean move(char a, int b, char c, int d, String tour) {
		if (a =='n' || c=='u'||converter(a)>7||converter(c)>7) {
			System.out.println("case Null");
			return false;
		}else {
			return move(converter(a), b,converter(c), d, tour);	
		}
	}
	public boolean move(int a, int b, int c, int d, String tour) { 
		boolean res = false; 
		if (c<=7 && d<=7) {
			String lettre = String.valueOf(this.position[a][b]);
			char lettre0 = lettre.charAt(0);
			char lettre1 = lettre.charAt(1);
			lettre = lettre0+""+lettre1;

			switch(lettre) {
			case "Pi":
				if ((a == c && b+1 == d && this.position[a][b].getColor()=="blanc"&& this.position[c][d]==null) || (a == c-1 && b+1 == d && this.position[a][b].getColor()=="blanc" && this.position[c][d].getColor()=="noire") || (a == c+1 && b+1 == d && this.position[a][b].getColor()=="blanc" && this.position[c][d].getColor()=="noire")|| (a == c && b==1 && d==3 && this.position[a][b].getColor()=="blanc"&& this.position[c][d]==null)||
						(a == c && b-1 == d && this.position[a][b].getColor()=="noire"&& this.position[c][d]==null) || (a == c-1 && b-1 == d && this.position[a][b].getColor()=="noire" && this.position[c][d].getColor()=="blanc") || (a == c+1 && b-1 == d && this.position[a][b].getColor()=="noire" && this.position[c][d].getColor()=="blanc")|| (a == c && b==6 && d==4 && this.position[a][b].getColor()=="noire"&& this.position[c][d]==null)){ 	
					if (collision(a,b,c,d,tour)==false){
						position[c][d]=this.position[a][b];
						position[a][b]=null;
						res = true;
						System.out.println("Pion     "+converter(a)+b+" en "+converter(c)+d);
					}else {
						//System.out.println("Erreur collision entre "+converter(a)+b+" et "+converter(c)+d );
					}
				}else {
					//System.out.println("Mauvais mouvement du pion "+converter(a)+b+" en "+converter(c)+d);
				}
				break;
			case "To":
				if ((a == c && b+1 == d) || (a == c && b+2 == d) || (a == c && b+3 == d) || (a == c && b+4 == d) || (a == c && b+5 == d) || (a == c && b+6 == d) || (a == c && b+7 == d) ||
						(a == c+1 && b == d)||(a == c+2 && b == d)||(a == c+3 && b == d)||(a == c+4 && b == d)||(a == c+5 && b == d)||(a == c+6 && b == d)||(a == c+7 && b == d) ||
						(a == c && b-1 == d) || (a == c && b-2 == d) || (a == c && b-3 == d) || (a == c && b-4 == d) || (a == c && b-5 == d) || (a == c && b-6 == d) || (a == c && b-7 == d) ||
						(a == c-1 && b == d)||(a == c-2 && b == d)||(a == c-3 && b == d)||(a == c-4 && b == d)||(a == c-5 && b == d)||(a == c-6 && b == d)||(a == c-7 && b == d)){ 

					if (collision(a,b,c,d,tour)==false){
						position[c][d]=this.position[a][b];
						position[a][b]=null;
						res = true;
						System.out.println("Tour     "+converter(a)+b+" en "+converter(c)+d);
					}else {
						//System.out.println("Erreur collision entre "+converter(a)+b+" et "+converter(c)+d );
					}
				}else {
					//System.out.println("Mauvais mouvement de la tour "+converter(a)+b+" en "+converter(c)+d);
				}

				break;
			case "Ca":
				if ((a+1 == c && b+2 == d) || (a-1 == c && b+2 == d) || (a-1 == c && b-2 == d) || (a+1 == c && b-2 == d) || (a+2 == c && b+1 == d) || (a+2 == c && b-1 == d)|| (a-2 == c && b+1 == d) || (a-2 == c && b-1 == d)){ 
					if (collision(a,b,c,d,tour)==false){
						position[c][d]=this.position[a][b];
						position[a][b]=null;
						res = true;
						System.out.println("Cavalier "+converter(a)+b+" en "+converter(c)+d);
					}else {
						//System.out.println("Erreur collision entre "+converter(a)+b+" et "+converter(c)+d );
					}
				}else {
					//System.out.println("Mauvais mouvement du cavalier "+converter(a)+b+" en "+converter(c)+d);
				}
				break;
			case "Fo":
				if ((a+1 == c && b+1 == d) ||(a+2 == c && b+2 == d) ||(a+3 == c && b+3 == d) ||(a+4 == c && b+4 == d) ||(a+5 == c && b+5 == d)||(a+6 == c && b+6 == d) ||(a+7 == c && b+7 == d) ||
						(a-1 == c && b-1 == d) ||(a-2 == c && b-2 == d) ||(a-3 == c && b-3 == d) ||(a-4 == c && b-4 == d) ||(a-5 == c && b-5 == d)||(a-6 == c && b-6 == d) ||(a-7 == c && b-7 == d)||
						(a+1 == c && b-1 == d) ||(a+2 == c && b-2 == d) ||(a+3 == c && b-3 == d) ||(a+4 == c && b-4 == d) ||(a+5 == c && b-5 == d)||(a+6 == c && b-6 == d) ||(a+7 == c && b-7 == d)||
						(a-1 == c && b+1 == d) ||(a-2 == c && b+2 == d) ||(a-3 == c && b+3 == d) ||(a-4 == c && b+4 == d) ||(a-5 == c && b+5 == d)||(a-6 == c && b+6 == d) ||(a-7 == c && b+7 == d)){ 
					if (collision(a,b,c,d,tour)==false){
						position[c][d]=this.position[a][b];
						position[a][b]=null;
						res = true;
						System.out.println("Fou      "+converter(a)+b+" en "+converter(c)+d);
					}else {
						//System.out.println("Erreur collision entre "+converter(a)+b+" et "+converter(c)+d );
					}
				}else {
					//System.out.println("Mauvais mouvement du fou "+converter(a)+b+" en "+converter(c)+d);
				}
				break;
			case "Re":
				if ((a == c && b+1 == d) || (a == c && b+2 == d) || (a == c && b+3 == d) || (a == c && b+4 == d) || (a == c && b+5 == d) || (a == c && b+6 == d) || (a == c && b+7 == d) ||
						(a == c+1 && b == d)||(a == c+2 && b == d)||(a == c+3 && b == d)||(a == c+4 && b == d)||(a == c+5 && b == d)||(a == c+6 && b == d)||(a == c+7 && b == d) ||
						(a == c && b-1 == d) || (a == c && b-2 == d) || (a == c && b-3 == d) || (a == c && b-4 == d) || (a == c && b-5 == d) || (a == c && b-6 == d) || (a == c && b-7 == d) ||
						(a == c-1 && b == d)||(a == c-2 && b == d)||(a == c-3 && b == d)||(a == c-4 && b == d)||(a == c-5 && b == d)||(a == c-6 && b == d)||(a == c-7 && b == d)||
						(a+1 == c && b+1 == d) ||(a+2 == c && b+2 == d) ||(a+3 == c && b+3 == d) ||(a+4 == c && b+4 == d) ||(a+5 == c && b+5 == d)||(a+6 == c && b+6 == d) ||(a+7 == c && b+7 == d) ||
						(a-1 == c && b-1 == d) ||(a-2 == c && b-2 == d) ||(a-3 == c && b-3 == d) ||(a-4 == c && b-4 == d) ||(a-5 == c && b-5 == d)||(a-6 == c && b-6 == d) ||(a-7 == c && b-7 == d)||
						(a+1 == c && b-1 == d) ||(a+2 == c && b-2 == d) ||(a+3 == c && b-3 == d) ||(a+4 == c && b-4 == d) ||(a+5 == c && b-5 == d)||(a+6 == c && b-6 == d) ||(a+7 == c && b-7 == d)||
						(a-1 == c && b+1 == d) ||(a-2 == c && b+2 == d) ||(a-3 == c && b+3 == d) ||(a-4 == c && b+4 == d) ||(a-5 == c && b+5 == d)||(a-6 == c && b+6 == d) ||(a-7 == c && b+7 == d)){ 
					if (collision(a,b,c,d,tour)==false){
						position[c][d]=this.position[a][b];
						position[a][b]=null;
						res = true;
						System.out.println("Reine    "+converter(a)+b+" en "+converter(c)+d);
					}else {
						//System.out.println("Erreur collision entre "+converter(a)+b+" et "+converter(c)+d );
					}
				}else {
					//System.out.println("Mauvais mouvement de la reine "+converter(a)+b+" en "+converter(c)+d);
				}
				break;
			case "Ro":
				if ((a == c && b+1 == d)||(a == c && b-1 == d)||(a+1 == c && b == d)||(a-1 == c && b == d)||(a+1 == c && b+1 == d)||(a-1 == c && b+1 == d)||(a-1 == c && b-1 == d)||(a+1 == c && b-1 == d)){ 
					if (collision(a,b,c,d,tour)==false){
						position[c][d]=this.position[a][b];
						position[a][b]=null;
						res = true;
						System.out.println("Roi      "+converter(a)+b+" en "+converter(c)+d);
					}else {
						//System.out.println("Erreur collision entre "+converter(a)+b+" et "+converter(c)+d );
					}
				}else {
					//System.out.println("Mauvais mouvement du roi "+converter(a)+b+" en "+converter(c)+d);
				}
				break;
			default:
				System.out.println("Pas de piece");
			}
		}
		return res;
	}


}
/**
 * @author William Wipf-Scheibel
 */