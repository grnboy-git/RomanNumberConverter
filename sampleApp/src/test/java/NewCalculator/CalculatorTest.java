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
    public void test文字の１を入力したら１が配列に入った状態で返ってくる(){
        String[] answer = newcalculator.listTransform("1");
        assertEquals(1, answer.length);
        assertEquals("1", answer[0]);
    }
    
    @Test
    public void test算術記号の文字列プラスを入れたときプラスという文字列の要素が入っている配列が返ってくる(){
        String[] answer = newcalculator.listTransform("+");
        assertEquals(1, answer.length);
        assertEquals("+", answer[0]);
    }
    @Test
    public void test文字列３とスペースで空白を入力してから記号マイナスを入れた時３とマイナスの文字列要素が入っている配列が返ってくる(){
        String[] answer = newcalculator.listTransform("3 -");
        assertEquals(2, answer.length);
        assertEquals("3", answer[0]);
        assertEquals("-", answer[1]);
    }
   @Test
   public void test3タブ記号マイナス記号３を入力したときでも３マイナス記号が配列に入って返ってくる(){
       String[] answer = newcalculator.listTransform("3 -");
       assertEquals(2, answer.length);
       assertEquals("3", answer[0]);
       assertEquals("-", answer[1]);
   }
     @Test
     public void test１プラス２の文字列を入力した時１２プラスの順に配列に入って返ってくる(){
        String[] answer = newcalculator.listArrange(new String[]{"1", "+", "2"});
        assertEquals("1", answer[0]);
        assertEquals("2", answer[1]);
        assertEquals("+", answer[2]);
     }
     @Test
     public void test１０かける２０の文字列を入力した時１０２０かけるの順に配列に入って返ってくる(){
         String[] answer = newcalculator.listArrange(new String[]{"10", "*", "20"});
         assertEquals("10", answer[0]);
         assertEquals("20", answer[1]);
         assertEquals("*", answer[2]);
     }
     @Test
     public void test１０かける２０プラス３０の文字列を入力したとき１０２０かける３０プラスが順に入った配列が返ってくる(){
         String[] answer = newcalculator.listArrange(new String[]{"10", "*", "20", "+", "30"});
         assertEquals("10", answer[0]);
         assertEquals("20", answer[1]);
         assertEquals("*", answer[2]);
         assertEquals("30", answer[3]);
         assertEquals("+", answer[4]);
         }
     @Test 
     public void test１０ぷらす２０かける３０の文字列を入たとき１０２０３０かけるぷらすの順に入った配列が返ってくる(){
         String[] answer = newcalculator.listArrange(new String[]{"10", "+", "20", "*", "30"});
         assertEquals("10", answer[0]);
         assertEquals("20", answer[1]);
         assertEquals("30", answer[2]);
         assertEquals("*", answer[3]);
         assertEquals("+", answer[4]);
     }
}
