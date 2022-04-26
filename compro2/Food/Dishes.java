package compro2.Food;

public class Dishes  {

    private String name = "";
    int price = 0;

    public Dishes(String name, int price) {

        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Dishes() {

    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }


}
