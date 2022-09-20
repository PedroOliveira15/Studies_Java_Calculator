import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int i = 1;
        while (i != 0){
            System.out.println("Digite o primeiro numero: ");
            Scanner a = new Scanner(System.in);
            Double num1 = a.nextDouble();

            System.out.println("Digite o segundo numero: ");
            Scanner b = new Scanner(System.in);
            Double num2 = a.nextDouble();

            System.out.println("Digite a opereção: ");
            Scanner op = new Scanner(System.in);
            String op1 = op.next();

            Operations operations = new Operations();
            if ("+".equals(op1)) {
                System.out.println(operations.sum(num1, num2));
            } else if ("-".equals(op1)) {
                System.out.println(operations.sub(num1, num2));
            } else if ("*".equals(op1)) {
                System.out.println(operations.multiply(num1, num2));
            } else if ("/".equals(op1)) {
                System.out.println(operations.division(num1, num2));
            }

            System.out.println("Deseja sair? Digite 0. ");
            Scanner out = new Scanner(System.in);
            i = out.nextInt();
        }


    }
}
