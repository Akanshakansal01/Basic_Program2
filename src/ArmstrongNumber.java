import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n,sum=0,rem;
        while(n>0)
        {
            rem = n%10;
            n=n/10;
            sum += rem*rem*rem;
        }
        if (temp==sum)
            System.out.println(temp + " is armstrong number");
        else
            System.out.println(temp + " is not armstrong number");
    }
}
