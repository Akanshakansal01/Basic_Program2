import java.util.Scanner;

public class RightRotateArrayElements {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= s.nextInt();
        System.out.println("Enter how many times you want to rotate: ");
        int a=s.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Original Array :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int last,j;
        for(int i=0;i<a;i++)
        {
            last=arr[n-1];
            for(j=n-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.println();
        System.out.println("After Right Rotation:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
