import java.io.IOException;
import java.util.ArrayList;
public class FurnitureShop {
    private ArrayList<Furniture> store;
    private int count;
    public FurnitureShop() {
        this.store = new ArrayList<>();
        count = 0;
    }
    public void sell(Furniture a){
        if (store.contains(a)){
            System.out.println("Продажа: " + a + " за " +a.getPrice());
            store.remove(a);

        }
        else{
            System.out.println("Товара нет");
        }

    }
    public void addStore(Furniture...a){
        for (Furniture obj:a) {
            store.add(obj);
            count++;
        }
    }

    void showProduct(){
        System.out.println("В магазине есть:");
        for(int i=0; i < store.size(); i++)
            System.out.println(store.get(i));
    }

}
