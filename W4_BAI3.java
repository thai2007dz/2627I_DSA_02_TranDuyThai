public class W4_BAI3 {
    public static void insertIntoSorted(int[] arr) {
        int n = arr.length;
        int target = arr[n - 1];
        int i = n - 2;
        while (i >= 0 && arr[i] > target) {
            arr[i + 1] = arr[i];
            printArray(arr);
            i--;
        }
        arr[i + 1] = target;
        printArray(arr);
    }
    public static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 3};
        System.out.println("Quá trình chèn:");
        insertIntoSorted(arr);
    }
}