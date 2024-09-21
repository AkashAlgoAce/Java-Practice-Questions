// Write a program to check if the string is palindrome or not ( Ex. : DAD = DAD ) jo ulta padhne per bhi same ho

package RECURSION;
import java.util.Scanner;
public class Question38 {
    static String reverse(String s, int idx){
        if (idx == s.length()) return "";
        String small_ans = reverse(s,idx+1);
        return small_ans + s.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = reverse(s,0);
        if (rev.equals(s)) System.out.println("Yes, the string is palindrome");
        else System.out.println("No, the string is not palindrome");
    }
}
