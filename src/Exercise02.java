import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args)
    {
        //variables for the weight of each category, homework, exam, and final grades.
        double weight1; double weight2; double weight3;

        Scanner cin = new Scanner(System.in);
        double Hw = calculateHomework();
        System.out.print("Enter your homework average weight: ");
        weight1 = cin.nextDouble();

        double Ex = calculateExam();
        System.out.print("Enter your Exam average weight: ");
        weight2 = cin.nextDouble();

        double Fin = calculateFinal();
        System.out.print("Enter your Final average weight: ");
        weight3 = cin.nextDouble();

        // formula to calculate the final grade
        double finalScore = (Hw * weight1 + Ex * weight2 + Fin * weight3) / (weight1 + weight2 + weight3);

        System.out.print(finalScore);
        System.out.println();

        //if and else statements responsible for printing out the letter grades based on final grade.
        if(finalScore >90){
            System.out.print("Your Letter grade is an A");
        }
        else if(finalScore > 80){
            System.out.print("Your Letter grade is a B");
        }
        else if(finalScore > 70){
            System.out.print("Your Letter grade is a C");
        }
        else if(finalScore > 60){
            System.out.print("Your Letter grade is a D");
        }
        else{
            System.out.print("Your Letter Grade is an F");
        }

    }
    // takes user input for Homework grade and returns it
    public static double calculateHomework(){
        Scanner cin = new Scanner(System.in);
        double Hw_Grade;
        System.out.print("Enter your homework average: ");
        Hw_Grade = cin.nextDouble();
        return Hw_Grade;
    }
    // takes user input for Exam grade and returns it
    public static double calculateExam(){
        Scanner cin = new Scanner(System.in);
        double Ex_Grade;
        System.out.print("Enter your Exam average: ");
        Ex_Grade = cin.nextDouble();
        return Ex_Grade;
    }
    // takes user input for final grade and returns it
    public static double calculateFinal(){
        Scanner cin = new Scanner(System.in);
        double Fin_Grade;
        System.out.print("Enter your final score: ");
        Fin_Grade = cin.nextDouble();
        return Fin_Grade;
    }
}
