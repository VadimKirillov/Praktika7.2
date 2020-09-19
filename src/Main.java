public class Main {
    public static void main(String[] args) {
        FurnitureShop Larek = new FurnitureShop();

        Furniture desk = new Desk(300,"Brown",60,50,2);
        Furniture table = new Table(228,"White",70,80);

        Larek.addStore(desk,table);
        Larek.showProduct();

        Larek.sell(table);
        Larek.showProduct();

    }
}
