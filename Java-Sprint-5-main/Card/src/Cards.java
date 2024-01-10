public class Cards {
    int rank;
    String suit;
    public Cards() {
    }
    public Cards(int rank, String suit) {
        assert isRankTrue(rank);
        assert isSuitTrue(suit);
        this.rank = rank;
        this.suit = suit;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit() {
        this.suit = suit;
    }
    boolean isRankTrue(int value){
        if(value>=1 && value<=13){
            return true;
        }
        return false;
    }
    boolean isSuitTrue(String value){
        final String[] names={"Hearts","Spades","Cube","Diamonds"};
        for(int i=0;i< names.length;i++){
            if(names[i].equals(value)){
                return true;
            }
        }
        return false;
    }
}

