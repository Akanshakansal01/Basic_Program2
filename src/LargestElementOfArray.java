import java.util.Scanner;

public class LargestElementOfArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of array:");
        int n= s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= s.nextInt();
        }
        System.out.println("Largest Array Elements is: ");
       int max=arr[0];
       for(int i =0;i<arr.length;i++)
       {
           if (arr[i] > max)
           {
               max = arr[i];
           }
       }
        System.out.println(max);
    }
}
