import java.util.Scanner;

//Write a method named getEvenDigitSum with one parameter of type int called number.
//The method should return the sum of the even digits within the number.
//If the number is negative, the method should return -1 to indicate an invalid value.

public class EvenDigitSum {

	public static void main(String[] args) {
		int number = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		boolean isAnInt = scan.hasNextInt();
		if (isAnInt) {
			number = scan.nextInt();
		}
		scan.close();
		evenDigitSum(number);

	}

	public static int evenDigitSum(int num) {
		if(num<0) {
			System.out.println("Invalid number");
			return -1;
			
		}else {
		int sum = 0;

		while (num >= 10) {
			int reminder = num % 10;
			if ((reminder % 2) == 0) {
				sum = sum + reminder;
			}
			num = num / 10;
		}
		System.out.println("sum of even numbers in the given digit    " + sum);
		return sum;
		}
	}

}
