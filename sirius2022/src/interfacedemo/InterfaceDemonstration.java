package interfacedemo;
//https://fluvid.com/videos/detail/VBpQeiex8psBvL-ee#.YjRglgWos7U.link
import malik.MoleculeFramework;

public class InterfaceDemonstration {
	public static void main(String[] args) {
		AlopathyMedicalCollege stanley=new AlopathyMedicalCollege();
		UnaniMedicalCollege annahospital=new UnaniMedicalCollege();
		JetAcademy jet=new JetAcademy();
		
		
		Human shoiab=new Human();
		
		MoleculeFramework.setInterface(Doctor.class);
		
		Doctor doctorShoiab=(Doctor)MoleculeFramework.getObject(new Object[] {annahospital,shoiab});
		
		doctorShoiab.doCure();
		MoleculeFramework.setInterface(Pilot.class);
		
		Pilot pilotShoiab=(Pilot)MoleculeFramework.getObject(new Object[] {doctorShoiab,jet});
		
		pilotShoiab.fly();
		
		doctorShoiab=(Doctor)pilotShoiab;
		
		doctorShoiab.doCure();
	}
}
