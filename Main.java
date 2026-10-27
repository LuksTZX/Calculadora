import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static int lerInt() {
        while (true) {
            try {
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas numeros inteiros!");
                sc.nextLine();
            }
        }
    }

    public static double lerDouble() {
        while (true) {
            try {
                double numero = sc.nextDouble();
                sc.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas numeros!");
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("Qual tipo de conta voce quer?");
            System.out.println("1 - Adição, 2 - Subtração, 3 - Divisão, 4 - Multiplicação e outras, 5 - Sair");
            opcao = lerInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite 2 numeros para a adição");
                    int a = lerInt();
                    int b = lerInt();
                    System.out.println("A soma de " + a + " + " + b + " é igual a " + (a + b));
                    break;

                case 2:
                    System.out.println("Digite 2 numeros para a subtração");
                    int a1 = lerInt();
                    int b1 = lerInt();
                    System.out.println("A subtração de " + a1 + " - " + b1 + " é igual a " + (a1 - b1));
                    break;

                case 3:
                    System.out.println("Digite 2 numeros para a divisão");
                    int a2 = lerInt();
                    int b2 = lerInt();
                    if (b2 != 0) {
                        System.out.println("A divisão de " + a2 + " ÷ " + b2 + " é igual a " + (a2 / b2));
                        System.out.println("O resto da divisão é: " + (a2 % b2));
                    } else {
                        System.out.println("Nao existe divisao por zero");
                    }
                    break;

                case 4:
                    int opcao1;
                    do {
                        System.out.println("1 - Multiplicação, 2 - Raiz Quadrada, 3 - Raiz Cubica, 4 - Potencia, 5 - Voltar");
                        opcao1 = lerInt();

                        switch (opcao1) {
                            case 1:
                                System.out.println("Digite 2 numeros para a multiplicação");
                                int a3 = lerInt();
                                int b3 = lerInt();
                                System.out.println("A multiplicação de " + a3 + " X " + b3 + " é igual a " + (a3 * b3));
                                break;

                            case 2:
                                System.out.println("Digite o numero para a raiz quadrada");
                                double a4 = lerDouble();
                                if (a4 >= 0) {
                                    System.out.println("A raiz quadrada de " + a4 + " é " + Math.sqrt(a4));
                                } else {
                                    System.out.println("Não existe raiz quadrada de numero negativo");
                                }
                                break;

                            case 3:
                                System.out.println("Digite o numero para a raiz cubica");
                                double a5 = lerDouble();
                                System.out.println("A raiz cubica de " + a5 + " é " + Math.cbrt(a5));
                                break;

                            case 4:
                                System.out.println("Digite a base e o expoente");
                                double base = lerDouble();
                                double expoente = lerDouble();
                                System.out.println("O resultado é " + Math.pow(base, expoente));
                                break;

                            case 5:
                                System.out.println("Voltando....");
                                break;

                            default:
                                System.out.println("Opção invalida!");
                                break;
                        }
                    } while (opcao1 != 5);
                    break;

                case 5:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opcao != 5);
    }
}