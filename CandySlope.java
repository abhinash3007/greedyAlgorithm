package GREEDY_ALGORITM;

public class CandySlope {
    public static void slope(int[]arr){
        if(arr.length==0){
            return;
        }int i=1;
        int sum=1;
        while(i<arr.length){
            if (arr[i]==arr[i-1]) {
                  sum+=1;
                  i++;
                  continue;  
            }int peak=1;
            while (i<arr.length && arr[i]>arr[i-1]) {
                peak+=1;
                sum+=peak;
                i++;
            }int dip=1;
            while (i<arr.length && arr[i]<arr[i-1]) {
                sum+=dip;
                dip++;
                i++;
            }if(dip>peak){
                sum+=dip-peak;
            }
        }System.out.println(sum);
    }public static void main(String[] args) {
        int[]arr={0,2,4,7,6,5,4,3,2,1,1,1,2,3,4,2,1,1,1};
        slope(arr);
    }
}
