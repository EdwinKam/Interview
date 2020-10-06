package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        System.out.println(s.intToRoman(1994));
    }
}
class Solution {
    StringBuilder sb = new StringBuilder();

    public String intToRoman(int num) {

        int rem = num / 1000;
        String result = "";
        int thousand = num / 1000 * 1000;
        System.out.println(thousand);
        int hundred = num % 1000 / 100 * 100;
        System.out.println(hundred);
        int tenth = num % 100 / 10 * 10;
        System.out.println(tenth);
        int dig = num % 10;
        basic(thousand);
        basic(hundred);
        basic(tenth);
        basic(dig);
        return sb.toString();
    }

    private void basic(int num) {
        switch (num) {
            case 10:
                sb.append('X');
                break;
            case 20:
                sb.append("XX");
                break;
            case 30:
                sb.append("XXX");
                break;
            case 40:
                sb.append("XL");
                break;
            case 50:
                sb.append('L');
                break;
            case 60:
                sb.append("LX");
                break;
            case 70:
                sb.append("LXX");
                break;
            case 80:
                sb.append("LXXX");
                break;
            case 90:
                sb.append("XC");
                break;
            case 1:
                sb.append('I');
                break;
            case 2:
                sb.append("II");
                break;
            case 3:
                sb.append("III");
                break;
            case 4:
                sb.append("IV");
                break;
            case 5:
                sb.append('V');
                break;
            case 6:
                sb.append("VI");
                break;
            case 7:
                sb.append("VII");
                break;
            case 8:
                sb.append("VIII");
                break;
            case 9:
                sb.append("IX");
                break;
            case 100:
                sb.append('C');
                break;
            case 200:
                sb.append("CC");
                break;
            case 300:
                sb.append("CCC");
                break;
            case 400:
                sb.append("CD");
                break;
            case 500:
                sb.append('D');
                break;
            case 600:
                sb.append("DC");
                break;
            case 700:
                sb.append("DCC");
                break;
            case 800:
                sb.append("DCCC");
                break;
            case 900:
                sb.append("CM");
                break;
            case 1000:
                sb.append("M");
                break;
            case 2000:
                sb.append("MM");
                break;
            case 3000:
                sb.append("MMM");
                break;
        }
    }

    private String basic1(int num) {
        switch (num) {
            case 1:
                sb.append("I");
                break;
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 20:
                return "XX";
            case 30:
                return "XXX";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 60:
                return "LX";
            case 70:
                return "LXX";
            case 80:
                return "LXXX";
            case 90:
                return "XC";
            case 100:
                return "C";
            case 200:
                return "CC";
            case 300:
                return "CCC";
            case 400:
                return "CD";
            case 500:
                return "D";
            case 600:
                return "DC";
            case 700:
                return "DCC";
            case 800:
                return "DCCC";
            case 900:
                return "CM";
            case 1000:
                return "M";
            case 2000:
                return "MM";
            case 3000:
                return "MMM";
            default:
                return "";
        }
        return "";
    }
}
