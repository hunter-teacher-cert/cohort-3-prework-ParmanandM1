import java.util.Random;
import java.util.*;

public class Guess{

    public static void main(String[] args) {
        // pick a random number
        System.out.println("I'm thinking of a number between 1 and 100 including both");
        System.out.println("Can you guess what it is?");
        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number: ");
        int guessnumber = scan.nextInt();
        
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: " + number);
        int Difference = number - guessnumber;
        System.out.println("You were off by: " + Difference);
        if (number == guessnumber)
          System.out.println("You are correct!!!");
        
    }
}