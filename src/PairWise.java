//package Software_Reliability.src;

import java.util.ArrayList;
import java.util.Arrays;


public class PairWise {
	ArrayList<int[]> testCases = generateList();
	
	public ArrayList<int[]> getPairWise(int[] defs, ArrayList<int[]> typs) {
		ArrayList<int[]> result = new ArrayList<int[]>();

		for (int i = 0; i < typs.size(); i++) {
			int[] v = typs.get(i);

			for (int element : v) {
				int[] instance = defs.clone();
				instance[i] = element;

				for (int j = 0; j < typs.size(); j++) {
					if (i != j) {
						int[] w = typs.get(j);

						for (int element2 : w) {
							int[] newerinstance = instance.clone();
							newerinstance[j] = element2 ;
							result.add(newerinstance);
						}
					}
				}
			}
		}

		return result;
	}
	ArrayList<int[]> generateList(){
		ArrayList<int[]> b = new ArrayList<int[]>();
		b.add(new int[]{7,9});
		b.add(new int[]{5,9});
		b.add(new int[]{-2,10});
		b.add(new int[]{7,10});
		b.add(new int[]{9,15});
		b.add(new int[]{2,1});
		b.add(new int[]{9,6});
		b.add(new int[]{3,4});
		b.add(new int[]{-8,10});
		b.add(new int[]{2,9});
		b.add(new int[]{5,3});
		b.add(new int[]{19,-40});
		b.add(new int[]{9,2});
		b.add(new int[]{2,3});
		b.add(new int[]{1,3});		
		return getPairWise(new int[]{1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15},b);
	}
}