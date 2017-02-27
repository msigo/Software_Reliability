package Software_Reliability.src;

import java.util.Arrays;


public class PerformTests {
	public PerformTests() {
		RandomArray randomTC = new RandomArray();
		PairWise pairwiseTC = new PairWise();
		FindMembership func = new FindMembership();

		int i = 0;
		int[] testCase;
		int[] list;
		int key;
		int res;
		System.out.println("Mutation Random\t\tPairwise");
		while (true) {
			testCase = randomTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_1(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == randomTC.testCases.size()) {
				break;
			}
		}
		System.out.print("1:\t" + i);

		i = 0;
		while (true) {
			testCase = pairwiseTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_1(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == pairwiseTC.testCases.size()) {
				break;
			}
		}
		System.out.println("\t\t" + i);

		i = 0;
		while (true) {
			testCase = randomTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_2(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == randomTC.testCases.size()) {
				break;
			}
		}
		System.out.print("2:\t" + i);

		i = 0;
		while (true) {
			testCase = pairwiseTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_2(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == pairwiseTC.testCases.size()) {
				break;
			}
		}
		System.out.println("\t\t" + i);

		i = 0;
		while (true) {
			testCase = randomTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_3(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == randomTC.testCases.size()) {
				break;
			}
		}
		System.out.print("3:\t" + i);

		i = 0;
		while (true) {
			testCase = pairwiseTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_3(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == pairwiseTC.testCases.size()) {
				break;
			}
		}
		System.out.println("\t\t" + i);

		i = 0;
		while (true) {
			testCase = randomTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_4(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == randomTC.testCases.size()) {
				break;
			}
		}
		System.out.print("4:\t" + i);

		i = 0;
		while (true) {
			testCase = pairwiseTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_4(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == pairwiseTC.testCases.size()) {
				break;
			}
		}
		System.out.println("\t\t" + i);

		i = 0;
		while (true) {
			testCase = randomTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_5(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == randomTC.testCases.size()) {
				break;
			}
		}
		System.out.print("5:\t" + i);

		i = 0;
		while (true) {
			testCase = pairwiseTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_5(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == pairwiseTC.testCases.size()) {
				break;
			}
		}
		System.out.println("\t\t" + i);

		i = 0;
		while (true) {
			testCase = randomTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_6(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == randomTC.testCases.size()) {
				break;
			}
		}
		System.out.print("6:\t" + i);

		i = 0;
		while (true) {
			testCase = pairwiseTC.testCases.get(i).clone();
			key = testCase[testCase.length - 1];
			list = Arrays.copyOfRange(testCase, 0, testCase.length - 1);
			res = func.binary_search_mutation_6(list, key);

			if (!oracle(key, Arrays.copyOfRange(testCase, 0, testCase.length - 1), res)) {
				break;
			}
			i++;
			if (i == pairwiseTC.testCases.size()) {
				break;
			}
		}
		System.out.println("\t\t" + i);
	}

	public boolean oracle(int key, int[] list, int func_res) {
		int index = -1;
		// System.out.println(Arrays.toString(list));

		for (int i = 0; i < list.length; i++) {
			Arrays.sort(list);
			if (list[i] == key) {
				index = i;
			}
		}
		// System.out.println(index + " " + func_res + " " + key);
		if (index == -1 || func_res == -1)
			return (index == func_res);
		else
			return (list[index] == list[func_res]);

	}

	public static void main(String[] args) {
		new PerformTests();
	}
}
