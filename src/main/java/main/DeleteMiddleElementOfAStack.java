package main;

public class DeleteMiddleElementOfAStack {
    class Solution {
        // Function to delete middle element of a stack.
        public void delete(Stack<Integer>s, int sizeOfStack, int count ){
            if(count == Math.floor((sizeOfStack+1)/2)){
                s.pop();
                return;
            }
            else{
                int val = s.pop();
                delete(s , sizeOfStack , count - 1);
                s.push(val);
            }
        }



        public void deleteMid(Stack<Integer>s,int sizeOfStack){
            int count = sizeOfStack;
            delete(s , sizeOfStack , count);

        }


    }

}
