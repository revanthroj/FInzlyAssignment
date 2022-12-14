package FXTradeBooking;

import java.util.Scanner;

public class BookTrade {
	public static void main(String[] args) {
		String yesOrno;
		TradePrint trade = new TradePrint();

		try (Scanner scanner = new Scanner(System.in)) {
			boolean flag = false;
			int choice;

			try {

				do {
					System.out.println("Enter your choice\n" + "1.Book Trade\n" + "2.Print Trade\n" + "3.Exit\n");
					choice = scanner.nextInt();
					switch (choice) {
						case 1:
							trade.process();
							break;
						case 2:
							trade.printData();
							break;
						case 3:
							System.out.println("Do you really want to exit (y/n)");
							yesOrno = scanner.next();
							
							if ("y".equalsIgnoreCase(yesOrno)) {
								System.out.println("Bye - have a good day");
								flag = true;
							} else if ("n".equalsIgnoreCase(yesOrno)) {
								continue;
							}
							break;
					}

				} while (flag == false);

			} catch (Exception e) {
				System.out.println("Invalid choice try again");

			}
		}
	}
}
