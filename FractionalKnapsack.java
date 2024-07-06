package GREEDY_ALGORITM;

import java.util.Arrays;

public class FractionalKnapsack {
    public static class Bucket{
        int weight;
        int value;
        Bucket(int weight,int value){
            this.weight=weight;
            this.value=value;
        }
    }
    public static void bag(Bucket[]bucket,int w){
        Arrays.sort(bucket,(a,b)->Double.compare((double)b.value/b.weight,(double)a.value/a.weight));
        int currentWeight=0;
        float val=0;
        for (int i = 0; i < bucket.length; i++) {
            if(currentWeight+bucket[i].weight<=w){
                currentWeight+=bucket[i].weight;
                val+=bucket[i].value;
            }else{
                int remain=w-currentWeight;
                val+=(bucket[i].value/bucket[i].weight)*remain;
                break;
            }
        }System.out.println(val);
    }public static void main(String[] args) {
        Bucket[] bucket = {
            new Bucket(20, 100),
            new Bucket(10, 60),
            new Bucket(50, 100),
            new Bucket(50, 200)
        };
        bag(bucket, 90);
    }
}
