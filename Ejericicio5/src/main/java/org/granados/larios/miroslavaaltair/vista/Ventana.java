package org.granados.larios.miroslavaaltair.vista;

import gerdoc.vista.Ejecutable;
import org.granados.larios.miroslavaaltair.model.figura.*;
import org.granados.larios.miroslavaaltair.model.figura.figura2.Escaleno;
import org.granados.larios.miroslavaaltair.model.figura.figura2.Isosceles;
import org.granados.larios.miroslavaaltair.util.ReadUtil;
import PerezCaldera.figura.Figura;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable {
    // Variables
    private static Ventana ventana;
    private JLabel jLabel, jLabel1, TipoCuadrado, PedirCuadrado, AreaCuadrado, PerimetroCuadrado, TipoEquilatero, PedirBase;
    private JTextField Cuadrado, BaseEquilatero, AlturaEquilatero, LadoEquilatero;
    private JButton CuadradoCalculo, EquilateroCalculo,IsoscelesCalculo,EscalenoCalculo;
    private JButton CirculoCalculo,RectanguloCalculo,RomboCalculo,TrapecioCalculo;
    private JLabel PedirAltura,PedirLado, AreaEquilatero, PerimetroEquilatero;
    private JLabel TipoEscaleno,PedirBaseEsc,PedirAlturaEsc,PedirLadoEsc,PedirLado2Esc,PedirLado3Esc,AreaEscaleno,PerimetroEscaleno ;
    private JTextField BaseEscaleno,AlturaEscaleno,LadoEscaleno,Lado2Escaleno,Lado3Escaleno;
    private JLabel PedirBaseIso,PedirAlturaIso,PedirLadoIso,PerimetroIsosceles,TipoIsosceles,AreaIsosceles,PedirLado2Iso;
    private JTextField BaseIsosceles,LadoIsosceles, AlturaIsosceles,Lado2Isosceles;
    private JLabel TipoCirculo,PedirRadio,PerimetroCirculo,AreaCirculo;
    private JTextField Radio;
    private JLabel TipoRectangulo,PedirBaseRec, PedirAlturaRec,AreaRectangulo, PerimetroRectangulo;
    private JTextField BaseRec,AlturaRec;
    private JTextField Diagonal1,Diagonal2,Lado1Rom;
    private JLabel TipoRombo,PedirDiagonal1,PedirDiagonal2,PedirLado1Rom, AreaRombo, PerimetroRombo;
    private JLabel TipoTrapecio,PedirBase1, PedirBase2, PedirLado1,PedirLado2,PedirAlturaTra,AreaTrapecio,PerimetroTrapecio;
    private JTextField Base1,Base2,Lado1Tra,Lado2Tra,AlturaTra;

    private Ventana() {
        super("Ventana de figuras");
        init();
    }

    private void init() {
        // Inicialización de los componentes
        jLabel = new JLabel("Bienvenido ");
        jLabel.setBounds(10, 10, 200, 20);

        jLabel1 = new JLabel("Llene los datos según la figura que desee calcular");
        jLabel1.setBounds(10, 30, 300, 20);

        TipoCuadrado = new JLabel("-----CUADRADO----");
        TipoCuadrado.setBounds(10, 50, 200, 20);

        PedirCuadrado = new JLabel("Ingrese el lado del Cuadrado:");
        PedirCuadrado.setBounds(10, 80, 200, 20);

        Cuadrado = new JTextField();
        Cuadrado.setBounds(10, 105, 100, 20);

        CuadradoCalculo = new JButton("Calcular para Cuadrado");
        CuadradoCalculo.setBounds(10, 135, 200, 30);

        AreaCuadrado = new JLabel("Area: ");
        AreaCuadrado.setBounds(10, 175, 200, 20);

        PerimetroCuadrado = new JLabel("Perimetro: ");
        PerimetroCuadrado.setBounds(10, 195, 200, 20);

        CuadradoCalculo.addActionListener(p -> {
            Figura figura = new Cuadrado();
            ((Cuadrado) figura).setLado(ReadUtil.string2Integer(Cuadrado.getText()));
            AreaCuadrado.setText("Área: " + figura.area());
            PerimetroCuadrado.setText("Perímetro: " + figura.perimetro());
        });

        // Sección para el Equilatero
        TipoEquilatero = new JLabel("-----EQUILATERO----");
        TipoEquilatero.setBounds(10, 225, 200, 20);

        PedirBase = new JLabel("Ingrese la base");
        PedirBase.setBounds(10, 250, 200, 20);

        BaseEquilatero = new JTextField();
        BaseEquilatero.setBounds(10, 275, 100, 20);

        PedirAltura = new JLabel("Ingrese la Altura");
        PedirAltura.setBounds(10, 300, 200, 20);

        AlturaEquilatero = new JTextField();
        AlturaEquilatero.setBounds(10, 325, 100, 20);

        PedirLado = new JLabel("Ingrese el Lado");
        PedirLado.setBounds(10, 350, 200, 20);

        LadoEquilatero = new JTextField();
        LadoEquilatero.setBounds(10, 375, 100, 20);

        EquilateroCalculo = new JButton("Calcular para Equilatero");
        EquilateroCalculo.setBounds(10, 405, 200, 30);

        AreaEquilatero = new JLabel("Area: ");
        AreaEquilatero.setBounds(10, 445, 200, 20);

        PerimetroEquilatero = new JLabel("Perimetro: ");
        PerimetroEquilatero.setBounds(10, 465, 200, 20);

        EquilateroCalculo.addActionListener(p -> {
            Equilatero equilatero = new Equilatero();
            // Se leen los valores de base, altura y lado de sus respectivos campos de texto
            ((Equilatero) equilatero).setbase(ReadUtil.string2Integer(BaseEquilatero.getText()));
            ((Equilatero) equilatero).setaltura(ReadUtil.string2Integer(AlturaEquilatero.getText()));
            ((Equilatero) equilatero).setLado(ReadUtil.string2Integer(LadoEquilatero.getText()));

            AreaEquilatero.setText("Area: " + equilatero.area());
            PerimetroEquilatero.setText("Perimetro: " + equilatero.perimetro());
        });


        // Seccion del isoceles
        TipoIsosceles = new JLabel("-----ISOSCELES----");
        TipoIsosceles.setBounds(250, 50, 200, 20);

        PedirBaseIso = new JLabel("Ingrese la base");
        PedirBaseIso.setBounds(250, 80, 200, 20);

        BaseIsosceles = new JTextField();
        BaseIsosceles.setBounds(250, 105, 100, 20);

        PedirAlturaIso = new JLabel("Ingrese la Altura");
        PedirAlturaIso.setBounds(250, 130, 200, 20);

        AlturaIsosceles = new JTextField();
        AlturaIsosceles.setBounds(250, 155, 100, 20);

        PedirLadoIso = new JLabel("Ingrese el Lado");
        PedirLadoIso.setBounds(250, 180, 200, 20);

        LadoIsosceles = new JTextField();
        LadoIsosceles.setBounds(250, 205, 100, 20);

        PedirLado2Iso = new JLabel("Ingrese el Lado 2");
        PedirLado2Iso.setBounds(250, 230, 200, 20);

        Lado2Isosceles = new JTextField();
        Lado2Isosceles.setBounds(250, 255, 100, 20);

        IsoscelesCalculo = new JButton("Calcular para Isosceles");
        IsoscelesCalculo.setBounds(250, 285, 200, 30);

        AreaIsosceles = new JLabel("Area: ");
        AreaIsosceles.setBounds(250, 325, 200, 20);

        PerimetroIsosceles = new JLabel("Perimetro: ");
        PerimetroIsosceles.setBounds(250, 345, 200, 20);

        IsoscelesCalculo.addActionListener(p -> {
            Isosceles isoceles = new Isosceles();
            ((Isosceles) isoceles).setbase(ReadUtil.string2Integer(BaseIsosceles.getText()));
            ((Isosceles) isoceles).setaltura(ReadUtil.string2Integer(AlturaIsosceles.getText()));
            ((Isosceles) isoceles).setlado1(ReadUtil.string2Integer(LadoIsosceles.getText()));
            ((Isosceles) isoceles).setlado2(ReadUtil.string2Integer(Lado2Isosceles.getText()));
            AreaIsosceles.setText("Area: " + isoceles.area());
            PerimetroIsosceles.setText("Perimetro: " + isoceles.perimetro());
        });
        // Seccion del Escaleno
        TipoEscaleno = new JLabel("-----ESCALENO----");
        TipoEscaleno.setBounds(250, 380, 200, 20);

        PedirBaseEsc = new JLabel("Ingrese la base");
        PedirBaseEsc.setBounds(250, 410, 200, 20);

        BaseEscaleno = new JTextField();
        BaseEscaleno.setBounds(250, 435, 100, 20);

        PedirAlturaEsc = new JLabel("Ingrese la Altura");
        PedirAlturaEsc.setBounds(250, 460, 200, 20);

        AlturaEscaleno = new JTextField();
        AlturaEscaleno.setBounds(250, 485, 100, 20);

        PedirLadoEsc = new JLabel("Ingrese el Lado");
        PedirLadoEsc.setBounds(250, 510, 200, 20);

        LadoEscaleno = new JTextField();
        LadoEscaleno.setBounds(250, 535, 100, 20);

        PedirLado2Esc = new JLabel("Ingrese el Lado 2");
        PedirLado2Esc.setBounds(250, 560, 200, 20);

        Lado2Escaleno = new JTextField();
        Lado2Escaleno.setBounds(250, 585, 100, 20);

        PedirLado3Esc = new JLabel("Ingrese el Lado 3 ");
        PedirLado3Esc.setBounds(250, 610, 200, 20);

        Lado3Escaleno = new JTextField();
        Lado3Escaleno.setBounds(250, 635, 100, 20);

        EscalenoCalculo = new JButton("Calcular para Escaleno");
        EscalenoCalculo.setBounds(250, 665, 200, 30);

        AreaEscaleno = new JLabel("Area: ");
        AreaEscaleno.setBounds(250, 695, 200, 20);

        PerimetroEscaleno = new JLabel("Perimetro: ");
        PerimetroEscaleno.setBounds(250, 715, 200, 20);


        EscalenoCalculo.addActionListener(p -> {
            Escaleno escaleno = new Escaleno();
            ((Escaleno) escaleno).setbase(ReadUtil.string2Integer(BaseEscaleno.getText()));
            ((Escaleno) escaleno).setaltura(ReadUtil.string2Integer(AlturaEscaleno.getText()));
            ((Escaleno) escaleno).setlado1(ReadUtil.string2Integer(LadoEscaleno.getText()));
            ((Escaleno) escaleno).setlado2(ReadUtil.string2Integer(Lado2Escaleno.getText()));
            ((Escaleno) escaleno).setLado3(ReadUtil.string2Integer(Lado3Escaleno.getText()));
            AreaEscaleno.setText("Área: " + escaleno.area());
            PerimetroEscaleno.setText("Perímetro: " + escaleno.perimetro());
        });
        // Seccion para Circulo
        TipoCirculo = new JLabel("-----CIRCULO----");
        TipoCirculo.setBounds(480, 50, 200, 20);


        PedirRadio = new JLabel("Ingrese el radio");
        PedirRadio.setBounds(480, 80, 200, 20);

        Radio = new JTextField();
        Radio.setBounds(480, 105, 100, 20);


        CirculoCalculo = new JButton("Calcular para radio");
        CirculoCalculo.setBounds(480, 135, 200, 30);


        AreaCirculo = new JLabel("Area: ");
        AreaCirculo.setBounds(480, 175, 200, 20);

        PerimetroCirculo = new JLabel("Perimetro: ");
        PerimetroCirculo.setBounds(480, 195, 200, 20);


        CirculoCalculo.addActionListener(p -> {
            Circulo circulo = new Circulo();
            circulo.setRadio(ReadUtil.string2Integer(Radio.getText()));

            AreaCirculo.setText("Area: " + circulo.area());
            PerimetroCirculo.setText("Perimetro: " + circulo.perimetro());
        });

        TipoRectangulo = new JLabel("-----RECTANGULO----");
        TipoRectangulo.setBounds(480, 230, 200, 20);

        PedirBaseRec = new JLabel("Ingrese el lado");
        PedirBaseRec.setBounds(480, 260, 200, 20);

        BaseRec = new JTextField();
        BaseRec.setBounds(480, 285, 100, 20);

        PedirAlturaRec = new JLabel("Ingrese la altura ");
        PedirAlturaRec.setBounds(480, 310, 200, 20);

        AlturaRec = new JTextField();
        AlturaRec.setBounds(480, 335, 100, 20);

        RectanguloCalculo = new JButton("Calcular para rectangulo");
        RectanguloCalculo.setBounds(480, 365, 200, 30);

        AreaRectangulo = new JLabel("Area: ");
        AreaRectangulo.setBounds(480, 405, 200, 20);

        PerimetroRectangulo = new JLabel("Perimetro: ");
        PerimetroRectangulo.setBounds(480, 425, 200, 20);


        RectanguloCalculo.addActionListener(p -> {
            Rectangulo rectangulo = new Rectangulo();
            rectangulo.setBase(ReadUtil.string2Integer(BaseRec.getText()));
            rectangulo.setAltura(ReadUtil.string2Integer(AlturaRec.getText()));

            AreaRectangulo.setText("Area: " + rectangulo.area());
            PerimetroRectangulo.setText("Perimetro: " + rectangulo.perimetro());
        });

        TipoRombo = new JLabel("-----ROMBO----");
        TipoRombo.setBounds(480, 460, 200, 20);

        PedirDiagonal1 = new JLabel("Ingrese la diagonal 1");
        PedirDiagonal1.setBounds(480, 490, 200, 20);

        Diagonal1 = new JTextField();
        Diagonal1.setBounds(480, 515, 100, 20);

        PedirDiagonal2 = new JLabel("Ingrese la diagonal 2");
        PedirDiagonal2.setBounds(480, 540, 200, 20);

        Diagonal2 = new JTextField();
        Diagonal2.setBounds(480, 565, 100, 20);

        PedirLado1Rom = new JLabel("Ingrese uno de los lados ");
        PedirLado1Rom.setBounds(480, 590, 200, 20);

        Lado1Rom = new JTextField();
        Lado1Rom.setBounds(480, 615, 100, 20);

        RomboCalculo = new JButton("Calcular para el Rombo");
        RomboCalculo.setBounds(480, 645, 200, 30);

        AreaRombo = new JLabel("Area: ");
        AreaRombo.setBounds(480, 685, 200, 20);

        PerimetroRombo = new JLabel("Perimetro: ");
        PerimetroRombo.setBounds(480, 705, 200, 20);


        RomboCalculo.addActionListener(p -> {
            Rombo rombo = new Rombo();
            rombo.setdiagonal1(ReadUtil.string2Integer(Diagonal1.getText()));
            rombo.setdiagonal2(ReadUtil.string2Integer(Diagonal2.getText()));
            rombo.setLado1(ReadUtil.string2Integer(Lado1Rom.getText()));

            AreaRombo.setText("Area: " + rombo.area());
            PerimetroRombo.setText("Perimetro: " + rombo.perimetro());
        });

        // TRAPECIO
        TipoTrapecio = new JLabel("-----TRAPECIO----");
        TipoTrapecio.setBounds(700, 50, 200, 20);

        PedirBase1 = new JLabel("Ingrese la Base 1");
        PedirBase1.setBounds(700, 80, 200, 20);

        Base1 = new JTextField();
        Base1.setBounds(700, 105, 100, 20);

        PedirBase2 = new JLabel("Ingrese la Base 2");
        PedirBase2.setBounds(700, 130, 200, 20);

        Base2 = new JTextField();
        Base2.setBounds(700, 155, 100, 20);

        PedirLado1 = new JLabel("Ingrese el lado 1");
        PedirLado1.setBounds(700, 180, 200, 20);

        Lado1Tra = new JTextField();
        Lado1Tra.setBounds(700, 205, 100, 20);

        PedirLado2 = new JLabel("Ingrese el lado 2");
        PedirLado2.setBounds(700, 230, 200, 20);

        Lado2Tra = new JTextField();
        Lado2Tra.setBounds(700, 255, 100, 20);

        PedirAlturaTra = new JLabel("Ingrese la altura");
        PedirAlturaTra.setBounds(700, 280, 200, 20);

        AlturaTra = new JTextField();
        AlturaTra.setBounds(700, 305, 100, 20);

        TrapecioCalculo = new JButton("Calcular para el Trapecio");
        TrapecioCalculo.setBounds(700, 335, 200, 30);

        AreaTrapecio = new JLabel("Area: ");
        AreaTrapecio.setBounds(700, 375, 200, 20);

        PerimetroTrapecio = new JLabel("Perimetro: ");
        PerimetroTrapecio.setBounds(700, 395, 200, 20);


        TrapecioCalculo.addActionListener(p -> {
            Trapecio trapecio = new Trapecio();
            trapecio.setAltura(ReadUtil.string2Integer(AlturaTra.getText()));
            trapecio.setBase1(ReadUtil.string2Integer(Base1.getText()));
            trapecio.setBase2(ReadUtil.string2Integer(Base2.getText()));
            trapecio.setLado1(ReadUtil.string2Integer(Lado1Tra.getText()));
            trapecio.setLado2(ReadUtil.string2Integer(Lado2Tra.getText()));

            AreaTrapecio.setText("Area: " + trapecio.area());
            PerimetroTrapecio.setText("Perimetro: " + trapecio.perimetro());
        });




        // Agregar los componentes
        getContentPane().setLayout(null);
        getContentPane().add(jLabel);
        getContentPane().add(jLabel1);
        getContentPane().add(Cuadrado);
        getContentPane().add(PerimetroCuadrado);
        getContentPane().add(AreaEquilatero);
        getContentPane().add(PerimetroEquilatero);
        getContentPane().add(AreaCuadrado);
        getContentPane().add(CuadradoCalculo);
        getContentPane().add(PerimetroCuadrado);
        getContentPane().add(TipoCuadrado);

        getContentPane().add(TipoEquilatero);
        getContentPane().add(PedirBase);
        getContentPane().add(BaseEquilatero);
        getContentPane().add(PedirAltura);
        getContentPane().add(AlturaEquilatero);
        getContentPane().add(PedirLado);
        getContentPane().add(LadoEquilatero);
        getContentPane().add(EquilateroCalculo);


        getContentPane().add(TipoIsosceles);
        getContentPane().add(PedirBaseIso);
        getContentPane().add(BaseIsosceles);
        getContentPane().add(PedirAlturaIso);
        getContentPane().add(AlturaIsosceles);
        getContentPane().add(PedirLadoIso);
        getContentPane().add(PedirLado2Iso);
        getContentPane().add(LadoIsosceles);
        getContentPane().add(IsoscelesCalculo);
        getContentPane().add(AreaIsosceles);
        getContentPane().add(PerimetroIsosceles);
        getContentPane().add(Lado2Isosceles);

        getContentPane().add(TipoEscaleno);
        getContentPane().add(PedirBaseEsc);
        getContentPane().add(BaseEscaleno);
        getContentPane().add(PedirAlturaEsc);
        getContentPane().add(AlturaEscaleno);
        getContentPane().add(PedirLadoEsc);
        getContentPane().add(LadoEscaleno);
        getContentPane().add(PedirLado2Esc );
        getContentPane().add(Lado2Escaleno);
        getContentPane().add(PedirLado3Esc);
        getContentPane().add(Lado3Escaleno);
        getContentPane().add(EscalenoCalculo);
        getContentPane().add(AreaEscaleno);
        getContentPane().add(PerimetroEscaleno);


        getContentPane().add( TipoCirculo);
        getContentPane().add(PedirRadio);
        getContentPane().add(Radio);
        getContentPane().add( CirculoCalculo);
        getContentPane().add(AreaCirculo);
        getContentPane().add(PerimetroCirculo);
        getContentPane().add(AreaCirculo);

        getContentPane().add(TipoRectangulo);
        getContentPane().add(PedirBaseRec);
        getContentPane().add(BaseRec);
        getContentPane().add( PedirAlturaRec);
        getContentPane().add(AlturaRec);
        getContentPane().add(AreaRectangulo);
        getContentPane().add(RectanguloCalculo);
        getContentPane().add(PerimetroRectangulo);

        getContentPane().add(TipoRombo);
        getContentPane().add(PedirDiagonal1);
        getContentPane().add(Diagonal1);
        getContentPane().add( PedirDiagonal2);
        getContentPane().add(Diagonal2);
        getContentPane().add(PedirLado1Rom);
        getContentPane().add(Lado1Rom);
        getContentPane().add(RomboCalculo);
        getContentPane().add(AreaRombo);
        getContentPane().add(PerimetroRombo);

        getContentPane().add(TipoTrapecio);
        getContentPane().add(PedirBase1);
        getContentPane().add(Base1);
        getContentPane().add(  PedirBase2);
        getContentPane().add(Base2);
        getContentPane().add(PedirLado1);
        getContentPane().add(Lado1Tra);
        getContentPane().add(PedirLado2);
        getContentPane().add(Lado2Tra);
        getContentPane().add(PedirAlturaTra);
        getContentPane().add(AlturaTra);
        getContentPane().add(TrapecioCalculo);
        getContentPane().add(AreaTrapecio);
        getContentPane().add( PerimetroTrapecio);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run() {
        setBounds(100, 100, 400, 500);
        setVisible(true);
    }
}
