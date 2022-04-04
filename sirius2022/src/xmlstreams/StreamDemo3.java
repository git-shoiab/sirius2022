package xmlstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class StreamDemo3 {
public static void main(String[] args) {
	//flatmap
	List <Integer> list1=Arrays.asList(1,2,3);
	List <Integer> list2=Arrays.asList(5,6,7);
	List <Integer> list3=Arrays.asList(9,4,9);
	List<List<Integer>> listoflist=Arrays.asList(list1,list2,list3);
	listoflist.stream().forEach(System.out::println);
	
	List<Integer> listofall=listoflist.stream().flatMap(x->x.stream()).collect(Collectors.toList());
	System.out.println(listofall);
			
	
	//boolean allmatch
	List <Integer> listt=Arrays.asList(6,3,6);
	boolean answer=listt.stream().allMatch(x->x>2);
	System.out.println(answer);
	//boolean anymatch
	List <Integer> listtt=Arrays.asList(1,3,6);
	boolean answer2=listtt.stream().anyMatch(x->x>2);
	System.out.println("Boolean any"+answer2);
	//findany
	List <Integer> listo=Arrays.asList( );
	Optional<Integer> o1=listo.stream().findAny();
	System.out.println(o1);
  //findfirst
	List <Integer> listp=Arrays.asList( 7,76,90,12);
	Optional<Integer> o2=listp.stream().findFirst();
	System.out.println(o2);
}
}