import java.util.Scanner;

public class Exercise03 {
    /*
    F = Final exam grade
    G = Grade you want for the class
    w = Weight of the final exam, divided by 100 (put weight in decimal form vs. percentage form)
    C = Your current grade
*/
    public static void main(String[] args)
    {
        double G = calculateGradeNeeded();
        double W = Weight();
        double C = YourCurrentGrade();

        // calculates final grade you need to get the grade you want using an already established formula
        double final_grade = (G-(1-W) * C) / W;
        System.out.print(final_grade);
    }
    public static double calculateGradeNeeded() {
        Scanner cin = new Scanner(System.in);
        double Grade;
        System.out.print("Enter Grade Needed: ");
        Grade = cin.nextDouble();
        return Grade;
    }
    public static double Weight() {
        Scanner cin = new Scanner(System.in);
        double Weight;
        System.out.print("Enter Weight of final ");
        Weight = cin.nextDouble();
        return Weight/100;
    }
    public static double YourCurrentGrade() {
        Scanner cin = new Scanner(System.in);
        double Current_Grade;
        System.out.print("Enter Current Grade: ");
        Current_Grade = cin.nextDouble();
        return Current_Grade;
    }

}
