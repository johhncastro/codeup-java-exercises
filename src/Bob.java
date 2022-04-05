import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                while(true) {

                    System.out.println("What will you say to Bob?");
                    String userResponse = scanner.nextLine().trim();

                    if (userResponse.endsWith("?")) {
                        System.out.println("sure.");
                    } else if (userResponse.endsWith("!")) {
                        System.out.println("woah chillll outtt");
                    } else if (userResponse.isEmpty()) {
                        System.out.println("fine. be that way.");
                    } else if (userResponse.toLowerCase().equals("bye")) {
                        System.out.println("see ya");
                        break;
                    }else {
                        System.out.println("Whatever.");
                    }
                }
    }
}
