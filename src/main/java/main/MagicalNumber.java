package main;

public class MagicalNumber {
    class Solution {
        public static int findMagicalNumber(int N, int[] arr) {
            // code here
            for(int i =0;i <N;i++)
            {
                if(arr[i] == i)
                    return i;
            }
            return -1;
        }
    }
}
