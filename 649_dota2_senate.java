class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad =new LinkedList<>();
        Queue<Integer> dir =new LinkedList<>();
        int n = senate.length();
        for(int i=0; i<n; i++){
            if(senate.charAt(i)=='R'){
                rad.add(i);
            }else{
                dir.add(i);
            }
            
        }
        while(!rad.isEmpty() && !dir.isEmpty()){
                int r = rad.remove();
                int d = dir.remove();
                if(r<d){
                    rad.add(r+n);
                }else{
                    dir.add(d+n);
                }
            }
        if(rad.isEmpty()){
            return "Dire";
        }
        return "Radiant";
    }
}





// class Solution {
//     public String predictPartyVictory(String senate) {
//         Queue<Character> q = new LinkedList<>();
//         for(int i=0;i<senate.length(); i++){
//             char ch = senate.charAt(i);
//             q.add(ch);
//         }
//         Queue<Character> q2 = new LinkedList<>();
//         for(int i=0; i<q.size(); i++){
//             char a = q.remove();
//             char b = q.remove(); //  second value delete ho jygi
//             q2.add(a);
//         }
//         if(q2.peek()=='R'){
//             return "Radiant";
//         }
//         return "Dire";
//     }
// }