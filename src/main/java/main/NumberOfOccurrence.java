package main;

public class NumberOfOccurrence {
    class Solution {
        int count(int[] arr, int n, int x) {

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == x) {
                    count++;
                }
            }
            return count;

        }
    }
}
