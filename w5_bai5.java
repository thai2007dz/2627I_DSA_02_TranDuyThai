import java.util.ArrayList;
import java.util.Scanner;

public class w5_bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int pivot = a[0];
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (a[i] <= pivot) left.add(a[i]);
            else right.add(a[i]);
        }
t
        for (int x : left) System.out.print(x + " ");
        System.out.print(pivot + " ");
        for (int x : right) System.out.print(x + " ");
    }
}