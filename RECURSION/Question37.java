// Write a program to print reverse of a string using recursion

package RECURSION;
import java.util.Scanner;
public class Question37 {

    static String reverse(String s, int idx){
        if (idx == s.length()) return "";
        String small_ans = reverse(s,idx+1);
        return small_ans + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s,0));

    }
}
