package cl;

import java.util.*;

public class MoneyBill
{
	public static void cal(int dish, int money, String name, int Price)
	{
		//ฟังก์ชั่นคิดเงิน
//		Console.Clear();
		if (money >= dish * Price)
		{
			int total;
			total = money - dish * Price;
			System.out.printf("\n\t%2$s Need To Pay %1$s" + "\r\n", dish * Price, name);
			System.out.printf("\n\t%2$s pay %1$s Baht." + "\r\n", money, name);
			System.out.printf("\n\t%2$s Get change For %1$s Baht." + "\r\n", total, name);
			System.out.printf("\n\t%2$s Get %1$s Thousand banknotes Baht." + "\r\n", total / 1000, name);
			System.out.printf("\n\t%2$s Get %1$s Five Hundreds Banknotes Baht." + "\r\n", total % 1000 / 500, name);
			System.out.printf("\n\t%2$s Get %1$s One Hundreds Banknotes Baht." + "\r\n", total % 1000 % 500 / 100, name);
			System.out.printf("\n\t%2$s Get %1$s Fifty Nanknotes Baht." + "\r\n", total % 1000 % 500 % 100 / 50, name);
			System.out.printf("\n\t%2$s Get %1$s Twenty Banknotes Baht." + "\r\n", total % 1000 % 500 % 100 % 50 / 20, name);
			System.out.printf("\n\t%2$s Get %1$s Ten coin Baht." + "\r\n", total % 1000 % 500 % 100 % 50 % 20 / 10, name);
			System.out.printf("\n\t%2$s Get %1$s Five coin Baht." + "\r\n", total % 1000 % 500 % 100 % 50 % 20 % 10 / 5, name);
			System.out.printf("\n\t%2$s Get %1$s One coin Baht." + "\r\n", total % 1000 % 500 % 100 % 50 % 20 % 10 % 5, name);
		}
		else if (money <= dish * Price)
		{
			System.out.printf("\n\t%2$s Need To Pay %1$s" + "\r\n", dish * Price, name);
			System.out.println("\n\tYour want add money again? ");
			System.out.print("\n\t1.Yes.\n\t2.No.\n\tYou select 1 or 2: ");
			int Choseadd = Integer.parseInt(new Scanner(System.in).nextLine());


			if (Choseadd == 1)
			{
				do
				{
					//ฟังชั่น เติมเงิน **สำหรับเงินไม่พอ
					System.out.print("\n\tHow much will you fill: ");
					money += Integer.parseInt(new Scanner(System.in).nextLine());
					System.out.printf("\n\tYour Wallet %1$s Bath" + "\r\n", money);
				} while (money < dish * Price);

				int total;
				total = money - dish * Price;
				System.out.printf("\n\t%2$s pay %1$s Baht." + "\r\n", money, name);
				System.out.printf("\n\t%2$s Get change For %1$s Baht." + "\r\n", total, name);
				System.out.printf("\n\t%2$s Get %1$s Thousand banknotes Baht." + "\r\n", total / 1000, name);
				System.out.printf("\n\t%2$s Get %1$s Five Hundreds Banknotes Baht." + "\r\n", total % 1000 / 500, name);
				System.out.printf("\n\t%2$s Get %1$s One Hundreds Banknotes Baht." + "\r\n", total % 1000 % 500 / 100, name);
				System.out.printf("\n\t%2$s Get %1$s Fifty Nanknotes Baht." + "\r\n", total % 1000 % 500 % 100 / 50, name);
				System.out.printf("\n\t%2$s Get %1$s Twenty Banknotes Baht." + "\r\n", total % 1000 % 500 % 100 % 50 / 20, name);
				System.out.printf("\n\t%2$s Get %1$s Ten coin Baht." + "\r\n", total % 1000 % 500 % 100 % 50 % 20 / 10, name);
				System.out.printf("\n\t%2$s Get %1$s Five coin Baht." + "\r\n", total % 1000 % 500 % 100 % 50 % 20 % 10 / 5, name);
				System.out.printf("\n\t%2$s Get %1$s One coin Baht." + "\r\n", total % 1000 % 500 % 100 % 50 % 20 % 10 % 5, name);
			}
		}
	}
}