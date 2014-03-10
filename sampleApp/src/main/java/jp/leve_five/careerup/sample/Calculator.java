package jp.leve_five.careerup.sample;

public class Calculator {
	private int count = 0;
	
	public int plus(int v1, int v2) {
		try {
			return calculate(v1, v2, new PlusOperator());
		} catch (Exception e) {
			return 0;
		}
	}
	public int minus(int v1,int v2) {
		try {
			return calculate(v1, v2, new MinusOperator());
		} catch (Exception e) {
			return 0;
		}
	}
	public int getCount(){
		return count;
	}
	public int multiplay(int v1,int v2) {
		try {
			return calculate(v1, v2, new MultiPlayOperator());
		} catch (Exception e) {
			return 0;
		}
	}
	
	public int divide(int v1,int v2) throws Exception {
		return calculate(v1,v2, new DivideOperator());
	}
	private int calculate(int v1, int v2, Operator operator) throws Exception {
		++count;
		return operator.calculate(v1, v2);
	}

    }


interface Operator {
	public int calculate(int v1, int v2) ;
}

class PlusOperator implements Operator {
	public int calculate(int v1, int v2)  {
		return v1 + v2;
	}
}

class MinusOperator implements Operator {
	public int calculate(int v1, int v2) {
		return v1 - v2;
	}
}
class MultiPlayOperator implements Operator{
	public int calculate(int v1, int v2) {
		return v1 * v2;
	}
}
class DivideOperator implements Operator{
	public int calculate(int v1, int v2) {
		return v1 / v2;
	}
}