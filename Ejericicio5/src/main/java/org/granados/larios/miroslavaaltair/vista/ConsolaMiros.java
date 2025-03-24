package org.granados.larios.miroslavaaltair.vista;

import gerdoc.vista.Ejecutable;
import org.granados.larios.miroslavaaltair.model.figura.figura2.Isosceles;
import org.granados.larios.miroslavaaltair.model.figura.Cuadrado;
import org.granados.larios.miroslavaaltair.model.figura.figura2.Escaleno;
import org.granados.larios.miroslavaaltair.model.figura.*;
import org.granados.larios.miroslavaaltair.model.figura.Circulo;
import org.granados.larios.miroslavaaltair.util.ReadUtil;

import PerezCaldera.figura.Figura;


public class ConsolaMiros implements Ejecutable, PerezCaldera.vista.Ejecutable {
    private static ConsolaMiros consolaMiros;

    private ConsolaMiros() {
    }

    public static ConsolaMiros getInstance() {
        if (consolaMiros == null) {
            consolaMiros = new ConsolaMiros();
        }
        return consolaMiros;
    }

    @Override
    public void run() {
        boolean flag = true;
        int opcion = 0;
        Figura figura = null;
        while (flag) {
            
            figura = null;
            Menu.principal();
            opcion = ReadUtil.getInstance().leerInt();
            switch (opcion) {
                case 1:
                    figura = new Cuadrado();
                    break;
                case 2:
                    figura = new Equilatero();
                    break;
                case 3:
                    figura = new Isosceles();
                    break;
                case 4:
                    figura = new Escaleno();
                    break;
                case 5:
                    figura = new Rectangulo();
                    break;
                case 6:
                    figura = new Rombo();
                    break;
                case 7:
                    figura = new Trapecio();
                    break;
                case 8:
                    figura = new Circulo();
                    break;

                case 9:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
            if (figura != null) {
                ((SolicitaDatos) figura).leerDatos();
                Menu.print(figura);
            }
        }
    }
}