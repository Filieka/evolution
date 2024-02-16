package dev.filieka.evolution.evolution.datastruct;

import dev.filieka.evolution.evolution.Setting;
import javafx.scene.canvas.Canvas;

public class Board {
    private boolean[][] boardData;
    //=false
    public Board(Setting setting){
        this.boardData = new boolean[10][10];
    }

    public Board(Board otherBoard) {
        // 獲取另一個 Board 對象的 boardData 大小
        int numRows = otherBoard.getBoardData().length;
        int numCols = otherBoard.getBoardData()[0].length;

        // 初始化新的 boardData
        this.boardData = new boolean[numRows][numCols];

        // 複製另一個 Board 對象的 boardData 到新的 boardData
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                this.boardData[row][col] = otherBoard.getBoardData()[row][col];
            }
        }
    }
    public boolean[][] getBoardData(){
        return this.boardData;
    }

    public void setBoardData(int i, int j, boolean value){
        this.boardData[i][j] = value;
    }


    private int state(int row,int col,int maxWidth,int maxHeight,boolean[][] boardData){
        int t=0;
        for(int x=-1;x<=1;x++){
            for(int y=-1;y<=1;y++){
                if(!(x==0&&y==0)&&row+x>-1&&row+x<maxWidth&&col+y>-1&&col+y<maxHeight){
                    if(boardData[row+x][col+y]){
                        t++;
                    }
                }
            }
        }
        return t;
    }

    public void evolution(Canvas canvas,int cellSize){
        //System.out.println("evolution start");
        int maxWidth = (int)canvas.getWidth()/cellSize;
        int maxHeight = (int)canvas.getHeight()/cellSize;
        boolean[][] target=new boolean[maxWidth][maxHeight];
        int numRows = target.length;
        int numCols = target[0].length;
        //System.out.printf("目標的大小為：%d 行 x %d 列%n", numRows, numCols);
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                int t=state(row,col,maxWidth,maxHeight,getBoardData());
                if(t>=2){
                    if(boardData[row][col]){
                        if(t<=3){
                            target[row][col]=true;
                        }
                        else{
                            target[row][col]=false;
                        }
                    }
                    else{
                        if(t==3){
                            target[row][col]=true;
                        }
                        else{
                            target[row][col]=false;
                        }
                    }
                }
                else{
                    target[row][col]=false;
                }
            }
        }
        this.boardData=target;
    }
    public void printBoardData() {
        for (int row = 0; row < boardData.length; row++) {
            for (int col = 0; col < boardData[row].length; col++) {
                // 將布爾值轉換為字符串 "1" 或 "0"，並打印
                System.out.print(boardData[row][col] ? "1" : "0");
            }
            System.out.println(); // 換行，移動到下一行
        }
    }
}
