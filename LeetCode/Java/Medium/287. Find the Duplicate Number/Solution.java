class Solution {
    public int findDuplicate(int[] arr) {
        int n=arr.length-1;
        int i=0;
        while(i<arr.length){
            if(arr[i]==i+1) i++;
            else if (arr[i]==arr[arr[i]-1]) {
                return arr[i];
            }
            else{
                int temp=arr[i]-1;
                arr[i]=arr[temp];
                arr[temp]=temp+1;
            }
        }
        return n;
        
    }
}