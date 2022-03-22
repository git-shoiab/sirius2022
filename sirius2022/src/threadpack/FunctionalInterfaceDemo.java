package threadpack;
//https://fluvid.com/videos/detail/-KRkYhG-YdsEznnwa#.YjmcprJPFLA.link
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		new MyFunctional() {			
			@Override
			public void met() {
				System.out.println("met anonymous impl called..");
			}
		
		}.met();
		
//		MyFunctional myf=new MyFunctional() {
//			
//			@Override
//			public void met() {
//				// TODO Auto-generated method stub
//				
//			}
//			@Override
//			public void met2() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		
//		myf.met();
		
		//LAMBDAS
		MyFunctional myf=()->{
			System.out.println("met method of interface called...");
		};
		MyFunctional2 myf2=(i)->{
			System.out.println("met 2 of inter called..:"+i);
		};
		
		MyFunctional3 myf3=(String s,int i)->{
			return "welcome to lambda..:"+s+":"+i;
		};
		
		myf.met();
		myf2.met(100);
		String result=myf3.met("sirius", 1000);
		System.out.println(result);
	}
}
@FunctionalInterface
interface MyFunctional{
	public void met();	
}

interface MyFunctional2{
	public void met(int i);	
}

interface MyFunctional3{
	public String met(String s,int i);	
}