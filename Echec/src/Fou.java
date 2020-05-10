
public class Fou extends Piece{
	
	public Fou(String d) {
		super();
		this.setColor(d);
		
		if(d.equals("blanc")) {
			this.setName("\u2657");
		}else{
			this.setName("\u265D");
		}
	}
}
