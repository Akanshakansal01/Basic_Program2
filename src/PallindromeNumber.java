import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n,s = 0;
        while(n > 0)
        {
            s = (s * 10) + (n % 10);
            n = n / 10;
        }
        if (temp==s)
            System.out.println(temp + " is pallindrome Number");
        else
            System.out.println(temp + " is not pallindrome Number");
    }
}
