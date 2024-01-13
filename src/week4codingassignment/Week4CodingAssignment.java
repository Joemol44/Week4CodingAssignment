package week4codingassignment;
		import java.time.Year;
import java.util.Arrays;
		import java.util.stream.IntStream;
		

		import javax.management.loading.PrivateClassLoader;
		import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
		
public class Week4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* # 1 */
		/*a*/
		

		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		

		// Instructions are to get the difference of the first and last element.
		// However we are not allowed to use ages[7]...
		int lengthOfArr = ages.length;
		int difference = Math.abs(ages[lengthOfArr - lengthOfArr] - ages[lengthOfArr - 1]);
		

		System.out.println("1. Difference of first and last element in ages[] = " + difference);
		
		/*b*/
		
		int[] ages2 = {4, 24, 44, 56, 78, 63, 56,85,99};

		int lengthOfArr2 = ages2.length;
		int difference2 = Math.abs(ages2[lengthOfArr2 - lengthOfArr2] - ages2[lengthOfArr2 - 1]);
 
		System.out.println("1.b. Difference of first and last element in ages2[] = " + difference2);
		
		/*c*/

		int sum = 0;
		for (int i = 0; i < ages2.length; i++) {
		sum += ages2[i];
		}
		double average = sum / lengthOfArr2;
		System.out.println("1.c. The average age in Ages2[] = " + average );
		

		/* # 2 */
		/*a*/

		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		sum = 0;
		for (int i = 0; i < names.length; i++) {
		sum += names[i].length();
		}
		average = sum / names.length;
		System.out.println("2. The average number of letters per name in names[] = " + average );
		
		/*b*/

		String allNames = "";
		for (int i = 0; i < names.length; i++) {
		allNames += names[i] + " ";
		}
		System.out.println("2.b. "+ allNames);
		

		/* 3 */
		

		System.out.println("3. Use array[arr.length] to access the last element of an array");
		

		/* 4 */
		

		System.out.println("4. Use array[0] to access the first element of an array");
		

		/* 5 */
		

		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length(); 
		}
		

		/* 6 */
		

		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
		sum += nameLengths[i];
		}
		System.out.println("6. The sum of all lengths in nameLengths[] = " + sum);
		

		/* 7 */
		

		System.out.println(duplicateWord("Hello", 8));
		

		/* 8 */
		

		System.out.println("8. " + getFullName("Jose", "Molina"));
		

		/* 9  referenced ages from question 1*/
		

		System.out.println("9. checkIfSumGreaterThan100() returns => " + checkIfSumGreaterThan100(ages));
		

		/* 10 */
		

		double[] doubleArr = {0.1, 1.0, 236.4592, 1000.1};
		double[] emptyDoubleArr = {};
		System.out.println("10. Average of array of doubles: " + getAverageOfDoubleArr(doubleArr));

		

		/* 11 */
		

		double[] anotherDoubleArr = {3.9, 8.7, 5.9, 10.1};
		System.out.println("11. Is the average of the first array greater than the average in the second array: " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
		

		/* 12 */
		

	
		
		/* 13 */

		
		}
		

		private static String duplicateWord(String word, int n) {
		String duplicatedWord = "";
		for (int i = 0; i < n; i++) {
		duplicatedWord += word;
		}
		return "duplicatedWord() returns => " + duplicatedWord;
		}
		

		private static String getFullName(String firstName, String lastName) {
		return "getFullName() returns => " + firstName + " " + lastName;
		}
		

		private static Boolean checkIfSumGreaterThan100(int[] arr) {
		return Arrays.stream(arr).sum() > 100;
		}
		

		private static double getAverageOfDoubleArr(double[] arr) {
		// We need to use .orElse() in case an empty array is passed in
		return Arrays.stream(arr).average().orElse(Double.NaN);
		}
		

		private static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
		return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr); 
		}
		

		

		/*
		* getAge calculates a new user's age with the given birthYear
		*/
		private static int getAge(int birthYear) {
		return Year.now().getValue() - birthYear; 
	
	}

}
