package day3;
//https://fluvid.com/videos/detail/DrG-KszxZZc-1D4a-#.YjF-Js9fRfg.link
public class ClassDemo2 {
	public static void main(String[] args) {
		ClassDemo2 obj=new ClassDemo2();
		Laddu myLaddu=new Laddu();
		Human dibya=new Human();
		
		//pass by value...
		System.out.println("Before passing..:"+myLaddu.size);//10
		obj.setSize(myLaddu.size);//iam passing value 10
		System.out.println("After Passing..:"+myLaddu.size);//10
		
		//pass by reference
		
		System.out.println("Before passing..:"+myLaddu.size);//10
		obj.setSize(myLaddu);//iam passing value 10
		System.out.println("After Passing..:"+myLaddu.size);//10
		
		
	}
	
	void setSize(int size) {//i am receving a copy
		size=5;
	}
	void setSize(Laddu laddu) {
		laddu.size=5;
	}
}

class Laddu{//comples type - remember - always pass by reference
	int size=10;//primitive - remember - always pass by value
}

class Human{}