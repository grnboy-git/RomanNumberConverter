package jp.leve_five.careerup.sample;

public class Stack {
    private int count = 0;

    private int[] pushArray;
    
    public Stack(int length){
        pushArray = new int[length];
    }
  
    public Stack(){
        pushArray = new int[10];
    }
    public int getCount() {
        return count;
    }

    public void push(int v1) {
        pushArray[count] = v1;
        count++;
    }

    public int pop() {
        count--;

        return pushArray[count];
    }

}
