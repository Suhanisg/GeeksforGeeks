package main;

public class SmallestPositiveMissingNumber {
    class Solution
    {
        //Function to find the smallest positive number missing from the array.
        static int missingNumber(int arr[], int size)
        {
            Arrays.sort(arr);
            int missing=1;
            for(int i=0;i<size;i++)
            {
                if(arr[i]<1)
                    continue;
                else if(arr[i]==missing)
                {
                    missing++;

                }

            }
            return missing;
        }
    }
}
