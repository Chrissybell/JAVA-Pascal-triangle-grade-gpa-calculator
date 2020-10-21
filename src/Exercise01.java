import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int number;
        double sum;
        System.out.print("Enter a number: ");
        number = cin.nextInt();
        sum =+ fractionSum(number);
        System.out.println("The sum of the first " + number + " numbers in the sequence is: " + sum);

    }

    public static double fractionSum(int n)
    {
        // starts an accumulator sum at 0.0
        double sum = 0.0;
        // for loop that adds the running sum
        for(int i = 1; i <= n; i++) {
            // on the first run the sum will be 1. one the second it will be 1.0 + 1.0/2 and so forth.
             sum =+ sum + 1.0/i;
        }
        // returns whatever sum ends up being
        return sum;
    }
}
