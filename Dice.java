package fridayPractice;

import java.util.Random;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of hit: ");
		int rollTimes = sc.nextInt();
		int freq[] = new int[7];

		for (int roll = 1; roll < rollTimes; roll++) {
			++freq[1 + rd.nextInt(7)];
		}
		System.out.println("Face\tFrequency");
		for (int face = 1; face < freq.length; face++) {
			System.out.println(face + "\t" + freq[face]);
		}
		sc.close();
	}

}
