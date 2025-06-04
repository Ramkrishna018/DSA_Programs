import java.util.*;

class Solution {
    
    // Brute Force O(n^2)
    public boolean twoSum(int arr[], int n, int x) {
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    // Two Pointer Approach (requires sorted array)
    public boolean twoSumPointerApproach(int arr[], int n, int x) {
        int l = 0;
        int h = n - 1;

        while(l < h) {
            int csum = arr[l] + arr[h];
            if(csum == x) {
                return true;
            } else if(csum > x) {
                h--;
            } else {
                l++;
            }
        }
        return false;
    }

    // Final method to call after sorting
    public boolean hasArrayTwoCondition(int arr[], int n, int x) {
        Arrays.sort(arr); // Sort array first
        return twoSumPointerApproach(arr, n, x);
    }

    // Main for test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 4, 6, 8, 10};
        int x = 14;
        int n = arr.length;

        System.out.println(sol.twoSum(arr, n, x));               // Brute Force
        System.out.println(sol.hasArrayTwoCondition(arr, n, x)); // Two Pointer
    }
}
