package LectureNotes;

import java.util.Scanner;

public class JavaWarmups {
    public static void returnFirstCapitalLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String str = scanner.next();
        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                System.out.println(str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        returnFirstCapitalLetter();
    }
}
