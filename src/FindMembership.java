
//package Software_Reliability.src;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Lab 2 Software Reliability
 */
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
	public int membership(int[] list, int key){
		int lo = 0;
        int hi = list.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < list[mid]) hi = mid - 1;
            else if (key > list[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
		/*int x,l,r;
		l=1;
		r=list.length;
		do{
			x=(l+r)/2;
			if(key<list[x]){
				r = x-1;
			}
			else{
				l=x+1;
		}
		System.out.println(l + " " + r);	
		}while(key!=list[x] | l<=r);
			
		
		if(list[x] == key) return x;
		else return -1;*/
	}

	// (iv) %Binary search
	// @requires list.length > 0;
	// @ensures key == list[\result] | \result == -1;
	public int binary_search(int[] list, int key) {
		list = sort(list);
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

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new FindMembership().sort(new int[]{3,2,1})));
		//String arrFile = "/Users/Addi/git/Software_Reliability/randomArrays.txt";

	}
}