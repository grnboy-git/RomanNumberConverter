package NewCalculator;

//import java.util.ArrayList;

public class Element {
    private String element;
    
//   public Element(String string){
//        switch(string){
//        case "\\d+" :
//            break;
//        case "+" :
//            break;
//        case "-":
//            break;
//        case "*":
//            break;
//        case "/":
//            break;
//        case "(":
//            break;
//        case ")":
//            break;
//        default:
//            throw new RuntimeException();
//        }
//        element = string;
//    }

    public String getValue() {
        return element;
    }
    public boolean isDigit(){
            try {
                Integer.parseInt(element);
                return true;
            } catch(NumberFormatException e) {
                return false;
            }       
    }

    }

