package com.java8;
// stream is interface present in java.util.stream package
// if we want to process objects from collection than we should go for stream api
// Stream s = c.stream() to get stream
// filter(predicate)
// map(function)
// collect()
// count()
// sorted() without argument default sorting order
// s1.compareTo(s2)  - default sorting order
// s2.compareTo(s1) = reverse natural order
// -s1.compareTo(s2) = reverse natural order
// min(Comparator) in min and max by default sorting will be there 
// max(Comparator)
// forEach(Consumer)
// toArray() to convert stream of objects in to array
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		/*List<Integer> li = new ArrayList<>();
		li.add(11);
		li.add(12);
		li.add(88);
		li.add(79);
		li.add(80);*/
		
		
		// how to sort on the basis of string length
		List<String> name = new ArrayList<>();
		name.add("Hu");
		name.add("A");
		name.add("Hussain");
		name.add("Salman Khan");
		name.add("Hussain");
		Comparator<String> c = (s1,s2)->{
			int l1 = s1.length();
			int l2 = s2.length();
			if(l1<l2) return -1;	
		    else if (l1>l2) return 1;
		    else return s1.compareTo(s2);
		};
		 
	//	List<Integer> l = li.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		// for printing in default order
		//List<Integer> l2 = li.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		// for printing in descending order 
		///List<Integer> l = li.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
		
	 //  int count =  (int) li.stream().filter(i->i%2==0).count();
		
		List<String> s = name.stream().sorted(c).collect(Collectors.toList());
	   System.out.println(s);
		
		
	}
	
}
