import java.util.Scanner;

public class MethodExercises {


    public static void divide(int num1, int num2){
        int i = num1 / num2;
        System.out.println(i);
    }
    public static void multiply(int num1, int num2){
        int i = num1 * num2;
        System.out.println(i);
    }
    public static void subtract(int num1, int num2){
        int i = num1 - num2;
        System.out.println(i);
    }
    public static void add(int num1,int num2){
        int i = num1 + num2;
        System.out.println(i);
    }
    public static void modulusNumber(int num1, int num2) {
        int  i = num1 % num2;
        System.out.println(i);
    }
    public static void Factorial(int userInput){
        int i, value = 1;
        for(i = 1; i<=userInput;i++){
            value = value * i;
        }
    }

    public static void diceRoll(Scanner scan){

        while( true ){


            System.out.println("Give me the number of sides of the dice");
            short n = Short.parseShort(scan.nextLine());
            int range = n - 1 + 1;
            System.out.println("Your dice roll 1 = " + ((int)(Math.random() * range) + 1) );
            System.out.println("Your dice roll 2 = " + ((int)(Math.random() * range) + 1) );

            System.out.println("Do you wish to continue? y/n");
            if(scan.nextLine().toLowerCase().equals("n")){
                break;
            }
        }

    }
    public static void main(String[] args) {
        add(3,2);
        multiply(3,3);
        divide(10,5);
        subtract(100,5);
        modulusNumber(50,9);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scan.nextInt();
        System.out.println(userInput);


//        System.out.println("The factorial of the input is  " + Factorial(userInput));
        diceRoll(scan);
    }



}
