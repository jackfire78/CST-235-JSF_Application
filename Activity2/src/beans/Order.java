package beans;


public class Order {
	String orderNumber;
	String productName;
	float price = 0;
	int quantity = 0; 
	
	public Order(String om, String pn,float p,int q) {
		this.orderNumber = om;
		this.productName = pn;
		this.price = p;
		this.quantity = q;
	}

	//get order num
	public String getOrderNumber() {
		return orderNumber;
	}

	//set order num
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	//get product name
	public String getProductName() {
		return productName;
	}

	//set product name
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	
	
	
}
