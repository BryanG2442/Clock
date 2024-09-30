import java.util.*;

public class Tic {
    public static void main(String[] args){
        String userName = "aooo";
        String passWord = "aaaa";
        String email = "ndwaj@jawd.com";
        int birthdate = 12_31_1939;
        int followerCount = 0;
        boolean isLoggedIn = false;

        System.out.println("Wijudwa");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your username.");
        String inputtedUserName = scanner.nextLine();

        System.out.println("Now please input your password.");
        String inputtedPassword = scanner.nextLine();

        if (userName.equals(inputtedUserName) && passWord.equals(inputtedPassword)) {
            System.out.println("Hello " + userName + "!");
            isLoggedIn = true;
        }
        else {
            System.out.println("Idiot");
            isLoggedIn = false;


                    }
    }
}
