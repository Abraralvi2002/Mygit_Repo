import java.util.*;
public class Sum_of_array {
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = ipt.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = ipt.nextInt();
        }
        int sum = sumArray(arr, 0);
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
