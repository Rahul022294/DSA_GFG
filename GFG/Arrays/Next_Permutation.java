class Next_Permutation {
    
    // Function to find the next permutation
    static void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // Step 1: Find the longest non-increasing suffix
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // Step 2: If i is -1, the array is in descending order, so reverse it to the smallest permutation
        if (i >= 0) {
            // Step 3: Find the smallest number in the suffix greater than nums[i]
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 4: Swap nums[i] and nums[j]
            swap(nums, i, j);
        }
        
        // Step 5: Reverse the suffix starting at i + 1
        reverse(nums, i + 1, n - 1);
    }
    
    // Helper function to swap elements at indices i and j
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Helper function to reverse a portion of the array
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--; 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        Next_Permutation.nextPermutation(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
