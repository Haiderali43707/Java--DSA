class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        int max=Integer.MIN_VALUE;
        int j=n-2;
        for(int i=n-1;i>0;i--)
        {
            max=Math.max(max,arr[i]);
                ans[j]=max;
            j--;
        }
        ans[n-1]=-1;
        return ans;
    }
}
