package com.mzh.study.unit.chess;

/**
 * Created by mazhihui on 2020/3/8.
 */
public class Chess {
    private ChessUnit chessUnit;
    private int x;
    private int y;

    public Chess(ChessUnit chessUnit, int x, int y) {
        this.chessUnit = chessUnit;
        this.x = x;
        this.y = y;
    }

    public ChessUnit getChessUnit() {
        return chessUnit;
    }

    public void setChessUnit(ChessUnit chessUnit) {
        this.chessUnit = chessUnit;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
