package compro2;

import cl.MoneyBill;
import tangible.OutObject;
import tangible.TryParseHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

			int money = 0;
			int dish;
			int order = 0;

			String[] User = {"Posident", "1234"};


			String enter = ""; // not null

			System.out.print("\n\t Please Enter Your ID : ");
			enter = new Scanner(System.in).nextLine();


			while (true)
			{

				if (User[0].equals(enter))
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

				if (User[1].equals(enter))
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



			//ฟังก์ชั่น เลือกเมนูอาหารและใส่ชื่อ**

			System.out.println("\n\tWelcome to Restaurant.");

			User user = new User();


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

					order = Integer.parseInt(new Scanner(System.in).nextLine()) - 1;
					if (order == -1)
					{
						System.out.println("\n\tSee You Next Time BRO <3");
						System.exit(0);
					}
					user.setDishe(dishes[order]);


					//===========================================================

					again_and_again = false;

				} catch (Exception e) {

					System.out.println("\n\tYou Must Select Number Food!!!!!");

				}


			} while (again_and_again == true);











				System.out.println("\n\t" + user.getName() + " have " + user.getMoney() + " baht");





			//ฟังชั้น เลือกจาน**


			System.out.println("\n\t" + user.getName() + " Select " + user.getDishe().getName() + " this " + user.getDishe().getPrice() + " Bath. " );



			List<Dishes>  Disheslist = new ArrayList<>();

			boolean dish_check = true;

			do {
				//System.out.print("\n\tHow Many Dishes Would You Like To Order? ");
				List<String> Dishes = new ArrayList<>(Collections.singleton("\n\tHow Many Dishes Would You Like To Order? "));

				for (String s : Dishes) {
					System.out.println(s);

				}


				try {


						//your for-loop code here
						user.setNum_dishes(Integer.parseInt(new Scanner(System.in).nextLine()));





					MoneyBill.cal(user.getNum_dishes(), user.getMoney(), user.getName(), user.getDishe().getPrice());


					//===========================================================

					dish_check = false;

				} catch (Exception e) {

					System.out.println("\n\tHey Man I Say !!! Enter A Number Dish!!!!!!!! ");

				}

			} while (dish_check == true);


			//System.out.print("\n\tHow Many Dishes Would You Like To Order? ");
			//dish = Integer.parseInt(new Scanner(System.in).nextLine());
















		//ทำรายการอีกครั้งมั้ย

			System.out.println("\n\t****************************");

			//ฟังชั้น ทำซํ้าให้เข้าไป สั่งอาหารใหม่
			System.out.println("Do you want order agian");
			System.out.println("1.Yes / 2.No ");


			select = Integer.parseInt(new Scanner(System.in).nextLine());


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
//

			} // while select end



//			System.exit(0);
		} //while end

	} // main end


}