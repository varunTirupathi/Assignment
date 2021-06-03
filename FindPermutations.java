import java.util.ArrayList;
import java.util.List;

public class FindPermutations {

	static void findingPermutations(List<List<Integer>> list, List<Integer> resultList, int[] arr) {
		// finding all the permutations of input and storing into resultList.
		if (resultList.size() == arr.length) {
			// Storing all the individual permutations in final List.
			list.add(new ArrayList<>(resultList));
		} else {
			for (int i = 0; i < arr.length; i++) {

				if (resultList.contains(arr[i])) {
					continue;
				}
				resultList.add(arr[i]);
				findingPermutations(list, resultList, arr);
				resultList.remove(resultList.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		// Input
		int[] inputArray = { 1, 2, 3 };
		// checking first constraint
		if (inputArray.length <= 6 && 1 <= inputArray.length) {
			boolean secondFlag = false;
			// checking second constraint
			for (int i = 0; i < inputArray.length; i++) {
				if (!(inputArray[i] >= -10 && inputArray[i] <= 10)) {
					secondFlag = true;
					break;
				}
			}
			if (!secondFlag) {
				// checking third constraint
				ArrayList<Integer> list2 = new ArrayList<>();
				boolean thirdFlag = false;
				for (int i = 0; i < inputArray.length; i++) {
					if (list2.contains(inputArray[i])) {
						thirdFlag = true;
						break;
					} else {
						list2.add(inputArray[i]);
					}
				}
				if (!thirdFlag) {
					List<List<Integer>> list = new ArrayList<>();
					findingPermutations(list, new ArrayList<>(), inputArray);
					for (List<Integer> k : list) {
						System.out.print(k);
					}
				} else {
					System.out.println("violating the third constarint integers are not unique");
				}
			} else {
				System.out.println("violating the second constarint elemets are not in range");
			}
		} else {
			System.out.println("violating the first constarint input length");
		}
	}
}
