
public class Tour extends Piece{
	
	public Tour(String d) {
		super();
		this.setColor(d);
	
		if(d.equals("blanc")) {
			this.setName("\u2656");
		}else{
			this.setName("\u265C");
		}
	}
}
