import java.util.Scanner;

public class linear {
    
    public static void main(String[] args) {
        int nums[]= { 12,3,5,-2,12,32};
        System.out.println("Enter the target:");
        Scanner scanner= new Scanner(System.in);
        int target= scanner.nextInt();

        int ans = linearSearch(nums,target);
        System.out.println();
        System.out.println(ans);

    }
    static int linearSearch(int[]arr, int target){
      if(arr.length==0){
        return -1;
      }
      for (int index = 0; index < arr.length; index++) {
        if(arr[index]==target){
            return index;
        }
      }
      return -1;
    }
}
