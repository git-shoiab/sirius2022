package utilpack;

import java.util.Random;

/*
 * 1. ArrayList, Queue, Stack
 * 2. LinkedList, Comparable and comparator
 * 3. Vector, Properties, Dictionary, Hashtable
 * 4. HashSet, TreeSet
 * 5. HashMap and TreeMap
 */
public class RandomNumber {
	public static void main(String[] args) {
		Random r=new Random();
				
		for(int i=1;i<6;i++) {
			int n=r.nextInt(25);
			if(n==0) {
				--i;
			}
			else {
				System.out.println(n);
			}
		}
	}
}
