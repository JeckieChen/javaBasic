package com.company.AlgorithmProblem.reverseWords;

public class Solution {
    public String reverseWords(String s){
//        String left = "";
//        String right = "";
        StringBuilder result = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char tmp = s.charAt(i);
            if (tmp!=' '){
                result.append(tmp);
            }else {
                if (!result.toString().equals("")){
                    result.append(' ');

                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "the sky is blue";
        String s2 = "  hello world!  ";
        String s3 = "a good   example";
        String r = solution.reverseWords(s1);
        System.out.println(r);
    }
}
