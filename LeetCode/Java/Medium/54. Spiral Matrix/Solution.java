class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer>ans=new ArrayList<>();
        int fr=0,fc=0,lr=arr.length-1,lc=arr[0].length-1;
        while(fr<=lr || fc<=lc){
            for(int i=fc;i<=lc;i++){
                ans.add(arr[fr][i]);
            }
            fr++;
            if(fr>lr || fc>lc) break;

            for(int i=fr;i<=lr;i++){
                ans.add(arr[i][lc]);
            }
            lc--;
            if(fr>lr || fc>lc) break;

            for(int i=lc;i>=fc;i--){
                ans.add(arr[lr][i]);
            }
            lr--;
            if(fr>lr || fc>lc) break;

            for(int i=lr;i>=fr;i--){
                ans.add(arr[i][fc]);
            }
            fc++;
        }
        return ans;
    }
}