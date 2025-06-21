import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int[]arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.print(java.util.Arrays.toString(arr));
    }
}
