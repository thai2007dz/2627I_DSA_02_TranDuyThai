public class W4_BAI2 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Mảng trước khi sắp xếp:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp Selection Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}