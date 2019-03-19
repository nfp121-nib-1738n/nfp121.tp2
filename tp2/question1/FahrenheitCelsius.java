package question1;

import java.util.*;

/**
 * @author Hany Abboud
 * @version 1.0
 */
public class FahrenheitCelsius {
    
    public static void main(String[] args) {
        List FahrenheitValues = getFahrenheitValuesFromArgs(args);
        List CelsiusValues = getCelsiusValuesFromFahrenheitValues(FahrenheitValues);
        showOutput(FahrenheitValues, CelsiusValues);                                                                    
    }

    public static ArrayList<Integer> getFahrenheitValuesFromArgs(String[] args){
        ArrayList<Integer> fahrenheitValues = new ArrayList<Integer>();
        for(int i=0;i<args.length;i++){
            int fahrenheitStringToIntegerValue = Integer.parseInt(args[i]);
            fahrenheitValues.add(fahrenheitStringToIntegerValue);
        }
        return fahrenheitValues;
    }
    
    public static ArrayList<String> getCelsiusValuesFromFahrenheitValues(List FahrenheitValues){
        ArrayList<String> res = new ArrayList<String>();
        Iterator iter = FahrenheitValues.iterator();
        
        while(iter.hasNext()) {
          float floatCelsiusVal = fahrenheitEnCelsius((int) iter.next());
          floatCelsiusVal = (float) (((int) (floatCelsiusVal*10))/10.0);
          String stringCelsiusVal = floatCelsiusVal + "";
          res.add(stringCelsiusVal);
        }
        
        return res;
    }
    
    public static void showOutput(List FahrenheitValues, List CelsiusValues){
        String Arrow = " -> ";
        for(int i=0;i<FahrenheitValues.size();i++){
            String Fahrenheit = FahrenheitValues.get(i) + "\u00B0F";
            String Celsius = CelsiusValues.get(i) + "\u00B0C";
            String Line = Fahrenheit + Arrow + Celsius;
            System.out.println(Line);
        }
    }

    public static float fahrenheitEnCelsius(int f) {
        float CelsiusValue = (float) ((5 * (f - 32)) / 9.0);
        return CelsiusValue;
    }

}
