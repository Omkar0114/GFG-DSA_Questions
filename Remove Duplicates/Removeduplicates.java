class Solution {
     static String removeDups(String S) {
        String result = "";
        for (int i = 0; i < S.length(); i++) {
            if (!result.contains(String.valueOf(S.charAt(i)))) {
                result += (String.valueOf(S.charAt(i)));
            }
        }
        return result;
    }
}
