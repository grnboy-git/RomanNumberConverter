package NewCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator newcalculator;
 
    @Before
    public void setUp(){
        newcalculator = new Calculator();
    }
    @Test
    public void test•¶š‚Ì‚P‚ğ“ü—Í‚µ‚½‚ç‚P‚ª”z—ñ‚É“ü‚Á‚½ó‘Ô‚Å•Ô‚Á‚Ä‚­‚é(){
        String[] answer = newcalculator.listTransform("1");
        assertEquals(1, answer.length);
        assertEquals("1", answer[0]);
    }
    
    @Test
    public void testZp‹L†‚Ì•¶š—ñƒvƒ‰ƒX‚ğ“ü‚ê‚½‚Æ‚«ƒvƒ‰ƒX‚Æ‚¢‚¤•¶š—ñ‚Ì—v‘f‚ª“ü‚Á‚Ä‚¢‚é”z—ñ‚ª•Ô‚Á‚Ä‚­‚é(){
        String[] answer = newcalculator.listTransform("+");
        assertEquals(1, answer.length);
        assertEquals("+", answer[0]);
    }
    @Test
    public void test•¶š—ñ‚R‚ÆƒXƒy[ƒX‚Å‹ó”’‚ğ“ü—Í‚µ‚Ä‚©‚ç‹L†ƒ}ƒCƒiƒX‚ğ“ü‚ê‚½‚R‚Æƒ}ƒCƒiƒX‚Ì•¶š—ñ—v‘f‚ª“ü‚Á‚Ä‚¢‚é”z—ñ‚ª•Ô‚Á‚Ä‚­‚é(){
        String[] answer = newcalculator.listTransform("3 -");
        assertEquals(2, answer.length);
        assertEquals("3", answer[0]);
        assertEquals("-", answer[1]);
    }
   @Test
   public void test3ƒ^ƒu‹L†ƒ}ƒCƒiƒX‹L†‚R‚ğ“ü—Í‚µ‚½‚Æ‚«‚Å‚à‚Rƒ}ƒCƒiƒX‹L†‚ª”z—ñ‚É“ü‚Á‚Ä•Ô‚Á‚Ä‚­‚é(){
       String[] answer = newcalculator.listTransform("3 -");
       assertEquals(2, answer.length);
       assertEquals("3", answer[0]);
       assertEquals("-", answer[1]);
   }
     @Test
     public void test‚Pƒvƒ‰ƒX‚Q‚Ì•¶š—ñ‚ğ“ü—Í‚µ‚½‚P‚Qƒvƒ‰ƒX‚Ì‡‚É”z—ñ‚É“ü‚Á‚Ä•Ô‚Á‚Ä‚­‚é(){
        String[] answer = newcalculator.listArrange(new String[]{"1", "+", "2"});
        assertEquals("1", answer[0]);
        assertEquals("2", answer[1]);
        assertEquals("+", answer[2]);
     }
     @Test
     public void test‚P‚O‚©‚¯‚é‚Q‚O‚Ì•¶š—ñ‚ğ“ü—Í‚µ‚½‚P‚O‚Q‚O‚©‚¯‚é‚Ì‡‚É”z—ñ‚É“ü‚Á‚Ä•Ô‚Á‚Ä‚­‚é(){
         String[] answer = newcalculator.listArrange(new String[]{"10", "*", "20"});
         assertEquals("10", answer[0]);
         assertEquals("20", answer[1]);
         assertEquals("*", answer[2]);
     }
     @Test
     public void test‚P‚O‚©‚¯‚é‚Q‚Oƒvƒ‰ƒX‚R‚O‚Ì•¶š—ñ‚ğ“ü—Í‚µ‚½‚Æ‚«‚P‚O‚Q‚O‚©‚¯‚é‚R‚Oƒvƒ‰ƒX‚ª‡‚É“ü‚Á‚½”z—ñ‚ª•Ô‚Á‚Ä‚­‚é(){
         String[] answer = newcalculator.listArrange(new String[]{"10", "*", "20", "+", "30"});
         assertEquals("10", answer[0]);
         assertEquals("20", answer[1]);
         assertEquals("*", answer[2]);
         assertEquals("30", answer[3]);
         assertEquals("+", answer[4]);
         }
     @Test 
     public void test‚P‚O‚Õ‚ç‚·‚Q‚O‚©‚¯‚é‚R‚O‚Ì•¶š—ñ‚ğ“ü‚½‚Æ‚«‚P‚O‚Q‚O‚R‚O‚©‚¯‚é‚Õ‚ç‚·‚Ì‡‚É“ü‚Á‚½”z—ñ‚ª•Ô‚Á‚Ä‚­‚é(){
         String[] answer = newcalculator.listArrange(new String[]{"10", "+", "20", "*", "30"});
         assertEquals("10", answer[0]);
         assertEquals("20", answer[1]);
         assertEquals("30", answer[2]);
         assertEquals("*", answer[3]);
         assertEquals("+", answer[4]);
     }
}
