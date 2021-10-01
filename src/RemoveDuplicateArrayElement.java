import java.util.Scanner;

public class RemoveDuplicateArrayElement {
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
        System.out.println();

    }
}
