/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumtest;

import Converter.*;

/**
 *
 * @author jazadehdel
 */
public class RomanNumTest {
    
    // roman numeral to convert
    static final char ROMANNUMTOCONVERT = 'V';
    
    
    /**
     * @param args the command line arguments
     */
    
    // this is the main entry point for this class;
    // we import the class from Converter above --- import Converter.*; means grab all
    // we then instatiate that class with Converter converter = new Converter();
    // and store a new object named converter with the logic inside.
    // when we call converter.toRoman("10") this calls the toRoman method in that object.
    
    public static void main(String[] args) {

       Converter converter = new Converter();
       
       System.out.println(converter.toRoman(145));
       
       System.out.println(converter.toArabic("V"));
       
    }
    
}
