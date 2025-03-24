package org.granados.larios.miroslavaaltair.model.figura;

import org.granados.larios.miroslavaaltair.util.ReadUtil;
import org.granados.larios.miroslavaaltair.vista.Menu;

import PerezCaldera.figura.Figura;

public class Rectangulo extends Figura {
    //variables
    protected double base;
    protected double altura;

    //Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {

    }
    //metodos


    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return altura * 2 + base * 2;
    }

    public void leerDatos()
    {
        Menu.menuBase( );
        base = ReadUtil.getInstance().leerInt( );
        Menu.menuAltura( );
        altura = ReadUtil.getInstance().leerInt( );
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
