package Software_Reliability.src;

//package Software_Reliability.src;

import java.util.ArrayList;
import java.util.Random;

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
							newerinstance[j] = element2;
							result.add(newerinstance);
						}
					}
				}
			}
		}

		return result;
	}

	ArrayList<int[]> generateList() {
		int N = 16;
		ArrayList<int[]> b = new ArrayList<int[]>();
		Random r = new Random();
		int[] temp = new int[N];

		for (int i = 0; i < temp.length; i++) {
			b.add(new int[] { r.nextInt(50) - 25, r.nextInt(50) - 25 });
		}
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{r.nextInt(50)-25,r.nextInt(50)-25});
		// b.add(new int[]{b.get(5)[0],b.get(13)[1]});
		for (int i = 0; i < temp.length; i++) {
			temp[i] = r.nextInt(50) - 25;
		}
		// int[] temp = new
		// int[]{r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25,r.nextInt(50)-25};
		temp[N - 1] = temp[6];
		return getPairWise(temp, b);
	}
}