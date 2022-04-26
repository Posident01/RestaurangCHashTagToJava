package compro2;

import Exception.*;
import compro2.Food.Dishes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Syster {

    Scanner keyboard = new Scanner(System.in);


    public int selection(String inPutMessage,String showError) {

        int selection = -1;
        boolean again = true;


        while(again)
        {

            try
            {

                System.out.print(inPutMessage);
                selection = Integer.parseInt(keyboard.nextLine());

                again = false;

            }

            catch (NumberFormatException e)
            {
                System.out.println(showError);

            }

        }

        return selection;
    }






}
