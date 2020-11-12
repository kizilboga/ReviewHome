package lesson08;

import java.util.ArrayList;

public class WrapperE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println(numbers.isEmpty());

		numbers.add(5);
		numbers.add(7);
		numbers.add(6);
		System.out.println(numbers.size());
		System.out.println(numbers.contains(7));
		System.out.println(numbers.get(0));

	}

}
