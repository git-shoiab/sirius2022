package day4;

public class InherDemo4 {
	public static void main(String[] args) {
		Dominos dom=new PutinDomino();
		
		dom.sellPizza();
	}
}
abstract class Dominos{
	public Dominos() {
		System.out.println("dominos cons called...");
	}
	final public void makeDough() {//final methods cannot be overriden
		createGeneticFlour();
		System.out.println("secret way of making dough...");
	}
	private void createGeneticFlour() {//private methods cannot be inherited
		System.out.println("making flour as per secret formula");
	}
	final public void addIngredients() {
		createGeneticIngredients();
		System.out.println("secret way of adding ingredients..");
	}
	private void createGeneticIngredients() {
		System.out.println("making ingredients as per genetic formula");
	}
	final public void bakePizza() {
		System.out.println("baking pizza as per dominos..");
	}
	final public void makePizza() {//template methods
		makeDough();
		addIngredients();
		bakePizza();
	}
	final public void sellPizza() {//template method
		getPayment();
		makePizza();
		deliverPizza();
	}
	public abstract void getPayment();
	public abstract void deliverPizza();
}

class ShoiabDomino extends Dominos{

	@Override
	public void getPayment() {
		System.out.println("get payment as per indian standards...");
	}

	@Override
	public void deliverPizza() {
		System.out.println("deliver pizza by bike....");
	}
	
}

class PutinDomino extends Dominos{

	@Override
	public void getPayment() {
		System.out.println("get payment as per russian standards...");
	}

	@Override
	public void deliverPizza() {
		System.out.println("deliver pizza by car....");
	}
	
}