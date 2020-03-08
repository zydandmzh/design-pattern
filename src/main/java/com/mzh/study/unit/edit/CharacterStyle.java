package com.mzh.study.unit.edit;

/**
 * Created by mazhihui on 2020/3/8.
 */
public class CharacterStyle {
    private Font font;
    private int size;
    private int colrRGB;

    public CharacterStyle(Font font, int size, int colrRGB) {
        this.font = font;
        this.size = size;
        this.colrRGB = colrRGB;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getColrRGB() {
        return colrRGB;
    }

    public void setColrRGB(int colrRGB) {
        this.colrRGB = colrRGB;
    }

    public enum Font{
        楷体,宋体,行书;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterStyle that = (CharacterStyle) o;

        if (size != that.size) return false;
        if (colrRGB != that.colrRGB) return false;
        return font == that.font;

    }

    @Override
    public int hashCode() {
        int result = font != null ? font.hashCode() : 0;
        result = 31 * result + size;
        result = 31 * result + colrRGB;
        return result;
    }

    @Override
    public String toString() {
        return "CharacterStyle{" +
                "font=" + font +
                ", size=" + size +
                ", colrRGB=" + colrRGB +
                '}';
    }
}
