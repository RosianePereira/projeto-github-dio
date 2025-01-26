package br.com.pesoideal;

import java.util.Scanner;

public class PesoIdealApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando a classe PesoIdeal para reutilização
        PesoIdeal pesoIdeal = new PesoIdeal();

        // Loop para permitir vários testes
        while (true) {
            System.out.println("Digite a altura (em metros) ou 'sair' para encerrar: ");
            String inputAltura = scanner.nextLine();

            // Verifica se o usuário quer sair
            if (inputAltura.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            // Validação de entrada para altura
            double altura = 0;
            try {
                altura = Double.parseDouble(inputAltura);
            } catch (NumberFormatException e) {
                System.out.println("Altura inválida. Tente novamente.");
                continue;
            }

            System.out.println("Digite o peso (em kg): ");
            String inputPeso = scanner.nextLine();

            // Validação de entrada para peso
            double peso = 0;
            try {
                peso = Double.parseDouble(inputPeso);
            } catch (NumberFormatException e) {
                System.out.println("Peso inválido. Tente novamente.");
                continue;
            }


            String resultado = pesoIdeal.calcularPesoIdeal(altura, peso);
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
