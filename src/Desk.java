public class Desk extends Table {
    private int places;
    Desk(int price, String color, int lengthofsurface, int widthofsurface, int places) {
        super(price, color, lengthofsurface, widthofsurface);
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "places=" + places +
                ", widthofsurface=" + widthofsurface +
                ", lengthofsurface=" + lengthofsurface +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
