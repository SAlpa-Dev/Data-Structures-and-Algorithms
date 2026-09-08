class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer>st=new Stack<>();
        int i=0;
        while(i<arr.length){
            String s=arr[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("+")){
                int a=st.peek();
                st.pop();
                int b=st.peek();
                st.push(a);
                int sum=a+b;
                st.push(sum);
            }
            else st.push(Integer.parseInt(s));
            i++;
        }
        int sum=0;
        while(!st.isEmpty()) sum+=st.pop();
        return sum;
    }
}