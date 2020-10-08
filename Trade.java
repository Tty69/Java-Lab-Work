public class Trade
{
	private String id;
	private String symbol;
	private int quantity;
  	private double price;
	
	public Trade(String id, String symbol, int quantity, double price)
	{
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
		this.price = price;
	}

	public Trade(String id, String symbol, int quantity)
	 {
		this.id = id;
		this.symbol = symbol;
	       	this.quantity = quantity;
										                 
	}


	public void setPrice(double price)
	{
		if(price > 0)
		{
			this.price = price;
		}

		else
		{
			System.out.println("The price is invalid");
		}	
	}

	public String toString()
	{
		return("id =" + id + " symbol = " + symbol + " quantity =" + quantity + " price =" + price);

	}

	public static void main(String [] args)
	{
		Trade t1 = new Trade("T1", "APPL", 100);
		System.out.println(t1.toString());
		t1.setPrice(15);
		System.out.println(t1.toString());
	}

}
