package exceppack;
//https://fluvid.com/videos/detail/G6x-YcDAp3i5gp3vY#.YjgPzSDc9Ds.link
public class ExcepDemo2 {
	public static void main(String[] args) {
		System.out.println("Before exception....");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println("you have not entered a argument.."+e);
		}catch(NumberFormatException ne) {
			System.out.println("You have entered a character in place of number...: "+ne);
		}
//		catch(Exception ee) {
//			System.out.println(ee);
//		}
		finally {
			System.out.println("finally block called...");
		}
		System.out.println("after exception..");
		}
}
