import java.util.*;

public class Activity {
    public static void main (String[] args){
        float number1;
        float number2;
        float answer;
        String selection;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input the first number: ");
        number1 = scanner.nextInt();

        System.out.print("Please input the second number: ");
        number2 = scanner.nextInt();

        System.out.println("Possible calculations:\n  (A)dd\n  (S)ubtract\n  (M)ultiply\n  (D)ivide\nPlease select an option: ");
        scanner.nextLine();
        selection = scanner.nextLine();

        if (selection.equalsIgnoreCase("A")) {
            answer = number2 + number1;
            System.out.println(number1 + " + " + number2 + " = " + answer);
            }
        else if (selection.equalsIgnoreCase("S")) {
            answer = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + answer);
        }
        else if (selection.equalsIgnoreCase("M")) {
            answer = number2 * number1;
            System.out.println(number1 + " * " + number2 + " = " + answer);
        }
        else if (selection.equalsIgnoreCase("D")) {
            answer = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + answer);
        }
        else {
            System.out.println("Not a possible option. Quitting program.");
        }
    }



}
