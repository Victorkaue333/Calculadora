import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1, n2;
        int escolha;
        int calculo;

        System.out.println("Escolha o seu método de cálculo:");
        System.out.println("1 - Adicão");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Digite qual você quer escolher: ");
        escolha = ler.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o primeiro número: ");
                n1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                n2 = ler.nextInt();
                calculo = n1 + n2;
                System.out.println("O resultado foi: " + calculo);
                break;

            case 2:
                System.out.println("Digite o primeiro número: ");
                n1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                n2 = ler.nextInt();
                calculo = n1 - n2;
                System.out.println("O resultado foi: " + calculo);
                break;

            case 3:
                System.out.println("Digite o primeiro número: ");
                n1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                n2 = ler.nextInt();
                calculo = n1 * n2;
                System.out.println("O resultado foi: " + calculo);
                break;

            case 4:
                System.out.println("Digite o primeiro número: ");
                n1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                n2 = ler.nextInt();
                if (n2 != 0) {
                    calculo = n1 / n2;
                    System.out.println("O resultado foi: " + calculo);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        ler.close();
    }
}