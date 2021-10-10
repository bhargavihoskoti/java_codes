package day6assignment;

public abstract class Product implements Comparable<Product> {
	
	private int itemCode;
	private String itemName;
	private double quantity;
	private double unitPrice;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int itemCode, String itemName, double quantity, double unitPrice) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	@Override
	public int compareTo(Product o) {
		  if(this.quantity< o.quantity) return +1;
		  if(this.quantity> o.quantity) return -1;
		  return 0;
			}

	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", quantity=" + quantity + ", unitPrice="
				+ unitPrice + "]";
	}

	
}
