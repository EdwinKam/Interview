package com.edwin;

import java.io.PipedInputStream;
import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.isMatch("aa","a*"));
    }
}
class Solution {
    public boolean isMatch(String s, String p) {
        return isMatch(s, p, 0, 0);
        /*
        try {
            System.out.println("   s:" + s.charAt(sin) + "      p:" + p.charAt(pin));
        }catch (Exception e){
            System.out.println();
        }
        */

    }

    private boolean isMatch(String s, String p, int sin, int pin) {
        System.out.print("s:"+sin+"p"+pin);
        try {

            System.out.println("   s:" + s.charAt(sin) + "      p:" + p.charAt(pin));
        }catch (Exception e){
            System.out.println();
        }
        if(sin==s.length()&&pin==p.length())return true;
        else if(sin<0||pin<0)return false;
        else if(sin==s.length()&&pin<p.length()){
            while(pin<p.length()){
                try{
                    if(p.charAt(pin)!='*'&&p.charAt(pin+1)!='*')return false;
                }catch (Exception e){
                    return false;
                }
            }
            return true;
        }else if(pin==p.length()){
            return false;
        }else if ((p.charAt(pin)==s.charAt(sin)||p.charAt(pin)=='.')&&isMatch(s,p,sin+1,pin+1)){
            return true;
        }else if(p.charAt(pin)=='*'){
            if(isMatch(s,p,sin,pin-1)){
                return true;
            }else
                return isMatch(s,p,sin,pin+1);
        }
        return true;
    }
}