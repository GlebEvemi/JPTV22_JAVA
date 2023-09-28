package September21;

import java.util.Scanner;

public class Task21 {
    Scanner scanner = new Scanner(System.in);

    public String start() {
        System.out.print("Введите трехзначное число:");
        int task = scanner.nextInt();
        int unit = task % 10;
        task = task / 10;
        System.out.println("Число едениц = " + unit);
        int tens = task % 10;
        task = task / 10;
        System.out.println("Число десяток = " + tens);
        int hundr = task % 10;
        System.out.println("Число соток = " + hundr);
        int sum = unit + tens + hundr;
        String answer = String.valueOf(sum);

        return "Сумма чисел = " + answer;



    }

}
