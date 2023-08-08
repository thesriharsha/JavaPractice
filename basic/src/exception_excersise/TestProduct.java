package exception_excersise;

class InsufficientQuantityException extends Exception{
	
}

class InvalidQuantityException extends Exception{
	
}
class Product{
	private int quantity;
	
	void sale(int units) throws InsufficientQuantityException
	{
		if(units<=quantity)
			quantity-=units;
		else
			throw new InsufficientQuantityException();
	}
	
	void purchase(int units) throws InvalidQuantityException
	{
		if(units>0)
			quantity+=units;
		else
			throw new InvalidQuantityException();
	}
}
public class TestProduct {

	public static void main(String[] args)
	{
		
	}
}

