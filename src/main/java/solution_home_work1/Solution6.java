package solution_home_work1;

import java.util.Scanner;

public class Solution6 {
    public static boolean checksForAPositiveOrNegativeNumber(int number){

        if (number >= 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа выводит true, если число отрицательное, и false если положительное");
        System.out.print("Введите целое число: ");
        int num = in.nextInt();
        System.out.println(checksForAPositiveOrNegativeNumber(num));

    }
}
