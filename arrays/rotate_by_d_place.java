import java.util.Arrays;

public class rotate_by_d_place {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int d = 3;  //let's say d=3
        d = d % arr.length; // modulo operator provides the remainder
        int[] temp = new int[d];
        for(int i =0; i<d;i++){
            temp[i]=arr[i];
        }
        for(int j =3;j<arr.length;j++){
              arr[j-d] = arr[j];
        }
        for(int k=arr.length-d;k<arr.length;k++){
            arr[k]=temp[k-(arr.length-d)];
        }

       System.out.println("rotated:"+ Arrays.toString(Arrays.copyOf(arr,arr.length)));
    }
}
