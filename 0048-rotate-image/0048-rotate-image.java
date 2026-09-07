class Solution {

    public void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public void reverse(int[] m) {
        int i = 0;
        int j = m.length - 1;

        while (i < j) {
            int temp = m[i];
            m[i] = m[j];
            m[j] = temp;

            i++;
            j--;
        }
    }

    public void rotate(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(arr, i, j);
            }
        }

        for (int i = 0; i < n; i++) {
            reverse(arr[i]);
        }
    }
}