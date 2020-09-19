public class Сhair extends Furniture {
    private int lengthofchairlegs;

    Сhair(int price, String color,int lengthofchairlegs) {
        super(price, color);
        this.lengthofchairlegs = lengthofchairlegs;
    }

    public int getLengthofchairlegs() {
        return lengthofchairlegs;
    }

    public void setLengthofchairlegs(int lengthofchairlegs) {
        this.lengthofchairlegs = lengthofchairlegs;
    }
}
