package day4;
//https://fluvid.com/videos/detail/XLE5Zc8ZrRF6GdeZ1#.YjK7PWnEaGA.link
//OBJECT REUSABILITY
public class InherDemo {
	public static void main(String[] args) {
		
	}
}
//Paintbrush is made reusable 
class PaintBrush{
	Paint rp=new RedPaint();
}

class Function{
	Hall hall=new MeetingHall();
}
class Hall{
	
}
//party hall is a kind of Hall
class PartyHall extends Hall{
	
}
class MeetingHall extends Hall{
	
}
class Employee{
	
}
//programmer is a kind of employee
class Programmer extends Employee{
	
}
class ShoeShop{
	ShoeFactory factory=new LakhaniShoeFactory();
}
class ShoeFactory{
	
}
class BataShoeFactory extends ShoeFactory{
	
}
class LakhaniShoeFactory extends ShoeFactory{
	
}