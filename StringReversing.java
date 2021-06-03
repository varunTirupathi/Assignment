import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReversing {

	static void reverse(String inputArray[]) {
		// Iterating half of the array and swapping the elements
		for (int i = 0, j = inputArray.length - 1; i < inputArray.length / 2; i++, j--) {
			String temp = inputArray[i];
			inputArray[i] = inputArray[j];
			inputArray[j] = temp;
		}
		// Printing the elements
		for (int k = 0; k <= inputArray.length - 1; k++) {
			System.out.print(inputArray[k] + " ");
		}
	}

	public static void main(String[] args) {
		// input
		String[] inputArray = { "A", "e", "l", "l", "o" };
		int min_range = 1, max_range = 105;
		// checking first constraint
		if (min_range <= inputArray.length && inputArray.length <= max_range) {
			// checking second constraint
			boolean secondFlag = false;
			for (int i = 0; i < inputArray.length; i++) {
				Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
				Matcher m = p.matcher(inputArray[i]);
				secondFlag = m.find();
				break;
			}
			if (!secondFlag) {
				reverse(inputArray);
			} else {
				System.out.println("violating the second constarint all 'printable ASCII character'");
			}
		} else {
			System.out.println("violating the first constarint range");
		}
	}
}
