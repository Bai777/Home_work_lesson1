package solution_home_work1;

import java.text.DecimalFormat;

public class Solution_1_2_3 {
    boolean valTrue = true;
    boolean valFalse = false;

    byte valByte = 110;
    short valShort = 30000;
    int valInt = 500;
    long valLong = 100_000;
    double valDouble = 45.38;
    char valChar = 'f';


    private static float isLong = 34.54F;
    private static   float height = 2.8F;
    private static float width = 50.2F;
    private static float weight = 10.20F;


    public static float floatComputation(float a, float b, float c, float d){
        float result = a * (b + (c / d));
        return result;
    }

    public static void main(String[] args) {
        float returnResult = floatComputation(isLong, height, width, weight);
        String formattedFloat = new DecimalFormat("#0.00").format(returnResult);
        System.out.println(formattedFloat);
    }
}
