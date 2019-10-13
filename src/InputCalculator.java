import java.util.Scanner;

public class InputCalculator {
	 public static void main(String[] args) {
		 InputthenPrintSumAndAverage();
	 }

 public static void InputthenPrintSumAndAverage() {
	 Scanner scanner = new Scanner(System.in);
	 int sum=0;
	 int counter=0;
	 int avg=0;
	 while(true) {
		 int order=counter +1;
		 System.out.println("Enter number #"+order);
	 boolean isAnInt=scanner.hasNextInt();
	 if(isAnInt) {
		 int n=scanner.nextInt();
		 counter++;
		 sum=sum+n;
		 avg=sum/counter;
		 if(counter==5) {
			 break;
		 }
	 }else {
		 System.out.println("Invalid number");
		 }
	 scanner.nextLine();
	 
	 }
	 System.out.println("sum of eneter no  "+sum+  "average "+avg);
	 scanner.close();
 } 
 }
