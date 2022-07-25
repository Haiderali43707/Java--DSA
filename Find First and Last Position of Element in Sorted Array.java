class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1;
        int end=-1;
        int []a=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                start=i;
                break;
            }
            
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                end=i;
                break;
            }
        }
        a[0]=start;
        a[1]=end;
        return a;
    }
}
