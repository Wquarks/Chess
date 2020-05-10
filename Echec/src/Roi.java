
public class Roi extends Piece{

	public Roi(String d) {
		super();
		this.setColor(d);
		
		if(d.equals("blanc")) {
			this.setName("\u2654");
		}else{
			this.setName("\u265A");
		}
	}
}
