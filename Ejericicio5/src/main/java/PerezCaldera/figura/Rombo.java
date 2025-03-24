package PerezCaldera.figura;

import PerezCaldera.util.ReadUtil;
import PerezCaldera.vista.Menu;

public class Rombo extends Figura{

    private double diagonalMayor;
    private double diagomalMenor;

    public Rombo() {

    }

    public Rombo(double diagomalMenor, double diagonalMayor) {
        this.diagomalMenor = diagomalMenor;
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagomalMenor() {
        return diagomalMenor;
    }

    public void setDiagomalMenor(double diagomalMenor) {
        this.diagomalMenor = diagomalMenor;
    }

    @Override
    public double area() {
        return diagomalMenor * diagomalMenor / 2;
    }

    @Override
    public double perimetro() {
        return 4 * Math.sqrt(Math.pow(diagomalMenor, 2) + Math.pow(diagomalMenor, 2));
    }

    @Override
    public void leerDatos() {
        Menu.menudiagonalMayor();
        diagonalMayor = ReadUtil.getInstance().leerInt();
        Menu.menudiagonalMenor();
        diagomalMenor = ReadUtil.getInstance().leerInt();
    }
}
