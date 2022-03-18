package day5;
//https://fluvid.com/videos/detail/ZEn3MT8j7KS9Dadgy#.YjQw92zgnn0.link
import java.util.Scanner;

public class InherDemo8 {
	public static void main(String[] args) {
		//BadFan shaitan=new BadFan();
		GoodFan khaitan=new GoodFan();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Please enter for pulling...");
			scan.next();
			khaitan.pull();
		}
	}
}
class BadFan{
	int state=0;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state...");
			state=1;
		}
		else if(state==1) {
			System.out.println("medium speed state...");
			state=2;
		}
		else if(state==2) {
			System.out.println("high speed state...");
			state=3;
		}
		else if(state==3) {
			System.out.println("switch off state...");
			state=0;
		}
	}
}
abstract class State{
	public abstract void pull(GoodFan fan);
}
class GoodFan{
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}
class SwitchOffState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("switch on state.....");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("medium speed state.....");
		fan.state=new MediumState();
	}
}
class MediumState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("high speed state.....");
		fan.state=new HighSpeedState();
	}
}
class HighSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("switch off state.....");
		fan.state=new SwitchOffState();
	}
}