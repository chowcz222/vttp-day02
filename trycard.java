package poker;

import java.util.Random;

public class trycard {
    
    public static void main(String[] args) {
        String[] suitList = {"Diamond", "Clubs", "Hearts", "Spades"};
        String[] valueList = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] deckList = new String[52];

        for(int i = 0; i < valueList.length; i++) {
            for (int j = 0; j < suitList.length; j++) {
                if(!(i == 0) && j == 0) {
                    deckList[(i*j+j+1)] = valueList[i] + " " + suitList[j];
                } else {
                    deckList[(i*j+j)] = valueList[i] + " " + suitList[j];
                }
                
            }
        
        }
        Random random = new Random();
        int c = random.nextInt(52);
        String[] cardDetails = deckList[c].split(" ");
        String value = cardDetails[0];
        String suit = cardDetails[1];
        System.out.printf("You drew %s of %s.", value, suit);
        
    }
}
