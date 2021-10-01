import java.util.Scanner;

public class SwapUsingXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no.: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        n = n ^ m;
        m = n ^ m;
        n = n ^ m;
        System.out.println("After Swapping: " + n);
        System.out.println(m);
    }
}
