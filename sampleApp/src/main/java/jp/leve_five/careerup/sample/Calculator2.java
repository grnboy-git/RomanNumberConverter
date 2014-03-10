package jp.leve_five.careerup.sample;

import java.util.regex.Pattern;

public class Calculator2 {
     int ret ;
     char fom [] ;

    public char[] fomula(String string) {
        ret = string.length();
        fom = new char[ret];
        for (int i = 0 ; ret > i ; i++)
        fom[i] = string.charAt(i);
        return fom;
    }
    
    public void check(){
        for(int i = 0 ; i < ret ; i++ ){
            if(Pattern.matches("[0-9]*", String.valueOf(fom[i]))){
            }else if(Pattern.matches("[\\+\\-\\*\\/\\(\\)]", String.valueOf(fom[i]))){
            }else{
                throw new RuntimeException();
            }
        }
    }
//    public String[] fomula(String string) {
//        int ret = string.length();
//        String fom [] = new String[ret];
//        
//        for (int count = 0 ; ret > count ; count++)
//
//         fom[count] = string.split(count);
//         
//          return fom;
//    }
    //1•¶ŽšˆÈŠO‚Ì’l‚ð•Ô‚¹‚é‚æ‚¤‚É‚·‚é
    public char[] figureCheck() {
        
        return null;
    }

//  //”z—ñ‚ð•À‚Ñ‘Ö‚¦‚é
//    public char[] sort(char[] a) {
//       fom = new char [ret];
//        
//        return null;
//    }
    
}
