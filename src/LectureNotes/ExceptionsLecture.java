package LectureNotes;

import java.util.Scanner;

public class ExceptionsLecture {
    // we are going to make this into an int
    public String maybeAnInt = "42";
    public String notAnInt = "not a num lol";

    public void askForAnInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        // the code is gonna ask for an int and try ot parse it into a int

        try {
            int userInputInteger = Integer.parseInt(userInput);
            System.out.println("The integer in your string is " + userInputInteger);
            // line 19 will try to catch the user int and throw an error in not an int
        }catch (NullPointerException npx){
            System.out.println("dud string is null");
        } catch (NumberFormatException nfx){
            System.out.println("Uh oh, " + nfx.getMessage() + " there is no integer!");
            // finally will run no matter what
        } finally {
            System.out.println("Thank you for using this complex and useful application.");
            System.out.println("Please come back and visit.");
        }
    }
}
