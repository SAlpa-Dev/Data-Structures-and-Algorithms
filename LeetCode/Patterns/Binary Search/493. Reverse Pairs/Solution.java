class Solution {

    public static int mergesort(int[] arr) {
        int n = arr.length;

        if (n <= 1) return 0;

        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        int idx = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }

        int count = 0;

        count += mergesort(a);
        count += mergesort(b);

        count += merge(arr, a, b);

        return count;
    }

    public static int merge(int[] arr, int[] a, int[] b) {

        int count = 0;

        // Count reverse pairs
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            if ((long) a[i] > 2L * b[j]) {
                count += a.length - i;
                j++;
            } else {
                i++;
            }
        }

        // Normal merge
        i = 0;
        j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] <= b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }

        while (i < a.length) {
            arr[k++] = a[i++];
        }

        while (j < b.length) {
            arr[k++] = b[j++];
        }

        return count;
    }

    public int reversePairs(int[] nums) {
        return mergesort(nums);
    }
}