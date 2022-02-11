public class Selectsort {
    public static void main(String[] args) {
        int a[] = { 23, 123, 4, 12, 345, 76 };
        for (int i = 0; i < a.length; i++) {
            int minIndex = a[i];
            for (int j = 0; j < a.length; i++) {
                if (a[minIndex] < a[j]) {
                    minIndex = j;

                }

            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        System.out.println("the sorted array..");
        for (int i = 0; i < a.length-1; i++) {
            System.out.println(a[i]+"'");
        }

    }

}
