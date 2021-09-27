import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=s.nextInt();
        int arr[] =new int[n];
        int sum =0;
        float avg;
        System.out.println("Enter "+ n +" elements: ");
        for( int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for( int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i : arr)
        {
            sum= sum+i;
        }
        avg=(float)sum/n;
        System.out.println("Sum of Array :"+sum);
        System.out.println("Average of Array :"+avg);
    }

}
