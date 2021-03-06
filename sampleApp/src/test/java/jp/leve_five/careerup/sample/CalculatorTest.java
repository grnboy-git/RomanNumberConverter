package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator = null;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void test0たす0は0() {
		int result = calculator.plus(0, 0);
		assertEquals(0, result);
	}
	
	@Test
	public void test０足すマイナス１はマイナス１(){
		int result = calculator.plus(0,-1);
		assertEquals(-1,result);
	}

	@Test
	public void test2ひく１は１(){
		int result = calculator.minus(2,1);
		assertEquals(1,result);
	}
	@Test
	public void test１０００引く９９０(){
		int result = calculator.minus(1000,990);
		Integer intObj = Integer.valueOf(result);
		assertTrue(intObj.equals(10));
	}
	@Test
	public void test１回も計算しないならgetcountで０が返ってくる(){
		int count = calculator.getCount();
		assertEquals(0,count);
	}
	@Test
	public void test２たす３の足し算したらgetcountが１(){
		 calculator.plus(2,3);
		 int count = calculator.getCount();
		 assertEquals(1,count);
	}
	@Test
	public void testマイナス１００からマイナス５００を引き算したらgetCountが1(){
		calculator.minus(-100,-500);
		int count = calculator.getCount();
		assertEquals(1,count);
	}
	@Test
	public void test足し算と引き算を1回ずつしたらgetCountが２(){
		calculator.plus(0, 0);
		calculator.minus(-100,-500);
		int count = calculator.getCount();
		assertEquals(2,count);
	}
	@Test
	public void test足し算2回引き算3回したらgetCountは5(){
		calculator.plus(1, 2);
		calculator.plus(1, 2);
		calculator.minus(3, 4);
		calculator.minus(5, 6);
		calculator.minus(5, 6);
		int count = calculator.getCount();
		assertEquals(5, count);
	}
	@Test
	public void test2かける3でresultは6を返す(){
		int result = calculator.multiplay(2,3);
		assertEquals(6,result);
	}
	@Test
	public void test10かける10でresultは100を返す(){
		int result = calculator.multiplay(10, 10);
		assertEquals(100,result);
	}
	public void testまいなす２かけるまいなす２は４を返す(){
		int result = calculator.multiplay(-2, -2);
		assertEquals(4,result);
	}
	@Test
	public void test18割る3は6を返す() throws Exception{
		int result = calculator.divide(18, 3);
		assertEquals(6,result);
	}

	@Test
	public void test18割る5は3を返す() throws Exception{
		int result = calculator.divide(18,5);
		assertEquals(3,result);
	}
	@Test
	public void test0割る２は0を返す() throws Exception {
		int result = calculator.divide(0, 2);
		assertEquals(0,result);		
	}
	@Test(expected = ArithmeticException.class)
	public void testマイナス１割る0は例外が発生する() throws Exception{
		calculator.divide(-1, 0);
	}
	public void testまいなす６割るマイナス３は２を返す() throws Exception{
		int result = calculator.divide(-6, -3);
		assertEquals(2,result);
	}
	@Test
	public void test６割るマイナス２はマイナス３を返す() throws Exception{
		int result = calculator.divide(6, -2);
		assertEquals(-3,result);
	}
	@Test
	public void test割り算を1回したらgetcountは1を返す() throws Exception{
		calculator.divide(4,2);
		int count = calculator.getCount();
		assertEquals(1,count);
	}
	@Test
	public void test掛け算を2回割り算を2回行うとgetCountは４を返す() throws Exception{
		calculator.multiplay(2,3);
		calculator.multiplay(2,3);
		calculator.divide(4,2);
		calculator.divide(4,2);
		int count = calculator.getCount();
		assertEquals(4,count);
	}
}
