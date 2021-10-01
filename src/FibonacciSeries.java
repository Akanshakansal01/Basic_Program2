import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int a=1,b=1,k;
        System.out.print("1 1 ");
        for(k=0;k<n;k++)
        {
            k=a+b;
            System.out.print(k + " ");
            a=b;
            b=k;
        }
    }
}
