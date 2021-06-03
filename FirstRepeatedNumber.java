import java.util.ArrayList;

class FirstRepeatedNumber {
	// Iterating the elements and finding the first repeated number with the help of
	// ArrayList
	static void printFirstRepeating(int arr[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			// Is it repeated number or not? check
			if (list.contains(arr[i])) {
				System.out.println(arr[i]);
				break;
			} else {
				list.add(arr[i]);
			}
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		// Input
		int inputArray[] = { 1, 2, 3, 3 };
		int min_range = 2, max_range = 105;

		// checking first constraint
		if (inputArray.length <= max_range && min_range <= inputArray.length) {
			boolean secondFlag = false;
			// checking second constraint
			for (int i = 0; i < inputArray.length; i++) {
				if (!(inputArray[i] >= 1 && inputArray[i] <= inputArray.length)) {
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
				if (thirdFlag) {
					printFirstRepeating(inputArray);
				} else {
					System.out.println("violating the third constarint all 'nums appear only once'");
				}

			} else {
				System.out.println("violating the second constarint elemets are not in range");
			}

		} else {
			System.out.println("violating the first constarint range");
		}
	}
}