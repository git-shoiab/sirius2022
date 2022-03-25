package performance;
//https://fluvid.com/videos/detail/R_4m9SvGM9HMpLqZw#.Yj1Le7rmol8.link
import java.lang.ref.SoftReference;

public class GcDemo {
	public static void main(String[] args) throws Exception{
		Runtime r=Runtime.getRuntime();
		System.out.println("Before Tatha..:"+r.freeMemory());
		GrandFather tatha=new GrandFather();
		System.out.println("After tatha..:"+r.freeMemory());
		SoftReference<GrandFather> soft=new SoftReference<>(tatha);
		tatha=null;
		System.out.println("After death..:"+r.freeMemory());
		r.gc();
		System.out.println("After death..:"+r.freeMemory());
		tatha=soft.get();
		System.out.println(tatha.getGold());
	}
}


class GrandFather{
	String age;
	private String gold="under the tree....";
	public GrandFather() {
		for(int i=0;i<1000;i++) {
			age=new String(age+""+i);
		}
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(getGold());
	}
	protected String getGold() {
		return gold;
	}
	
	
}