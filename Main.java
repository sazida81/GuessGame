import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rn = new Random();
        int random = rn.nextInt(100);
        while(true) {
            System.out.print("Enter the player guess: ");
            Scanner sc = new Scanner(System.in);
            int player = sc.nextInt();
            if (player == random) {
                System.out.println("You Guessed right");
                break;
            } else if (random > player) {
                System.out.println("Your guessed is low");
            } else {
                System.out.println("Your guessed is high");
            }
        }
    }
}
