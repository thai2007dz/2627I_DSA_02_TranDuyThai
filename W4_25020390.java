import java.util.*;

public class W4_25020390 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) c[i] = sc.nextInt();

        Arrays.sort(c);

        for (int i = 0; i < n; i++) {
            if (c[i] >= n - i) {
                System.out.print(n - i);
                return;
            }
        }
        System.out.print(0);
    }
}