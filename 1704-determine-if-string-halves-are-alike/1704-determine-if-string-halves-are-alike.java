class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        
        int count=0;

      for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                if (i < mid)
                    count++;
                else
                    count--;
            }
        }
      return count  ==0;
        }
       
    }
