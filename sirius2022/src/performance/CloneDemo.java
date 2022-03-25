package performance;
//https://fluvid.com/videos/detail/v_v8rS1wD2f4gvxMD#.Yj1jrX7y960.link
public class CloneDemo {
	
	public static void main(String[] args)throws Exception {
		Sheep mother=new Sheep();
		mother.name="I am the mother sheep...";
		
		//Sheep dolly=new Sheep();
		
		//Sheep dolly=mother;
		
		Sheep dolly=(Sheep)mother.met();
		dolly.name="I am the clone dolly...";
		
		System.out.println(mother.name+":"+dolly.name);
		
	}
	
}


class Sheep implements Cloneable{
	public Sheep() {
		System.out.println("sheep cons called...");
	}
	String name;
	
	 Sheep met()throws Exception {
		 return (Sheep)this.clone();
	 }
}