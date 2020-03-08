package com.mzh.study.unit.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mazhihui on 2020/3/8.
 */
public class ChessBoard {
    private Map<Integer,Chess> chesses = new HashMap<>();
    public ChessBoard() {
        init();
    }

    private void init(){
        chesses.put(1,new Chess(ChessUnitFactory.getChessUnit(1),0,1));
        chesses.put(2,new Chess(ChessUnitFactory.getChessUnit(2),0,2));
    }
    public void move(Chess chess,int x,int y){

    }
}
