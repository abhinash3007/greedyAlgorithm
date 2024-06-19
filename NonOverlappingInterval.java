package GREEDY_ALGORITM;

import java.util.Arrays;

public class NonOverlappingInterval {
    public static void nonOverlapp(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        int last = arr[0][1];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] > last) {
                count++;
                last = arr[i][1];
            }
        }
        System.out.println(arr.length - count);
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 1, 3 }, { 2, 4 }, { 5, 7 }, { 6, 8 }, { 9, 10 }
        };
        nonOverlapp(arr);

    }
}
