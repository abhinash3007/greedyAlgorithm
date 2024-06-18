package GREEDY_ALGORITM;

import java.util.Arrays;

public class NMeetingsInRoom {
    public static class Meeting{
        int start;
        int end;
        Meeting(int start,int end){
            this.start=start;
            this.end=end;
        }
    }public static void totalMeeting(Meeting[]meetings){
        Arrays.sort(meetings, (a, b) -> a.end - b.end);
        int[]res=new int[meetings.length];
        int lastEnd=meetings[0].end;
        int count=1;
        for (int i = 1; i < meetings.length; i++) {
            if(meetings[i].start>lastEnd){
                count++;
                lastEnd=meetings[i].end;
            }
        }System.out.println(count);
    }public static void main(String[] args) {
        Meeting[] meetings = {
            new Meeting(1, 2),
            new Meeting(3, 4),
            new Meeting(0, 6),
            new Meeting(5, 7),
            new Meeting(8, 9),
            new Meeting(5, 9)
        };
        totalMeeting(meetings);
    }
}
