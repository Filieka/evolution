package dev.filieka.evolution.evolution.datastruct;

public class Board {
    private boolean[][] boardData;
    //=false
    public Board(){
        this.boardData = new boolean[100][100];
    }

    public boolean[][] getBoardData(){
        return this.boardData;
    }

    public void setBoardData(int i, int j, boolean value){
        this.boardData[i][j] = value;
    }
}
