//import java.util.Scanner;

public class Principal {
	public static Echiquier plateau = new Echiquier();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		////////////////////////////////////////////////////////////////////
		//////////////////////// Mode Graphique ////////////////////////////	
		////////////////////////////////////////////////////////////////////
		
		plateau.fenetre();


		////////////////////////////////////////////////////////////////////
		//////////////////////// Mode console //////////////////////////////	
		////////////////////////////////////////////////////////////////////	


		/*
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);



		String tour ="blanc";


		while (true) {

			plateau.arbitre(tour);
			System.out.print("  +----+----+----+----+----+----+----+----+");
			System.out.println("");
			for (int u=7; u>=0; u-- ) {
				System.out.print(u+" |");
				for (int i=0; i<=7; i++ ) {
					if (plateau.getPiecePosition(i,u) != null) {
						System.out.print(plateau.getPieceName(i,u) + "|");
					}else {
						System.out.print("    |");
					}
				}
				System.out.println("");
				System.out.print("  +----+----+----+----+----+----+----+----+");
				System.out.println("");
			}
			System.out.println("     A    B    C    D    E    F    G    H   ");
			System.out.println("");

			System.out.println("Le tour est au "+ tour);


			boolean moveOk=false;
			char pos0='o';
			int pos1=0;
			char pos2='o';
			int pos3=0;
			boolean err = false;



			while(moveOk==false) {
				if (err!=true) {
					System.out.println("Entrer une nouvelle position :");
				}else {
					System.out.println("/!\\ Erreur(s), entrer une nouvelle position :");
				}
				String s=sc.next();
				String c=sc.next();

				pos0 = s.charAt(0);
				pos1 = Integer.parseInt(String.valueOf(s.charAt(1)));
				pos2 = c.charAt(0);
				pos3 = Integer.parseInt(String.valueOf(c.charAt(1)));
				try {
					moveOk = plateau.move(pos0, pos1, pos2, pos3, tour);
				}finally {
					err=true;

				}

			}
			tour = plateau.position[pos2][pos3].getColorInverse();

		}

		*/
	}
}



/**
 * @author William Wipf-Scheibel
 */