package solution_home_work1;

import java.util.Scanner;

public class Solution8 {

    public static void leapYearOrNot(int year){
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }

    public static void main(String[] args) {
        System.out.println("Программа проверяет високосный год или нет");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год для проверки: ");
        leapYearOrNot(in.nextInt());
    }
}
