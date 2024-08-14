package main;

public class SumOfAllDivisorsFrom1Ton {
    class Solution{
        static long sumOfDivisors(int N){
            long sum = 0;
            for(int i =1;i<=N;i++){
                sum+=(N/i)*i;
            }
            return sum;
        }
    }
}
