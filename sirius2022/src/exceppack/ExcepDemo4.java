/**
https://fluvid.com/videos/detail/n8QdniKVQkSXBx3Gg#.Yjgi4TN4gLY.link
 * 
 */
package exceppack;

import java.util.Scanner;

/**
 * @author Hp
 *
 */
public class ExcepDemo4 {
	public static void main(String[] args)throws Exception {
		Child baby=new Child();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the item...:");
		String itemclass=scan.next();
		Item item=(Item)Class.forName(itemclass).getConstructor().newInstance();
		Dog tiger=new Dog();
		baby.playWithDog(item, tiger);
	}
}

class Handler911{
	public void help(DogBiteException dbe) {
		System.out.println("take the child to hospital.............");
	}
	public void help(DogBarkException dbr) {
		System.out.println("barking dogs seldom bite...relax.........");
	}
	public void help(DogPlayException dbr) {
		System.out.println("happy dogs dont bite...play.........");
	}
}
abstract class Item{
	public abstract void action()throws DogExceptions;
}
class Stick extends Item{
	public Stick() {
		// TODO Auto-generated constructor stub
	}
	public void action() throws DogExceptions{
		throw new DogBiteException("you beat I bite....");
	}
}
class Stone extends Item{
	public Stone() {
		// TODO Auto-generated constructor stub
	}
	public void action() throws DogExceptions{
		throw new DogBarkException("you hit, I chase....");
	}
}
class Ball extends Item{
	public Ball() {
		// TODO Auto-generated constructor stub
	}
	public void action() throws DogExceptions{
		throw new DogPlayException("you throw, I catch....");
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
			dee.visit();
		}
	}
}

abstract class DogExceptions extends Exception{
	public abstract void visit();
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
	@Override
	public void visit() {
		new Handler911().help(this);
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
	@Override
	public void visit() {
		new Handler911().help(this);
	}
}
class DogPlayException extends DogExceptions{
	String msg;
	public DogPlayException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception....: "+msg;
	}
	@Override
	public void visit() {
		new Handler911().help(this);
	}
}