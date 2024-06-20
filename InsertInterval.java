package GREEDY_ALGORITM;

import java.util.ArrayList;

public class InsertInterval {
    public static void insert(int[][]arr,int[]newInterval){
        ArrayList<int[]>list=new ArrayList<>();
        int i=0;
        while (i<arr.length && arr[i][1]<newInterval[0]) {
            list.add(arr[i]);
            i++;
        }while (i<arr.length && arr[i][0]<newInterval[0]) {
            newInterval[0]=Math.min(arr[i][0], newInterval[0]);
            newInterval[1]=Math.max(arr[i][1], newInterval[1]);
            i++;
        }
        list.add(newInterval);
        while (i<arr.length) {
            list.add(arr[i]);
            i++;
        } for (int[] interval : list) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {6, 9}
        };
        int[] newInterval = {2, 5};
        insert(intervals, newInterval);
    }
}
