package day4;
//https://fluvid.com/videos/detail/L-Bg1T_98ecYBzxkd#.YjMDY5tIo8M.link
public class InherDemo6 {
	public static void main(String[] args) {
		Food food=new Rice(new FishCurry(new Rice(new Kabab())));
		System.out.println("Rice cost..:"+food.cost());
	}
}
abstract class Food{
	public abstract int cost();
}
abstract class VegFood extends Food{
	
}
abstract class NonVegFood extends Food{
	
}
class Rice extends VegFood{
	public Rice() {
		// TODO Auto-generated constructor stub
	}
	Food food;
	public Rice(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(food!=null) {
			return 10+food.cost();
		}
		else {
			return 10;
		}
	}
}

class FishCurry extends NonVegFood{
	public FishCurry() {
		// TODO Auto-generated constructor stub
	}
	Food food;
	public FishCurry(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(food!=null) {
			return 20+food.cost();
		}
		else {
			return 20;
		}
	}
}
class Kabab extends NonVegFood{
	public Kabab() {
		// TODO Auto-generated constructor stub
	}
	Food food;
	public Kabab(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(food!=null) {
			return 50+food.cost();
		}
		else {
			return 50;
		}
	}
}