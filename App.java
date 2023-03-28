package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner pegar_input = new Scanner(System.in);
        String menu = """
                1- Celsius para Fahrenheit:
                2- Celsius para Kelvin:
                3- Fahrenheit para Kelvin:\s
                4- Kelvin para Fahrenheit:\s
                5- Sair do programa:\s""";
        int escolha = 0;
        double temperatura_entrada;
        String aviso_erro = "Digite apenas números entre 1 e 5\n";

        System.out.println("Bem vindo ao programa de converter unidades de medida de temperatura: ");
        while(escolha != 5){
            System.out.println(menu);
            escolha = pegar_input.nextInt();
            switch (escolha) {
                case 1 -> {
                    System.out.print("Digite o valor da temperatura em Celsius: ");
                    temperatura_entrada = pegar_input.nextDouble();
                    System.out.printf("%.2fC correspondem a %.2fF\n", temperatura_entrada, ConversorTemperatura.celsius_para_fahrenheit(temperatura_entrada));
                }
                case 2 -> {
                    System.out.print("Digite o valor da temperatura em Celsius: ");
                    temperatura_entrada = pegar_input.nextDouble();
                    System.out.printf("%.2fC correspondem a %.2fK\n", temperatura_entrada, ConversorTemperatura.celsius_para_kelvin(temperatura_entrada));
                }
                case 3 -> {
                    System.out.print("Digite o valor da temperatura em Fahrenheit: ");
                    temperatura_entrada = pegar_input.nextDouble();
                    System.out.printf("%.2fF correspondem a %.2fK\n", temperatura_entrada, ConversorTemperatura.farenheit_para_kelvin(temperatura_entrada));
                }
                case 4 -> {
                    System.out.print("Digite o valor da temperatura em Kelvin: ");
                    temperatura_entrada = pegar_input.nextDouble();
                    System.out.printf("%.2fK correspondem a %.2fF\n", temperatura_entrada, ConversorTemperatura.kelvin_para_fahrenheit(temperatura_entrada));
                }
                case 5 -> System.out.println("Obrigado por utilizar o programa!");
                default -> System.out.println(aviso_erro);
            }
        }
        pegar_input.close();
    }
}