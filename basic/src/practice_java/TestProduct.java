
package practice_java;



abstract class Product {

	protected String name;
	protected int price, quantity;

	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	int getPrice() {
		return this.price;
	}

	int getQuantity() {
		return this.quantity;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	void print()
	{
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	abstract double getNetPrice();
}

class ProductWithTax extends Product {

	protected double taxRate;

	public ProductWithTax(String name, int price, int quantity, double taxRate) {
		super(name, price, quantity);
		this.taxRate = taxRate / 100;
	}

	double getTaxRate() {
		return this.taxRate;
	}

	void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	@Override
	double getNetPrice() {
		// TODO Auto-generated method stub
		return price * quantity + (price * quantity * taxRate);
	}
	void print()
	{
		super.print();
		System.out.println(this.taxRate);
	}

}

class DiscountedProducts extends Product {
	private double discountRate;

	public DiscountedProducts(String name, int price, int quantity, double discountRate) {
		super(name, price, quantity);
		this.quantity = quantity;
		this.discountRate = discountRate/100;
	}

	@Override
	double getNetPrice() {
		// TODO Auto-generated method stub
		return price * quantity - (price * quantity * discountRate);
	}

	double getDiscountRate() {
		return this.discountRate;
	}

	void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	void print()
	{
		super.print();
		System.out.println(this.discountRate);
	}
}

class ImportedProducts extends ProductWithTax {

	private double importTax;

	public ImportedProducts(String name, int price, int quantity, double taxRate, double importTax) {
		super(name, price, quantity, taxRate);
		this.importTax = importTax / 100;
		// TODO Auto-generated constructor stub
	}

	@Override
	double getNetPrice() {
		// TODO Auto-generated method stub
		double amount = price * quantity + (price * quantity * taxRate);
		return amount + amount * importTax;
	}

	double getImportTax() {
		return this.importTax;
	}

	void setImportTax(double importTax) {
		this.importTax = importTax;
	}
	void print()
	{
		super.print();
		System.out.println(this.importTax);
	}

}

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImportedProducts i = new ImportedProducts("Watch", 2000, 5, 5, 10);
		System.out.println(i.getNetPrice());
		
		Product p = new ProductWithTax("gonemad",20,3,2);
		System.out.println(p.getNetPrice());
		
		Product p1 = new DiscountedProducts ("gonemad",20,3,2);
		System.out.println(p1.getNetPrice());
		
		Product p2 = new ImportedProducts ("gonemad",20,3,2,6);
		System.out.println(p2.getNetPrice());
		System.out.println(p1.getNetPrice());

	}

}