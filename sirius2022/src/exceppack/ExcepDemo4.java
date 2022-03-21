/**
https://fluvid.com/videos/detail/n8QdniKVQkSXBx3Gg#.Yjgi4TN4gLY.link
 * 
 */
package exceppack;

/**
 * @author Hp
 *
 */
public class ExcepDemo4 {
	public static void main(String[] args) {
		Child baby=new Child();
		Dog tiger=new Dog();
		baby.playWithDog(new Stick(), tiger);
	}
}

class Handler911{
	public void help(DogBiteException dbe) {
		System.out.println("take the child to hospital.............");
	}
	public void help(DogBarkException dbr) {
		System.out.println("barking dogs seldom bite...relax.........");
	}
}
abstract class Item{
	public abstract void action()throws DogExceptions;
}
class Stick extends Item{
	public void action() throws DogExceptions{
		throw new DogBiteException("you beat I bite....");
	}
}
class Stone extends Item{
	public void action() throws DogExceptions{
		throw new DogBarkException("you hit, I chase....");
	}
}

class Dog{
	public void play(Item item)throws DogExceptions {
		item.action();
	}
}
class Child{
	public void playWithDog(Item item,Dog dog) {
		try {
			dog.play(item);
		}catch(DogExceptions dee) {
			System.out.println(dee);
		}
	}
}

abstract class DogExceptions extends Exception{
	
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception....: "+msg;
	}
}

class DogBarkException extends DogExceptions{
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception....: "+msg;
	}
}