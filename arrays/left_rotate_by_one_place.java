import java.util.Arrays;

public class left_rotate_by_one_place {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int ans= left(arr);
       System.out.println("After rotating: " + Arrays.toString(Arrays.copyOf(arr, ans))); 
    }
    static int left(int [] arr){
        int temp=0;
        temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
           
        }
        arr[arr.length-1]=temp;
        return arr.length;
    }
}
