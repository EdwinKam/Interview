package com.edwin;

import java.util.HashMap;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.isValid("()"));
    }
}

class Solution {
    public boolean isValid(String sg) {
        Stack<Character> st=new Stack();
        for(int i=0;i<sg.length();i++){
            char s=sg.charAt(i);
            if(s==')'){
                if(st.empty() || st.pop()!='('){return false;}
            }
            else if(s==']'){
                if(st.empty() || st.pop()!='['){return false;}
            }
            else if(s=='}'){
                if(st.empty() || st.pop()!='{'){return false;}
            }
            else{
                st.push(s);
            }
        }
        return st.empty();
    }
}