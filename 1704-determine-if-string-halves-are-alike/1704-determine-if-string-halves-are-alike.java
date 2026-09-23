class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        int countA=0;
        int countB=0;

        for(int i=0;i<mid;i++){
           
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                countA++;
            }
        }
        for(int i=mid;i<s.length();i++){
           
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                countB++;
            }
        }
        if(countA==countB){
            return true;
        }
        return false;
    }
}