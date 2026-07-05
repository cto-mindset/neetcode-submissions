class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (len != 0 && s.charAt(i) == ' ')
                return len;
            if (s.charAt(i) == ' ')
                continue;
            len++;
        }
        return len;
    }
}