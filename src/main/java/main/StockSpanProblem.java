package main;

public class StockSpanProblem {
    class Solution {
        // Function to calculate the span of stockâ€™s price for all n days.
        public static int[] calculateSpan(int price[], int n) {
            // Your code here
            Stack<Integer> st=new Stack<>();
            int a[]=new int[n];
            int b[]=new int[n];
            a[0]=-1;
            st.push(0);
            for(int i=1;i<n;i++)
            {
                while(!st.isEmpty()&&price[st.peek()]<=price[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    a[i]=-1;
                }
                else
                {
                    a[i]=st.peek();
                }
                st.push(i);
            }
            for(int i=0;i<n;i++)
            {
                b[i]=i-a[i];
            }
            return b;
        }
    }

}
