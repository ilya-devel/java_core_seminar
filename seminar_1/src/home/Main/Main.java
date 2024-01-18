package home.Main;

import home.math.*;

public class Main {
    
    /** 
     * @param args list arguments
     */
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 7;
        System.out.println(MathOperation.add(a,b));
        System.out.println(MathOperation.div(a,b));
        System.out.println(MathOperation.mult(a,b));
        System.out.println(MathOperation.delim(a,b));
    }
}
