package PerezCaldera.vista;

import PerezCaldera.figura.Cuadrado;
import PerezCaldera.figura.Figura;
import PerezCaldera.util.ReadUtil;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable
{
    private static Ventana ventana;
    private JLabel jLabel;
    private JTextField jTextField;

    private JTextField Nueva_Caja_De_Texto;

    private JButton jButton;

    private Ventana( )
    {
        super( "Ventana de figuras" );
        init( );
    }

    private void init()
    {
        jLabel = new JLabel( "Welcome" );
        jLabel.setBounds( 10,10, 100 , 20);
        jTextField = new JTextField( );
        jTextField.setBounds( 110, 10 , 100, 20 );

        Nueva_Caja_De_Texto = new JTextField( );
        Nueva_Caja_De_Texto.setBounds( 310, 10 , 100, 20 );

        jButton = new JButton( "Calcular" );
        jButton.setBounds( 10, 40, 70, 20 );
        jButton.addActionListener( p -> {
            Figura figura = new Cuadrado( );
            ((Cuadrado)figura).setLado( ReadUtil.string2Integer( jTextField.getText() ) );
            System.out.println( figura.area( ) );
            System.out.println( figura.perimetro( ) );
        } );
        getContentPane().setLayout( null );
        getContentPane().add( jLabel );
        getContentPane().add( jTextField );

        getContentPane().add( Nueva_Caja_De_Texto );

        getContentPane().add( jButton );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }

    public static Ventana getInstance( )
    {
        if( ventana == null )
        {
            ventana = new Ventana( );
        }
        return ventana;
    }

    @Override
    public void run()
    {
        setBounds( 100 , 100, 400, 300 );
        setVisible( true );
    }
}
