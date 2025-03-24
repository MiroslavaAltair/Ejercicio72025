package org.granados.larios.miroslavaaltair.model.figura;

import org.granados.larios.miroslavaaltair.util.ReadUtil;
import org.granados.larios.miroslavaaltair.vista.Menu;

public class Equilatero extends Triangulo
{

    public Equilatero()
    {
    }

    public Equilatero(double base, double altura, double lado1)
    {
        super(base, altura);
        this.lado = lado;
    }

    protected double lado;

    public Equilatero(double lado1)
    {
        this.lado = lado1;
    }

    public double getlado1() {return lado;}

    public  double perimetro()
    {
        return lado*3;
    }
    public void leerDatos()
    {
        super.leerDatos();
        Menu.menuLado1( );
        lado = ReadUtil.getInstance().leerInt();
    }

    public void setbase(double base) {
        this.setBase(base);
    }

    public void setaltura(double altura) {
        this.setAltura(altura);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setlado1(Integer integer) {
    }
}