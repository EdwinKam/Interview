package com.edwin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }
}
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int sublength=words[0].length();
        HashMap<String,Integer> result = new HashMap<>();
        HashMap<String,Integer> input = new HashMap<>();
        HashMap<String,Integer> copy =input;
        List<Integer> list = new ArrayList<>();



        for(int i=0; i<words.length;i++){
            input.put(words[i],i);
        }
        for(int i=0; i<s.length()-sublength+1;i++){
            if(input.containsValue(s.substring(i,i+sublength+1))){
                list.add(input.)
            }

        }

    }
}