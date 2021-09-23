package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

  @Test
  public void shouldConvertToOne(){
      assertEquals("I", Main.intToRoman(1));
  }

    @Test
    public void shouldConvertToTen(){
        assertEquals("X", Main.intToRoman(10));
    }

    @Test
    public void shouldConvertToHundred(){
      assertEquals("C", Main.intToRoman(100));
    }

    @Test
    public void shouldConvertToThousands(){
        assertEquals("M", Main.intToRoman(1000));
    }

}
