class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer>ans=new ArrayList<>();
        int fr=0,lr=arr.length-1,fc=0,lc=arr[0].length-1;
        while(fr<=lr && fc<=lc){
            for(int j=fc;j<=lc;j++) {
                ans.add(arr[fr][j]);
            }
            fr++;
            if(fr>lr || fc>lc)break;

            for(int i=fr;i<=lr;i++) {
                ans.add(arr[i][lc]);
            }
            lc--;
            if(fr>lr || fc>lc)break;

            for(int j=lc;j>=fc;j--) {
                ans.add(arr[lr][j]);
            }
            lr--;
            if(fr>lr || fc>lc)break;

            for(int i=lr;i>=fr;i--) {
                ans.add(arr[i][fc]);
            }
            fc++;
        }
        return ans;
    }
}