package poker;


public class card{

    private String suit;
    private String value;
    private String[] suitList = {"Diamond", "Clubs", "Hearts", "Spades"};
    private String[] valueList = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public card() {
    }

    public String setSuit(Integer b) {

        String randomSuit = suitList[b];
        return randomSuit;

    }

    public String setValue(Integer a) {

        String randomValue = valueList[a];
        return randomValue;

    }

    public void createCard(String s, String v) {

        this.suit = s;
        this.value = v;
    }

    public void drawCard() {
        System.out.printf("You drew %s of %s.", this.value, this.suit);
    }
}
