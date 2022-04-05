import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // loops basics
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//
//        while ( i <= 15 ) {
//            System.out.print(i + " ");
//            i++;
//        }

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:


        //  BELOW IS A DO-WHILE LOOP THAT WILL COUNT DOWN BY 2 STARTING W 0 AND ENDING AT 100
//        int counter = 0;
//
//        do {
//            System.out.println(counter);
//            counter += 2;
//        } while (counter <= 100);

        // BELOW IS ANOTHER DO-WHILE LOOP THAT COUNTS BACKWARDS BY 5 FROM 100 TO -10
//        int counter = 100;
////
//        do {
//            System.out.println(counter);
//            counter -= 5;
//        } while (counter >= -10);

        // BELOW IS CODE THAT AND SQUARES EACH TIME BUT DOES NOT GO PASS 1000000
//        long counter = 2L;
//
//
//        do {
//            System.out.println(counter);
//            counter *= counter;
//        } while (counter < 1000000L);

        // REFACTORED INTO FOR LOOP

//        int counter = 100;
//

//        for(int counter = 100; counter >= -10; counter -= 5) {
//            System.out.println(counter);
//        }
//
//        for(long counter = 2L; counter < 1000000; counter *= counter) {
//            System.out.println(counter);
//        }
        // FIZZ BUZZ
//        for(int i = 1; i <= 100; i++){
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        Scanner scanner = new Scanner(System.in);
//
        boolean userContinues = true;

        do {
            System.out.println("What number would you like to go up to? ");
            int userInt = scanner.nextInt();
            System.out.println();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for(int i = 1; i <= userInt; i++){
                System.out.format("%-6d", i);
                System.out.print(" | ");
                System.out.format("%-7d", i * i);
                System.out.print(" | ");
                System.out.print(i * i * i);
                System.out.println();
            }
            System.out.print("Would you like to enter another number (y/n)? ");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while (userContinues);
    }
}
