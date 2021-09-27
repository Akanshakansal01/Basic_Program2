import java.util.Scanner;

public class EvenPositionArrayElement {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of array:");
        int n= s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= s.nextInt();
        }
        System.out.println("Even Position Array Elements are: ");
        for(int i=1;i<n;i=i+2)
        {
            System.out.println(arr[i]);
        }
    }
}
