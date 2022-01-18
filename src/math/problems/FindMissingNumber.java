package math.problems;

public class FindMissingNumber {
    /*
     * If n = 10, then array will have 9 elements in the range from 1 to 10.
     * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
     * Write java code to find the missing number from the array. Write static helper method to find it.
     */
    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("the missing number from the array is: "+missingNumber(array));
    }
    public static int missingNumber(int[] array) {
        int arraySize = array.length + 1;
        int sum = (arraySize * (arraySize + 1)) / 2;
        int elementSum = 0;
        for (int i = 0; i < array.length; i++) {
            elementSum += array[i];
        }
        int missingNumber = sum - elementSum;
        return missingNumber;

    }

}