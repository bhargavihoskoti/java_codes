package day6assignment;

public class Apparel extends Product {

	
	private int size;
	private String material;

   
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}

     public Apparel(int itemCode, String itemName, double quantity, double unitPrice, int size, String material) {
		super(itemCode, itemName, quantity, unitPrice);
		this.size = size;
		this.material = material;
	}
	
	

}
