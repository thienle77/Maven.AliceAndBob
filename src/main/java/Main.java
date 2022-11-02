
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Hello what is your name?");
        Scanner scanner = new Scanner (System.in);
        String s = scanner.nextLine();
        System.out.println("Your name is " + s);


        if (s .equals("Bob") || s .equals ("Alice")) {
            System.out.println("Greetings " + s) ;
        } else {
            System.out.println("Sorry, name was not found");
        }

    }
}





