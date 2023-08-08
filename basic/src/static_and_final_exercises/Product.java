package static_and_final_exercises;

public class Product 
	 {

		private int quantity;
		private int rate;
		// Class Variables
		private static double taxRate = 0.12;
		
		public Product(int rate,int quantity)
		{
			this.rate = rate;
			this.quantity = quantity;
		}
		
		public Product(int rate)
		{
			this.rate = rate;
			this.quantity = 1;
		}
		
		int getQuantity()
		{
			return quantity;
		}
		int getRate()
		{
			return rate;
		}
		double getAmount()
		{
			double amount = quantity*rate;
			return amount+amount*Product.taxRate;
			
		}
		void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}
		void setRate(int rate)
		{
			this.rate = rate;
		}
		
		// Class Methods
		public static double getTaxRate()
		{
			return Product.taxRate;
		}
		
		
		//Main method
		public static void main(String[] args)
		{
			Product s = new Product(20,5);
			System.out.println(s.getAmount());
			
		}
		
	}

