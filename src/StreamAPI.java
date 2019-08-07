import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Stream API provide the most convient and natural way to apply function to sequence of objects
//it is a data struture. we cant store any data, it will not effected to source of data
public class StreamAPI {

	public static void main(String[] args) {
		
		//map
		List<String> lis = Arrays.asList("London", "HongKong", "Paris", "NewYork");
		Iterator<String> it = lis.iterator();
		while (it.hasNext()) {
			String city = it.next();
			System.out.println(city);
		}

		List<String> listt = lis.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		Iterator<String> itt = listt.iterator();
		while (itt.hasNext()) {
			String city = itt.next();
			System.out.println(city);
		}
		
		List<Integer> li = Arrays.asList(1,2,3,4,6,89,90);
		List<Integer> lii=li.stream().map(i->i*2).collect(Collectors.toList());
		Iterator<Integer> itnum = lii.iterator();
		while (itnum.hasNext()) {
			int multby2 = itnum.next();
			System.out.println(multby2);
		}
		
		//Reduce operation-Stream.reduce()-reduction stream operations allow us to produce
		// one single result from a sequence of elements, 
		//by applying repeatedly a combining operation to the elements in the sequence.
		// Identity, Accumulator(two parameters--partial value and next iterating value), and Combiner
		
		int result=li.stream().reduce(0, (sum,dataval)->sum+dataval);
		System.out.println("Result using reduce  "+result);
		
		///Filter-- filetr is used to filter out the element from sequence of elements
		List<Integer> filt=li.stream().filter(i->i>7).collect(Collectors.toList());
		System.out.println(filt);
		
		 
		List<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(24);
		list.add(80);
		list.add(76);
		list.add(32);
		list.add(65);
		list.add(30);
		list.add(20);
		list.add(65);
		list.stream().forEach(a -> System.out.print(a+" "));
		System.out.println("\n");
		
		List<Integer> sqList = list.stream().map(a -> a*a).collect(Collectors.toList());
		System.out.println(sqList+"\n");
		
		List<Integer> firstAndAbove = list.stream().filter(a->a>60).collect(Collectors.toList());
		System.out.println(firstAndAbove+"\n");
		
		long countFirst =  list.stream().filter(a->a>60).count();
		System.out.println(countFirst+"\n");
		
		List<Integer> addToFailed = list.stream().filter(a->a<=30).map(a->a+10).collect(Collectors.toList());
		System.out.println(addToFailed+"\n");
		
		Stream<Integer> distinct =  list.stream().filter(a->a>60).distinct();
		System.out.println(distinct.count()+"\n");
		
		List<Integer> naturalSorting =  list.stream().sorted((a1,a2)->-a1.compareTo(a2)).collect(Collectors.toList());
		System.out.println(naturalSorting+"\n");
		
		List<Integer> customSorting =  list.stream().sorted((a1,a2)->a1<a2?-1:a1>a2?11:0).collect(Collectors.toList());
		System.out.println(customSorting+"\n");

	}

}
