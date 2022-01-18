package math.problems;

public class Pattern {

	public static void main(String[] args) {

printNos(100,90);
printNos1(88,70);
printNos2(67,40);
printNos3(36,10);
printNos4(5,0);
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32;...........
		 *
		 *
		 */
	}

	public static void printNos(int initial, int last) {
		if (initial >= last) {
			System.out.print(initial + " ");
			printNos(initial - 1, last);
		}
	}
	public static void printNos1(int initial1, int last1) {
		if (initial1 >= last1) {
			System.out.print(initial1 + " ");
			printNos1(initial1 - 2, last1);
		}
	}
	public static void printNos2(int initial2, int last2) {
		if (initial2 >= last2) {
			System.out.print(initial2 + " ");
			printNos2(initial2 - 3, last2);
		}
	}
	public static void printNos3(int initial3, int last3) {
		if (initial3 >= last3) {
			System.out.print(initial3 + " ");
			printNos3(initial3 - 4, last3);
		}
	}
	public static void printNos4(int initial4, int last4) {
		if (initial4 >= last4) {
			System.out.print(initial4 + " ");
			printNos4(initial4 - 5, last4);
		}
	}
}









