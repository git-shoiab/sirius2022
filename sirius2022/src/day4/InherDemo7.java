package day4;

public class InherDemo7 {
	public static void main(String[] args) {
		Tv tv=new Tv();
		XBox xbox=new XBox();
		VGame vgame=new VGame();
		SetTopBox box=new SetTopBox();
		Ginie ginie=new Ginie();
		
		NewsChannelCommand ncc=new NewsChannelCommand(tv, xbox, vgame, box);
		ginie.setCommand(ncc, 1);
		ginie.executeCommnad(1);
	}
}

class Ginie{
	Command c[]=new Command[5];
	
	public Ginie() {
		for(int i=0;i<5;i++) {
			c[i]=new DummyCommand();
		}
	}
	public void executeCommnad(int slot) {
		c[slot].execute();
	}
	
	public void setCommand(Command command,int slot) {
		c[slot]=command;
	}
}
abstract class Command{
	Tv tv;
	XBox xbox;
	VGame vgame;
	SetTopBox box;
	public Command() {
		
	}
	public Command(Tv tv, XBox xbox, VGame vgame, SetTopBox box) {
		this.tv = tv;
		this.xbox = xbox;
		this.vgame = vgame;
		this.box = box;
	}
	public abstract void execute();
}
class DummyCommand extends Command{
	
	@Override
	public void execute() {
		System.out.println("I am dummy yet to be operational...");
	}
}
class NewsChannelCommand extends Command{
		
	public NewsChannelCommand(Tv tv, XBox xbox, VGame vgame, SetTopBox box) {
		super(tv,xbox,vgame,box);
	}

	@Override
	public void execute() {
		System.out.println("news channel command started ....");
		tv.av1();
		box.newsChannel();
		System.out.println("news channel started..enjoy news...");
	}
}
class SerialChannelCommand extends Command{
	public SerialChannelCommand(Tv tv, XBox xbox, VGame vgame, SetTopBox box) {
		super(tv,xbox,vgame,box);
	}

	@Override
	public void execute() {
		System.out.println("serial channel command started ....");
		tv.av1();
		box.serialChannel();
		System.out.println("serial channel started..enjoy saas bahu serial...");
	}
}
class TTGameCommand extends Command{
	public TTGameCommand(Tv tv, XBox xbox, VGame vgame, SetTopBox box) {
		super(tv,xbox,vgame,box);
	}

@Override
	public void execute() {
		System.out.println("tt game command started ....");
		tv.av2();
		xbox.TTGame();
		System.out.println("tt game started..enjoy playing...");
	}	
}
class SkiiGameCommand extends Command{
	public SkiiGameCommand(Tv tv, XBox xbox, VGame vgame, SetTopBox box) {
		super(tv,xbox,vgame,box);
	}

	@Override
	public void execute() {
		System.out.println("skii game command started ....");
		tv.av2();
		vgame.skatingGame();
		System.out.println("skii game started..enjoy playing...");
	}
}
class Tv{
	public void av1() {
		System.out.println("av1 started...");
	}
	public void av2() {
		System.out.println("av2 started...");
	}
}
class XBox{
	public void TTGame() {
		System.out.println("start tt game...");
	}
}
class VGame{
	public void skatingGame() {
		System.out.println("start skiing game..");
	}
}
class SetTopBox{
	public void newsChannel() {
		System.out.println("news channel started...");
	}
	public void serialChannel() {
		System.out.println("serial channel started..");
	}
}