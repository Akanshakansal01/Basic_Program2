import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of array:");
        int n= s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= s.nextInt();
        }
        System.out.println("Reverse Array Elements are: ");
        for(int i=n;i>0;i--)
        {
            System.out.print(i+" ");

        }
    }
}
