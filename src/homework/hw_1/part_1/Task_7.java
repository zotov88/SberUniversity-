package homework.hw_1.part_1;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.printf("%d%d", n % 10, n / 10);
    }
}
