package day4;

public class InherDemo3 {
	public static void main(String[] args) {
		
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
	
}
class Item{
	public void action() {
		System.out.println("I am dummy...");
	}
}