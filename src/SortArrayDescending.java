import java.util.Scanner;

public class SortArrayDescending {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Original Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Ascending Sorted Array :");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
