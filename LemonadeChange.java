package GREEDY_ALGORITM;

public class LemonadeChange {
    public static boolean change(int[]arr){
        if(arr.length==0){
            return true;
        }int val1=0,val2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==5){
                val1++;
            }else if (arr[i]==10) {
                if (val1!=0) {
                    val1--;
                    val2++;
                }else{
                    return false;
                }
            }else{
                if (val1!=0 && val2!=0) {
                    val1--;
                    val2--;
                }else if (val1>=3) {
                    val1=val1-3;
                }else{
                    return false;
                }
            }
        }return true;
    }public static void main(String[] args) {
        int[]arr={5,5,5,10,20};
        System.out.println(change(arr));
    }
}
