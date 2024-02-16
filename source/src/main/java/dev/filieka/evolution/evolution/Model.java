package dev.filieka.evolution.evolution;

import dev.filieka.evolution.evolution.datastruct.Board;

public class Model {
    private Board nowBoard;
    private Setting setting;

    public Model(Setting setting){
        this.setting=setting;
        this.nowBoard = new Board(this.setting);
    }


    public Board getNowBoard() {
        return this.nowBoard;
    }




}
