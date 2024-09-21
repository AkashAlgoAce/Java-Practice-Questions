// Given a string . Print all its subsequences ( without using Arraylist : print them using void )

package RECURSION;
import java.util.Scanner;
public class Question40 {
    static void print_ssq(String s, String currAns){
        if (s.isEmpty()){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        print_ssq(remString, currAns + curr);
        print_ssq(remString, currAns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print_ssq("abc","");
    }
}
