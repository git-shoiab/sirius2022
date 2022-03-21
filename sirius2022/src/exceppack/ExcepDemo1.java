package exceppack;
//https://fluvid.com/videos/detail/w6e8gcQ7MMsnyoxQY#.YjgIZ09fQb8.link
public class ExcepDemo1 {
	public static void main(String[] args) {
		System.out.println("Before exception...");
		int len=args.length;
		if(len>0) {
			String num=args[0];
			if(Character.isDigit(num.charAt(0))) {
				int n=Integer.parseInt(num);
				if(n!=0) {
					
					int i=1/Integer.parseInt(args[0]);
				}
				else {
					System.out.println("The number is zero, ..wrong");
				}
			}
			else {
				System.out.println("the input is not a number....");
			}
		}
		else {
			System.out.println("please input a argument......");
		}
		
		System.out.println("after exception...");
	}
}
