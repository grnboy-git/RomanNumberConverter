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
	public void test0‚½‚·0‚Í0() {
		int result = calculator.plus(0, 0);
		assertEquals(0, result);
	}
	
	@Test
	public void test‚O‘«‚·ƒ}ƒCƒiƒX‚P‚Íƒ}ƒCƒiƒX‚P(){
		int result = calculator.plus(0,-1);
		assertEquals(-1,result);
	}

	@Test
	public void test2‚Ğ‚­‚P‚Í‚P(){
		int result = calculator.minus(2,1);
		assertEquals(1,result);
	}
	@Test
	public void test‚P‚O‚O‚Oˆø‚­‚X‚X‚O(){
		int result = calculator.minus(1000,990);
		Integer intObj = Integer.valueOf(result);
		assertTrue(intObj.equals(10));
	}
	@Test
	public void test‚P‰ñ‚àŒvZ‚µ‚È‚¢‚È‚çgetcount‚Å‚O‚ª•Ô‚Á‚Ä‚­‚é(){
		int count = calculator.getCount();
		assertEquals(0,count);
	}
	@Test
	public void test‚Q‚½‚·‚R‚Ì‘«‚µZ‚µ‚½‚çgetcount‚ª‚P(){
		 calculator.plus(2,3);
		 int count = calculator.getCount();
		 assertEquals(1,count);
	}
	@Test
	public void testƒ}ƒCƒiƒX‚P‚O‚O‚©‚çƒ}ƒCƒiƒX‚T‚O‚O‚ğˆø‚«Z‚µ‚½‚çgetCount‚ª1(){
		calculator.minus(-100,-500);
		int count = calculator.getCount();
		assertEquals(1,count);
	}
	@Test
	public void test‘«‚µZ‚Æˆø‚«Z‚ğ1‰ñ‚¸‚Â‚µ‚½‚çgetCount‚ª‚Q(){
		calculator.plus(0, 0);
		calculator.minus(-100,-500);
		int count = calculator.getCount();
		assertEquals(2,count);
	}
	@Test
	public void test‘«‚µZ2‰ñˆø‚«Z3‰ñ‚µ‚½‚çgetCount‚Í5(){
		calculator.plus(1, 2);
		calculator.plus(1, 2);
		calculator.minus(3, 4);
		calculator.minus(5, 6);
		calculator.minus(5, 6);
		int count = calculator.getCount();
		assertEquals(5, count);
	}
	@Test
	public void test2‚©‚¯‚é3‚Åresult‚Í6‚ğ•Ô‚·(){
		int result = calculator.multiplay(2,3);
		assertEquals(6,result);
	}
	@Test
	public void test10‚©‚¯‚é10‚Åresult‚Í100‚ğ•Ô‚·(){
		int result = calculator.multiplay(10, 10);
		assertEquals(100,result);
	}
	public void test‚Ü‚¢‚È‚·‚Q‚©‚¯‚é‚Ü‚¢‚È‚·‚Q‚Í‚S‚ğ•Ô‚·(){
		int result = calculator.multiplay(-2, -2);
		assertEquals(4,result);
	}
	@Test
	public void test18Š„‚é3‚Í6‚ğ•Ô‚·() throws Exception{
		int result = calculator.divide(18, 3);
		assertEquals(6,result);
	}

	@Test
	public void test18Š„‚é5‚Í3‚ğ•Ô‚·() throws Exception{
		int result = calculator.divide(18,5);
		assertEquals(3,result);
	}
	@Test
	public void test0Š„‚é‚Q‚Í0‚ğ•Ô‚·() throws Exception {
		int result = calculator.divide(0, 2);
		assertEquals(0,result);		
	}
	@Test(expected = ArithmeticException.class)
	public void testƒ}ƒCƒiƒX‚PŠ„‚é0‚Í—áŠO‚ª”­¶‚·‚é() throws Exception{
		calculator.divide(-1, 0);
	}
	public void test‚Ü‚¢‚È‚·‚UŠ„‚éƒ}ƒCƒiƒX‚R‚Í‚Q‚ğ•Ô‚·() throws Exception{
		int result = calculator.divide(-6, -3);
		assertEquals(2,result);
	}
	@Test
	public void test‚UŠ„‚éƒ}ƒCƒiƒX‚Q‚Íƒ}ƒCƒiƒX‚R‚ğ•Ô‚·() throws Exception{
		int result = calculator.divide(6, -2);
		assertEquals(-3,result);
	}
	@Test
	public void testŠ„‚èZ‚ğ1‰ñ‚µ‚½‚çgetcount‚Í1‚ğ•Ô‚·() throws Exception{
		calculator.divide(4,2);
		int count = calculator.getCount();
		assertEquals(1,count);
	}
	@Test
	public void testŠ|‚¯Z‚ğ2‰ñŠ„‚èZ‚ğ2‰ñs‚¤‚ÆgetCount‚Í‚S‚ğ•Ô‚·() throws Exception{
		calculator.multiplay(2,3);
		calculator.multiplay(2,3);
		calculator.divide(4,2);
		calculator.divide(4,2);
		int count = calculator.getCount();
		assertEquals(4,count);
	}
}
