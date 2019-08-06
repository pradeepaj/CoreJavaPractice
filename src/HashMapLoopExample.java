import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapLoopExample {

	 public static void main(String args[]) {
	        
		    // Creating a HashMap of String keys and String values 
		    
		    HashMap<String, String> hm=new HashMap<String,String>();
		    hm.put("k1", "v1");
		    hm.put("k2", "v2");
		    Set<Map.Entry<String, String>> entry=hm.entrySet();
		    Iterator<Map.Entry<String, String>> it=entry.iterator();
		    // Iterating or looping using entrySet() method
		    while(it.hasNext()) {
		    	Map.Entry enr=it.next();
		    	System.out.println("Key " +enr.getKey()+" " +"Value " +enr.getValue());
		    }
		    
		    //sort by key
		    
		    HashMap<Integer, String> hashm=new HashMap<Integer,String>();
		    hashm.put(11,"rama");
		    hashm.put(3, "uma");
		    hashm.put(5, "soma");
		    hashm.put(34, "ama");
		    hashm.put(10, "raju");
		    Set set=hashm.entrySet();
		    Iterator iter=set.iterator();
		    while(iter.hasNext()) {
		    	Map.Entry entryy=(Map.Entry)iter.next();
		    	System.out.println("Key "+entryy.getKey() +" " +"Value "+ entryy.getValue());
		    }
		    //using Treemap we can sort by key
		    
		    TreeMap<Integer, String> tree=new TreeMap<Integer, String>(hashm);
		    Set set1=tree.entrySet();
		    System.out.println(set1);
		    Iterator iter1=set1.iterator();
		    while(iter1.hasNext()) {
		    	Map.Entry entryyy=(Map.Entry)iter1.next();
		    	System.out.println("Key "+entryyy.getKey() +" " +"Value "+ entryyy.getValue());
		    }
		    
		    Map<Integer, String> map = sortByValues(hashm); 
		    System.out.println("After Sorting:");
		    Set set2 = map.entrySet();
		    Iterator iterator2 = set2.iterator();
		      while(iterator2.hasNext()) {
		           Map.Entry pair = (Map.Entry)iterator2.next();
		           System.out.print(pair.getKey() + ": ");
		           System.out.println(pair.getValue());
		      }
		  }

		    private static HashMap sortByValues(HashMap map) { 
		       List list = new LinkedList(map.entrySet());
		       // Defined Custom Comparator here
		       Collections.sort(list, new Comparator() {
		            public int compare(Object o1, Object o2) {
		               return ((Comparable) ((Map.Entry) (o1)).getValue())
		                  .compareTo(((Map.Entry) (o2)).getValue());
		            }
		       });

		       // Here I am copying the sorted list in HashMap
		       // using LinkedHashMap to preserve the insertion order
		       HashMap sortedHashMap = new LinkedHashMap();
		       for (Iterator it = list.iterator(); it.hasNext();) {
		              Map.Entry entry = (Map.Entry) it.next();
		              sortedHashMap.put(entry.getKey(), entry.getValue());
		       } 
		       return sortedHashMap; 
		  }

}
