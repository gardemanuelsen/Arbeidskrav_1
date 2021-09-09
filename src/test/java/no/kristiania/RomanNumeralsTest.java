package no.kristiania;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

  @Test
  public void shouldConvertToOne(){
      assertEquals("I", RomanNumeralsTest.intToRoman(10));
  }





    public static String intToRoman(int num) {
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[num / 1000] +
                hundreds[(num % 1000) /100] +
                tens[(num % 100) / 10] +
                units[num % 10];
    }

    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        System.out.println("Skriv inn tall her:");
        System.out.println("Romertallet er: " + intToRoman(readData.nextInt()));
    }
}
