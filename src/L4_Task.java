import java.util.Scanner;

public class L4_Task {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите y: ");
        int y = sc.nextInt();

        System.out.print("Введите х: ");
        int x = sc.nextInt();

        if (x == 0 || y == 0) {
            System.out.println("Невозможно определить");
        } else {

            if (x > 0) {
                if(y > 0) {
                    System.out.println("Четверть 1");
                }else {
                    System.out.println("Четверть 4");
                }

            }else {
                if(y > 0) {
                    System.out.println("Четверть 2");
                }else {
                    System.out.println("Четверть 3");
                }
            }

        }


    }

}
