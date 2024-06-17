package GREEDY_ALGORITM;

public class JumpGame2 {
    public static void jump(int[]arr){
        if(arr.length==1){
            return;
        }int count=0,i=0,j=0;
        while (j<arr.length-1) {
            int far=0;
            for(int k=i;k<=j;k++){
                far=Math.max(arr[k]+k,far);
            }i=j+1;
            j=far;
            count+=1;
            // if (i > j) {
            //     System.out.println("Cannot reach the end.");
            //     return;
            // }
        }
        System.out.println(count);
    }public static void main(String[] args) {
        int[]arr={2,4,1,2,3,1,1,2};
        jump(arr);
    }
}
