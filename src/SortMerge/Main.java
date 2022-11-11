/*
package SortMerge;

import java.util.Arrays;

public class Main {
    public static int[] nationalTeam (int[][] regionalTeams){
        int[] team = regionalTeams[0];

        for (int i = 1; i < regionalTeams.length; i++){
            team = merge(team, regionalTeams[i]);
        }
        return team;
    }

    public static void mergeSort (int[] arr){
        if (arr.length == 1){
            return;
        }
        int[] arrLeft = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] arrRight = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        mergeSort(arrLeft);
        mergeSort(arrRight);

    }
    public static int[] merge (int[] team, int[] regionalsTeams){
        int[] resultTeam = new int[10];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < resultTeam.length; i++){
            if (team[index1] >= regionalsTeams[index2]){
                resultTeam[i] = team[index1];
                index1++;
            } else {
                resultTeam[i] = regionalsTeams[index2];
                index2++;
            }
        }
        return resultTeam;
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
*/
