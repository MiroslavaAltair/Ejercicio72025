package gerdoc.vista;

import PerezCaldera.figura.Figura;
import gerdoc.figura.*;
import gerdoc.figura.figura2.Escaleno;
import gerdoc.figura.figura2.Isosceles;
import gerdoc.util.ReadUtil;

public class ConsolaGerman implements Ejecutable, PerezCaldera.vista.Ejecutable
{
    private static ConsolaGerman consolaGerman;

    private ConsolaGerman()
    {
    }

    public static ConsolaGerman getInstance( )
    {
        if( consolaGerman == null )
        {
            consolaGerman = new ConsolaGerman( );
        }
        return consolaGerman;
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
                    flag = false;
                    break;

                default:
                    Menu.opcionInvalida( );
            }
            if( figura != null ) {
                ((SolicitaDatos)figura).leerDatos( );
                Menu.print( figura );
            }
        }
    }
}
