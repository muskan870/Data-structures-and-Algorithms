import java.util.Arrays;
public class right_rotate {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int ans= right(arr);
       System.out.println("After rotating: " + Arrays.toString(Arrays.copyOf(arr, ans))); 
    }
    static int right(int [] arr){
        int temp=0;
        temp=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
           
        }
        arr[0]=temp;
        return arr.length;
    }
}