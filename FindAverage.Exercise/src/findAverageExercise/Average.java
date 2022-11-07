package findAverageExercise;

import java.util.ArrayList;
import java.util.List;

public class Average {

	private List<Integer> list;
	private int average;
	
	Average() {
		list = new ArrayList<>();
		average = 0;
	}
	
	public void add(int number) {
		list.add(number);
	}

	public void getAllListOfIntegers() {
		list.forEach(System.out::println);
	}
	
	public double findAverage() {
		int sum = list.stream().mapToInt(i -> i).sum();
		return sum / average;
	}
		
	public double findTrueAverage() {
		int sum = list.stream().mapToInt(i -> i).sum();
		return sum / list.size();
	}
	
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}

	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}

	
	
	
}
