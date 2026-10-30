class Main {
    public static void main(String[] args) {
        int[] a = {63, 25, 12, 22, 11};

        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        System.out.println("sorted array:");
        System.out.println(java.util.Arrays.toString(a));
    }
}
