
public class Reine extends Piece{

	public Reine(String d) {
		super();
		this.setColor(d);
		
		if(d.equals("blanc")) {
			this.setName("\u2655");
		}else{
			this.setName("\u265B");
		}
	}
	
}
