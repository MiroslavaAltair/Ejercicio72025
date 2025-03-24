package org.granados.larios.miroslavaaltair.model.figura;

import org.granados.larios.miroslavaaltair.util.ReadUtil;
import org.granados.larios.miroslavaaltair.vista.Menu;

import PerezCaldera.figura.Figura;

public class Trapecio extends Figura {
    //variables
    private double base1;
    private double base2;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(double base1, double base2, double altura, double lado1, double lado2) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Trapecio() {

    }

    @Override
    public double area() {
        return ((base1 + base2) / 2) * altura;
    }

    @Override
    public double perimetro() {
        return base1 + base2 + lado1 + lado2;
    }
    public void leerDatos()
    {
        Menu.menuBase( );
        base1 = ReadUtil.getInstance().leerInt( );
        Menu.menuBase2( );
        base2 = ReadUtil.getInstance().leerInt( );
        Menu.menuLado1();
        lado1= ReadUtil.getInstance().leerInt();
        Menu.menuLado2();
        lado2= ReadUtil.getInstance().leerInt();
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerInt();
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}


