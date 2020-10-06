package com.edwin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.letterCombinations("67").toString());

    }
}
class Solution {
    public final String letter[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == "") {
            return list;
        }
        char[] one = new char[digits.length()];
        hoop(one, digits, 0, list);
        list.toString();
        return list;
    }

    private void hoop(char[] one, String digit, int index, List<String> list) {
        if (index == digit.length()) {
            list.add(new String(one));
        } else {
            String each = letter[Character.getNumericValue(digit.charAt(index))];
            System.out.println(each);
            for (int i = 0; i < each.length(); i++) {
                one[index] = each.charAt(i);
                hoop(one, digit, index + 1, list);
            }
        }

    }
}