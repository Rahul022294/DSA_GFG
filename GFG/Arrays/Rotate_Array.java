class Rotate_Array {
    // Function to reverse a portion of the array
    static void rotate(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate an array by d elements in counter-clockwise direction
    static void rotateArr(int arr[], int d) {
        // Handle the case when d > arr.length to prevent unnecessary rotations
        d = d % arr.length; // Ensure d is within bounds of the array length

        // Reverse the first d elements
        rotate(arr, 0, d - 1);

        // Reverse the remaining elements from d to arr.length-1
        rotate(arr, d, arr.length - 1);

        // Reverse the entire array from 0 to arr.length-1
        rotate(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        
        // Rotate the array
        rotateArr(arr, d);
        
        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
