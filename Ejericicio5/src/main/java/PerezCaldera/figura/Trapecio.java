package PerezCaldera.figura;

import PerezCaldera.util.ReadUtil;
import PerezCaldera.vista.Menu;

public class Trapecio extends Figura{

    private double basemayor;
    private double basemenor;
    private double altura;

    public Trapecio(){

    }

    public Trapecio(double basemayor, double basemenor, double altura) {
        this.basemayor = basemayor;
        this.basemenor = basemenor;
        this.altura = altura;
    }

    public double getBasemayor() {
        return basemayor;
    }

    public void setBasemayor(double basemayor) {
        this.basemayor = basemayor;
    }

    public double getBasemenor() {
        return basemenor;
    }

    public void setBasemenor(double basemenor) {
        this.basemenor = basemenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (basemayor + basemenor) * altura / 2;
    }

    @Override
    public double perimetro() {
        return basemayor + basemenor +  (2 * Math.sqrt(Math.pow(((basemayor - basemenor) / 2), 2) + Math.pow(getAltura(), 2)));
    }

    @Override
    public void leerDatos() {
        Menu.menubaseMayor();
        basemayor = ReadUtil.getInstance().leerInt();
        Menu.menubaseMenor();
        basemenor = ReadUtil.getInstance().leerInt();
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerInt();
    }
}
