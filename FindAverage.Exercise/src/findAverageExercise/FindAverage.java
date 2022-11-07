package findAverageExercise;

import java.util.Scanner;

public class FindAverage {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Average averageList = new Average();
		
		int i = 0;
		while (i < 3) {
			averageList.add(scanner.nextInt());
			i++;
		}
		averageList.setAverage(scanner.nextInt());
		
		averageList.getAllListOfIntegers();
		
		double result = averageList.findAverage();
		
		double trueResult = averageList.findTrueAverage();
		
		System.out.printf("The result of %d + %d + %d divided by %d is %.1f", 
				averageList.getList().get(0), averageList.getList().get(1), averageList.getList().get(2), averageList.getAverage(), result);
		scanner.close();
		
		System.out.println();
		
		System.out.printf("The average of: %d, %d, %d is %.1f",
				averageList.getList().get(0), averageList.getList().get(1), averageList.getList().get(2), trueResult);
	}
	
}
