package day3;
//https://fluvid.com/videos/detail/448axCd4ojhBRDd52#.YjG0wGrElzM.link
public class StaticDemo2 {
	public static void main(String[] args) {
		
		TrainingRoom t1=new TrainingRoom();
		TrainingRoom t2=new TrainingRoom();
		
		System.out.println(t1.sanyo);
		System.out.println(t2.sanyo);
		
		System.out.println(t1.toilet);
		System.out.println(t2.toilet);
		
		System.out.println(TrainingRoom.toilet);
		System.out.println(TrainingRoom.toilet);
		met();
	}
	static void met() {
		//this - cannot use this - because this refers to current object
		//and for static it is jvm so it cannot point to jvm
		//super keyword cannot be used inside a static method
		//static methods cannot access non static variables or methods
	}
}

class TrainingRoom{
	Projector sanyo=new Projector();//instance variable
	static Toilet toilet=new Toilet();//class variable
	//class variable means - n number of instances will use the same object of toilet
}

class Projector{
	
}

class Toilet{
	
}