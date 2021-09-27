import java.util.Scanner;

public class ArrayElements {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of array:");
        int n= s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= s.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int i: arr)
        {
            System.out.print(i+" ");

        }
    }
}
