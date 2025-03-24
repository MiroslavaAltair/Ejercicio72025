package org.granados.larios.miroslavaaltair.model.figura;

import org.granados.larios.miroslavaaltair.util.ReadUtil;
import org.granados.larios.miroslavaaltair.vista.Menu;

import PerezCaldera.figura.Figura;

public class Cuadrado extends Figura
{

    private double lado;

    public Cuadrado()
    {
    }

    public Cuadrado(double lado)
    {
        this.lado = lado;
    }



    public void leerDatos()
    {
        Menu.menuCuadrado( );
        lado = ReadUtil.getInstance().leerInt( );
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area()
    {
        return lado*lado;
    }

    @Override
    public double perimetro()
    {
        return lado*4;
    }

}