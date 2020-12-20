package com.edwin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][]snakes
        shortestSnakesAndLadders(5,new int{[3]})
    }
    public static int shortestSnakesAndLadders(int boardSize, int[][] snakes, int[][] ladders) {
        int count=0;
        int position =1;
        return rec(boardSize,snakes, ladders,  count,position);
    }
    public static int rec(int boardSize, int[][] snakes, int[][] ladders,  int count,int position){
        if(boardSize-position<=6)return count++;//if get to the end
        int []array= new int[boardSize];
        int step=0;
        for(int i=0; i<ladders.length;i++){ //check if any ladder within 6 steps
            if(position+6>=ladders[i][0]){
                array[step]=rec(boardSize,snakes, ladders,  count+1,ladders[i][1]);
                step++;
            }
        }
        for(int i=0; i<ladders.length;i++){ //check if any ladder within 6 steps
            if(position+6==snakes[i][0]){
                continue;
            }
            array[step]=rec(boardSize,snakes, ladders,  count+1,position+6);
            step++;
            break;
        }
        return min(array);
    }
    public static int min(int[] array){
        int min=0;
        for(int i=0;i<array.length;i++){
            if(min==0&&array[i]>min){
                min=array[i];
            }else if(min!=0){
                min=Math.min(array[i],min);
            }
        }
        return min;
    }
}
