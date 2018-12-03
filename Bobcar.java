import java.util.Scanner;
public class Bobcar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int car = 0, days = 0, member = 0, exec = 0, discount = 0;

		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.println("Please choose the rental car: ");
		car = input.nextInt();

		if (car == 1 || car == 2 || car == 3 ) {

			System.out.println("please enter the number of rental days: ");
			days = input.nextInt();
			discount = days / 7;
			System.out.println("Club member?: 1 for yes, 0 for no: ");
			member = input.nextInt();

			if (member != 1 && member != 0) {
				System.out.println("Number is invalid");
			}

			else if (member == 0) {
				if (car == 1) {
					System.out.println("Base: " + days + "days for an Economy @ $35 per day: $ " + (days * 35));
					System.out.println("Total Estimate Rental: $ " + (days * 35));
				}
				if (car == 2) {
					System.out.println("Base: " + days + "days for an Economy @ $35 per day: $ " + (days * 45));
					System.out.println("Total Estimate Rental: $ " + (days * 45));
				}
				if	(car == 3) {
					System.out.println("Base: " + days + "days for an Economy @ $35 per day: $ " + (days *95));
					System.out.println("Total Estimate Rental: $ " + (days * 95));
				}
			}
			else if (member == 1) {
				System.out.println("Platnium Executive Package?: 1 for yes, 0 for no: ");
				exec = input.nextInt();

				int base1 = (days * 35);
				int base2 = (days * 45);
				int base3 = (days * 95);


				switch (exec) {
				case 0: 
					if (car == 1) {
						System.out.println("Base: " + days + " days for an Economy @ $35 per day: $ " + base1);
						System.out.println("Club Member Discount: -$ " + (discount * 35));
						System.out.println("Total Estimate Rental: $ " + (base1 - (discount * 35)));
					}
					if (car == 2) {
						System.out.println("Base: " + days + " days for an Compact @ $45 per day: $ " + base2);
						System.out.println("Club Member Discount: -$ " + (discount * 45));
						System.out.println("Total Estimate Rental: $ " + (base2 - (discount * 45)));
					}
					if (car == 3) {
						System.out.println("Base: " + days + " days for an Standard @ $95 per day: $ " + base3);
						System.out.println("Club Member Discount: -$ " + (discount * 95));
						System.out.println("Total Estimate Rental: $ " + (base3 - (discount * 95)));
					}
					break;

				case 1:
					if (car == 1) {
						System.out.println("Base: " + days + "days for an Economy @ $35 per day: $ " + base1);
						System.out.println("Club Member Discount: -$ " + (discount * 35));
						System.out.println("Platnium Executive Package: +$ " + (base1 * .15));
						System.out.println("Total Estimate Rental: $ " + ((base1) - (discount * 35) + (base1 * .15)));
					}
					if (car == 2) {
						System.out.println("Base: " + days + "days for an Economy @ $45 per day: $ " + base2);
						System.out.println("Club Member Discount: -$ " + (discount * 45));
						System.out.println("Platnium Executive Package: +$ " + (base2 * .15));
						System.out.println("Total Estimate Rental: $ " + ((base2) - (discount * 45) + (base2 * .15)));
					}
					if (car == 3) {
						System.out.println("Base: " + days + "days for an Economy @ $95 per day: $ " + base3);
						System.out.println("Club Member Discount: -$ " + (discount * 95));
						System.out.println("Platnium Executive Package: +$ " + (base3 * .15));
						System.out.println("Total Estimate Rental: $ " + ((base3) - (discount * 95) + (base3 * .15)));

					}

					return;
				}


			}

		}

		else {
			System.out.println("Invalid number");
		}
	} 
}
