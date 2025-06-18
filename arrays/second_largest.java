public class second_largest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 25};
        int largest=arr[0];
        int sec = -1;
        for( int i=0;i<arr.length;i++){
            if(arr[i]>largest){
               sec=largest;
                largest=arr[i];
            
            }
            else if(arr[i]<largest && arr[i]>sec){
                sec =arr[i];
            }
        }
       
       System.out.println(sec);
}

}