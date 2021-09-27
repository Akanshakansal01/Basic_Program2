import java.util.Scanner;

public class SmallestElementOfArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= s.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Smallest Array Elements is: ");
        int min= arr[0];
        for(int j=0;j<n;j++)
        {
            if(arr[j]<min)
            {
                min = arr[j];
            }
        }
        System.out.println(min);
    }
}
