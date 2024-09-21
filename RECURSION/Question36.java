// Related to strings
// Remove all occurrences of 'a' from string s = 'abcax'

package RECURSION;
import java.util.Scanner;
public class Question36 {
static String remove(String s, int idx){
    if (idx == s.length()) return "";
    String smallAns = remove(s,idx+1);
    char currchar = s.charAt(idx);
    if (currchar != 'a') return currchar + smallAns;
    else return smallAns;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(remove(s,0));

        }
    }

