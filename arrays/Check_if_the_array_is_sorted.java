public class Check_if_the_array_is_sorted {
    public boolean arraySortedOrNot(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>= arr[i - 1]) {
               
            }
            else{
                 return false;
            }
        }
        return true;
    }
}
