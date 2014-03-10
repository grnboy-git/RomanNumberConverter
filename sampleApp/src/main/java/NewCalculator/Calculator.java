package NewCalculator;

import java.util.ArrayList;


public class Calculator {
    public int length;
    
    public String[] listTransform(String fomula){
        String[] s = fomula.split("\\s");
        return s;
        
    }
      public String[] listArrange(String[] arrange){
          String[] sort = arrange;
          String c;
          c = sort[1];
          sort[1] = sort[2];
          sort[2] = c;
          
         if(sort.length >= 4 ){
          String d = sort[3];
          sort[3] = sort[4];
          sort[4] = d;
          }
         
         ArrayList <String> sortArray = new ArrayList<String>(arrange.length);
         
          return sort;
      }
//      public String checker(String[] sort){
//          String check ;
//          
//          return check;
//          
//      }
    

}



