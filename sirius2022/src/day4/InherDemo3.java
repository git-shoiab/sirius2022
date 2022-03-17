package day4;
//https://fluvid.com/videos/detail/XLE5Zc8ZvXS6GdxGk#.YjLIjhmXyFw.link
//https://fluvid.com/videos/detail/G6x-YcDwvLs5gO7KR#.YjLOjDWezFA.link
public class InherDemo3 {
	public static void main(String[] args) {
		GoodDog tiger=new GoodDog();
		tiger.play(new Stick());
	}
}

class BadDog{
	public void play(String item) {
		if(item.equals("stick")) {
			System.out.println("you beat I bite.....");
		}
		else if (item.equals("stone")) {
			System.out.println("I throw I chase you not stone...");
		}
		else if(item.equals("ball")) {
			System.out.println("you throw I catch...");
		}
	}
}
class GoodDog{
	public void play(Item item) {
		item.action();
	}
}
abstract class Item{
	public abstract void action() ;
}
class Stick extends Item{
	@Override
	public void action() {
		System.out.println("you beat I bite...");
	}
}
class Stone extends Item{
	@Override
	public void action() {
		System.out.println("you throw I chase you...");
	}
}
class Ball extends Item{
	@Override
	public void action() {
		System.out.println("You throw I play with you..");
	}
}