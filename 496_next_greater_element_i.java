class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for(int i=n-1; i>=0; i--){
            while(st.size()>0 && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }else{
                nge[i]=st.peek();
            }
            st.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<n; j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=nge[j];
                    break;
                }
            }
        }
        return ans;
    }
}