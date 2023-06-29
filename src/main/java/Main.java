/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Guess The Number");
        int n = 10;
        int guess = 0;
        int counter = 0;

        while (guess != n) {
            System.out.print("You Guessed: ");
            guess = in.nextInt();
            counter++;

            if (guess > n) {
                System.out.println("Too large");
            } else if (guess < n) {
                System.out.println("Too small");
            } else {
                System.out.println("You're CORRECT!");
                System.out.println("It took you "  + counter +  " tries to guess correctly!");
            }
        }
    }
}




        


