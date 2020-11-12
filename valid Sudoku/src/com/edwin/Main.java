package com.edwin;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    public static boolean validSo(char[][]board){
        for (int i=0; i<board.length;i++) {
            HashMap<String, Integer> col = new HashMap<>();
            HashMap<String, Integer> row = new HashMap<>();
            for(int j=0; j<board[0].length;j++) {
                String ch1 = String.valueOf(board[i][j]);
                System.out.println(ch1);
                if(ch1!=".'") {
                    if (col.containsKey(ch1)) return false;
                    col.put(ch1, j);
                }
                String ch2 = String.valueOf(board[j][i]);
                System.out.println(ch2);
                if(ch2!=".'") {
                    if (row.containsKey(ch2)) return false;
                    row.put(ch2, j);
                }
            }
        }
        for(int i=0;i<board.length;i+=3){
            for(int j =0;j<board.length;j+=3){

                HashMap<String, Integer> box = new HashMap<>();
                //System.out.println("------------------------");
                for(int row=i;row<i+3;row++){
                    for(int col =j;col<j+3;col++){
                        String ch = String.valueOf(board[row][col]);
                        //System.out.print(ch);
                        if(ch!=".'") {
                            if (box.containsKey(ch)) return false;
                            box.put(ch, j);
                        }
                    }
                    //System.out.println();
                }
            }
        }
        return true;
    }
}
