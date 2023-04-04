import static org.junit.Assert.*;
import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void test() {
		ShoppingCart shop = new ShoppingCart();
		assertEquals(0, shop.getItemCount());
	}
	
	@Test
	public void testEmpty()
	{
		ShoppingCart shop = new ShoppingCart();
		Product prod = new Product("Computer",1023.0);
		shop.addItem(prod);
		shop.empty();
		assertEquals(0, shop.getItemCount());
		
	}
	
	@Test
	public void testIncrement()
	{
		ShoppingCart shop = new ShoppingCart();
		Product prod = new Product("Computer",1023.0);
		shop.addItem(prod);
		assertEquals(1, shop.getItemCount());
	}
	
	@Test
	public void testDecreased() throws ProductNotFoundException
	{
		ShoppingCart shop = new ShoppingCart();
		Product prod1= new Product("Computer",1023.0);
		Product prod2= new Product("Cloth",2190.0);
		shop.addItem(prod1);
		shop.addItem(prod2);
		shop.removeItem(prod2);
		assertEquals(1, shop.getItemCount());
	}

}
