/*Write a Java program and compute the sum of the digits of an integer
        Input Data:
        Input an integer: 25
        Expected Output
        The sum of the digits is: 7
*/

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for(int i=n;i>0;i--) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
}
