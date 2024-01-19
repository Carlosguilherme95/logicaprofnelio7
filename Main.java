import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de Km percorrida");
        Float quantidadeKM = Float.valueOf(scanner.nextLine());
        System.out.println("Digite a quantidade de combustível utilizado?");
        Float combust = Float.valueOf(scanner.nextLine());
        consumoMedio(quantidadeKM, combust);

    }

    private static void consumoMedio(Float quantidadeKM, Float combust) {
        Float media = quantidadeKM / combust;
        String resultado = String.format("%.3f", media);
        System.out.println("o consumo médio foi: " + resultado);
    }
}

/**
 * Problema "consumo"
 * Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
 * combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
 * médio do carro, com três casas decimais.
 * Exemplo 1:
 * Distancia percorrida: 500
 * Combustível gasto: 38.5
 * Consumo medio = 12.987
 */