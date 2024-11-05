public class Cards {
    public enum Rank {
        ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king
    }
    public static void main(String args[]){
        Rank highCard;
        Rank faceCard;
        Rank card1;
        Rank card2;

        highCard = Rank.ace;
        faceCard = Rank.queen;
        card1 = Rank.four;
        card2 = Rank.six;

        int card1Val = card1.ordinal() + 1;
        int card2Val = card2.ordinal() + 1;

        System.out.println("High card : "+highCard+" and Face card: "+faceCard);
        System.out.println("Card 1: "+ card1Val+" Card 2: "+card2Val);
    }
}