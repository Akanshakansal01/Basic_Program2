import java.util.Scanner;

public class NumberPattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0,r=n;i<n;i++,r--) {
            for(int j=1;j<=r;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
