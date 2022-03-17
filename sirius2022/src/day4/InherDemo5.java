package day4;
//https://fluvid.com/videos/detail/1eVaGHew_3tAe22Ly#.YjL7os_xg1I.link
public class InherDemo5 {
	public static void main(String[] args) {
		ShakthiSocket ss=new ShakthiSocket();
		HPPlug hp=new HPPlug();
		IndianAdapter ip=new IndianAdapter();
		ip.setAmericanPlug(hp);
		ss.roundPinHole(ip);
	}
}
class IndianAdapter extends IndianPlug{
	AmericanPlug ap;
	public void setAmericanPlug(AmericanPlug ap) {
		this.ap=ap;
	}
	@Override
	public void action() {
		ap.action();
	}
}
abstract class IndianSocket{
	public abstract void roundPinHole(IndianPlug ip);
}
abstract class IndianPlug{
	public abstract void action();
}

abstract class AmericanPlug{
	public abstract void action();
}

class HPPlug extends AmericanPlug{
	@Override
	public void action() {
		System.out.println("american plug working...");
	}
}

class ShakthiSocket extends IndianSocket{
	@Override
	public void roundPinHole(IndianPlug ip) {
		ip.action();
	}
}