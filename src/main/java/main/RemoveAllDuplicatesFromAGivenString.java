package main;

public class RemoveAllDuplicatesFromAGivenString {
    class Solution {
        String removeDuplicates(String str) {
            String ans= "";

            for(int i=0;i<str.length();i++){
                if(str.indexOf(str.charAt(i))==i)
                    ans += str.charAt(i);
            }
            return ans;
        }
    }
}
