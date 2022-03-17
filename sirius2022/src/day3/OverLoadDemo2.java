package day3;

public class OverLoadDemo2 {
	public static void main(String[] args) {
		Happy911 _911=new Happy911();
		
		_911.help(new Fire());
	}
}

class Bad911{
	void help(String s) {
		if(s.equals("fire")) {
			System.out.println("sent fire service...");
		}
		else if(s.equals("robbery")) {
			System.out.println("sent police...");
		}
	}
}

class Happy911{
	void help(Fire fire) {
		fire.action();
	}
	void help(Robbery robbery) {
		robbery.action();
	}
	void help(HeartAttack ha) {
		ha.action();
	}
}

class Fire{
	public void action() {
		System.out.println("send fire engine...");
	}
}

class Robbery{
	public void action() {
		System.out.println("sent police...");
	}
}
class HeartAttack{
	public void action() {
		System.out.println("sent doctor...");
	}
}