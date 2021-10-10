package day6assignment;

public class FoodItem extends Product {

	
	private boolean  isVegetarian;
	
	
	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FoodItem(int itemCode, String itemName, double quantity, double unitPrice, boolean isVegetarian) {
		super(itemCode, itemName, quantity, unitPrice);
		this.isVegetarian = isVegetarian;
	}



}
