package ReversePolish;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReversePolishTest {

    @Before
    public void setUp(){
    }

    @Test
    public void test文字列で１を入力したら数字の１を返す() {
      ReversePolish reversepolish = new ReversePolish();
      int x = reversepolish.calc("1");
      assertEquals(1, x);  
    }
    @Test 
    public void test文字列 
}
