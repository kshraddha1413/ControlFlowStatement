import java.util.Scanner;

public class MinandMax {
	public static void main(String[] args) {
		MinandMaxNumber();
	}
		
	public static void MinandMaxNumber() {
		int min = Integer.MAX_VALUE, max = 0,counter=0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int order=counter+1;
			System.out.println("Enter number #"+order);
			boolean isAnInt = scanner.hasNext();
			if (isAnInt) {
				int number = scanner.nextInt();
				counter++;
				if (number > max) {
					max = number;
				}
				if (number < min) {
					min = number;
				}
				if(counter==3) {
					break;
				}
			}else {
				System.out.println("number is invalid");
			}
		scanner.nextLine();
	}
	System.out.println("minimum number" +min+"maximum number"+max);
	scanner.close();
	}	
	}


