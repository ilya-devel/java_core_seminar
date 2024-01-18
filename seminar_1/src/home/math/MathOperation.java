package home.math;

public class MathOperation {
    
    /** 
     * @param a integer number
     * @param b integer number
     * @return Integer
     */
    public static Integer add(Integer a, Integer b){
        return a + b;
    }
    
    /** 
     * @param a integer number
     * @param b integer number
     * @return Integer
     */
    public static Integer div(Integer a, Integer b){
        return a - b;
    }
    
    /** 
     * @param a integer number
     * @param b integer number
     * @return Integer
     */
    public static Integer mult(Integer a, Integer b){
        return a * b;
    }
    
    /** 
     * @param a integer number
     * @param b integer number
     * @return Double
     */
    public static Double delim(Integer a, Integer b){
        return Double.valueOf(a) / b;
    }
}
