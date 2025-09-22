package com.atividade09.model;

public class Verificarvelocidade {

    public static double calcularVelocidade(double distanciaKm, double tempoHoras) {
        return distanciaKm / tempoHoras;
    }
    public static boolean verificarMulta(double velocidadeMedia) {
        return velocidadeMedia > 80;
    }

}
