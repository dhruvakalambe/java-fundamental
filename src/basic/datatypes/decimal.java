package basic.datatypes;

import org.w3c.dom.ls.LSOutput;

import java.time.chrono.MinguoEra;

public class decimal {
    public static void main(String[] args) {
        float sal1 = 101.256789541f;
        double sal2 = 101.245698412236844565;
        System.out.println(sal1);
        System.out.println(sal2);
        //Showing the min and max values of float and double
        float floatmin = Float.MIN_VALUE;
        float floatmax = Float.MAX_VALUE;
        System.out.println(floatmin+"\n"+floatmax);
        double doublemin = Double.MIN_VALUE;
        double doublemax = Double.MAX_VALUE;
        System.out.println(doublemin + "\n" + doublemax);
    }
}
