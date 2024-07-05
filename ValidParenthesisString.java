package GREEDY_ALGORITM;

public class ValidParenthesisString {
    public static boolean isValid(String s, int i, int open) {
        if (s.length() == i) {
            return open==0;
        }
        if (open < 0) {
            return false;
        }
        char ch = s.charAt(i);
        if (ch == '(') {
            return isValid(s, i+1, open+1);
        } else if (ch == '*') {
            return isValid(s, i+1, open+1) ||
                    isValid(s, i+1, open - 1) ||
                    isValid(s, i+1, open);
        } else {
            return isValid(s, i+1, open - 1);
        }
    }
    public static boolean optimal(String s){
        int open=0;
        int close=0;
        for (int j = 0; j < s.length(); j++) {
            char ch=s.charAt(j);
            if(ch=='(' || ch=='*'){
                open++;
            }else{
                open--;
            }
            if(open<0){
                return false;
            }
        }
        for (int j = s.length()-1; j >= 0; j--) {
            char ch=s.charAt(j);
            if(ch==')' || ch=='*'){
                close++;
            }else{
                close--;
            }if (close<0) {
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        String s = "(*)";
        System.out.println(isValid(s, 0, 0));
        System.out.println(optimal(s));
    }
}
