package day3;
//https://fluvid.com/videos/detail/VBpQeiejRzhBvrPRR#.YjFmoeRsYyk.link
//https://fluvid.com/videos/detail/aQadEUd6z5fnPRdwj#.YjFuUQK-IM8.link
public class ClassDemo1 {
	int age=20;//primitive type or simple type
	String name="ramu";
	int nos[]=new int[4];
	String weighttype="heavy";
	
	int weight=getWeight(weighttype);
	
	MyType mytype=new MyType();//complex type - because this represents more values
	
	void met() {//to operate on complex type, u have to write the logic
		//inside a method
		mytype.age=20202;//write
		System.out.println(mytype.age);//read
	}
	int getWeight(String s) {
		if(s.equals("heavy")) {
			return 100;
		}
		else {
			return 50;
		}
	}
	void setWeight(String s) {
		weighttype=s;
	}
}

//a complex type is one, where you can have many datas represented in one
//data type
class MyType{//complex type
	int age=20;//primitive type or simple type
	String name="ramu";
	int nos[]=new int[4];
	String weighttype="heavy";
}