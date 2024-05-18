package main;

public class MoveAllZeroesToEndOfArray {
    class Solution {
        void pushZerosToEnd(int[] arr, int n) {
            // code here
            int j=0;

            for(int i=0; i<n; i++){
                if(arr[i] != 0)
                    arr[j++] = arr[i];
            }
            for(int i=j; i<n; i++){
                arr[i] = 0;
            }
        }
    }
}
