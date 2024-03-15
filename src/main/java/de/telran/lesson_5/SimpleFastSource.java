package de.telran.lesson_5;

public class SimpleFastSource {
    public static void main(String[] args) {

        int[] arrInt = {1,3,5,6,7,9,10,13,17};

        int result = binarySearch(arrInt, 0, arrInt.length-1, 13);
        System.out.println("index = "+ result);

        result = binarySearch(arrInt, 0, arrInt.length-1, 8);
        System.out.println("index = "+ result);


    }

    public static int binarySearch(int[] arr, int leftIdx, int rightIdx, int element) {
        if (rightIdx >= leftIdx) {
            int mid = leftIdx + (rightIdx - leftIdx) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] > element) {
                return binarySearch(arr, leftIdx, mid - 1, element);
            }
            return binarySearch(arr, mid + 1, rightIdx, element);
        }
        return -1;
    }
}
