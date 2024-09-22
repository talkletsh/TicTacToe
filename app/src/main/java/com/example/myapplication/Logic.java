package com.example.myapplication;

import android.widget.Toast;

public class Logic {

    private int[][] board=new int[3][3];
    private int counter=0;

 //
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
        else
            board[row][col]=-1;
    }
    public boolean win ()
    {
        int sumX=0, sum0=0,sumI=0,sumJ=0;
        for (int i=0; i<3; i++)
        {
            sumX=0;
            sum0=0;
            sumI+=board[i][i];
            sumJ+=board[i][board.length-i-1];
            for (int j=0; j<3; j++)
            {
                sumX+=board[i][j];
                sum0+=board[j][i];
            }
            if(Math.abs(sumX)==3 || Math.abs(sum0)==3)
                return true;
            if(Math.abs(sumI)==3 || Math.abs(sumJ)==3)
                return true;
        }
        return false;
    }
}
