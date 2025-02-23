class Move_Zeroes {
    static void pushZerosToEnd(int[] arr) {
        // code here
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != j){
                int v = arr[i];
                arr[i] = arr[j];
                arr[j] = v;
            }
            j++;
        }
        }

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 0, 4, 3, 0, 5, 0 };
        pushZerosToEnd(arr1);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}