import java.util.Random;


public class Scanner{
    public static void main(String[] args) {
        guessingGame(3);

    }

    public static void guessingGame(){
        Scanner input = new Scanner(System.in);
        int num = new Random().nextInt(10) + 1;
        System.out.println("Please guess a number from 1-10");
        int guess = input.nextInt();
        if (num == guess) {
            System.out.println("You got the right answer!");
        } else {
            System.out.println("Incorrect! The answer was " + num);
        }

    }
}
