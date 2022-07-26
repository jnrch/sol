package com.jonathan.sol;

public class CocheCombustible extends Coche {

    @Override
    public double getPrecio() {
        return 15000.0;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el coche combustible: Ok");
    }
}
