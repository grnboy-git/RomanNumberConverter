
import static org.junit.Assert.*;
import jp.leve_five.careerup.sample.InArabicNumber;

import org.junit.Test;


public class InputOutputTest {

    @Test
    public void test‚R‚ğ“ü—Í‚·‚é‚ÆIII‚ªo—Í‚³‚ê‚é(){
        InputOutput inputoutput = new InputOutput();
        String output = inputoutput.convert(3);
       assertEquals("III", output);
    }
    
    @Test
    public void test4‚ğ“ü—Í‚·‚é‚ÆIV‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(4);
        assertEquals("IV", roman);
    }

    @Test
    public void test4000‚ğ“ü—Í‚·‚é‚Æ‹ó‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(4000);
        assertEquals("", roman);
    }
    
    @Test
    public void test900‚ğ“ü—Í‚·‚é‚ÆCM‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(900);
        assertEquals("CM", roman);
    }

    @Test
    public void test3999‚ğ“ü—Í‚·‚é‚ÆMMMCMXCIX‚ª•Ô‚Á‚Ä‚­‚é() {
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(3999);
        assertEquals("MMMCMXCIX", roman);
    }

    
    @Test
    public void testXVI‚ğ“ü—Í‚·‚é‚Æ16‚ªo—Í‚³‚ê‚é(){
        InputOutput inputoutput = new InputOutput();
        int arabic = inputoutput.convert("XVI");
        assertEquals(16, arabic);
    }
    
    
    
}
