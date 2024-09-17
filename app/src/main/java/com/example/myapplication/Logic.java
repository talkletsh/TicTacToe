package com.example.myapplication;

public class Logic {

    private int[][] board=new int[3][3];
    private int counter=0;


    public Logic() {
    }

    public boolean isAvailable(int row, int col)
    {
        if (board[row][col]==0)
            return true;
        return false;
    }
    public void update(int row, int col)
    {
        if (counter%2==0)
            board[row][col]=1;
    }
}
