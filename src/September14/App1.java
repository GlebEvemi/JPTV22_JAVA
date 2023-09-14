package September14;
import java.util.Scanner;

public class App1 {
    private final Scanner scanner;
    private boolean repeat = true;
    public App1(){
        scanner = new Scanner(System.in);

    }
    public void run(){
        do {
            System.out.println("Выберите щадачу из списка");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Демонстрация работы со строками");
            System.out.println("2. Демонстрация работы с массивами");
            System.out.print("Номер задачи: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Вы выбрали выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Вы выбрали работу со строками");
                    repeat = false;
                    break;
                case 2:
                    System.out.println("Вы выбрали работу с массивами");
                    repeat = false;
                    break;
                default:
                    System.out.println("You are stupid");
            }}while(repeat);
        }
    }
