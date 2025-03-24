package org.granados.larios.miroslavaaltair.model.figura;

import org.granados.larios.miroslavaaltair.util.ReadUtil;
import org.granados.larios.miroslavaaltair.vista.Menu;

import PerezCaldera.figura.Figura;

public class Rombo extends Figura {
    //variables
    private double diagonal1;
    private double diagonal2;
    private double lado1;

    //constructor

    public Rombo(double diagonal1, double diagonal2, double lado) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.lado1 = lado;
    }

    public Rombo() {

    }


    public double getDiagonal1() {
        return diagonal1;
    }

    public void setdiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getdiagonal2() {
        return diagonal2;
    }

    public void setdiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
//metodos

    @Override
    public double area() {
        return diagonal1*diagonal2*1/2;
    }

    @Override
    public double perimetro() {
        return lado1*4;
    }
    public void leerDatos()
    {
        Menu.menuDiagonal1( );
        diagonal1 = ReadUtil.getInstance().leerInt( );
        Menu.menuDiagonal2( );
        diagonal2 = ReadUtil.getInstance().leerInt( );
        Menu.menuLado1();
        lado1= ReadUtil.getInstance().leerInt();
    }

}
