package compro2;

import compro2.Food.*;
import Exception.*;

import java.util.*;

import static cl.MoneyBill.cal;

public class Restaurang
{

	private static Scanner keyboard = new Scanner(System.in);
	private static Syster sys = new Syster();

	private static SysterList sysList = new SysterList();



	public static void main(String[] args) throws IndexTooLowException, IndexTooHighException
	{

		List<Dishes> dishesList = sysList.loadFood("dishes");

		List<Drink> drinksList = sysList.loadDrink("drinks");




		boolean again = true;
		String select;

		while (again)
		{

//			logIn(); <--

			//ฟังก์ชั่น เลือกเมนูอาหารและใส่ชื่อ**

			System.out.println("\n\tWelcome to Restaurant.");

			User user = new User();


			System.out.print("\n\tEnter your name: ");  /// ใส่ชื่อ
			user.setName(keyboard.nextLine());

			user.setMoney(sys.selection("\n\tHow Much Money Do You Have: "
					,"\n\tBro I Say Let Select Money!!!!!!!!!!!!!!!!!"));


		//รายการเมนู

			String con; //

			do
			{
				for (int i = 0; i < dishesList.size(); i++) {

					System.out.println("\t" + (i + 1) + "." + dishesList.get(i).getName()
							+ " " + dishesList.get(i).getPrice() + " Baht");

				}


				System.out.println("\n\t0.Exit");


				// เลือก ออเดอร์

				user.setSelection(sysList.selection("\n\t" + user.getName() + " Please select order : "
						, "\n\tYou Must Select Number Food!!!!!"
						, dishesList));


				if (user.getSelection() == -1) {
					System.out.println("\n\tSee You Next Time BRO <3");
					System.exit(0);
				}

				else
				{
					user.addDishesList(dishesList.get(user.getSelection()));
					user.setBill(user.getBill()+dishesList.get(user.getSelection()).getPrice());

				}

				System.out.println("\n\tYour order have : ");

				for (int i = 0; i < user.getDisheslist().size(); i++) {

					System.out.println("\t" + (i + 1) + "." + user.getDisheslist().get(i).getName()
							+ " " + user.getDisheslist().get(i).getPrice() + " Baht");

				}

				System.out.println("\tThat will be "+user.getBill()+" Baht");

				System.out.println();
				System.out.print("\tDo You Want Add More?? [Y/N] :");
				con = String.valueOf(new Scanner(System.in).nextLine());



			} while (con.equals("Y") || con.equals("y"));
			//ฟังชั้น เลือกจาน**


			//System.out.println("\n\t****************************");



			//			System.out.println("You Want Order drink");
//			System.out.println("1.Yes / 2.No ");


			con = "y";

			do
			{
				for (int i = 0; i < drinksList.size(); i++) {

					System.out.println("\t" + (i + 1) + "." + drinksList.get(i).getName()
							+ " " + drinksList.get(i).getPrice() + " Baht");

				}


				System.out.println("\n\t0.Exit");


				// เลือก ออเดอร์

				user.setSelection(sysList.selectionDrink("\n\t" + user.getName() + " Please select order : "
						, "\n\tYou Must Select Number Food!!!!!"
						, drinksList));


				if (user.getSelection() == -1) {
					System.out.println("\n\tSee You Next Time BRO <3");
					System.exit(0);
				}

				else
				{
					user.addlistDrink( drinksList.get(user.getSelection()));
					user.setBill(user.getBill()+drinksList.get(user.getSelection()).getPrice());

				}

				System.out.println("\n\tYour order have : ");

				for (int i = 0; i < user.getlistDrink().size(); i++) {

					System.out.println("\t" + (i + 1) + "." + user.getlistDrink().get(i).getName()
							+ " " + user.getlistDrink().get(i).getPrice() + " Baht");

				}

				System.out.println("\tThat will be "+user.getBill()+" Baht");

				System.out.println();
				System.out.print("\tDo You Want Add More?? [Y/N] :");
				con = String.valueOf(new Scanner(System.in).nextLine());



			} while (con.equals("Y") || con.equals("y"));

				System.out.println("\n\t" + user.getName() + " have " + user.getMoney() + " baht");


			cal(user.getBill(), user.getMoney(), user.getName());



		//ทำรายการอีกครั้งมั้ย

			System.out.println("\n\t****************************");

			//ฟังชั้น ทำซํ้าให้เข้าไป สั่งอาหารใหม่
			System.out.println("\tDo you want order agian");
			System.out.println("\t1.Yes / 2.No ");


			select = keyboard.next();


			int userInput = 1;
			while (userInput != 0)
			{


				if (select.equals("1"))
				{
					userInput--;
					again = true;
//					Console.encoding();
				}

				else if (select.equals("2"))
				{
					userInput--;
					again = false;

					System.out.println("\tThank you for using the service.");

				}

				else
				{
					System.out.println("You Must Select 1 Or 2 Only");
					System.out.println("Do you want order agian");
					System.out.println("1	.Yes / 2.No ");
					select = keyboard.nextLine();

				}
//

			} // while select end



//			System.exit(0);

		} //while end

	} // main end













	public static void logIn()
	{
		String[] User = {"Posident", "1234"};

		System.out.print("\n\t Please Enter Your ID : ");


		String enter = new Scanner(System.in).nextLine();


		while (true)
		{

			if (User[0].equals(enter))
			{
				break; // exit loop
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

	}



}
