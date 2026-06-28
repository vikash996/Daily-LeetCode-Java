class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char p = s.charAt(i);
            if(p == '#'){
                if(!st1.isEmpty())
                    st1.pop();
            }else{
                st1.push(p);
            }
        }
        for(int i = 0; i < t.length(); i++){
            char q = t.charAt(i);
            if(q == '#'){
                if(!st2.isEmpty())
                    st2.pop();
            }else{
                st2.push(q);
            }
        }
        return st1.equals(st2);
    }
}