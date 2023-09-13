package acorn;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

	public int Additon(int a, int b) {
		return a + b;
	}

	public int Substraction(int a, int b) {

		return a - b;
	}

	public int Multiplication(int a, int b) {
		return a * b;
	}

	public int Division(int a, int b) {
		return a / b;
	}

	public ArrayList<Integer> Measure(int num) {

		ArrayList<Integer> Measure = new ArrayList<>();

		for (int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				Measure.add(i);
			}
		}
		return Measure;

	}

	public static void main(String[] args) {
//		int a = 5, b = 3;
//		int result1 = Additon(a, b);
//		int result2 = Substraction(a, b);
//		int result3 = Multiplication(a, b);
//		int result4 = Division(a, b);
//		System.out.println("더하기" + result1 + "빼기" + result2 + "곱하기" + result3 + "나누기" + result4);
		Calculator c = new Calculator();
		ArrayList<Integer> Measure = new ArrayList<>();

		Measure = c.Measure(10);
		System.out.println(Measure);
	}
}
