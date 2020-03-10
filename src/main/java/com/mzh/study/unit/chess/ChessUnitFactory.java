package com.mzh.study.unit.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mazhihui on 2020/3/8.
 */
public class ChessUnitFactory extends AbstractChess{
    private static final Map<Integer,ChessUnit> chessMap = new HashMap<>();

    static{
        chessMap.put(1,new ChessUnit(1,"車",ChessUnit.Color.RED));
        chessMap.put(2,new ChessUnit(2,"馬",ChessUnit.Color.RED));
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类构造代码块");
    }
    public ChessUnitFactory(){
        System.out.println("子类构造方法");
    }

    public static ChessUnit getChessUnit(Integer chessId){
        return chessMap.get(chessId);
    }

    public static void main(String[] args) {
        new ChessUnitFactory();
    }
}
