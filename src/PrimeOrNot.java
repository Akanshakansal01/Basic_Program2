import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime= true;
        //for(int i=2;i<n/2;i++)
        //for(int i=2;i<n;i++)
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(n + " is prime Number");
        else
            System.out.println(n+ " is not prime Number");
    }
}
