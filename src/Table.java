public class Table extends Furniture {
    protected int widthofsurface;
    protected int lengthofsurface;

    Table(int price, String color, int lengthofsurface, int widthofsurface) {
        super(price, color);
    }

    public int getWidthofsurface() {
        return widthofsurface;
    }

    public void setWidthofsurface(int widthofsurface) {
        this.widthofsurface = widthofsurface;
    }

    public int getLengthofsurface() {
        return lengthofsurface;
    }

    public void setLengthofsurface(int lengthofsurface) {
        this.lengthofsurface = lengthofsurface;
    }

    @Override
    public String toString() {
        return "Table{" +
                "widthofsurface=" + widthofsurface +
                ", lengthofsurface=" + lengthofsurface +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
