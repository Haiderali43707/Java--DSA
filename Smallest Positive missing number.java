class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int x=1;  // smallest missing postive Number
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0 && arr[i]==x)
            {
                x=x+1;
            }
        }
        return x;
    }
}
