package xmlstreams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamDemo {
	public static void main(String[] args) {
		StreamDemo obj=new StreamDemo();
		//obj.normalCode();
		//obj.reducedCode();
		//obj.createStreams();
		obj.methodsInStreams();
	}
	public void normalCode() {
		List<String> list=new ArrayList<>();
		list.add("aaaa");
		list.add("bbb");
		
		for(String s:list) {
			System.out.println(s);
		}
	}
	
	public void reducedCode() {
		List<String> list=Arrays.asList("aaaa","bbbb","cccc");//one line code
		//Arrays.asList("hello","hai").stream().forEach(i->{System.out.println(i);});
		//Arrays.asList("helllllllooo","haiiiiii").stream().forEach(System.out::println);//method referencing
		//Stream<String> s=list.stream();
		//s.forEach((i)->{System.out.println(i);});
		//list.stream().forEach((i)->{System.out.println(i);});
		//parallelstream uses thread concept - from concurrency api
		list.parallelStream().forEach(System.out::println);//not thread safe
		list.parallelStream().forEachOrdered(System.out::println);//thread safe
		
	}
	public void createStreams() {
		Stream s=Stream.empty();
		System.out.println(s.count());
		
		Stream ss=Stream.of("aaa","bbb","ccc");
		ss.parallel().iterator().forEachRemaining(System.out::println);
		
		Stream.of("xxx","yyy","zzz").parallel().forEach(System.out::println);
		Stream.of("xxx","yyy","zzz").parallel().forEachOrdered(System.out::println);
		
		String arr[]= {"a","b","c"};
		Stream arrstream=Arrays.stream(arr);
		arrstream.forEach(System.out::println);
		
		Stream<String> strb=Stream.<String>builder().add("abc").add("xyx").add("pqr").build();
		strb.forEach(System.out::println);
		
		Stream<Double> sg=Stream.<Double>generate(()->new Generator().generate()).limit(5);
		sg.forEach(System.out::println);
		
		Stream sgi=Stream.iterate(50, n->n+10).limit(5);
		sgi.forEach(System.out::println);
		
		IntStream.range(1, 5).forEach(System.out::println);
		LongStream.range(2, 10).forEach(System.out::println);
		
		IntStream istream="hello world".chars();
		istream.forEach(System.out::println);
		
		DoubleStream ds=new Random().doubles().limit(5);
		ds.forEach(System.out::println);
		
		//reading streams from file.
		try {
		//URI uri=new URI("http://google.com/index.html");
		Path path=Paths.get("abc.properties");
		Stream fstream=Files.lines(path, Charset.forName("UTF-8"));
		fstream.forEach(System.out::print);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void methodsInStreams() {
		Stream<String> mystream=Stream.of("aa","ba","cc","da");
		//mystream.filter(s->s.contains("a")).forEach(System.out::println);
		Stream<Integer> mystreamint=Stream.of(1,2,3,4);
		mystreamint.filter(n->check(n)).forEach(System.out::println);
		
		//List<String> filteredlist=mystream.filter(s->s.contains("a")).collect(Collectors.toList());
		//System.out.println(filteredlist);
		
		mystream.filter(s->s.contains("a")).map(s->concat(s)).forEach(System.out::println);
	}
	public String concat(String s) {
		return s+"hello world";
	}
	public boolean check(Integer n) {
		if(n>2) {
			return true;
		}
		else {
			return false;
		}
	}
}
class Generator{
	public double generate() {
		return new Random().nextDouble();
	}
}