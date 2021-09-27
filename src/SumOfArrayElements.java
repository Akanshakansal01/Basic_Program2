import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= s.nextInt();
        int sum =0;
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of Array Elements is: "+ sum);

    }
}
