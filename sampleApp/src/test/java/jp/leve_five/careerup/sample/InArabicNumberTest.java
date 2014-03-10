
package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class InArabicNumberTest {


    @Test
    public void test1‚ð“ü—Í‚·‚é‚ÆI‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(1);
        assertEquals("I", roman);
    }
    @Test
    public void test2‚ð“ü—Í‚·‚é‚ÆII‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(2);
        assertEquals("II", roman);
    }
    @Test
    public void test3‚ð“ü—Í‚·‚é‚ÆIII‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(3);
        assertEquals("III", roman);
    }
    @Test
    public void test4‚ð“ü—Í‚·‚é‚ÆIV‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(4);
        assertEquals("IV", roman);
    }
    @Test
    public void test8‚ð“ü—Í‚·‚é‚ÆVIII‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(8);
        assertEquals("VIII", roman);
    }
    @Test
    public void test9‚ð“ü—Í‚·‚é‚ÆIX‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(9);
        assertEquals("IX", roman);
    }
    @Test
    public void test10‚ð“ü—Í‚·‚é‚ÆX‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(10);
        assertEquals("X", roman);
    }
    @Test
    public void test15‚ð“ü—Í‚·‚é‚ÆXV‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(15);
        assertEquals("XV", roman);
    }
    @Test
    public void test490‚ð“ü—Í‚·‚é‚Æiii‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(490);
        assertEquals("CDXC", roman);
    }
    @Test
    public void test3999‚ð“ü—Í‚·‚é‚ÆMMMCMXCIX‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(3999);
        assertEquals("MMMCMXCIX", roman);
    }
    @Test
    public void test4000‚ð“ü—Í‚·‚é‚Æ‹ó‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(4000);
        assertEquals("", roman);
    }
    @Test
    public void test900‚ð“ü—Í‚·‚é‚ÆCM‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(900);
        assertEquals("CM", roman);
    }
    

}