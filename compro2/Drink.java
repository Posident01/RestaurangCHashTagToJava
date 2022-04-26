package compro2;


public class Drink extends Dishes{

    private String name = " ";
    private int price = 0;
    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Drink() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
