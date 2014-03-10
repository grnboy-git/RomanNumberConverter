package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InRomanNumeralsTest {
 
    @Before
    
        
    
 
   @Test
    public void testi‚ğ‚R‚Â“ü—Í‚·‚é‚Æ‚R‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("iii");
        assertEquals(3, answer);
    }
    @Test
    public void testv‚ğ1‚Â“ü—Í‚·‚é‚Æ5‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("v");
        assertEquals(5, answer);
    }
    @Test
    public void testx‚ğ‚R‚Â“ü—Í‚·‚é‚Æ3‚O‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("xxx");
        assertEquals(30, answer);
    }
    @Test
    public void testx‚ğ‚R‚Âv‚ğ‚P‚Âi‚ğ‚Q‚Â“ü—Í‚·‚é‚Æ36‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("xXxVI");
        assertEquals(36, answer);
    }
    
    @Test
    public void testL‚ğ1‚Â“ü—Í‚·‚é‚Æ50‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("L");
        assertEquals(50, answer);
    }
    @Test
    public void testc‚ğ‚R‚Â“ü—Í‚·‚é‚Æ‚R00‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("Ccc");
        assertEquals(300, answer);
    }
    @Test
    public void testD‚ğ1‚Â“ü—Í‚·‚é‚Æ500‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("D");
        assertEquals(500, answer);
    }
    @Test
    public void testM‚ğ2‚Â“ü—Í‚·‚é‚Æ200‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("Mm");
        assertEquals(2000, answer);
    }
    @Test
    public void testm‚ğ2‚Âd‚ğ‚P‚Âc‚ğ‚Q‚Â“ü—Í‚·‚é‚Æ2700‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("mMdCC");
        assertEquals(2700, answer);
    }
    
    @Test
    public void testc‚ğ1‚Â“ü—Í‚·‚é‚Æ50‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("c");
        assertEquals(100, answer);
    }
    @Test
    public void testmmmcmliv‚ğ“ü—Í‚·‚é‚Æ‚ª•Ô‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("mmmcmliv");
        assertEquals(3954, answer);
    }
    @Test
    public void testi‚ğ4‚Â“ü—Í‚·‚é‚Æ³‚µ‚¢ƒ[ƒ}”š‚Ì‹L–@‚Å‚Í‚ ‚è‚Ü‚¹‚ñ‚Æ•\¦‚³‚ê‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        inRomanNumerals.inOut("iiii");
    }
    @Test
    public void testvm‚ğ4‚Â“ü—Í‚·‚é‚Æ³‚µ‚¢ƒ[ƒ}”š‚Ì‹L–@‚Å‚Í‚ ‚è‚Ü‚¹‚ñ‚Æ•\¦‚³‚ê‚é() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        inRomanNumerals.inOut("vm");
    }

}
