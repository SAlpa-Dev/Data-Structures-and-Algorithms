class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer>ans=new ArrayList<>();
        int i=0;
        while(i<arr.length){ 
            int correct_idx=arr[i]-1;
            if(arr[i]==i+1 || arr[i]==arr[correct_idx]) i++;
            else{
                int temp=arr[i]-1;
                arr[i]=arr[temp];
                arr[temp]=temp+1;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1) ans.add(i+1);
        }
        return ans;
        
        /*ArrayList<Integer>ans=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int ele:arr) set.add(ele);
        for(int i=1;i<=arr.length;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
        */
    }
}

