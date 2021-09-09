package no.kristiania;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

  @Test
  public void shouldConvertToOne(){
      assertEquals("I", RomanNumeralsTest.intToRoman(1));
  }

    @Test
    public void shouldConvertToTen(){
        assertEquals("X", RomanNumeralsTest.intToRoman(10));
    }

    @Test
    public void shouldConvertToHundred(){
      assertEquals("C", RomanNumeralsTest.intToRoman(100));
    }

    @Test
    public void shouldConvertToThousands(){
        assertEquals("M", RomanNumeralsTest.intToRoman(1000));
    }




    public static String intToRoman(int number) {
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[number / 1000] +
                hundreds[(number % 1000) /100] +
                tens[(number % 100) / 10] +
                units[number % 10];
    }

    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        System.out.println("Skriv inn tall her:");
        System.out.println("Romertallet er: " + intToRoman(readData.nextInt()));
    }
}
