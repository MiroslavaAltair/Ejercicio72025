package PerezCaldera.figura;

import PerezCaldera.util.ReadUtil;
import PerezCaldera.vista.Menu;

public class Poligono extends Figura{

    private int lados;
    private double apotema;
    private double lado;

    public Poligono(){

    }

    public Poligono(double apotema, int lados) {
        this.apotema = apotema;
        this.lados = lados;
        this.lado = lado;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lados * apotema;
    }

    @Override
    public double perimetro() {
        return lados * lado;
    }

    @Override
    public void leerDatos() {
        Menu.menuLados();
        lados = ReadUtil.getInstance().leerInt();
        Menu.menuCuadrado();
        lado = ReadUtil.getInstance().leerInt();
        Menu.menuApotema();
        apotema = ReadUtil.getInstance().leerInt();
    }


}
