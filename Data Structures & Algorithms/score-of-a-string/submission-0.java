class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        byte[] bytes = s.getBytes();
        for (int i = 0; i < s.length() - 1; i++) score += Math.abs(bytes[i] - bytes[i + 1]);
        return score;
    }
}