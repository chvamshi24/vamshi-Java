package world;

public class Plant {
	// Bad practice
	public String name;
	
	// Aceptable practice --- it's final
	public final static int ID = 6;
	
	private String type;
	
	protected String size;
	
	protected int height;
	
	public Plant() {
		this.name = "Freedy";
		this.type = "plant";
		this.size = "medium";
		this.height = 8;
	}

}
