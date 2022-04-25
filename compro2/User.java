package compro2;

import Exception.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class User {

    Scanner keyboard = new Scanner(System.in);

    private String name = "";
    private int money = 0;

    private Dishes dishe = null;
    private int num_dishes = 0;

    private List<Dishes>  Disheslist = new ArrayList<>();

    public void addMenuList (Dishes menu) {
        Disheslist.add(menu);
    }



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
    public List<Dishes> getDisheslist(){
        return this.getDisheslist();
    }


    public int selection() {

        int selection = -1;
        boolean again = true;

        while(again)
        {
            try
            {
                System.out.print("Input : ");
                String selectionStr = keyboard.nextLine();

                selection = getInput(selectionStr);

                again = false;

            }
            catch (NumberFormatException e)
            {
                System.out.println("Error : Only Number");
            }

//            catch (SelectToReturn e)
//            {
//                return 0;
//            }

            catch(IndexTooLowException e)
            {
                //System.out.println(">> "+index);
                System.out.println("Error : Index too low");
            }

            catch(IndexTooHighException e)
            {
                //System.out.println(">> "+index);
                System.out.println("Error : Index too high");
            }

        }

        return selection;
    }


    public int getInput(String selectionStr) throws IndexTooLowException, IndexTooHighException
    {
        int select;

        try {
            select = Integer.parseInt(selectionStr);
            select = select - 1;

            // TODO: check index value and return proper exception

//            if (select == -1)
//            {
//                throw new SelectToReturn();
//            }


            if (select < -1) {
                throw new IndexTooLowException();
            }

            else if (select > 5)
            {
                throw new IndexTooHighException();
            }


        } catch (NumberFormatException e) {

            // TODO: remove below return, throw the proper exception
            throw new NumberFormatException();
        }

        return select;


    }

}


