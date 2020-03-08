package com.mzh.study.unit.edit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mazhihui on 2020/3/8.
 */
public class Editor {
    private List<Character> editorText = new ArrayList<>();
    public void append(char c, CharacterStyle.Font font, int size , int colorRGB){
        Character character = new Character(c,CharactorStyleFactory.getCharacterStyle(font,size,colorRGB));
        editorText.add(character);
    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.append('a', CharacterStyle.Font.宋体,12,123456);
        editor.append('b', CharacterStyle.Font.宋体,10,123456);
        editor.append('c', CharacterStyle.Font.宋体,10,123456);

        System.out.println(editor.editorText);
    }
}
