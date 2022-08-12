package Algorithms;

public class Main {
    public static int biSearching (int[] arr, int number){
        int lastIndexBook = 0;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex < lastIndex){
            int middleIndex = (lastIndex + firstIndex) / 2;
            if (arr[middleIndex] == number) {
                firstIndex = middleIndex;
                while (firstIndex <= lastIndex) {
                    int middleIndex2 = (firstIndex + lastIndex) / 2;
                    if (arr[middleIndex2] == number) {
                        firstIndex = middleIndex2 + 1;
                    } else {
                        lastIndex = middleIndex2 - 1;
                    }
                }
            } else if (arr[middleIndex] < number) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > number) {
                lastIndex = middleIndex -1;
            }
            lastIndexBook = firstIndex;
        }
        return arr.length - lastIndexBook;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};
        System.out.println(biSearching(arr, 32));
    }
}
