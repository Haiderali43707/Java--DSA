class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
       ArrayList<Integer>list=new ArrayList<>();
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<n;i++)
      {
          if(map.containsKey(arr[i]))
          {
              list.add(arr[i]);
          }
      }
      
      if(list.isEmpty())
      {
          list.add(-1);
      }
      return list;
        
        
    }
}
