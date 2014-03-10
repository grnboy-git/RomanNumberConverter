import jp.leve_five.careerup.sample.InArabicNumber;
import jp.leve_five.careerup.sample.InRomanNumerals;

public class InputOutput {

    String convert(int arabic){
        InArabicNumber inArabicNumber = new InArabicNumber();
        String roman = inArabicNumber.inOut(arabic);
        return roman;
    }
    
    int convert(String roman){
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int arabic = inRomanNumerals.inOut(roman);
        return arabic;
    }
}
