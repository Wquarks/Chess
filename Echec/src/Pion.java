
public class Pion extends Piece {
	
	public Pion(String d) {
		super();
		this.setColor(d);
		
		if(d.equals("blanc")) {
			this.setName("\u2659");
		}else{
			this.setName("\u265F");
		}
	}
	
}
