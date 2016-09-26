import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Scanner inputs

		double intuit;
		do{
			System.out.print("Initial tuition cost: ");
			intuit = input.nextDouble();
			if(intuit < 0.00)
				System.out.println("Error, please enter a positive tuition cost.");}
		while(intuit < 0.00);

		double increase;
		do{
			System.out.print("Increase percentage (between 0.00 and 1.00): ");
			increase = input.nextDouble();
			if(increase < 0.00 | increase > 1.00)
				System.out.println("Error, please enter a percentage between 0.00 and 1.00");}
		while(increase < 0.00 | increase > 1.00);

		int i;

		for (i = 0; i < 3; i++) {
			intuit = (intuit * (increase + 2));
		}
		System.out.println("The total tuition is " + intuit + " dollars per year");

	}
}

