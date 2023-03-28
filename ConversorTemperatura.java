package org.example;
public class ConversorTemperatura {
    public static double celsius_para_fahrenheit(double temperatura_inicial) {
        double temperatura_final = temperatura_inicial * 1.80 + 32.00;
        return temperatura_final;
    }

    public static double celsius_para_kelvin(double temperatura_inicial) {
        double temperatura_final = temperatura_inicial + 273.15;
        return temperatura_final;
    }

    public static double farenheit_para_kelvin(double temperatura_inicial) {
        double temperatura_final = (temperatura_inicial - 32.00) / 1.80 + 273.15;
        return temperatura_final;
    }

    public static double kelvin_para_fahrenheit(double temperatura_inicial) {
        double temperatura_final = (temperatura_inicial - 273.15) * 1.80 + 32.00 ;
        return temperatura_final;
    }
}