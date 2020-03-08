package com.mzh.study.unit.edit;

/**
 * Created by mazhihui on 2020/3/8.
 */
public class Character {
    private char c;
    private CharacterStyle characterStyle;

    public Character(char c, CharacterStyle characterStyle) {
        this.c = c;
        this.characterStyle = characterStyle;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Character{" +
                "c=" + c +
                ", characterStyle=" + characterStyle +
                '}';
    }
}
