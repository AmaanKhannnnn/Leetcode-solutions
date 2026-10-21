class Solution {
    public boolean judgeCircle(String moves) {
        int U =0;
        int D =0;
        int L =0;
        int R =0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='U'){
                U++;
            }
           else if(moves.charAt(i)=='D'){
                D++;
            }
            else if(moves.charAt(i)=='L'){
                L++;
            }
             else if(moves.charAt(i)=='R'){
                R++;
            }
        } if(U==D && L==R)return true;
        else return false;
    }
}