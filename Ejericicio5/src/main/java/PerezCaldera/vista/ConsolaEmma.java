package PerezCaldera.vista;

import PerezCaldera.figura.*;
import PerezCaldera.figura.figura2.Escaleno;
import PerezCaldera.figura.figura2.Isosceles;
import PerezCaldera.util.ReadUtil;

public class ConsolaEmma implements Ejecutable
{
    private static ConsolaEmma consolaEmma;

    private ConsolaEmma()
    {
    }

    public static ConsolaEmma getInstance( )
    {
        if( consolaEmma == null ){
            consolaEmma = new ConsolaEmma( );
        }
        return consolaEmma;
    }

    @Override
    public void run() {
        boolean flag = true;
        int opcion = 0;
        Figura figura = null;
        while( flag ) {

            figura = null;
            Menu.principal( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion ) {
                case 1:
                    figura = new Cuadrado( );
                    break;

                case 2:
                    figura = new Equilatero( );
                    break;

                case 3:
                    figura = new Isosceles( );
                    break;

                case 4:
                    figura = new Escaleno( );
                    break;

                case 5:
                    figura = new Rectangulo( );
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
                    figura = new Poligono();
                    break;

                case 10:
                    flag = false;
                    break;

                default:
                    Menu.opcionInvalida( );
            }
            if( figura != null ) {
                figura.leerDatos( );
                Menu.print( figura );
            }
        }
    }
}
