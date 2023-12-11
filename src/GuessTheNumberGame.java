import java.io.Console;
import java.util.Random;

public class GuessTheNumberGame {

    private Random random;
    private int targetNumber;

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        System.out.println(game.targetNumber);

    }

    public GuessTheNumberGame(){
        this.random = new Random();
        this.targetNumber = random.nextInt(100);
    }

}
