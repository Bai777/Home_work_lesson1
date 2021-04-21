package solution_home_work1;

import java.util.Scanner;

public class Solution4 {
    private static int oneNumber = 16;
    private static int twoNumber = 5;

    public static boolean sumNumbers(int firstNum, int secondNum){
        int result = firstNum + secondNum;
        if (result >= 10 && result <= 20){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа диапазона суммы чисел)\nЕсли число лежиит в пределах от 10 до 20 (включительно),\nесли да – вернётся true, в противном случае – false");
        System.out.print("Введите первое число число: ");
        int firstNum = in.nextInt();
        System.out.print("Введите второе число число: ");
        int secondNum = in.nextInt();


        System.out.println(sumNumbers(firstNum, secondNum));
    }
}
