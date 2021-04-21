package solution_home_work1;

import java.util.Scanner;

public class Solution5 {


    public static void checksForAPositiveOrNegativeNumber(int number){

        if (number >= 0)
            System.out.println("Ваше число положительное");
        else
            System.out.println("Ваше число отрицательное");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();
        checksForAPositiveOrNegativeNumber(num);
    }
}
