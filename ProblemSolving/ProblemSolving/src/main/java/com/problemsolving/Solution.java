package com.problemsolving;

public class Solution {

    public String reverseSubstring(String s) {
        int left = 0;
        StringBuilder result = new StringBuilder();
        while(left<s.length()) {
            if(s.charAt(left) != '(') {
                result.append(s.charAt(left));
                left++;
            } else {
                int right = left + 1;
                while(right < s.length() && s.charAt(right) != ')') {
                    right++;
                }
                result.append('(');
                for(int i = right - 1; i>left; i--) {
                    result.append(s.charAt(i));
                }
                result.append(')');
                left = right + 1;
            }
        }
        return result.toString();
    }

}
