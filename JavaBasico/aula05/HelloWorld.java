import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Escolha o operador (+, -, *, /): ");
        String operador = scanner.next();

        double resultado = 0.0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = (double) num1 / num2;
                break;
            default:
                System.out.println("Operador invalido.");
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close(); // Fechar o scanner após o uso
    }
}
