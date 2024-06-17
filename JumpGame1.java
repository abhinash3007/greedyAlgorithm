package GREEDY_ALGORITM;

public class JumpGame1 {
    public static boolean game(int[]arr){
        int finalPosition=arr.length-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]+i>=finalPosition){
                finalPosition=i;
            }
        }return finalPosition==0;
    }public static void main(String[] args) {
        int[]arr={1,1,2,3,2,1,0,0,1,3};
        System.out.println(game(arr));
    }
}
