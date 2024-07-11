package main;

public class LargestElementInArray {

    class Solution {
        public static int largest(int n, int[] arr) {
            // code here
            int maxno = arr[0] ;
            for (int i=1 ; i < arr.length  ; i++) {
                if (arr[i] > maxno) {
                    maxno = arr[i];
                }
            }
            return maxno;

        }
    }
}
