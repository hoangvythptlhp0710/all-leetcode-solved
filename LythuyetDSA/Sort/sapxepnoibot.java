package src.LythuyetDSA.Sort;

public class sapxepnoibot {
    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    // sắp xếp từ nhỏ đến lớn
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            printArray(i, a);
            if (isSorted = true){
                break;
            }
        }
    }

    public static void main(String[] args) {
        // int[] a = { 1, 8, 6, 9, 7, 4, 2 };
        int[] b = { 1, 2, 3, 9, 8 };
        // bubbleSort(a);
        bubbleSort(b);
    }
}
