package in.ac.sharda.pizzaapplication.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private int id=0;


	public Cart(int i, int j, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	private List<Product> products
			= new ArrayList<>();
	
	public void addProduct(Product product){
		this.products.add(product);
	}

	private List<Product> setUniqueItem()
	{
		List<Product> uniqList=new ArrayList<>();
		for(Product p : products)
		{
			if(!uniqList.contains(p))
			{
				uniqList.add(p);
			}
		}
		return uniqList;
	}

	private void removeItem(Product prdct)
	{
		products.remove(prdct);
	}

}
