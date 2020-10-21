import java.util.*;
class Product
{
	linkList
	String p_name;
	int p_Id;
	int p_quantity;
	public String productCreate(String p_name, int p_id, int p_quantity)
	{
		this.p_name=p_name;
		this.p_id=p_idl
		this.p_quantity=p_quantity;				
	}
	private String updateProduct()
	{
		System.out.println("add more items in the list:");
	}
	public String getProductDetails()
	{
		System.out.println("details of the prodcut are ");
	}
}

class ProductTest
{
	public staic void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		String p_name=sc.next();
		int p_Id=sc.nextInt();
		int p_quantity=sc.nextInt();
		Product p1= new Product();
		p1.productCreate(p_name,p_id,p_quantity);
		p1.updateProduct();
		p1.getProductDetails();
	}
}