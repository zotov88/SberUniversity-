package homework.hw_1.part_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2));
    }
}
