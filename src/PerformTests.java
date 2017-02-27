import java.util.Arrays;

public class PerformTests {
	public PerformTests() {
		RandomArray randomTC = new RandomArray();
		PairWise pairwiseTC = new PairWise();
		FindMembership func = new FindMembership();
	
		System.out.println("HEJ");

		int[] korv = new int[15];
		int i=0;
		int[] testCase;
		int[] list;
		int key;
		int res;
		while(true){
			testCase = randomTC.testCases.get(i).clone();
			key = testCase[testCase.length-1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length-2);
			res = func.binary_search(list,key);

			if(!oracle(key,Arrays.copyOfRange(testCase, 0, testCase.length-2), res)){
				break;
			}
			i++;
			if(i==randomTC.testCases.size()){
				break;
			}
		}	
		System.out.println(i);
	}

	public boolean oracle(int key, int[] list,int func_res) {
		int index = -1;
		for (int i = 0; i<list.length; i++) {
			if (list[i] == key) {
				index = i;
			}
		}
		System.out.println(index + " " + func_res);
		System.out.println(list[index]+" "+ key);
		return (index == func_res);
	}

	public static void main(String[] args) {
		new PerformTests();
	}
}
