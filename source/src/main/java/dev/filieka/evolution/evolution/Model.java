package dev.filieka.evolution.evolution;

import dev.filieka.evolution.evolution.datastruct.Board;

public class Model {
    private Board nowBoard;

    public Model(){
        this.nowBoard = new Board();
    }

    public boolean[][] test(){
        return this.nowBoard.getBoardData();
    }

    public Board getNowBoard() {
        return this.nowBoard;
    }

    public void setNowBoard(Board board) {
        this.nowBoard = board;
    }



    public void nextEvolution(){

    }
}
