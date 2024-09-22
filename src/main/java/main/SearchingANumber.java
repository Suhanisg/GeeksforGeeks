package main;

public class SearchingANumber {
    class Solution {
        public int search(int k, ArrayList<Integer> arr) {
            // code here
            int result=-1;
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)==k) {
                    result=i+1;
                    break;
                }
            }
            return result;

        }
    }
}
