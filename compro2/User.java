package compro2;

import Exception.*;
import java.util.Scanner;


public class User {


    private String name = "";
    private int money = 0;

    private Dishes dishe = null;
    private int num_dishes = 0;


    public User()
    {

    }

    public User(String name, int money){

        this.name = name;
        this.money = money;
}

public String getName(){
    return this.name;
}


    public int getMoney() {
        return this.money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Dishes getDishe() {
        return dishe;
    }

    public int getNum_dishes() {
        return num_dishes;
    }

    public void setDishe(Dishes dishe) {
        this.dishe = dishe;
    }

    public void setNum_dishes(int num_dishes) {
        this.num_dishes = num_dishes;
    }
}


