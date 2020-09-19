public abstract class Furniture {
    protected int price;
    protected String color;
    Furniture(int price, String color){
        this.price=price;
        this.color=color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
