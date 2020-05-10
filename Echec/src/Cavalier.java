
public class Cavalier extends Piece{

	public Cavalier(String d) {
		super();
		this.setColor(d);
		
		if(d.equals("blanc")) {
			this.setName("\u2658");
		}else{
			this.setName("\u265E");
		}
	}
}
