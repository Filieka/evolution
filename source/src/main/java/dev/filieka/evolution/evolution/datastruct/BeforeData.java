package dev.filieka.evolution.evolution.datastruct;

import java.util.ArrayList;
import java.util.List;

public class BeforeData {
    private List<Board> boardList;

    public  BeforeData(){
        this.boardList=new ArrayList<>();
    }

    public void push(Board board){
        boardList.add(board);
        if (boardList.size() > 10) {
            boardList.remove(0); // 刪除第一個元素，保持列表大小為10
        }
    }

    public Board pop(){
        if (boardList.size() <= 0){
            return null;
        }
        System.out.println("beforeData len:"+boardList.size());
        // 獲取最後一個元素的索引
        int lastIndex = boardList.size() - 1;
        System.out.println("lastIndex:"+lastIndex);

        // 通過索引獲取最後一個元素
        Board lastBoard = boardList.get(lastIndex);

        // 通過索引刪除最後一個元素
        boardList.remove(lastIndex);

        lastBoard.printBoardData();

        System.out.println("beforeData len:"+boardList.size());

        return lastBoard;
    }
}
