import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter how many rows you want for your pascal triangle: ");
        int n = cin.nextInt();


        // outer for loop that runs n times
        for (int i = 0; i <= n; i++) {
            // responsible for format. it moves based on white spaces to the right.
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner for loop responsible for producing the pascal triangle patterns
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + pascal_formula(i, j));
            }
            // after the 2 inner for loops run ith times you move to a new line and redo the same thing.
            System.out.println();

        }
    }
    /* we'll be using a known formula for generating pascals triangle
    this formula requires the use of a factorial which we'll be making in this method
     */
    static int fact(int n) {
        int factorial;

        for ( factorial = 1; n > 1; n--) {
            factorial *= n;
        }
        return factorial;

    }

    /* the formula to calculate pascals triangle is
     n!/r!(n-r)!
     */
    public static int pascal_formula(int n, int r)
    {
     return fact(n) / (fact(n - r)* fact(r));
    }


}



