package GREEDY_ALGORITM;

import java.util.Arrays;

public class JobSequencingProblem {
    public static class Job {
        char id;
        int deadline;
        int profit;
    
        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }public static void maxProfit(Job[]jobs,int n){
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        boolean[]time=new boolean[n];
        int[]res=new int[n];
        int totalProfit=0;
        for(int i=0;i<jobs.length;i++){
            for(int j=Math.min(jobs[i].deadline-1, n-1);j>=0;j--){
                if(time[j]==false){
                    totalProfit+=jobs[i].profit;
                    res[j]=jobs[i].id;
                    time[j]=true;
                    break;
                }
            }
        }System.out.println(totalProfit);
    }public static void main(String[] args) {
        Job[]jobs={
            new Job('a', 2, 100),
            new Job('b', 1, 19),
            new Job('c', 2, 27),
            new Job('d', 1, 25),
            new Job('e', 3, 15)
        };
        maxProfit(jobs, jobs.length);
    }
}
