package com.mzh.study.unit.edit;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mazhihui on 2020/3/8.
 */
public class CharactorStyleFactory {
    private static final Map<Integer,CharacterStyle> characterStyleMap = new HashMap<>();
    public static CharacterStyle getCharacterStyle(CharacterStyle.Font font,int size ,int colorRGB){
      CharacterStyle characterStyle = new CharacterStyle(font,size,colorRGB);
      if (characterStyleMap.containsKey(characterStyle.hashCode())){
          return characterStyleMap.get(characterStyle.hashCode());
      } else {
          characterStyleMap.put(characterStyle.hashCode(),characterStyle);
      }
      return characterStyle;
    }
}
