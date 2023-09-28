package September21;

import java.util.Scanner;


public class Temp {
    private Scanner scanner;

    public void run() {
        this.scanner = new Scanner(System.in);
        System.out.println("1: Exit");
        System.out.println("2: Цельсий -> Фаренгейт");
        System.out.println("3: Фаренгейт -> Цельсий");
        int task = this.scanner.nextInt();
        scanner.nextLine();
        switch (task) {
            case 1:
                System.out.println("Artjom gay");
                break;
            case 2:
                System.out.println("Artjom x2 gay");
                break;
            case 3:
                System.out.println("Artjom x3 gay");
                break;
            default:
                System.out.println("Go fuck yourself");
        }


    }


}
