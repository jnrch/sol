package com.jonathan.sol;

public class CocheHibrido extends Coche {

    @Override
    public double getPrecio() {
        return 20000.0;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el coche hibrido: Ok");
    }
}
