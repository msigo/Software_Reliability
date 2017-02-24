package Software_Reliability.src;

import java.util.ArrayList;
import java.util.Random;

public class RandomArray {

	public ArrayList<Integer> getRandArray(int n) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			list.add(random.nextInt());
		}
		System.out.println(list);
		return list;
	}
	
	
	public static void main(String[] args) {
		RandomArray ra = new RandomArray();
		ra.getRandArray(20);
	}
	
	
}

