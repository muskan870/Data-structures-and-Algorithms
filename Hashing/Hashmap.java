import java.util.*;// * is used to import all kind of utilities
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        // they are unordered so they print output in any random order
        //Insertion
        map.put("India", 120);
         
        map.put("China", 120);
    
          map.put("Australia", 432);
           map.put("USA", 21);
   System.out.println(map);
   map.put("China", 180);// updated the value
   System.out.println(map);

   // Search
   if(map.containsKey("China")){
    System.out.println("present");}
    if(!map.containsKey("France")){
        System.out.println("Doesn't present");
    
   }
   System.out.println(map.get("China"));// if you want value and it exist
   System.out.println(map.get("Indonesia"));// if key is not exist
   int[]arr={1,2,3,4,5};
   for(int val : arr){     // extended for loop used in collection work
    System.out.print( val +" ");
    
   }System.out.println();

   //Iterator
   for(Map.Entry<String , Integer> e: map.entrySet()){
    System.out.print(e.getKey()+" ");
    System.out.print(e.getValue()+" ");
   }
    }    
}
