package Software_Reliability.src;

/*
 * Lab 2 Software Reliability
 */
public class FindMembership {
	
	RandomArray randArr = new RandomArray();
	
	public FindMembership() {
	}
	//(i) Sorting
	//@ requires list.length > 0;
	//@ ensures (\forall int i; 0 <= i && i < \result.length-1; \result[i]<\result[i+1]);
	public int[] sort(int[] list){
		int length = list.length;

		int newLength;
		while (length != 0) {
			newLength = 0;
			for (int i = 1; i < length; i++) {
				if (list[i - 1] > list[i]) {
					int tmp = list[i];
					list[i] = list[i-1];
					list[i-1] = tmp;			
				}
			}
			length = newLength;
		}
		return list;
	}
	

	// (ii) %Searching
	//@requires list.length > 0;
	//@ensures list[\result] == key | \result == -1;
	public int search(int[] list, int key){return 1;}

	//(iii) %Membership
	// requires list.length > 0;
	// ensures (\exists int i; 0 <= i && i < list.length-1; list[i]==key) && \result | !(\exists int i; 0 <= i && i < list.length-1; list[i]==key) && !\result;
	public int membership(int[] list, int key){
		int x,l,r;
		l=1;
		r=list.length;
		x=(l+r)/2;
		while(key!=list[x] || l>r){
			if(key<list[x]){
				r = x-1;
			}
			else{
				l=x+1;
			}
		}
		if(list[x] == key) return x;
		else return -1;
	}
	
	//(iv) %Binary search
	//@requires list.length > 0;
	//@ensures key == list[\result] | \result == -1;
	public int binary_search(int[] list, int key){
		list = sort(list);
		return membership(list,key);
	}
	
	public static void main(String[] args) {
		new FindMembership();
		
		/*
		WriteToFile wtf = new WriteToFile();
		String theFile = "/Users/Addi/git/Software_Reliability/randomArrays.txt";
		int numberOfArrays = 100;
		int lengthOfArray = 15;
		wtf.writeTo(theFile,numberOfArrays,lengthOfArray);
		*/
	}
}