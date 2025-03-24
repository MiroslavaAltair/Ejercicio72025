package PerezCaldera.inicio;

import org.granados.larios.miroslavaaltair.vista.ConsolaMiros;

//Paqueteria importada
import PerezCaldera.util.ReadUtil;
import PerezCaldera.vista.Ejecutable;
import PerezCaldera.vista.Menu;
import PerezCaldera.vista.Ventana;
import gerdoc.vista.ConsolaGerman;
import PerezCaldera.vista.ConsolaEmma;

//Clase Inicio
public class Inicio {

    //Clase Principal del programa
    public static void main(String[] args) {

        //Importando los atributos
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;

        while( flag ) {
            ejecutable = null;
            Menu.principal2( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion ) {

                case 1:
                    ejecutable = ConsolaEmma.getInstance();
                    break;

                case 2:
                    ejecutable = Ventana.getInstance( );
                    break;
                    
                case 3:
                    ejecutable = ConsolaMiros.getInstance();
                    break;

                case 4:
                    ejecutable = ConsolaGerman.getInstance();
                    break;
                    
                case 5:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null ) {
                ejecutable.run( );
            }
        }
    }
}