
public class Piece {
	private String name;
	private String color;

	public Piece() {
		this.name = "piece";
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String a) {
		this.name = a;
	}	
	public String getColor() {
		return color;
	}
	public String getColorInverse() {
		String res="blanc";
		if (color=="blanc") {
			res="noire";
		}
		return res;
	}
	public void setColor(String d) {
		this.color = d;
	}
}
