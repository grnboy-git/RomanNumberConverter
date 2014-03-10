package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class StackTest {
    private Stack stack = null;
    private Stack stack5 = null;

    @Before
    public void setUp() {
        stack = new Stack();
        stack5 = new Stack(5);
    }

    @Test
    public void test‰Šúó‘Ô‚Å‚ÍgetCount‚Í0‚ğ•Ô‚·() {
        int count = stack.getCount();
        assertEquals(0, count);
    }

    @Test
    public void test®”3‚ğ‚P‚Â’Ç‰Á‚·‚é‚µ‚½‚çgetCount‚Í‚P‚ğ•Ô‚·() {
        stack.push(3);
        int count = stack.getCount();
        assertEquals(1, count);
    }

    @Test
    public void testpush‚Q‰ñÀs‚É‘Î‚µ‚Äpop‚ªˆê‰ñÀs‚³‚ê‚½ê‡‚ÍgetCount‚ª‚P‚ğ•Ô‚·() {
        stack.push(1);
        stack.push(2);
        int pop = stack.pop();
        int count = stack.getCount();
        assertEquals(2, pop);
        assertEquals(1, count);
    }

    @Test
    public void testpush‚É‚R‚Æ‚S‚Ì‡”Ô‚Å’l‚ğ“n‚µ‚½‚çpop‚Å‚S‚Æ‚R‚Ì‡”Ô‚Å•Ô‚Á‚Ä‚­‚é() {
        stack.push(3);
        stack.push(4);
        int pop = stack.pop();
        assertEquals(4, pop);
        pop = stack.pop();
        assertEquals(3, pop);
    }

    @Test
    public void testpush‚É‚T‚Æ‚U‚Æ‚V‚Ì‡”Ô‚Å’l‚ğ“n‚µ‚½‚çpop‚Å‚V‚Æ‚U‚Æ‚T‚Ì‡”Ô‚Å•Ô‚Á‚Ä‚­‚é() {
        stack.push(5);
        stack.push(6);
        stack.push(7);
        int pop = stack.pop();
        assertEquals(7, pop);

        pop = stack.pop();
        assertEquals(6, pop);
        pop = stack.pop();
        assertEquals(5, pop);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test—v‘f‚ª‹ó‚Ì‚Æ‚«‚Épop‚ğÀs‚µ‚½‚ç—áŠO‚ª”­¶‚·‚é() {
        stack.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testpush‚ÅƒXƒ^ƒbƒN‚Ì—v—Ì‚ğ’´‚¦‚½—áŠO‚ª”­¶‚·‚é() {

        for (int i = 0; i < 11; i++) {
            stack.push(1);
        }
    }

    @Test
    public void testStack‚Ì—v‘f”‚ğ5‚É‚µ‚Ä—v‘f”‚à‚TŒÂ“ü‚é() {
        stack5.push(1);
        stack5.push(2);
        stack5.push(3);
        stack5.push(4);
        stack5.push(5);
        assertTrue(true);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testStack‚Ì—v‘f”‚ğ‚T‚É‚µ‚Ä—v‘f”‚ğ‚UŒÂ“ü‚ê‚é‚Æ—áŠO‚ª”­¶‚·‚é() {
        stack5.push(1);
        stack5.push(2);
        stack5.push(3);
        stack5.push(4);
        stack5.push(5);
        stack5.push(6);
    }

}
