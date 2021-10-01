import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean b = isPerfect(n);
        if (b)
            System.out.println(n + " is perfect number");
        else
            System.out.println(n + " is not perfect number");
    }
    public static boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
           if(n%i==0)
               sum=sum+i;
        }
        if(n==sum)
            return true;
        return false;
    }
}

