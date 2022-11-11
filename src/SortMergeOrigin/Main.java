package SortMergeOrigin;

import java.util.Arrays;

public class Main {
    public static int[] nationalTeam (int[][] regionalTeams){
        int[] team = regionalTeams[0];

        for (int i = 1; i < regionalTeams.length; i++){
            team = merge(team, regionalTeams[i]);
        }
        return team;
    }

    public static int[] mergeSort (int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int[] arrLeft = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] arrRight = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        mergeSort(arrLeft);
        mergeSort(arrRight);

        return merge(arrLeft, arrRight);
    }
    public static int[] merge (int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < result.length; i++){
            if (left.length == index1) {
                result[i] = right[index2];
                index2++;
            }
            else if (right.length == index2) {
                result[i] = left[index1];
                index1++;
            }
            else if (left[index1] < right[index2]) {
                result[i] = left[index1];
                index1++;
            } else {
                result[i] = right[index2];
                index2++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] regionalTeams = new int[][]{
                new int[]{45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                new int[]{31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                new int[]{51, 30, 10, 9, 8, 7, 6, 5, 2, 1, 60}};

        //System.out.println(Arrays.toString(nationalTeam(regionalTeams)));
        System.out.println(Arrays.toString(mergeSort(regionalTeams[2])));
    }
}
