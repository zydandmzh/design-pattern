package com.mzh.study.unit.chess;

/**
 * Created by mazhihui on 2020/3/8.
 */
public class ChessUnit {
    private int chessId;
    private String text;
    private Color color;

    public ChessUnit(int chessId, String text, Color color) {
        this.chessId = chessId;
        this.text = text;
        this.color = color;
    }

    public int getChessId() {
        return chessId;
    }

    public void setChessId(int chessId) {
        this.chessId = chessId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public enum Color {
        RED,BLUE;
    }
}
