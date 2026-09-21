import java.util.Scanner;
import java.util.Stack;

public class w3_tailop_25020390 {

    static int doUuTien(char x) {
        if (x == '+' || x == '-') return 1;
        if (x == '*' || x == '/') return 2;
        return 0;
    }

    static String chuyenHauTo(String s) {
        String kq = "";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') continue;

            if (Character.isLetterOrDigit(c)) {
                kq += c + " ";
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    kq += st.pop() + " ";
                }
                if (!st.isEmpty()) st.pop();
            } else {
                while (!st.isEmpty() && doUuTien(st.peek()) >= doUuTien(c)) {
                    kq += st.pop() + " ";
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            kq += st.pop() + " ";
        }

        return kq.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(chuyenHauTo(s));
        sc.close();
    }
}