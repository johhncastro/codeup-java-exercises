import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.format("the value of pi is approximately %.2f" , pi);


        Scanner scanner = new Scanner(System.in);


        System.out.print("please enter int: ");
        int number =scanner.nextInt();
        System.out.println(number + " was your number");
        scanner.nextLine(); // needed to clear new line char from scanner
        System.out.println("Enter a Word: ");
        String word1 = scanner.next();
        System.out.println("Enter another word: ");
        String word2 = scanner.next();
        System.out.println("enter the last word: ");
        String word3 = scanner.next();
        System.out.println("Your words were "+ word1 + ", "+ word2 + " ," + word3);
        scanner.nextLine(); // needed to clear new line char from scanner
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println(sentence + "... Wow what a beautiful sentence");
//        scanner.nextLine(); // needed to clear new line char from scanner
        System.out.println("please enter the length of the classroom: ");
        int length =scanner.nextInt();
        scanner.nextLine(); // needed to clear new line char from scanner
        System.out.println("please enter the width of the classroom: ");
        int width =scanner.nextInt();
        System.out.println("The perimeter of the classroom is " + ((length *2) + (width*2)) + " and the area is "+ (length * width));






//        System.out.println("You entered: --> \"" + userInput + "\" <--");


    }
}
