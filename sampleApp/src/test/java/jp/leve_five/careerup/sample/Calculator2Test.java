package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Calculator2Test {

    @Before
    public void setUp()throws Exception{}
    Calculator2 string =  new Calculator2();
    

    @Test
    public void test•¶š—ñ‚Å‚Pƒvƒ‰ƒX‚Q‚ğ“ü—Í‚·‚é‚Æ”z—ñ‚Å‚Pƒvƒ‰ƒX‚Q‚ª•Ô‚Á‚Ä‚­‚é(){
        char[] fomula = string.fomula("1+2");
        assertEquals('1', fomula[0]);
        assertEquals('+', fomula[1]);
        assertEquals('2', fomula[2]);
    }
    
    @Test(expected = RuntimeException.class)
    public void test”š‚â‰‰ZqˆÈŠO‚Ì•¶š‚ª“ü—Í‚³‚ê‚½‚çexception‚ğ•Ô‚·(){
       string.fomula("‚ ");
       string.check();
    }
    
    @Test
    public void test¬Š‡ŒÊ‚ğ“n‚µ‚Ä‚à—áŠO‚É‚È‚ç‚È‚¢(){
        string.fomula("(1+2)");
        string.check();
    }
    @Test
    public void test‚P‚Qƒvƒ‰ƒX‚R‚P‚ğ“ü—Í‚·‚é‚Æ‚P‚Qƒvƒ‰ƒX‚R‚P‚Ì‡‚Å•Ô‚Á‚Ä‚­‚é(){
        string.fomula("12+31");
        char[] fomula2 = string.figureCheck();
        assertEquals(12, fomula2[0]);
        assertEquals('+', fomula2[1]);
        assertEquals(31, fomula2[2]);
    }

//    @Test
//    public void test‚Pƒvƒ‰ƒX‚Q‚ğ“ü—Í‚·‚é‚Æ‚P‚Qƒvƒ‰ƒX‚Ì‡‚Å•Ô‚Á‚Ä‚­‚é(){
//        char[] fomula = string.fomula("1+2");
//        char[] fomula2 = string.sort(fomula);
//        assertEquals('1', fomula2[0]);
//        assertEquals('2', fomula2[1]);
//        assertEquals('+', fomula2[2]);
//        
//    }
  
}
