package no.kristiania;

import java.util.Scanner;

public class Main {

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
