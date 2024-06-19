package GREEDY_ALGORITM;

import java.util.Arrays;

public class ShortestJobFirst {
    public static void shortest(int[]arr){
        Arrays.sort(arr);
        int total=0,waitingTime=0;
        for (int i = 0; i < arr.length; i++) {
            waitingTime=waitingTime+total;
            total+=arr[i];
        }int avg=waitingTime/arr.length;
        System.out.println(avg);
    }public static void main(String[] args) {
        int[]arr={4,3,7,1,2};
        shortest(arr); 
    }
}
