class Solution {
    public String[] findWords(String[] words) {
        int[] f = new int[26];

        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        for(int i = 0; i < r1.length(); i++) {
            f[r1.charAt(i) - 'a'] = 1;
        }

        for(int i = 0; i < r2.length(); i++) {
            f[r2.charAt(i) - 'a'] = 2;
        }

        for(int i = 0; i < r3.length(); i++) {
            f[r3.charAt(i) - 'a'] = 3;
        }

        String[] ans = new String[words.length];
        int k = 0;

        for(String word : words) {

            boolean choice = true;

            int num = f[Character.toLowerCase(word.charAt(0)) - 'a'];

            for(int j = 1; j < word.length(); j++) {

                if(f[Character.toLowerCase(word.charAt(j)) - 'a'] != num) {
                    choice = false;
                    break;
                }
            }

            if(choice) {
                ans[k++] = word;
            }
        }

        return Arrays.copyOf(ans, k);
    }
}