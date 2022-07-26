package com.jonathan.sol;

public class CocheElectrico extends Coche {

    private int bateria = 89;

    @Override
    public double getPrecio() {
        return 10000.0;
    }

    @Override
    public void acelerar() {
        if (tieneBateriaOk()) {
            System.out.println("Acelerando el coche eléctrico");
        } else {
            System.out.println("No puedo acelerar el coche eléctrico, tiene bateria baja");
        }
    }

    public boolean tieneBateriaOk() {
        System.out.println("Verificando el estado de batería del coche eléctrico:");
        return bateria > 90;
    }
}
