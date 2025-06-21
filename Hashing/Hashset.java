import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
        public static void main(String[] args) {
            // creating hashset
        HashSet<Integer> set = new HashSet<>();
        // insert elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
         set.add(5); set.add(8);
      System.out.println(" Size of set is:"+set.size());//as output it gives 3 as it doesn't consider duplicate elements 
      // search-contains
      if(set.contains(1)){
        System.out.println("contains");
      }
      if(!set.contains(4)){
        System.out.println("Not contains");
      }
      // delete
      set.remove(2);
      if(!set.contains(2)){
        System.out.println("It doesn't have ");
      }
      System.out.println("now the size is :"+set.size());
      System.out.println(set);
      //Iterator
      Iterator<Integer> it = set.iterator();
      // it.hasnext and it.next 
      // the second one returns the value and the first one checks if exist or not 
      while(it.hasNext()){
        System.out.println(it.next());

      }
    }
}
