import java.util.Scanner;

public class L4_Task3 {

    public static void main(String[] args) {

        int operand1 = 5;
        int operand2 = 4;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите знак: ");
        String sign = sc.next();

        switch (sign){
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.println(operand1-operand2);
                break;
            case "*":
                System.out.println(operand1*operand2);
                break;
            case "/":

                if (operand2 == 0){
                    System.out.println("Деление на 0 невозможно");
                    break;
                }

                System.out.println((double)operand1 / operand2);
                break;
            default:
                System.out.println("Неизвестная операция");
        }

    }

}
