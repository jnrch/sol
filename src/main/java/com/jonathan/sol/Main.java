package com.jonathan.sol;

public class Main {

    public static void main(String[] args) {
        Coche[] coches = {
                new CocheElectrico(),
                new CocheCombustible(),
                new CocheHibrido()
        };

        acelerarCoche(coches);
    }

    public static void acelerarCoche(Coche[] coches) {
        for (Coche coche: coches) {
            coche.acelerar();
        }
    }
}
