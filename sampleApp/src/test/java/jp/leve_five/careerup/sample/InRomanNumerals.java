package jp.leve_five.careerup.sample;

public class InRomanNumerals {
    private char element;
    private char previousElement = ' ';
    
    public int inOut(String roman) {
        int Arabic = 0;
        
        Arabic = romanChangeArabic(Arabic, roman);
        if (Arabic < 1 || Arabic > 3999) {
            Arabic = 0;
            System.out.println("正しいローマ数字の記法ではありません");
        }
        return Arabic;
    }

    int romanChangeArabic(int Arabic, String roman) {
        char[] arraySmallRoman = romanChangeArray(roman);
        for (int i = arraySmallRoman.length - 1; i >= 0; i--) {
            element = arraySmallRoman[i];
            Arabic = checkCharAndCalc(Arabic, element, previousElement);
            previousElement = element;
        }
        return Arabic;
    }
    
    
    char[] romanChangeArray(String roman) {
        String smallRoman = roman.toLowerCase();
        char[] arraySmallRoman = smallRoman.toCharArray();
        return arraySmallRoman;
    }

    int checkCharAndCalc(int arabic, char element, char previousElement) {
        switch(element){
        case 'i':
            arabic = iCheck(arabic, previousElement);
            break;
        case 'v':
            arabic = vCheck(arabic);
            break;
        case 'x':
            arabic = xCheck(arabic, previousElement);
            break;
        case 'l':
            arabic = lCheck(arabic);
            break;
        case 'c':
            arabic = cCheck(arabic, previousElement);
            break;
        case 'd':
            arabic = dCheck(arabic);
            break;
        case 'm':
            arabic = mCheck(arabic);
            break;
        default:
            arabic -= 4000;
        }
        return arabic;
    }
    
    int iCheck(int arabic, char previousElement){
        if (arabic <= 2) {
            arabic += 1;
        }else if ('v' == previousElement || 'x' == previousElement) {
            arabic -= 1;
        }else{
            arabic -= 4000;
        }
        return arabic;
    }
    
    int vCheck(int arabic){
            if (arabic <= 3) {
                arabic += 5;
            }else{
                arabic -= 4000;
            }
            return arabic;
    }
    
    int xCheck(int arabic, char previousElement){
        if (arabic <= 29) {
            arabic += 10;
        }else if ('l' == previousElement || 'c' == previousElement) {
            arabic -= 10;
        }else{
            arabic -= 4000;
        }
        return arabic;
    }
    
    int lCheck(int arabic){
        if(arabic <= 39) {
            arabic += 50;
        }else{
            arabic -= 4000;
        }
        return arabic;
    }
    
    int cCheck(int arabic, char previousElement){
        if(arabic <= 299) {
            arabic += 100;
        }else if ('d' == previousElement || 'm' == previousElement) {
            arabic -= 100;
        }else{
            arabic -= 4000;
        }
        return arabic;
    }
    
    int dCheck(int arabic){
        if(arabic <= 399) {
            arabic += 500;
        }else{
            arabic -= 4000;
        }
        return arabic;
    }
    int mCheck(int arabic){
        if(arabic <= 2999) {
            arabic += 1000;
        }else{
            arabic -= 4000;
        }
        return arabic;
    }
}