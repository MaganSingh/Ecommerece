import java.util.*;
class ShoppingCart
{
	String p_name;
	int p_quant;
	double price;
	public String addToCart(String p_name , int p_quant , double price)
	{
		this.p_name=p_name;
		this.p_quant=p_quant;
		this.price=price;
			
	}
	public String removeFromCart(String p_name)
	{
		System.out.println("product is remove from the cart");
	}
	public String getCartDetails()
	{
	  System.out.println("product details are :");
	}
	public String confirmCartItems()	
	{
		System.out.println("please confirm the items that you are selected for shopping ");
	}

}


class ShoppingCartTest
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		ShoppingCart s1=new ShoppingCart();
		System.out.println("shoping cart details:");
		String p_name=sc.next();
		int p_quant=sc.nextInt();
		int price=sc.nextInt();
		s.addToCart(p_name, p_quant, price);
		s.removeFromCart( p_name);
		s.getCartDetails();
		s.confirmCartItems();
		
	
	}
}