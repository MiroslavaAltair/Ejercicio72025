package PerezCaldera.figura;

import PerezCaldera.util.ReadUtil;
import PerezCaldera.vista.Menu;

public class Circulo extends Figura{

    private double radio;

    public Circulo () {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double perimetro() {
        return Math.PI * 2 * radio;
    }

    @Override
    public void leerDatos() {
        Menu.menuradio();
        radio = ReadUtil.getInstance().leerInt();
    }
}
