package compro2;

import cl.*;
import tangible.OutObject;
import tangible.TryParseHelper;

import java.io.Console;
import java.util.*;

public class Program
{
	public static void main(String[] args)
	{


		boolean again = true, success;

		int select;

		while (again)
		{
//			Console.encoding();
			String[] menu = {"1.Rice Chiken.", "2.Khao mun kai.", "3.Kao ka moo.", "4.Noodle Ped", "5.Pad ka prao."};
			int[] Price = {40, 50};
			int money = 0;
			int dish, bath = 0;
			int order;



			// bool success;   // use for no error input
			// success = Int32.TryParse(Console.ReadLine(), out select);   // input select

			String[] user = {"Posident", "1234"};


			String enter = ""; // not null

			System.out.print("\n\tPlease Enter Your ID : ");
			enter = new Scanner(System.in).nextLine();


			while (true)
			{

				if (user[0].equals(enter))
				{
					break; // exsit loop
				}

				else
				{ // กรอกผิด
					System.out.println("\n\tThe ID and password are entered incorrectly. Please enter again ");
					System.out.print("\n\tPlease Enter Your ID : ");
					enter = new Scanner(System.in).nextLine();
				}

			}


			System.out.print("\n\tPlease Enter Your Password : ");
			enter = new Scanner(System.in).nextLine();

			while (true)
			{

				if (user[1].equals(enter))
				{
					break; // exsit loop
				}

				else
				{
					System.out.println("\n\tThe ID and password are entered incorrectly. Please enter again ");
					System.out.print("\n\tPlease Enter Your Password : ");
					enter = new Scanner(System.in).nextLine();
				}

			}



//			Console.encoding();
			//ฟังก์ชั่น เลือกเมนูอาหารและใส่ชื่อ**

			System.out.println("\n\tWelcome to Restaurant.");
			System.out.println("\n\t1.Rice Chiken 40 Baht \n\t2.Khao mun gai 50 Baht\n\t3.Kao pad moo 40 Baht\n\t4.Noodle Ped 50 Baht\n\t5.Pad Ka Prao 40 Baht\n\t6.Exit. ");
			System.out.print("\n\tEnter your name: ");
			String name = new Scanner(System.in).nextLine();
			System.out.print("\n\tHow Much Money Do You Have: ");
			money = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.print(String.format("\n\t%1$s please select order: ", name));


			order = Integer.parseInt(new Scanner(System.in).nextLine());


			if (order == 6)
			{
				System.exit(0);
			}


			System.out.println(String.format("\n\t%1$s have %2$s baht.", name, money));



			if (order == 1 || order == 3 || order == 5)
			{
				bath = 0; // Price = 40 Baht
			}

			else
			{
				bath = 1; // Price = 50 Baht
			}

			order--;

			//ฟังชั้น เลือกจาน**
			System.out.printf("\n\t%3$s select %1$s this %2$s baht." + "\r\n", menu[order], Price[bath], name);

			System.out.print("\n\tHow Many Dishes Would You Like To Order? ");
			dish = Integer.parseInt(new Scanner(System.in).nextLine());

			Class1.cal(dish, money, name, Price[bath]);


			System.out.println("\n\t****************************");

			//ฟังชั้น ทำซํ้าให้เข้าไป สั่งอาหารใหม่
			System.out.println("Do you want order agian");
			System.out.println("1.Yes / 2.No ");

			OutObject<Integer> tempOut_select = new OutObject<Integer>();
			success = TryParseHelper.tryParseInt(new Scanner(System.in).nextLine(), tempOut_select); // input select
		select = tempOut_select.outArgValue;


			int userInput = 1;
			while (userInput != 0)
			{


				if (select == 1)
				{
					userInput--;
					again = true;
//					Console.encoding();
				}

				else if (select == 2)
				{
					userInput--;
					again = false;

					System.out.println("Thank you for using the service.");

				}

				else
				{
					System.out.println("You Must Select 1 Or 2 Only");
					System.out.println("Do you want order agian");
					System.out.println("1.Yes / 2.No ");

					OutObject<Integer> tempOut_select2 = new OutObject<Integer>();
					success = TryParseHelper.tryParseInt(new Scanner(System.in).nextLine(), tempOut_select2); // input select
				select = tempOut_select2.outArgValue;
				}
//				Console.encoding();

			} // while select end

		} //while end

	} // main end

}