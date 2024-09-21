// Given a string , write all its subsequences of the string

// Example :
// INPUT : 'abc'
// OUTPUT : a,b,c,ab,bc,ca,abc


package RECURSION;
import java.util.ArrayList;
import java.util.Scanner;
public class Question39 {
    static ArrayList<String> get_ssq(String s){
    ArrayList<String> ans = new ArrayList<>();
    // base case
        if (s.isEmpty()){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns = get_ssq(s.substring(1));
        for (String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = get_ssq("abcde");
        System.out.println(ans);

    }
}
