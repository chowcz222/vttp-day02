package poker;

import java.util.Random;
import java.io.Console;

public class playcards {
    public static void main(String[] args) {

        Console cons = System.console();;
        String input = cons.readLine("draw or shuffle deck\n");
        if (input.equals("draw")) {
            Random random = new Random();
            int c = random.nextInt(13);
            int d = random.nextInt(4);

            card mycard = new card();
            mycard.createCard(mycard.setSuit(d), mycard.setValue(c));
            mycard.drawCard();
        }
        
    }
}

