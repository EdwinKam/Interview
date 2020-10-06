package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.romanToInt("MCMXCIV"));
        System.out.println();
    }
}
class Solution {
    public int romanToInt(String s) {
        int num=0;
        int check=0;//the a largest value appear on the right hand side of this character, this character will be -=
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)=='I'&&check<=1){
                num+=1;
            }else if(s.charAt(i)=='I'&&check>0){
                num-=1;
            }else if(s.charAt(i)=='V'){
                num+=5;
                check=5;
            }else if(s.charAt(i)=='X'&&check<=10){
                check=10;
                num+=10;
            }else if(s.charAt(i)=='X'&&check>10){
                num-=10;
            }else if(s.charAt(i)=='L'){
                num+=50;
                check=50;
            }else if(s.charAt(i)=='C'&&check<=100){
                check=100;
                num+=100;
            }else if(s.charAt(i)=='C'&&check>100){
                num-=100;
            }else if(s.charAt(i)=='D'){
                num+=500;
                check=500;
            }else if(s.charAt(i)=='M'){
                check=1000;
                num+=1000;
            }
            i--;
        }
        return num;
    }
}