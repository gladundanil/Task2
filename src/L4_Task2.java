import java.util.Scanner;

public class L4_Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = sc.next();

        switch (word.toLowerCase()){
            case "ясно":
                System.out.println("clear");
                break;
            case "сухо":
                System.out.println("dry");
                break;
            case "жарко":
                System.out.println("hot");
                break;
            case "солнечно":
                System.out.println("sunny");
                break;
            case "холодно":
                System.out.println("cold");
                break;
            case "облачно":
                System.out.println("cloud");
                break;
            case "ветренно":
                System.out.println("wind");
                break;
            case "мороз":
                System.out.println("frost");
                break;
            case "дождь":
                System.out.println("rain");
                break;
            case "снег":
                System.out.println("snow");
                break;
            default:
                System.out.println("В словаре нет такого слова.");
        }

    }

}
