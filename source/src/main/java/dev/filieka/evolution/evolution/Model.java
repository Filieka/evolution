package dev.filieka.evolution.evolution;

import dev.filieka.evolution.evolution.datastruct.BeforeData;
import dev.filieka.evolution.evolution.datastruct.Board;

public class Model {
    private Board nowBoard;
    private Setting setting;
    private BeforeData beforeData;

    public Model(Setting setting){
        this.setting=setting;
        this.nowBoard = new Board(this.setting);
        this.beforeData= new BeforeData();
    }


    public void setNowBoard(Board board){
        this.nowBoard=board;
    }
    public Board getNowBoard() {
        return this.nowBoard;
    }
    
    public BeforeData getBeforeData(){
        return this.beforeData;
    }




}
