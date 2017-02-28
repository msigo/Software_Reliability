package Software_Reliability.src;

import java.util.ArrayList;
import java.util.Random;

public class RandomArray {
	ArrayList<int[]> testCases = getRandArrays(500);

	public int[] getRandArray(int n) {

		int[] list = new int[n];
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			list[i] = (random.nextInt((50) - 25));
		}
		return list;
	}

	public ArrayList<int[]> getRandArrays(int n) {
		ArrayList<int[]> list = new ArrayList<int[]>();

		for (int i = 0; i < n; i++) {
			list.add(getRandArray(16));
		}
		return list;
	}
}
