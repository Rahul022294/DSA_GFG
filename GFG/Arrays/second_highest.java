
class second_highest {
    public static int getSecondLargest(int[] arr) {
        int n = arr.length;
        int first, second;

        // There should be at least two elements
        if (n < 2) {
            return -1;
        }

        first = second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            // If current element is greater
            // than first then update both
            // first and second
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

            // If arr[i] is in between first
            // and second then update second
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE)
            return -1;
        else
            return second;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 8, 10 };
        int ans = getSecondLargest(arr);
        System.out.println("The second highest number is " + ans);
    }
}