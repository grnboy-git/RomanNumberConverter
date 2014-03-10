package NewCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElementTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testコンストラクタに数字を指定してエレメントオブジェクトを作成できる() {
        Element element = new Element("5");
        assertEquals("5", element.getValue());
    }
    @Test
    public void testコンストラクタに演算子を指定してエレメントオブジェクトを作成できる(){
        Element element = new Element("*");
        assertEquals("*", element.getValue());
    }
    @Test (expected = RuntimeException.class)
    public void testコンストラクタに値が空文字だったとき例外が発生する(){
        new Element("");    
    }
    @Test
    public void testコンストラクタに数字の文字列を指定してtrueが返ってくる(){
        Element element = new Element("10"
                );
        boolean check = element.isDigit();
        assertEquals(true, check);
    }
    @Test
    public void testコンストラクタに演算子の文字列を指定した場合falseが返ってくる(){
        Element element = new Element("/");
        boolean check = element.isDigit();
        assertEquals(false, check);
        
    }
    @Test(expected =  Exception.class)
    public void testコンストラクタに数字と演算子以外の文字列を指定した場合例外が発生する(){
        new Element("Hello");
    }
    @Test(expected = Exception.class)
    public void testコンストラクタにbyeの文字列を指定した場合例外が発生する(){
        new Element("bye");
    }
}
