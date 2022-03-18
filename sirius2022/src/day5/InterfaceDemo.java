package day5;

import malik.MoleculeFramework;

//https://fluvid.com/videos/detail/zj4k_T7o54tgjQQ8B#.YjRXmeVA3gY.link
public class InterfaceDemo {
	public static void main(String[] args) {
		AlopathyMedicalCollege stanley=new AlopathyMedicalCollege();
		
		Human shoiab=new Human();
		
		MoleculeFramework.setInterface(Doctor.class);
		
		Doctor doctorShoiab=(Doctor)MoleculeFramework.getObject(new Object[] {stanley,shoiab});
		
		doctorShoiab.doCure();
	}
}
class Human{
	
}

interface Doctor{
	public void doCure();
	public void earnMoney();
}
interface Service{
	public void serve();
}
interface Nurse extends Service{
	public void servePatients();
}
class AlopathyMedicalCollege implements Doctor,Nurse{
	@Override
	public void doCure() {
		System.out.println("cure is implemented as per alopathy medicine...");
	}
	@Override
	public void earnMoney() {
		System.out.println("money honey and honey is money...");
	}
	@Override
	public void serve() {
		System.out.println("serving patients of alopathy doctors...");
	}
	@Override
	public void servePatients() {
		// TODO Auto-generated method stub
		
	}
}

class UnaniMedicalCollege implements Doctor{
	@Override
	public void doCure() {
		System.out.println("give alopathy medicine as unani medicine...");
	}
	@Override
	public void earnMoney() {
		System.out.println("earn as much as u can....");
	}
}

