package org.granados.larios.miroslavaaltair.model.figura;

import org.granados.larios.miroslavaaltair.util.ReadUtil;
import org.granados.larios.miroslavaaltair.vista.Menu;

import PerezCaldera.figura.Figura;

public class Circulo extends Figura {

    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {

    }

    @Override
    public double area() {
         return Math.PI*(radio*radio);
    }

    @Override
    public double perimetro() {
        return Math.PI*radio;
    }

    public void leerDatos()
    {
        Menu.menuCirculo( );
        radio = ReadUtil.getInstance().leerInt( );
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
