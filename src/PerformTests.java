import java.util.Arrays;


public class PerformTests {
	public PerformTests() {
		RandomArray randomTC = new RandomArray();
		PairWise pairwiseTC = new PairWise();
		FindMembership func = new FindMembership();
	
		int i=0;
		int[] testCase;
		int[] list;
		int key;
		int res;
		while(true){
			testCase = pairwiseTC.testCases.get(i).clone();
			key = testCase[testCase.length-1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length-1);
			res = func.binary_search(list,key);

			if(!oracle(key,Arrays.copyOfRange(testCase, 0, testCase.length-1), res)){
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
			Arrays.sort(list);
			if (list[i] == key) {
				index = i;
			}
		}
		if(index==-1) return (index == func_res);
		else return (list[index]==list[func_res]);

	}

	public static void main(String[] args) {
		new PerformTests();
	}
}
