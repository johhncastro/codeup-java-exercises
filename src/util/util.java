package util;

import java.util.Scanner;

class Input{

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string.");
        String input = scanner.nextLine();
        return input;
    }

    public static boolean yesNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter either yes (for true) or no (for false)");
        String input = scanner.nextLine();
        return (input.equalsIgnoreCase("yes") | input.equalsIgnoreCase("y") | input.equalsIgnoreCase("true") | input.equalsIgnoreCase("t"));
    }
//


}



public class util {
    public static void main(String[] args) {

        System.out.println(Input.getString());
        System.out.println(Input.yesNo());

    }
}
