package no.kristiania;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

  @Test
  public void shouldConvertToOne(){
      assertEquals("I", main.intToRoman(1));
  }

    @Test
    public void shouldConvertToTen(){
        assertEquals("X", main.intToRoman(10));
    }

    @Test
    public void shouldConvertToHundred(){
      assertEquals("C", main.intToRoman(100));
    }

    @Test
    public void shouldConvertToThousands(){
        assertEquals("M", main.intToRoman(1000));
    }

}
