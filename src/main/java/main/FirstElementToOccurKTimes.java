package main;

public class FirstElementToOccurKTimes {
    class Solution
    {
        public int firstElementKTime(int n, int k, int[] a) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<n; i++){
                if(!map.containsKey(a[i])) map.put(a[i],1);
                else map.put(a[i],map.get(a[i])+1);
                if(map.get(a[i])>=k) return a[i];
            }
            return -1;
        }
    }
}
