public class peak_element{
    public static void main(String[]args){
      int arr[]={12,34,21,54,65,34,98};
      System.out.println(max(arr));
    }
    static int max(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>ans){
            ans=arr[i];
            }
        }System.out.println("Maximum value is:");
        return ans;
    }
}