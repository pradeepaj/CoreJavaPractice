
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
 
public class CollectionWorkspace
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        //Array with duplicate elements
        Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
         
        //This array has duplicate elements
        System.out.println( Arrays.toString(numbers) );
         
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
         
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
        //Verify the array content
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
        
        
     // Array with duplicate elements
        Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };
 
        // This array has duplicate elements
        System.out.println(Arrays.toString(origArray));
 
        Integer[] tempArray = removeDuplicates(origArray);
 
        // Verify the array content
        System.out.println(Arrays.toString(tempArray));
    
        // 
        // Create a HashSet 
        HashSet<String> hset = new HashSet<String>();

        // Creating a List of HashSet elements
        List<String> list = new ArrayList<String>(hset);

        HashSet<String> fruits = new HashSet<String>();
        fruits.add("");
        
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Pear");
        
        List<String> fr=new ArrayList<>(fruits);
        Collections.sort(fr);
        TreeSet<String> tr= new TreeSet<>(fruits);
    }
 
    private static Integer[] removeDuplicates(Integer[] origArray) {
 
        Integer[] tempArray = new Integer[origArray.length];
         
        int indexJ = 0;
        for (int indexI = 0; indexI < origArray.length - 1; indexI++)
        {
            Integer currentElement = origArray[indexI];
             
            if (currentElement != origArray[indexI+1]) {
                tempArray[indexJ++] = currentElement;
            }
        }
         
        tempArray[indexJ++] = origArray[origArray.length-1];
		return tempArray;
         
       
    //https://javahungry.blogspot.com/2019/02/collection-programs-in-java-for-interview.html
    }  
   
   ///Sort arraylist in decending order
    //1-->Collections.sort(arraylist,Collections.reverseOrder());
    //2-->Collections.sort(list);Collections.reverse(list);
    // add element at particular index of ArrayList-->add(int index, Object element). 
    //remove element-->remove(int index) -->remove(Object o)
    
    }

