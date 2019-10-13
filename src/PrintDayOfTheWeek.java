//Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//
//The method should not return any value (hint: void)
//
//Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.
//
//Bonus: 
//	Write a second solution using if then else, instead of using switch.
//	Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh

public class PrintDayOfTheWeek {
	public static void main(String[] args) {
		printDayOfTheWeek(0);
		
	}

	public static void printDayOfTheWeek(int n) {
		switch(n) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thrusday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
				System.out.println("invalid number");
					
		}
		
	}
	
	}

