import java.util.Random;

public class Exercise04 {
    // constructor called random that uses the imported random function.
    public static final Random RANDOM =new Random();
    // keeps track of the total distance taken.
    public static int TOTAL_DISTANCE;

    public static void main(String[] args) {
       Choose_random_moves();
       Start_Walk();
    }

    // chooses from the array list_of_moves randomly
    public static String Choose_random_moves() {
        String[] list_of_moves = {"Right", "Left", "Up", "Down"};
        int Choose_move = RANDOM.nextInt(list_of_moves.length);
        return list_of_moves[Choose_move];
    }
    public static void Start_Walk() {
        // the walk is 2D so it'll be in x and y form
        int x; int y;
         x = 0; y = 0;
        System.out.println("The walk will be starting at points (0,0)");
        /* this do while loops runs the statements in the do loop while the statement
        x == 0 && y == 0 is not true.
        */
        do {
            /* created a variable moves to store the random value we picked in our array list from the
            Choose_random_moves method
             */
            String moves = Choose_random_moves();
            if (moves.equals("Right"))
            {
                System.out.println("You moved right");
                /* x position is incremented by 1 each time that Right is picked and runs.
                if Left, up or down are selected the same thing happens just x is either
                decreased or y is either increased or decreased by 1.
                 */
                x = x + 1;
                /* everytime Right, left, up, or down is selected this value which represents
                our total distance is increased by 1.
                 */
                TOTAL_DISTANCE = TOTAL_DISTANCE + 1;
            }
            else if (moves.equals("Left")) {
                System.out.println("You moved left");
                x = x - 1;
                TOTAL_DISTANCE = TOTAL_DISTANCE + 1;
            }
            else if (moves.equals("Up")) {
                System.out.println("You moved up");
                y = y + 1;
                TOTAL_DISTANCE = TOTAL_DISTANCE + 1;
            }
            else  {
                System.out.println("You moved Down");
                y = y - 1;
                TOTAL_DISTANCE = TOTAL_DISTANCE + 1;
            }
            System.out.println("Your current location is: (" + x + ", " + y + " )");
        }
        // once this statements evaluates to true the do loop stops and the contents inside the while loop executes
        while (!(x == 0 && y == 0));
        System.out.println("You have reached your starting point");
        System.out.println("Your total distance is:(" + TOTAL_DISTANCE + ")");

    }
}

