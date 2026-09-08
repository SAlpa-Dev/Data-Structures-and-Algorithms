class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer>st=new Stack<>();
        int i=0;
        while(i<arr.length){
            String s=arr[i];
            if(s.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                int sum=a+b;
                st.push(sum);
            }
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("C")) st.pop();
            else st.push(Integer.parseInt(s));
            i++;
        }
        int record=0;
        while(!st.isEmpty()) record+=st.pop();

        return record;
    }
}