package solution_home_work1;

import java.util.Scanner;

public class Solution7 {

    public static void name(String inputName){
        System.out.println("Привет, " + inputName);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String inputName = in.nextLine();
        name(inputName);
    }
}
