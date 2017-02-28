
package Software_Reliability.src;


public class FindMembership {

	RandomArray randArr = new RandomArray();

	public FindMembership() {
	}

	// (i) Sorting
	// @ requires list.length > 0;
	// @ ensures (\forall int i; 0 <= i && i < \result.length-1;
	// \result[i]<\result[i+1]);
	public int[] sort(int[] list) {
		int length = list.length;

		int newLength;
		while (length != 0) {
			newLength = 0;
			for (int i = 1; i < length; i++) {
				if (list[i - 1] > list[i]) {
					int tmp = list[i];
					list[i] = list[i - 1];
					list[i - 1] = tmp;
					newLength = i;
				}

			}
			length = newLength;
		}
		return list;
	}

	public int[] sort_mutation1(int[] list) {
		int length = list.length;

		int newLength;
		while (length != 0) {
			newLength = 0;
			for (int i = 1; i < length; i++) {
				if (list[i - 1] > list[i]) {
					int tmp = list[i];
					list[i] = list[i - 1];
					list[i - 1] = tmp;
					// newLength = i;
				}

			}
			length = newLength;
		}
		return list;
	}

	public int[] sort_mutation2(int[] list) {
		int length = list.length;

		int newLength;
		while (length != 0) {
			newLength = 0;
			for (int i = 2; i < length; i++) { // i =2 instead of 1
				if (list[i - 1] > list[i]) {
					int tmp = list[i];
					list[i] = list[i - 1];
					list[i - 1] = tmp;
					// newLength = i;
				}

			}
			length = newLength;
		}
		return list;
	}

	public int[] sort_mutation3(int[] list) {
		int length = list.length;

		int newLength;
		while (length != 0) {
			newLength = 0;
			for (int i = 1; i < length; i++) {
				if (list[i - 1] < list[i]) {
					int tmp = list[i];
					list[i] = list[i - 1];
					list[i - 1] = tmp;
					newLength = i;
				}

			}
			length = newLength;
		}
		return list;
	}

	// (ii) %Searching
	// @requires list.length > 0;
	// @ensures list[\result] == key | \result == -1;
	public int search(int[] list, int key) {
		return 1;
	}

	// (iii) %Membership
	// requires list.length > 0;
	// ensures (\exists int i; 0 <= i && i < list.length-1; list[i]==key) &&
	// \result | !(\exists int i; 0 <= i && i < list.length-1; list[i]==key) &&
	// !\result;
	public int membership(int[] list, int key) {
		int lo = 0;
		int hi = list.length - 1;
		while (lo <= hi) {
			// Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < list[mid])
				hi = mid - 1;
			else if (key > list[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
		/*
		 * int x,l,r; l=1; r=list.length; do{ x=(l+r)/2; if(key<list[x]){ r =
		 * x-1; } else{ l=x+1; } System.out.println(l + " " + r);
		 * }while(key!=list[x] | l<=r);
		 * 
		 * 
		 * if(list[x] == key) return x; else return -1;
		 */
	}

	public int membershipMutation_1(int[] list, int key) {
		int lo = 0;
		int hi = list.length - 1;
		while (lo > hi) { // changed direction and removed equal
			// Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < list[mid])
				hi = mid - 1;
			else if (key > list[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;

	}

	public int membershipMutation_2(int[] list, int key) {
		int lo = 0;
		int hi = list.length - 2; // minus 2 isntead of 1
		while (lo <= hi) {
			// Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < list[mid])
				hi = mid - 1;
			else if (key > list[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}


	public int membershipMutation_3(int[] list, int key) {
		int lo = 0;
		int hi = list.length - 1;
		while (lo == hi) { // removed less than sign and added a equal sign
			// Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < list[mid])
				hi = mid - 1;
			else if (key > list[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	// (iv) %Binary search
	// @requires list.length > 0;
	// @ensures key == list[\result] | \result == -1;
	public int binary_search(int[] list, int key) {
		list = sort(list);
		return membership(list, key);
	}

	public int binary_search_mutation_1(int[] list, int key) {
		list = sort(list);
		return membershipMutation_1(list, key);
	}

	public int binary_search_mutation_2(int[] list, int key) {
		list = sort_mutation2(list);
		return membership(list, key);
	}

	public int binary_search_mutation_3(int[] list, int key) {
		list = sort(list);
		return membershipMutation_2(list, key);
	}

	public int binary_search_mutation_4(int[] list, int key) {
		list = sort_mutation3(list);
		return membership(list, key);
	}

	public int binary_search_mutation_5(int[] list, int key) {
		list = sort(list);
		return membershipMutation_3(list, key);
	}

	public int binary_search_mutation_6(int[] list, int key) {
		list = sort_mutation1(list);
		return membership(list, key);
	}

	public void writeRandtoFile() {
		WriteToFile wtf = new WriteToFile();
		String theFile = "/Users/Addi/git/Software_Reliability/randomArrays.txt";
		int numberOfArrays = 100;
		int lengthOfArray = 15;
		wtf.writeTo(theFile, numberOfArrays, lengthOfArray);
	}

	public void writePairWise() {
		PairWise pw = new PairWise();

		// pw.getPairWise(defs, typs)
	}

}