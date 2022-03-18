package interfacedemo;

public class JetAcademy implements Pilot,Steward{
@Override
public void fly() {
	System.out.println("flying.............................");
}
@Override
	public void serve() {
		System.out.println("serving.......................");
	}
}
