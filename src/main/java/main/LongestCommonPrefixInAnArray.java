package main;

public interface LongestCommonPrefixInAnArray {
    class Solution{

        public int compare (String a ,String b){
            int i =0;
            int count =0;

            while(i<a.length()&&i<b.length()){

                if(a.charAt(i)==b.charAt(i)){
                    count++;
                }
                else{
                    return count;
                }
                i++;
            }
            return count;
        }

        String longestCommonPrefix(String arr[], int n){
            String a = "";
            int count=Integer.MAX_VALUE;

            if(n==1){
                return arr[0];
            }

            for(int i =0;i<n-1;i++){
                int  ans = compare(arr[0],arr[i+1]);
                if(ans == 0){
                    return "-1";
                }
                if(ans<count){
                    count=ans;
                }

            }
            for(int i = 0;i<count;i++){
                a+=arr[0].charAt(i);
            }

            return a;

        }
    }
}
