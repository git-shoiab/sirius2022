package exceppack;
//throw and throws - checked exception
//https://fluvid.com/videos/detail/AZX-wTBpKxHm_5vOd#.YjgdiIkX038.link
public class ExcepDemo3 {

	public static void main(String[] args) {//throws Exception {
		Sheep sheep=new Sheep();
		try {
			//sheep.wait();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		LBoard lboard=new LBoard();
		try {
			lboard.driving("bumpy");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Sheep{
	
}


class LBoard{
	public void driving(String road)throws Exception{
		if(road.equals("bumpy")) {
			throw new BumpyRoadException("dom doom dush...........");
		}
	}
	//the meaning of the above throws is,  this method is capable of throwing an exception
	//please handle don't ignore
}

class BumpyRoadException extends Exception{
	String msg;
	public BumpyRoadException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "The road is bumpy..bla bla bla............"+msg;
	}
}