package annopack;
//https://fluvid.com/videos/detail/P5OY2TPYPLIgrX7-B#.YjrM-12GuK4.link
public class AnnoDemo {
	public static void main(String[] args) {
		ShoeShop shop=ChennaiContainer.getShoeShop();
		
		System.out.println(shop.sellShoe());
	}
}

class ChennaiContainer{
	
	public static ShoeShop getShoeShop() {
		ShoeFactory factory=new LakhaniShoeFactory();
		ShoeShop shop=new SiriusShoeShop();
		
		//knowledge of factory to shop - because shop is dependent on factory
		
		shop.setFactory(factory);
		
		return shop;
	}
}
abstract class Shoe{}

class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}

interface Manufacturer{
	public Shoe makeShoe();
}
abstract class ShoeFactory implements Manufacturer{
	
}
interface Seller{
	public Shoe sellShoe();
}
abstract class ShoeShop implements Seller{
	private ShoeFactory factory;

	public ShoeFactory getFactory() {
		return factory;
	}

	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
	
}

class BataShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}

class SiriusShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe() {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}