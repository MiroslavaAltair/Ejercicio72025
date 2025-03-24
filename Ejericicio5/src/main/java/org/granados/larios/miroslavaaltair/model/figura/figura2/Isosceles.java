package org.granados.larios.miroslavaaltair.model.figura.figura2;

import org.granados.larios.miroslavaaltair.model.figura.Equilatero;
import org.granados.larios.miroslavaaltair.util.ReadUtil;
import org.granados.larios.miroslavaaltair.vista.Menu;

public class Isosceles extends Equilatero
{
    protected double lado2;

    public Isosceles(double base, double altura, double lado1, double lado2)
    {
        super(base, altura, lado1);
        this.lado2 = lado2;
    }

    public Isosceles() {

    }

    public double getLado2()
    {
        return lado;
    }

    public void setlado2(double lado2)
    {
        this.lado2 = lado2;
    }

    @Override
    public double perimetro()
    {
        return 2*lado+ lado2;
    }
    public double area(){return
            (base*altura)/2;}
    public void leerDatos()
    {
        super.leerDatos();
        Menu.menuLado2( );
        lado2 = ReadUtil.getInstance().leerInt();
    }


}
