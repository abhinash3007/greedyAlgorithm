package GREEDY_ALGORITM;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {
    public static void platform(int[]arr,int[]dept){
        Arrays.sort(arr);
        Arrays.sort(dept);
        int count=0;
        int max=0;
        int i=0,j=0;
        while (i<arr.length) {
            if(arr[i]<=dept[j]){
            count++;
            max=Math.max(max, count);
            i++;
            }else{
                count--;
                j++;
            }
        }System.out.println(max);
    }public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        platform(arr, dep);
    }
}
