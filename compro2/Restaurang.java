package compro2;

import cl.*;
import tangible.OutObject;
import tangible.TryParseHelper;

import java.util.*;

public class Restaurang
{
	public static void main(String[] args)
	{
		Dishes[] dishes = new Dishes[5];

		dishes[0] = new Dishes("Rice Chiken",60);
		dishes[1] = new Dishes("Khao mun kai",50);
		dishes[2] = new Dishes("Kao ka moo",45);
		dishes[3] = new Dishes("Noodle Ped",65);
		dishes[4] = new Dishes("Pad ka prao",50);

		boolean again = true, success;

		int select;

		while (again)
		{
//			Console.encoding();
			int[] Price = {40, 50};
			int money = 0;
			int dish, bath = 0;
			int order = 0;

//			String[] user = {"Posident", "1234"};
//
//
//			String enter = ""; // not null
//
//			System.out.print("\n\t Please Enter Your ID : ");
//			enter = new Scanner(System.in).nextLine();
//
//
//			while (true)
//			{
//
//				if (user[0].equals(enter))
//				{
//					break; // exsit loop
//				}
//
//				else
//				{ // กรอกผิด
//					System.out.println("\n\tThe ID and password are entered incorrectly. Please enter again ");
//					System.out.print("\n\tPlease Enter Your ID : ");
//					enter = new Scanner(System.in).nextLine();
//				}
//
//			}
//
//
//			System.out.print("\n\tPlease Enter Your Password : ");
//			enter = new Scanner(System.in).nextLine();
//
//			while (true)
//			{
//
//				if (user[1].equals(enter))
//				{
//					break; // exsit loop
//				}
//
//				else
//				{
//					System.out.println("\n\tThe ID and password are entered incorrectly. Please enter again ");
//					System.out.print("\n\tPlease Enter Your Password : ");
//					enter = new Scanner(System.in).nextLine();
//				}
//
//			}



//			Console.encoding();
			//ฟังก์ชั่น เลือกเมนูอาหารและใส่ชื่อ**

			System.out.println("\n\tWelcome to Restaurant.");

//			System.out.println("\n\t1.Rice Chiken 40 Baht \n\t2.Khao mun gai 50 Baht\n\t3.Kao pad moo " +
//					"40 Baht\n\t4.Noodle Ped 50 Baht\n\t5.Pad Ka Prao 40 Baht\n\t6.Exit. ");




			System.out.print("\n\tEnter your name: ");  /// ใส่ชื่อ
			user.setName(new Scanner(System.in).nextLine());


			boolean check_money = true;

			do {

				System.out.print("\n\tHow Much Money Do You Have: ");

				try {

					user.setMoney(Integer.parseInt(new Scanner(System.in).nextLine()));
					//===========================================================

					check_money = false;

				} catch (Exception e) {

					System.out.println("\n\tBro I Say Let Select Money!!!!!!!!!!!!!!!!!");
//					System.out.println(e);

				}

			} while (check_money == true);

		//รายการเมนู

			for (int i = 0; i < dishes.length ; i++) {

				System.out.println("\t"+ (i+1) + "." + dishes[i].getName() + " " + dishes[i].getPrice() + " Baht");

			}
			System.out.println("\n\t0.Exit");











			// เลือก ออเดอร์

			boolean again_and_again = true;

			do {

				System.out.print("\n\t" + user.getName() + " Please select order : ");

				try {

					order = Integer.parseInt(new Scanner(System.in).nextLine());

					//===========================================================

					again_and_again = false;

				} catch (Exception e) {

					System.out.println("\n\tYou Must Select Number Food!!!!!");

				}

			} while (again_and_again == true);



				if (order == 0)
				{
					System.out.println("\n\tSee You Next Time BRO <3");
					System.exit(0);

				}

				System.out.println("\n\t" + user.getName() + " have " + user.getMoney() + " baht");


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


			System.out.println("\n\t" + user.getName() + " Select " + user.getDishe().getName() + " this " + user.getDishe().getPrice() + " Bath. " );

			boolean dish_check = true;

			do {

				System.out.print("\n\tHow Many Dishes Would You Like To Order? ");

				try {

					user.setNum_dishes(Integer.parseInt(new Scanner(System.in).nextLine()));

					MoneyBill.cal(user.getNum_dishes(), user.getMoney(), user.getName(), user.getDishe().getPrice());
					//===========================================================

					again_and_again = false;

				} catch (Exception e) {

					System.out.println("\n\tHey Man I Say !!! Enter A Number Dish!!!!!!!! ");

				}

			} while (dish_check == true);


			//System.out.print("\n\tHow Many Dishes Would You Like To Order? ");
			//dish = Integer.parseInt(new Scanner(System.in).nextLine());
















		//ทำรายการอีกครั้งมั้ย

//			System.out.println("\n\t****************************");
//
//			//ฟังชั้น ทำซํ้าให้เข้าไป สั่งอาหารใหม่
//			System.out.println("Do you want order agian");
//			System.out.println("1.Yes / 2.No ");
//
//
//			select = Integer.parseInt(new Scanner(System.in).nextLine());
//
//
//			int userInput = 1;
//			while (userInput != 0)
//			{
//
//
//				if (select == 1)
//				{
//					userInput--;
//					again = true;
////					Console.encoding();
//				}
//
//				else if (select == 2)
//				{
//					userInput--;
//					again = false;
//
//					System.out.println("Thank you for using the service.");
//
//				}
//
//				else
//				{
//					System.out.println("You Must Select 1 Or 2 Only");
//					System.out.println("Do you want order agian");
//					System.out.println("1.Yes / 2.No ");
//
//					OutObject<Integer> tempOut_select2 = new OutObject<Integer>();
//					success = TryParseHelper.tryParseInt(new Scanner(System.in).nextLine(), tempOut_select2); // input select
//				select = tempOut_select2.outArgValue;
//				}
////
//
//			} // while select end



			System.exit(0);
		} //while end

	} // main end

}