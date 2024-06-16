package GREEDY_ALGORITM;

import java.util.Arrays;

public class AssignCookies {
    public static void assign(int[]greedy,int[]parents){
        Arrays.sort(greedy);
        Arrays.sort(parents);
        int i=0,j=0;
        while (i<greedy.length && j<parents.length ) {
            if(greedy[i]<=parents[j]){
                i++;
            }j++;
        }System.out.println(i);
    }public static void main(String[] args) {
        int[]greedy={1,5,3,3,4};
        int[]parents={4,2,1,2,1,3};
        assign(greedy, parents);
    }
}
