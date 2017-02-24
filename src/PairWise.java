package Software_Reliability.src;

import java.util.ArrayList;
import java.util.Arrays;


public class PairWise {
	int s = 0;
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
							System.out.println(s++);
						}
					}
				}
			}
		}

		return result;
	}
	
	/*
	public static void main(String[] args) {
		ArrayList<int[]> b = new ArrayList<int[]>();
		b.add(new int[]{7});
		b.add(new int[]{8});
		b.add(new int[]{9});
		

		//System.out.println(Arrays.toString(new PairWise().getPairWise(new int[]{1, 2,3,4},b)));
		
		ArrayList<int[]> k = new PairWise().getPairWise(new int[]{1, 2, 3},b);
		for(int[] t : k){
			System.out.println(Arrays.toString(t));
		} 	
	}
	*/
	
}