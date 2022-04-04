package xmlstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethodsDemo {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4);
	int reduced=list.stream().reduce((n1,n2)->n1+n2).get();
	System.out.println(reduced);
	
	int min=list.stream().min((n1,n2)->n1.compareTo(n2)).get();
	System.out.println("Minimum Value..:"+min);
	
	int key=11;
	int ar[]= {2,5,8,10,10,10,5};
	boolean yes=IntStream.of(ar).anyMatch(n1->(n1==key));
	if(yes) {
		System.out.println("element found...");
	}
	else {
		System.out.println("element not found....");
	}
	
	double d=IntStream.of(ar).average().getAsDouble();
	System.out.println(d);
	
	IntStream s=IntStream.of(ar).distinct();
	s.forEach(System.out::println);
	
	Stream ss=Stream.of(11,34,5,66,67,67).filter(n1->(n1<50)).sorted();
	ss.forEach(System.out::println);
	
	Stream sss=Stream.of(11,34,5,66,67,67).filter(n1->(n1<50)).map(n1->n1+10);
	sss.forEach(System.out::println);
	
	IntSummaryStatistics isc=IntStream.of(1,2,3,4,5,6,10).summaryStatistics();
	System.out.println(isc);
}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}