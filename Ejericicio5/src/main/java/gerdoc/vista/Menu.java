package gerdoc.vista;

import PerezCaldera.figura.Figura;

public class Menu
{
    public static void principal( )
    {
        System.out.println( "welcome");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Cuadrado");
        System.out.println( "2.- Equilatero");
        System.out.println( "3.- Isoceles");
        System.out.println( "4.- Escaleno");
        System.out.println( "5.- Salir");
    }

    public static void opcionInvalida( )
    {
        System.out.println( "Opción invalida");
    }

    public static void print(Figura figura)
    {
        System.out.println( "El perimetro es: " + figura.perimetro() );
        System.out.println( "El area es: " + figura.area() );
    }

    public static void principal2( )
    {
        System.out.println( "welcome");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Consola Emma");
        System.out.println( "2.- Ventana");
        System.out.println( "3.- Consola Miros");
        System.out.println( "4.- Consola German");
        System.out.println( "5.- Salir");
    }

    public static void menuCuadrado( )
    {
        System.out.println("Dame un lado");
    }

    public static void menuBase( )
    {
        System.out.println("Dame una base");
    }

    public static void menuAltura( )
    {
        System.out.println("Dame una altura");
    }

    public static void menuLado1( )
    {
        System.out.println("Dame un lado 1");
    }

    public static void menuLado2( )
    {
        System.out.println("Dame un lado 2");
    }

    public static void menuLado3( )
    {
        System.out.println("Dame un lado 3");
    }

    public static void menudiagonalMayor() {System.out.println("Dame una Diagonal Mayor");}

    public static void menudiagonalMenor() {System.out.println("Dame una Diagonal Menor");}

    public static void menubaseMenor() {System.out.println("Dame una Diagonal Menor");}

    public static void menubaseMayor() {System.out.println("Dame una Diagonal Mayor");}

    public static void menuradio( )
    {
        System.out.println("Dame el radio");
    }

    public static void menuApotema( )
    {
        System.out.println("Dame una apotema");
    }

    public static void menuLados( )
    {
        System.out.println("Dame el numero de lados");
    }





}
