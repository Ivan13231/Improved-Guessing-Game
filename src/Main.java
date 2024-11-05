import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i = 0;
        int complete = 0;
        Random rand = new Random();
        int randomNumber =  rand.nextInt(100) + 1;
        int guessNumber = 0;
        Scanner scan = new Scanner(System.in);
        String quit = "";
        System.out.println("Hello dear User! You have come to my guessing game. The only way to ");
        System.out.println("escape is to guess which number I am thinking about... or just by ");
        System.out.println("typing quit. OK! Now we begin! I have on my mind a number between ");
        System.out.println("1 and 100. Guess it!");

        while (complete == 0){
i++;
            if (scan.hasNextInt()){
                guessNumber = scan.nextInt();
                if (guessNumber < randomNumber){
                    System.out.println("Guess higher");

                }
                else if (guessNumber > randomNumber){
                    System.out.println("Guess lower");

                }
                else complete = 1;


            }
            else
                quit = scan.next();
                if (quit.equals("quit")){
                System.out.println("I see, you are choosing the easy way out. I knew it!");
                complete = -1;
            }


        }
        if (complete == -1){
            --i;
            System.out.println("Just so you know, the number was " + randomNumber);
            System.out.println("Dare to try again?");

        }
        else
        System.out.println("I can't believe it! You have defeated me!");
        System.out.println("You have made " + i + " guesses ");
    }


}


