package com.edwin;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "-91283472332";
        Solution s = new Solution();
        System.out.println(s.myAtoi(str));
    }
}
class Solution {
    public int myAtoi(String str) {
        int index = 0;
        long result = 0;
        boolean neg = false;
        try{
        while (str.charAt(index) == ' ') {
            index++;
        }
            System.out.println(index);
            if (str.charAt(index) == '-') {
                neg = true;
                index++;
            } else if (str.charAt(index) == '+') {
                index++;
            } else {
                result += Integer.parseInt(String.valueOf(str.charAt(index)));
                System.out.println(result);
                index++;
            }
            while (index<str.length()&&Integer.parseInt(String.valueOf(str.charAt(index))) >= 0 || Integer.parseInt(String.valueOf(str.charAt(index))) <= 9) {

                result = result * 10;
                result += Integer.parseInt(String.valueOf(str.charAt(index)));
                index++;
                System.out.println(result);
                System.out.println("ondex" + index);
                if(result>Integer.MAX_VALUE){
                    if(neg) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }
            }
            if(neg) {
                result = result * -1;
            }

            return (int)result;
        } catch (Exception e) {
            if(neg) {
                result = result * -1;
            }

            return (int)result;
        }
    }
    }

