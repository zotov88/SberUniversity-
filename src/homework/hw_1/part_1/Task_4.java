package homework.hw_1.part_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        int seconds = new Scanner(System.in).nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        System.out.printf("%d %d", hours, minutes);
    }
}
