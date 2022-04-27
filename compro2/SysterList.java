package compro2;

import compro2.Food.Dishes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

import Exception.*;
import compro2.Food.Drink;


public class SysterList
{

    Scanner keyboard = new Scanner(System.in);


    public int selection(String inPutMessage,String showError, List<Dishes> dishesList) throws IndexTooLowException, IndexTooHighException
    {

        int selection = -1;
        boolean again = true;


        while(again)
        {

            String selectionStr = "";

            try
            {

                System.out.print(inPutMessage);
                selectionStr = keyboard.nextLine();

                selection = getInput(selectionStr,dishesList);

                again = false;

            }

            catch (NumberFormatException e)
            {
                System.out.println(showError);

            }

            catch (IndexTooHighException e)
            {
                System.out.println(showError);

            }
            catch (IndexTooLowException e)
            {
                System.out.println(showError);
            }

        }

        return selection;
    }





    public int getInput(String selectionStr, List<Dishes> dishesList) throws IndexTooLowException, IndexTooHighException
    {
        int select;

        try {
            select = Integer.parseInt(selectionStr);
            select = select - 1;

            if (select < -1) {
                throw new IndexTooLowException();
            }


            else if (select > dishesList.size()-1)
            {
                throw new IndexTooHighException();
            }


        } catch (NumberFormatException e) {

            throw new NumberFormatException();
        }

        return select;


    }

    public List<Dishes> loadFood(String fileName) {

        List<Dishes> loadFood = new ArrayList<>();

        File myFile = new File("compro2/Food/"+fileName+".txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(myFile)))
        {
            String[] fields = null;
            String line = null;

            for (int i = 0 ; ((line = reader.readLine()) != null); i++) {
                fields = line.split(",");



                Dishes dishes = new Dishes();

                dishes.setName(fields[0]);

                dishes.setPrice(Integer.parseInt(fields[1]));


                loadFood.add(dishes);

            }

        }

        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }



        return loadFood;


    }












    public int selectionDrink(String inPutMessage,String showError, List<Drink> dishesList) throws IndexTooLowException, IndexTooHighException
    {

        int selection = -1;
        boolean again = true;


        while(again)
        {

            String selectionStr = "";

            try
            {

                System.out.print(inPutMessage);
                selectionStr = keyboard.nextLine();

                selection = getInputDrink(selectionStr,dishesList);

                again = false;

            }

            catch (NumberFormatException e)
            {
                System.out.println(showError);

            }

            catch (IndexTooHighException e)
            {
                System.out.println(showError);

            }
            catch (IndexTooLowException e)
            {
                System.out.println(showError);
            }

        }

        return selection;
    }


    public int getInputDrink(String selectionStr, List<Drink> dishesList) throws IndexTooLowException, IndexTooHighException
    {
        int select;

        try {
            select = Integer.parseInt(selectionStr);
            select = select - 1;

            if (select < -1) {
                throw new IndexTooLowException();
            }


            else if (select > dishesList.size()-1)
            {
                throw new IndexTooHighException();
            }


        } catch (NumberFormatException e) {

            throw new NumberFormatException();
        }

        return select;


    }

    public List<Drink> loadDrink(String fileName) {

        List<Drink> loadDrink = new ArrayList<>();

        File myFile = new File("compro2/Food/"+fileName+".txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(myFile)))
        {
            String[] fields = null;
            String line = null;

            for (int i = 0 ; ((line = reader.readLine()) != null); i++) {
                fields = line.split(",");



                Drink dishes = new Drink();

                dishes.setName(fields[0]);

                dishes.setPrice(Integer.parseInt(fields[1]));


                loadDrink.add(dishes);

            }

        }

        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }



        return loadDrink;


    }
}
