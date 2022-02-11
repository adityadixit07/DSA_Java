public class SelectionSort {
    public static void main(String[] args) {
        int a[] = { 23, 34, 12, 2, 234, 112 };
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[minIndex] < a[j]) {
                    minIndex = j;
                }

                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        System.out.println("The sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

}
