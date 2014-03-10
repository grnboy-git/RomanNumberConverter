package jp.leve_five.careerup.sample;

public class InArabicNumber {
    private StringBuilder romanStringBuilder = new StringBuilder("");

    public String inOut(int arabic) {
        String roman;
        if (arabic < 1 || arabic > 3999) {
            roman = "";
            return roman;
        }

        roman = changeRomanToArabic(arabic);

        return roman;
    }

    String changeRomanToArabic(int arabic) {
        addArabicToRomanStringBuilder(makeArrayOfInt(arabic));
        String roman = romanStringBuilder.toString();

        return roman;
    }

    int[] makeArrayOfInt(int arabic) {
        int element = 0;
        int index = 1;

        for (int x = 10; arabic >= x; x *= 10) {
            index++;
        }

        int[] arrayArabic = new int[index];

        for (index = 0; arrayArabic.length > index; index++) {
            int divisors = 10;
            element = arabic % divisors;
            arabic -= element;
            arabic /= 10;
            arrayArabic[index] = element;
        }
        return arrayArabic;
    }

    void addArabicToRomanStringBuilder(int[] arrayArabic) {
        for (int index = arrayArabic.length - 1; 0 <= index; index--) {
            checkPosition(arrayArabic[index], index);
        }
    }

    void checkPosition(int element, int index) {
        switch (index) {
        case 0:
            if (element != 0) {
                oneDigit(element);
            }
            break;
        case 1:
            if (element != 0) {
                doubleDigit(element);
            }
            break;
        case 2:
            if (element != 0) {
                threeDigit(element);
            }
            break;
        case 3:
            fourDigit(element);
            break;
        }

    }

    void fourDigit(int element) {
        switch (element) {
        case 3:
            romanStringBuilder.append("M");
        case 2:
            romanStringBuilder.append("M");
        case 1:
            romanStringBuilder.append("M");
            break;
        }
    }

    void threeDigit(int element) {
        switch (element) {
        case 3:
            romanStringBuilder.append("C");
        case 2:
            romanStringBuilder.append("C");
        case 1:
            romanStringBuilder.append("C");
            break;
        case 4:
            romanStringBuilder.append("CD");
            break;
        case 5:
            romanStringBuilder.append("D");
            break;
        case 6:
            romanStringBuilder.append("DC");
            break;
        case 7:
            romanStringBuilder.append("DCC");
            break;
        case 8:
            romanStringBuilder.append("DCC");
            break;
        case 9:
            romanStringBuilder.append("CM");
            break;
        }
    }

    void doubleDigit(int element) {
        switch (element) {
        case 3:
            romanStringBuilder.append("X");
        case 2:
            romanStringBuilder.append("X");
        case 1:
            romanStringBuilder.append("X");
            break;
        case 4:
            romanStringBuilder.append("XL");
            break;
        case 5:
            romanStringBuilder.append("L");
            break;
        case 6:
            romanStringBuilder.append("LX");
            break;
        case 7:
            romanStringBuilder.append("LXX");
            break;
        case 8:
            romanStringBuilder.append("LXXX");
            break;
        case 9:
            romanStringBuilder.append("XC");
            break;
        }
    }

    void oneDigit(int element) {
        switch (element) {
        case 3:
            romanStringBuilder.append("I");
        case 2:
            romanStringBuilder.append("I");
        case 1:
            romanStringBuilder.append("I");
            break;
        case 4:
            romanStringBuilder.append("IV");
            break;
        case 5:
            romanStringBuilder.append("V");
            break;
        case 6:
            romanStringBuilder.append("VI");
            break;
        case 7:
            romanStringBuilder.append("VII");
            break;
        case 8:
            romanStringBuilder.append("VIII");
            break;
        case 9:
            romanStringBuilder.append("IX");
            break;
        }
    }

}