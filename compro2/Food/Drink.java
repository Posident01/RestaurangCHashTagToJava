package compro2.Food;


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
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
