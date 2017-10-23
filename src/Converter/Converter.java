/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import java.util.HashMap;
import java.util.*;
/**
 *
 * @author jazadehdel
 */
public class Converter {
    
    // declaring hmap to store below values
    private TreeMap<Integer, String> romToArabicMap = new TreeMap<Integer, String>();
    private String romanAnswer = "";
    private int arabicAnswer = 0;
    
    public Converter() {
        this.romToArabicMap.put(1000, "M");
        this.romToArabicMap.put(900, "CM");
        this.romToArabicMap.put(500, "D");
        this.romToArabicMap.put(400, "CD");
        this.romToArabicMap.put(100, "C");
        this.romToArabicMap.put(90, "XC");
        this.romToArabicMap.put(50, "L");
        this.romToArabicMap.put(40, "XL");
        this.romToArabicMap.put(10, "X");
        this.romToArabicMap.put(9, "IX");
        this.romToArabicMap.put(5, "V");
        this.romToArabicMap.put(4, "IV");
        this.romToArabicMap.put(1, "I");
    }
    
    public String toRoman(Integer arabic) {
          int finder = this.romToArabicMap.floorKey(arabic);
          if (arabic == finder) {
              String thisLetter = this.romToArabicMap.get(arabic);
              romanAnswer+=thisLetter;
              return romanAnswer;
          } 
              String thisLetter = this.romToArabicMap.get(finder);
              romanAnswer += thisLetter;
              Integer newArabic = arabic-finder;
              toRoman(newArabic);
              return romanAnswer;
    }

    
    public Integer toArabic(String roman) {
        
        arabicAnswer = this.romToArabicMap.get(roman);
        
        
        return arabicAnswer;
    }
    
    
}
