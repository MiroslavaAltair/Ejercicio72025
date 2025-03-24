package org.granados.larios.miroslavaaltair.model.figura;


import org.granados.larios.miroslavaaltair.util.ReadUtil;
import org.granados.larios.miroslavaaltair.vista.Menu;

import PerezCaldera.figura.Figura;

public abstract class Triangulo extends Figura
{
    protected double base;
    protected double altura;


    public Triangulo()
    {
    }

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        return (base*altura)/2;
    }
    public abstract double perimetro();
    public double getBase()
    {
        return base;
    }
    public void setBase(double base)
    {
        this.base = base;
    }
    public double getAltura()
    {
        return altura;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    public void leerDatos()
    {
        Menu.menuBase();
        base = ReadUtil.getInstance().leerInt( );
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerInt( );
    }


}