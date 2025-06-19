import java.util.Arrays;
public class Duplicates {
    public static void main(String[] args) {
       int arr []={1,2,2,3,4,3,5};
       Arrays.sort(arr);
       int ans = dupli(arr);
       for(int i=0;i<ans;i++){
        
       }
       System.out.println("After removing Duplicates: " + Arrays.toString(Arrays.copyOf(arr, ans)));

    }
   public  static int dupli (int [] arr){
         
        int i=0;
        for(int j =1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        } return i+1;
    }
}
