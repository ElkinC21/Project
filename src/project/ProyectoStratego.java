package project;

import java.awt.Image;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.Random;

import proyecto2.Juego;
import Logica.Cuentas;
import Logica.Usuario;
import Logica.juego;

public class ProyectoStratego extends javax.swing.JFrame {
    private Juego gameMenu;
    private Cuentas sistemaCuentas;
    private Usuario usuarioActual;
    private String userFaction;
    private String opponentFaction;

    private boolean Batalla=false;
    private int Batallaconteo;
    private Timer battleTimer;
    private Ficha ficha1;
    private Ficha ficha2;
    private int filaficha1;
    private int filaficha2;
    private int colficha1;
    private int colficha2;
  
  private javax.swing.border.Border[][] Borders = new javax.swing.border.Border[10][10];
    private Ficha fichaseleccionada = null;
    private int filasalida, colsalida;
    private String turno = "Heroes";
    JButton tableroBotones[][] = new JButton[10][10];
    Ficha fichas[][] = new Ficha[10][10];
    Random random = new Random();
    public Ficha heroes[] = new Ficha[40];
    public Ficha villanos[] = new Ficha[40];
    Ficha tablas = new Ficha();
    private JLabel villanoseliminados[];
    private JLabel heroeseliminados[];

    private ImageIcon[][] guardariconos = new ImageIcon[10][10];
      
    String WINS="/project/WINS2.png";
    String FIGHT="/project/FIGHT.png";
    String LOSE="/project/LOSE2.png";
    String beast = "/project/BEAST.png";
    String blackWidow = "/project/BLACKWIDOW.png";
    String blade = "/project/BLADE.png";
    String captainAmerica = "/project/CAPTAINAMERICA.png";
    String punisher = "/project/PUNISHER.png";
    String colossus = "/project/COLOSSUS.png";
    String cyclops = "/project/CYCLOPS.png";
    String daredevil = "/project/DAREDEVIL.png";
    String drStrange = "/project/DRSTRANGE.png";
    String thing = "/project/THING.png";
    String emmaFrost = "/project/EMMAFROST.png";
    String ghostRider = "/project/GHOSTRIDER.png";
    String giantMan = "/project/GIANTMAN.png";
    String hulk = "/project/HULK.png";
    String humanTorch = "/project/HUMANTORCH.png";
    String iceMan = "/project/ICEMAN.png";
    String invisibleWoman = "/project/INVISIBLEWOMAN.png";
    String ironMan = "/project/IRONMAN.png";
    String nightcrawler = "/project/nightcrawler.png";
    String mrFantastic = "/project/MRFANTASTIC.png";
    String namor = "/project/NAMOR.png";
    String nickFury = "/project/NICKFURY.png";
    String phoenix = "/project/PHOENIX.png";
    String proffesorX = "/project/PROFFESORX.png";
    String sheHulk = "/project/SHEHULK.png";
    String silverSurfer = "/project/SILVERSURFER.png";
    String spiderGirl = "/project/SPIDERGIRL.png";
    String spiderMan = "/project/SPIDERMAN.png";
    String storm = "/project/STORM.png";
    String thor = "/project/THOR.png";
    String wolverine = "/project/WOLVERINE.png";
    String elektra = "/project/ELEKTRA.png";
    String gambit = "/project/GAMBIT.png";
    String novaBlast = "/project/NOVABLAST.png";
    String planetaTierra = "/project/PLANETATIERRA.png";
    String drDoom = "/project/DRDOOM.png";
    String galactus = "/project/GALACTUS.png";
    String kingpin = "/project/KINGPIN.png";
    String magneto = "/project/MAGNETO.png";
    String apocalypse = "/project/APOCALYPSE.png";
    String greenGoblin = "/project/GREENGOBLIN.png";
    String venom = "/project/VENOM.png";
    String bullseye = "/project/BULLSEYE.png";
    String omegaRed = "/project/OMEGARED.png";
    String onslaught = "/project/ONSLAUGHT.png";
    String redSkull = "/project/REDSKULL.png";
    String mystyque = "/project/MYSTYQUE.png";
    String mysterio = "/project/MYSTERIO.png";
    String drOctopus = "/project/DROCTOPUS.png";
    String deadpool = "/project/DEADPOOL.png";
    String abomination = "/project/ABOMINATION2.png";
    String thanos = "/project/THANOS.png";
    String blackcat = "/project/BLACKCAT.png";
    String sabretooth = "/project/SABRETOOTH.png";
    String juggernaut = "/project/JUGGERNAUT.png";
    String rhino = "/project/RHINO.png";
    String carnage = "/project/CARNAGE.png";
    String moleMan = "/project/MOLEMAN.png";
    String lizard = "/project/LIZARD.png";
    String mrSinister = "/project/MRSINISTER.png";
    String sentinel1 = "/project/SENTINEL1.png";
    String ultron = "/project/ULTRON.png";
    String sandman = "/project/SANDMAN.png";
    String leader = "/project/LEADER.png";
    String viper = "/project/VIPER.png";
    String sentinel2 = "/project/SENTINEL2.png";
    String electro = "/project/ELECTRO.png";
    String blackWidowVillana = "/project/BlackWidowvillana.png";
    String pumpkinBomb1 = "/project/PUMPKINBOMB.png";
    String tierraVillanos = "/project/TIERRAVILLANOS.png";

   

    public ProyectoStratego(Juego gameMenu, Cuentas sistemaCuentas, Usuario usuarioActual, String chosenFaction) {
        this.gameMenu = gameMenu;
        this.sistemaCuentas = sistemaCuentas;
        this.usuarioActual = usuarioActual;
        this.userFaction = chosenFaction;
        this.opponentFaction = chosenFaction.equals("Heroes") ? "Villanos" : "Heroes";
        this.turno = "Heroes"; 

        initComponents();
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/project/tablerofinal_1.png")));
        Doradofondo.setIcon(new ImageIcon(getClass().getResource("/project/Marco_270x770.png")));
        Doradofondoheroes.setIcon(new ImageIcon(getClass().getResource("/project/Marco_270x770.png")));
        VS.setIcon(new ImageIcon(getClass().getResource("/project/VS_transparente_100x80.png")));
        Fondopanelpelea.setIcon(new ImageIcon(getClass().getResource("/project/resized_image_750x470.png")));
        villano1.setIcon(new ImageIcon(getClass().getResource("/project/VILLANOS-ELIMINADOS_230X25_1.png")));
        tituloheroes.setIcon(new ImageIcon(getClass().getResource("/project/HEROES-ELIMINADOS_230X25.png")));


        continuar.setVisible(false);
        Fondopanelpelea.setVisible(false);
        HeroeBatalla.setVisible(false);
        VillanoBatalla.setVisible(false);
        VS.setVisible(false);
        resultadoheroe.setVisible(false);
        resultadovillano.setVisible(false);
        this.setLocationRelativeTo(null);

        villanoseliminados = new JLabel[]{villano1a, villano2a, villano3a, villano4a, villano5a, villano6a, villano7a, villano8a, villanoa9, villanoa10, villanoa11, villanoa12, villanoa13, villanoa14, villanoa15, villanoa16, villanoa17, villanoa18, villanoa19, villanoa20, villanoa21, villanoa22, villanoa23, villanoa24, villanoa25, villanoa26, villanoa27, villanoa28, villanoa30, villanoa31, villanoa32, villanoa34};
        heroeseliminados = new JLabel[]{heroe1, heroe2, heroe3, heroe4, heroe5, heroe6, heroe7, heroe8, heroe9, heroe10, heroe11, heroe12, heroe13, heroe14, heroe15, heroe16, heroe17, heroe18, heroe19, heroe20, heroe21, heroe22, heroe23, heroe24, heroe25, heroe26, heroe27, heroe28, heroe29, heroe30, heroe31, heroe32, heroe33};
        
        tableroBotones[0][0] = b1;
        tableroBotones[0][1] = b2;
        tableroBotones[0][2] = b3;
        tableroBotones[0][3] = b4;
        tableroBotones[0][4] = b5;
        tableroBotones[0][5] = b6;
        tableroBotones[0][6] = b7;
        tableroBotones[0][7] = b8;
        tableroBotones[0][8] = b9;
        tableroBotones[0][9] = b10;
        tableroBotones[1][0] = b11;
        tableroBotones[1][1] = b12;
        tableroBotones[1][2] = b13;
        tableroBotones[1][3] = b14;
        tableroBotones[1][4] = b15;
        tableroBotones[1][5] = b16;
        tableroBotones[1][6] = b17;
        tableroBotones[1][7] = b18;
        tableroBotones[1][8] = b19;
        tableroBotones[1][9] = b20;
        tableroBotones[2][0] = b21;
        tableroBotones[2][1] = b22;
        tableroBotones[2][2] = b23;
        tableroBotones[2][3] = b24;
        tableroBotones[2][4] = b25;
        tableroBotones[2][5] = b26;
        tableroBotones[2][6] = b27;
        tableroBotones[2][7] = b28;
        tableroBotones[2][8] = b29;
        tableroBotones[2][9] = b30;
        tableroBotones[3][0] = b31;
        tableroBotones[3][1] = b32;
        tableroBotones[3][2] = b33;
        tableroBotones[3][3] = b34;
        tableroBotones[3][4] = b35;
        tableroBotones[3][5] = b36;
        tableroBotones[3][6] = b37;
        tableroBotones[3][7] = b38;
        tableroBotones[3][8] = b39;
        tableroBotones[3][9] = b40;
        tableroBotones[4][0] = b41;
        tableroBotones[4][1] = b42;
        tableroBotones[4][2] = b43;
        tableroBotones[4][3] = b44;
        tableroBotones[4][4] = b45;
        tableroBotones[4][5] = b46;
        tableroBotones[4][6] = b47;
        tableroBotones[4][7] = b48;
        tableroBotones[4][8] = b49;
        tableroBotones[4][9] = b50;
        tableroBotones[5][0] = b51;
        tableroBotones[5][1] = b52;
        tableroBotones[5][2] = b53;
        tableroBotones[5][3] = b54;
        tableroBotones[5][4] = b55;
        tableroBotones[5][5] = b56;
        tableroBotones[5][6] = b57;
        tableroBotones[5][7] = b58;
        tableroBotones[5][8] = b59;
        tableroBotones[5][9] = b60;
        tableroBotones[6][0] = b61;
        tableroBotones[6][1] = b62;
        tableroBotones[6][2] = b63;
        tableroBotones[6][3] = b64;
        tableroBotones[6][4] = b65;
        tableroBotones[6][5] = b66;
        tableroBotones[6][6] = b67;
        tableroBotones[6][7] = b68;
        tableroBotones[6][8] = b69;
        tableroBotones[6][9] = b70;
        tableroBotones[7][0] = b71;
        tableroBotones[7][1] = b72;
        tableroBotones[7][2] = b73;
        tableroBotones[7][3] = b74;
        tableroBotones[7][4] = b75;
        tableroBotones[7][5] = b76;
        tableroBotones[7][6] = b77;
        tableroBotones[7][7] = b78;
        tableroBotones[7][8] = b79;
        tableroBotones[7][9] = b80;
        tableroBotones[8][0] = b81;
        tableroBotones[8][1] = b82;
        tableroBotones[8][2] = b83;
        tableroBotones[8][3] = b84;
        tableroBotones[8][4] = b85;
        tableroBotones[8][5] = b86;
        tableroBotones[8][6] = b87;
        tableroBotones[8][7] = b88;
        tableroBotones[8][8] = b89;
        tableroBotones[8][9] = b90;
        tableroBotones[9][0] = b91;
        tableroBotones[9][1] = b92;
        tableroBotones[9][2] = b93;
        tableroBotones[9][3] = b94;
        tableroBotones[9][4] = b95;
        tableroBotones[9][5] = b96;
        tableroBotones[9][6] = b97;
        tableroBotones[9][7] = b98;
        tableroBotones[9][8] = b99;
        tableroBotones[9][9] = b100;
        
for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            if (tableroBotones[i][j] != null) {
                Borders[i][j] = tableroBotones[i][j].getBorder();
            }
            }
        }
        
        ValorFichas();
        inicializarFormacion(villanos, true);
        inicializarFormacion(heroes, false);

        if (Cuentas.gameMode.equals("Tutorial")) {
            revelarFichas();
        } else {
            ocultarFichas();
        }
        
        actualizarTitulo();
        
        
        tituloheroes.setText("Turno: " + turno);
    }
    
    public ProyectoStratego() {
        this(null, null, null, "Heroes");
    }
    
    
    
    private void pintaropciones(int fila, int columna) {
        int rango = fichas[fila][columna].getRango();
        int filaup;
        int columnaup;
        int filaleft;
        int columnaleft;
        int filaright;
        int columnaright;
        int filadown;
        int columnadown;

        if (rango != 2) {

            filaup = fila - 1;
            columnaup = columna;
            if (filaup >= 0 && movvalido(fila, columna, filaup, columnaup) && !((filaup == 4 || filaup == 5) && (columnaup == 2 || columnaup == 3 || columnaup == 6 || columnaup == 7))) {
                tableroBotones[filaup][columnaup].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

            }

            filadown = fila + 1;
            columnadown = columna;
            if (filadown < 10 && movvalido(fila, columna, filadown, columnadown) && !((filadown == 4 || filadown == 5) && (columnadown == 2 || columnadown == 3 || columnadown == 6 || columnadown == 7))) {
                tableroBotones[filadown][columnadown].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

            }

            filaleft = fila;
            columnaleft = columna - 1;
            if (columnaleft >= 0 && movvalido(fila, columna, filaleft, columnaleft) && !((filaleft == 4 || filaleft == 5) && (columnaleft == 2 || columnaleft == 3 || columnaleft == 6 || columnaleft == 7))) {
                tableroBotones[filaleft][columnaleft].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

            }

            filaright = fila;
            columnaright = columna + 1;
            if (columnaright < 10 && movvalido(fila, columna, filaright, columnaright) && !((filaright == 4 || filaright == 5) && (columnaright == 2 || columnaright == 3 || columnaright == 6 || columnaright == 7))) {
                tableroBotones[filaright][columnaright].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

            }

        } else {

            filaup = fila - 1;
            columnaup = columna;
            while (filaup >= 0) {
                if (!((filaup == 4 || filaup == 5) && (columnaup == 2 || columnaup == 3 || columnaup == 6 || columnaup == 7)) && fichas[filaup][columnaup] == null) {
                    tableroBotones[filaup][columnaup].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    filaup--;
                } else {
                    if (filaup >= 0 && !((filaup == 4 || filaup == 5) && (columnaup == 2 || columnaup == 3 || columnaup == 6 || columnaup == 7)) && fichas[filaup][columnaup] != null && !fichas[filaup][columnaup].getTipo().equals(turno)) {
                        tableroBotones[filaup][columnaup].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    }
                    break;
                }
            }

            filadown = fila + 1;
            columnadown = columna;
            while (filadown < 10) {
                if (!((filadown == 4 || filadown == 5) && (columnadown == 2 || columnadown == 3 || columnadown == 6 || columnadown == 7)) && fichas[filadown][columnadown] == null) {
                    tableroBotones[filadown][columnadown].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    filadown++;
                } else {
                    if (filadown < 10 && !((filadown == 4 || filadown == 5) && (columnadown == 2 || columnadown == 3 || columnadown == 6 || columnadown == 7)) && fichas[filadown][columnadown] != null && !fichas[filadown][columnadown].getTipo().equals(turno)) {
                        tableroBotones[filadown][columnadown].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    }
                    break;
                }
            }

            filaleft = fila;
            columnaleft = columna - 1;
            while (columnaleft >= 0) {
                if (!((filaleft == 4 || filaleft == 5) && (columnaleft == 2 || columnaleft == 3 || columnaleft == 6 || columnaleft == 7)) && fichas[filaleft][columnaleft] == null) {
                    tableroBotones[filaleft][columnaleft].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    columnaleft--;
                } else {
                    if (columnaleft >= 0 && !((filaleft == 4 || filaleft == 5) && (columnaleft == 2 || columnaleft == 3 || columnaleft == 6 || columnaleft == 7)) && fichas[filaleft][columnaleft] != null && !fichas[filaleft][columnaleft].getTipo().equals(turno)) {
                        tableroBotones[filaleft][columnaleft].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    }
                    break;
                }
            }

            filaright = fila;
            columnaright = columna + 1;
            while (columnaright < 10) {
                if (!((filaright == 4 || filaright == 5) && (columnaright == 2 || columnaright == 3 || columnaright == 6 || columnaright == 7)) && fichas[filaright][columnaright] == null) {
                    tableroBotones[filaright][columnaright].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    columnaright++;
                } else {
                    if (columnaright < 10 && !((filaright == 4 || filaright == 5) && (columnaright == 2 || columnaright == 3 || columnaright == 6 || columnaright == 7)) && fichas[filaright][columnaright] != null && !fichas[filaright][columnaright].getTipo().equals(turno)) {
                        tableroBotones[filaright][columnaright].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    }
                    break;
                }
            }
        }
    }
    
    private boolean vermovimientos() {
        for (int fila = 0; fila < 10; fila++) {

            for (int columna = 0; columna < 10; columna++) {

                Ficha ficha = fichas[fila][columna];
                if (ficha != null && ficha.getTipo().equals(turno)) {

                    int movimientos[][] = {
                        {-1, 0},
                        {1, 0},
                        {0, -1},
                        {0, 1},};

                    for (int moves = 0; moves < movimientos.length; moves++) {
                        int movfila = movimientos[moves][0];
                        int movcolumna = movimientos[moves][1];
                        int nuevafila = fila + movfila;
                        int nuevacolumna = columna + movcolumna;
                        if (nuevafila >= 0 && nuevafila < 10
                                && nuevacolumna >= 0 && nuevacolumna < 10) {
                            if (movvalido(fila, columna, nuevafila, nuevacolumna)) {
                                return true;
                            }
                        }
                    }
                }

            }
        }
        return false;
    }

    private void limpiarpintados() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tableroBotones[i][j].setBorder(Borders[i][j]);

            }
        }
    }
    private void ValorFichas() {

        heroes[0] = new Ficha("Beast", new ImageIcon(getClass().getResource(beast)), "Heroes", 3);
        heroes[1] = new Ficha("Black Widow", new ImageIcon(getClass().getResource(blackWidow)), "Heroes", 1);
        heroes[2] = new Ficha("Blade", new ImageIcon(getClass().getResource(blade)), "Heroes", 4);
        heroes[3] = new Ficha("Captain America", new ImageIcon(getClass().getResource(captainAmerica)), "Heroes", 9);
        heroes[4] = new Ficha("Punisher", new ImageIcon(getClass().getResource(punisher)), "Heroes", 4);
        heroes[5] = new Ficha("Colossus", new ImageIcon(getClass().getResource(colossus)), "Heroes", 3);
        heroes[6] = new Ficha("Cyclops", new ImageIcon(getClass().getResource(cyclops)), "Heroes", 5);
        heroes[7] = new Ficha("Daredevil", new ImageIcon(getClass().getResource(daredevil)), "Heroes", 6);
        heroes[8] = new Ficha("Dr Strange", new ImageIcon(getClass().getResource(drStrange)), "Heroes", 2);
        heroes[9] = new Ficha("Thing", new ImageIcon(getClass().getResource(thing)), "Heroes", 4);
        heroes[10] = new Ficha("Emma Frost", new ImageIcon(getClass().getResource(emmaFrost)), "Heroes", 3);
        heroes[11] = new Ficha("Ghost Rider", new ImageIcon(getClass().getResource(ghostRider)), "Heroes", 4);
        heroes[12] = new Ficha("Giant Man", new ImageIcon(getClass().getResource(giantMan)), "Heroes", 3);
        heroes[13] = new Ficha("Hulk", new ImageIcon(getClass().getResource(hulk)), "Heroes", 6);
        heroes[14] = new Ficha("Human Torch", new ImageIcon(getClass().getResource(humanTorch)), "Heroes", 5);
        heroes[15] = new Ficha("Ice Man", new ImageIcon(getClass().getResource(iceMan)), "Heroes", 2);
        heroes[16] = new Ficha("Invisible Woman", new ImageIcon(getClass().getResource(invisibleWoman)), "Heroes", 5);
        heroes[17] = new Ficha("Iron Man", new ImageIcon(getClass().getResource(ironMan)), "Heroes", 6);
        heroes[18] = new Ficha("Nightcrawler", new ImageIcon(getClass().getResource(nightcrawler)), "Heroes", 2);
        heroes[19] = new Ficha("Mr Fantastic", new ImageIcon(getClass().getResource(mrFantastic)), "Heroes", 10);
        heroes[20] = new Ficha("Namor", new ImageIcon(getClass().getResource(namor)), "Heroes", 7);
        heroes[21] = new Ficha("Nick Fury", new ImageIcon(getClass().getResource(nickFury)), "Heroes", 8);
        heroes[22] = new Ficha("Phoenix", new ImageIcon(getClass().getResource(phoenix)), "Heroes", 2);
        heroes[23] = new Ficha("Proffesor X", new ImageIcon(getClass().getResource(proffesorX)), "Heroes", 8);
        heroes[24] = new Ficha("She-Hulk", new ImageIcon(getClass().getResource(sheHulk)), "Heroes", 3);
        heroes[25] = new Ficha("Silver Surfer", new ImageIcon(getClass().getResource(silverSurfer)), "Heroes", 6);
        heroes[26] = new Ficha("Spider Girl", new ImageIcon(getClass().getResource(spiderGirl)), "Heroes", 2);
        heroes[27] = new Ficha("Spider Man", new ImageIcon(getClass().getResource(spiderMan)), "Heroes", 7);
        heroes[28] = new Ficha("Storm", new ImageIcon(getClass().getResource(storm)), "Heroes", 2);
        heroes[29] = new Ficha("Thor", new ImageIcon(getClass().getResource(thor)), "Heroes", 5);
        heroes[30] = new Ficha("Wolverine", new ImageIcon(getClass().getResource(wolverine)), "Heroes", 7);
        heroes[31] = new Ficha("Elektra", new ImageIcon(getClass().getResource(elektra)), "Heroes", 2);
        heroes[32] = new Ficha("Gambit", new ImageIcon(getClass().getResource(gambit)), "Heroes", 2);
        heroes[33] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[34] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[35] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[36] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[37] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[38] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[39] = new Ficha("Planeta Tierra", new ImageIcon(getClass().getResource(planetaTierra)), "Heroes", 20);

        villanos[0] = new Ficha("Dr Doom", new ImageIcon(getClass().getResource(drDoom)), "Villanos", 10);
        villanos[1] = new Ficha("Galactus", new ImageIcon(getClass().getResource(galactus)), "Villanos", 9);
        villanos[2] = new Ficha("Kingpin", new ImageIcon(getClass().getResource(kingpin)), "Villanos", 8);
        villanos[3] = new Ficha("Magneto", new ImageIcon(getClass().getResource(magneto)), "Villanos", 8);
        villanos[4] = new Ficha("Apocalypse", new ImageIcon(getClass().getResource(apocalypse)), "Villanos", 7);
        villanos[5] = new Ficha("Green Goblin", new ImageIcon(getClass().getResource(greenGoblin)), "Villanos", 7);
        villanos[6] = new Ficha("Venom", new ImageIcon(getClass().getResource(venom)), "Villanos", 7);
        villanos[7] = new Ficha("Bullseye", new ImageIcon(getClass().getResource(bullseye)), "Villanos", 6);
        villanos[8] = new Ficha("Omega Red", new ImageIcon(getClass().getResource(omegaRed)), "Villanos", 6);
        villanos[9] = new Ficha("Onslaught", new ImageIcon(getClass().getResource(onslaught)), "Villanos", 6);
        villanos[10] = new Ficha("Red Skull", new ImageIcon(getClass().getResource(redSkull)), "Villanos", 6);
        villanos[11] = new Ficha("Mystique", new ImageIcon(getClass().getResource(mystyque)), "Villanos", 5);
        villanos[12] = new Ficha("Mysterio", new ImageIcon(getClass().getResource(mysterio)), "Villanos", 5);
        villanos[13] = new Ficha("Dr Octopus", new ImageIcon(getClass().getResource(drOctopus)), "Villanos", 5);
        villanos[14] = new Ficha("Deadpool", new ImageIcon(getClass().getResource(deadpool)), "Villanos", 5);
        villanos[15] = new Ficha("Abomination", new ImageIcon(getClass().getResource(abomination)), "Villanos", 4);
        villanos[16] = new Ficha("Thanos", new ImageIcon(getClass().getResource(thanos)), "Villanos", 4);
        villanos[17] = new Ficha("Black Cat", new ImageIcon(getClass().getResource(blackcat)), "Villanos", 4);
        villanos[18] = new Ficha("Sabretooth", new ImageIcon(getClass().getResource(sabretooth)), "Villanos", 4);
        villanos[19] = new Ficha("Juggernaut", new ImageIcon(getClass().getResource(juggernaut)), "Villanos", 3);
        villanos[20] = new Ficha("Rhino", new ImageIcon(getClass().getResource(rhino)), "Villanos", 3);
        villanos[21] = new Ficha("Carnage", new ImageIcon(getClass().getResource(carnage)), "Villanos", 3);
        villanos[22] = new Ficha("Mole Man", new ImageIcon(getClass().getResource(moleMan)), "Villanos", 3);
        villanos[23] = new Ficha("Lizard", new ImageIcon(getClass().getResource(lizard)), "Villanos", 3);
        villanos[24] = new Ficha("Mr.Sinister", new ImageIcon(getClass().getResource(mrSinister)), "Villanos", 2);
        villanos[25] = new Ficha("Sentinel 1", new ImageIcon(getClass().getResource(sentinel1)), "Villanos", 2);
        villanos[26] = new Ficha("Ultron", new ImageIcon(getClass().getResource(ultron)), "Villanos", 2);
        villanos[27] = new Ficha("Sandman", new ImageIcon(getClass().getResource(sandman)), "Villanos", 2);
        villanos[28] = new Ficha("Leader", new ImageIcon(getClass().getResource(leader)), "Villanos", 2);
        villanos[29] = new Ficha("Viper", new ImageIcon(getClass().getResource(viper)), "Villanos", 2);
        villanos[30] = new Ficha("Sentinel 2", new ImageIcon(getClass().getResource(sentinel2)), "Villanos", 2);
        villanos[31] = new Ficha("Electro", new ImageIcon(getClass().getResource(electro)), "Villanos", 2);
        villanos[32] = new Ficha("Black Widow", new ImageIcon(getClass().getResource(blackWidowVillana)), "Villanos", 1);
        villanos[33] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[34] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[35] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[36] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[37] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[38] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[39] = new Ficha("Tierra Villanos", new ImageIcon(getClass().getResource(tierraVillanos)), "Villanos", 20);
    }
private void Click(int fila, int columna) {
    if (Batalla) return; // No hacer nada si una batalla está en curso
    limpiarpintados();
    ficharevelar.setIcon(null);

    // No se puede mover a las zonas de agua
    if (fichaseleccionada != null && ((fila == 4 || fila == 5)
            && (columna == 2 || columna == 3 || columna == 6 || columna == 7))) {
        JOptionPane.showMessageDialog(this, "Esta es una zona prohibida", "Movimiento no valido", JOptionPane.PLAIN_MESSAGE);
        fichaseleccionada = null;
        return;
    }

    // --- SELECCIÓN DE FICHA ---
    if (fichaseleccionada == null && fichas[fila][columna] != null) {
        // Verificar si es el turno del jugador correcto
        if (!fichas[fila][columna].getTipo().equals(turno)) {
            JOptionPane.showMessageDialog(this, "TURNO DEL RIVAL!!!!!", "", JOptionPane.PLAIN_MESSAGE);
            fichaseleccionada = null;
            return;
        }
        
        // Asignar la ficha seleccionada
        fichaseleccionada = fichas[fila][columna];
        filasalida = fila;
        colsalida = columna;
        pintaropciones(filasalida, colsalida);

        // Revelar la ficha seleccionada en el panel lateral
        ficharevelar.setIcon(Cambiartamano(fichaseleccionada.getIcono(), ficharevelar.getWidth(), ficharevelar.getHeight()));
        return;
    }

    // --- MOVIMIENTO O ATAQUE DE FICHA ---
    if (fichaseleccionada != null) {
        // Validar que la ficha seleccionada pueda moverse
        if (fichaseleccionada.getRango() == 15 || fichaseleccionada.getRango() == 20) {
            JOptionPane.showMessageDialog(this, "Esta ficha no puede moverse", "", JOptionPane.PLAIN_MESSAGE);
            fichaseleccionada = null;
            return;
        }
        
        // Validar si el movimiento es legal en el tablero
        if (!movvalido(filasalida, colsalida, fila, columna)) {
            JOptionPane.showMessageDialog(this, "Movimiento no válido", "", JOptionPane.PLAIN_MESSAGE);
            fichaseleccionada = null;
            return;
        }
        
        Ficha destino = fichas[fila][columna];

        // CONDICIÓN DE VICTORIA: CAPTURAR TIERRA
        if (destino != null && destino.getRango() == 20) {
            if (!fichaseleccionada.getTipo().equals(destino.getTipo())) {
                String ganadorNombreusuario = usuarioActual.getUsuario();
                String ganadorBandofaccion = userFaction;
                String perdedorNombreusuario = gameMenu.getOpponentUser().getUsuario();
                String perdedorBandofaccion = opponentFaction;

                JOptionPane.showMessageDialog(this, 
                    ganadorBandofaccion + " ha CAPTURADO la TIERRA de " + perdedorBandofaccion + "!\n¡" + ganadorBandofaccion + " ganan el juego!", 
                    "¡Juego Terminado!", JOptionPane.INFORMATION_MESSAGE);
                
                terminarJuego("EARTH_CAPTURE", 5, ganadorNombreusuario, ganadorBandofaccion, perdedorNombreusuario, perdedorBandofaccion);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "No puedes moverte a tu propia TIERRA o atacarla.", "Movimiento no válido", JOptionPane.PLAIN_MESSAGE);
                fichaseleccionada = null;
                return;
            }
        }
        
        // ATAQUE A UNA BOMBA
        if (destino != null && destino.getRango() == 15) {
            if (fichaseleccionada.getRango() == 3) { // Minero desactiva bomba
                Colocareliminado(destino, Cambiartamano(destino.getIcono(), 46, 58));
                fichas[fila][columna] = fichaseleccionada;
                tableroBotones[fila][columna].setIcon(Cambiartamano(fichaseleccionada.getIcono(), 60, 63));
                fichas[filasalida][colsalida] = null;
                tableroBotones[filasalida][colsalida].setIcon(null);
            } else { // Otra ficha es eliminada por la bomba
                Colocareliminado(fichaseleccionada, Cambiartamano(fichaseleccionada.getIcono(), 46, 58));
                fichas[filasalida][colsalida] = null;
                tableroBotones[filasalida][colsalida].setIcon(null);
            }
        // INICIAR BATALLA
        } else if (destino != null && !destino.getTipo().equals(fichaseleccionada.getTipo())) {
            ficha1 = fichaseleccionada;
            ficha2 = destino;
            filaficha1 = filasalida; 
            colficha1 = colsalida;
            filaficha2 = fila; 
            colficha2 = columna;
            Batalla(ficha1, ficha2);
            Batalla = true;
            return; // Detener ejecución hasta que la batalla termine
        // MOVIMIENTO A CASILLA ALIDADA
        } else if (destino != null && destino.getTipo().equals(fichaseleccionada.getTipo())) {
            JOptionPane.showMessageDialog(this, "No puedes moverte hacia un aliado", "ERROR", JOptionPane.PLAIN_MESSAGE);
            fichaseleccionada = null;
            return;
        // MOVIMIENTO A CASILLA VACÍA
        } else {
            fichas[fila][columna] = fichaseleccionada;
            tableroBotones[fila][columna].setIcon(Cambiartamano(fichaseleccionada.getIcono(), 60, 63));
            fichas[filasalida][colsalida] = null;
            tableroBotones[filasalida][colsalida].setIcon(null);
        }

        // --- FINALIZAR TURNO ---
        turno = turno.equals("Heroes") ? "Villanos" : "Heroes";
        actualizarTitulo(); 

        if (Logica.Cuentas.gameMode.equals("Classic")) {
            ocultarFichas();
        } else {
            revelarFichas();
        }
        limpiarpintados();
        fichaseleccionada = null;

        // Verificar si el oponente tiene movimientos
        if (!vermovimientos()) {
            String ganadorNombreusuario = usuarioActual.getUsuario();
            String ganadorBandofaccion = userFaction;
            String perdedorNombreusuario = gameMenu.getOpponentUser().getUsuario();
            String perdedorBandofaccion = opponentFaction;

            JOptionPane.showMessageDialog(this, 
                perdedorBandofaccion + " no tiene movimientos posibles.\n¡Fin del juego!", 
                "Juego terminado", JOptionPane.INFORMATION_MESSAGE);
            terminarJuego("NO_MOVES", -3, ganadorNombreusuario, ganadorBandofaccion, perdedorNombreusuario, perdedorBandofaccion);
        }
    }
}

    private void guardar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Ficha ficha = fichas[i][j];
                if (ficha != null && !ficha.getTipo().equals(userFaction)) {
                    guardariconos[i][j] = (ImageIcon) tableroBotones[i][j].getIcon();
                } else {
                    guardariconos[i][j] = null; 
                }
            }
        }
    }
     private void actualizarTitulo() {
        this.setTitle("Stratego Marvel - Turno de: " + turno);
    }

 private void ocultarFichas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (fichas[i][j] != null) { // Si hay una ficha en la casilla
                    tableroBotones[i][j].setIcon(null); // Oculta el ícono
                    tableroBotones[i][j].setText("?");   // Muestra un signo de interrogación
                } else { // Si la casilla está vacía
                    tableroBotones[i][j].setIcon(null);
                    tableroBotones[i][j].setText("");
                }
            }
        }
    }
    
    private void revelarFichas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (fichas[i][j] != null) { // Only show pieces if there is one
                    tableroBotones[i][j].setIcon(Cambiartamano(fichas[i][j].getIcono(), 60, 63));
                    tableroBotones[i][j].setText("");
                } else {
                    // If it's an empty spot, ensure no text or icon
                    tableroBotones[i][j].setIcon(null);
                    tableroBotones[i][j].setText("");
                }
            }
        }
    }

    private boolean movvalido(int filasalida, int colsalida, int filadestino, int coldestino) {
        Ficha ficha = fichas[filasalida][colsalida];
        int rango = ficha.getRango();

        if (rango != 2) {
            if (filasalida == filadestino && (coldestino == colsalida + 1 || coldestino == colsalida - 1)) {
                return puedeOcupar(filadestino, coldestino, ficha);
            }
            if (colsalida == coldestino && (filadestino == filasalida + 1 || filadestino == filasalida - 1)) {
                return puedeOcupar(filadestino, coldestino, ficha);
            }
            return false;
        }

        if (filasalida == filadestino) {
            int paso;
            if (coldestino > colsalida) {
                paso = 1;
            } else {
                paso = -1;
            }
            for (int c = colsalida + paso; c != coldestino; c += paso) {
                if (fichas[filasalida][c] != null) {
                    return false;
                }
            }
            return puedeOcupar(filadestino, coldestino, ficha);
        }

        if (colsalida == coldestino) {
            int paso;
            if (filadestino > filasalida) {
                paso = 1;
            } else {
                paso = -1;
            }
            for (int f = filasalida + paso; f != filadestino; f += paso) {
                if (fichas[f][colsalida] != null) {
                    return false;
                }
            }
            return puedeOcupar(filadestino, coldestino, ficha);
        }

        return false;
    }

    private boolean puedeOcupar(int fila, int col, Ficha moverficha) {
        Ficha fichadestino = fichas[fila][col];
        if (fichadestino == null) {

            return true;
        }

        return !fichadestino.getTipo().equals(moverficha.getTipo());
    }


   
private void Batalla(Ficha ficha1, Ficha ficha2) {
        if (ficha1.getTipo().equals("Heroes")) {
            HeroeBatalla.setIcon(Cambiartamano(ficha1.getIcono(), HeroeBatalla.getWidth(), HeroeBatalla.getHeight()));
            VillanoBatalla.setIcon(Cambiartamano(ficha2.getIcono(), VillanoBatalla.getWidth(), VillanoBatalla.getHeight()));
        } else {
            HeroeBatalla.setIcon(Cambiartamano(ficha2.getIcono(), HeroeBatalla.getWidth(), HeroeBatalla.getHeight()));
            VillanoBatalla.setIcon(Cambiartamano(ficha1.getIcono(), VillanoBatalla.getWidth(), VillanoBatalla.getHeight()));
        }

        Fondopanelpelea.setVisible(true);
        HeroeBatalla.setVisible(true);
        VillanoBatalla.setVisible(true);
        VS.setVisible(true);
        conteobatalla.setVisible(true);
        resultadoheroe.setVisible(false);
        resultadovillano.setVisible(false);
        continuar.setVisible(false);

        boolean ganaficha1 = false;

        if (ficha1.getRango() == 1 && ficha2.getRango() == 10) {
            ganaficha1 = true;
        } 
        else if (ficha1.getRango() == 3 && ficha2.getRango() == 15) {
            ganaficha1 = true;
        }
        else if (ficha1.getRango() > ficha2.getRango()) {
            ganaficha1 = true;
        }

        if (ganaficha1) {
            if (ficha1.getTipo().equals("Heroes")) {
                resultadoheroe.setIcon(new ImageIcon(getClass().getResource(WINS)));
                resultadovillano.setIcon(new ImageIcon(getClass().getResource(LOSE)));
            } else {
                resultadoheroe.setIcon(new ImageIcon(getClass().getResource(LOSE)));
                resultadovillano.setIcon(new ImageIcon(getClass().getResource(WINS)));
            }
        } else if (ficha1.getRango() == ficha2.getRango()) {
            resultadoheroe.setIcon(new ImageIcon(getClass().getResource(LOSE)));
            resultadovillano.setIcon(new ImageIcon(getClass().getResource(LOSE)));
        } else {
            if (ficha1.getTipo().equals("Heroes")) {
                resultadoheroe.setIcon(new ImageIcon(getClass().getResource(LOSE)));
                resultadovillano.setIcon(new ImageIcon(getClass().getResource(WINS)));
            } else {
                resultadoheroe.setIcon(new ImageIcon(getClass().getResource(WINS)));
                resultadovillano.setIcon(new ImageIcon(getClass().getResource(LOSE)));
            }
        }

        Batallaconteo = 3;
        if (battleTimer != null && battleTimer.isRunning()) battleTimer.stop();
        battleTimer = new Timer(1000, ev -> {
            if (Batallaconteo > 0) {
                conteobatalla.setText(String.valueOf(Batallaconteo));
            } else if (Batallaconteo == 0) {
                conteobatalla.setIcon(new ImageIcon(getClass().getResource(FIGHT)));
                conteobatalla.setText("");
            } else {
                resultadoheroe.setVisible(true);
                resultadovillano.setVisible(true);
                continuar.setVisible(true);
                ((Timer) ev.getSource()).stop();
            }
            Batallaconteo--;
        });
        battleTimer.setInitialDelay(0);
        battleTimer.start();
    }

   
   private void accionBotonRetirarse(java.awt.event.ActionEvent evt) {
        int confirmacion = JOptionPane.showConfirmDialog(
            this,
            "¿Esta seguro de que desea retirarse del juego?\n" +
            "Su oponente recibira 3 puntos y el juego terminara.",
            "Confirmar Retiro",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            String ganadorBandofaccion = turno.equals("Heroes") ? "Villanos" : "Heroes";
            String ganadorNombreusuario = (userFaction.equals(ganadorBandofaccion)) ? usuarioActual.getUsuario() : gameMenu.getOpponentUser().getUsuario();
            String perdedorNombreusuario = (userFaction.equals(turno)) ? usuarioActual.getUsuario() : gameMenu.getOpponentUser().getUsuario();
            String perdedorBandofaccion = userFaction;
            
            terminarJuego("RETREAT", 3, ganadorNombreusuario, ganadorBandofaccion, perdedorNombreusuario, perdedorBandofaccion);
        }
    }
   
    private void inicializarFormacion(Ficha[] fichasBando, boolean esVillano) {
        int filaTierra = esVillano ? 9 : 0;
        int colTierra;
        do {
            colTierra = random.nextInt(8) + 1;
        } while (colTierra == 0 || colTierra == 9);

        Ficha tierra = fichasBando[39];
        fichas[filaTierra][colTierra] = tierra;
        tableroBotones[filaTierra][colTierra].setIcon(Cambiartamano(tierra.getIcono(), 60, 63));

        int filaArriba = esVillano ? 8 : 1;
        int[][] alrededor = {
            {filaTierra, colTierra - 1},
            {filaTierra, colTierra + 1},
            {filaArriba, colTierra},
            {filaArriba, colTierra - 1},
            {filaArriba, colTierra + 1}
        };

        int bombasColocadas = 0;
        for (int[] pos : alrededor) {
            int f = pos[0], c = pos[1];
            if (f >= 0 && f < 10 && c >= 0 && c < 10 && fichas[f][c] == null) {
                Ficha bomba = fichasBando[33 + bombasColocadas];
                fichas[f][c] = bomba;
                tableroBotones[f][c].setIcon(Cambiartamano(bomba.getIcono(), 60, 63));
                bombasColocadas++;
            }
        }

        int filaExtra1 = esVillano ? 9 : 0;
        int filaExtra2 = esVillano ? 8 : 1;
        for (int i = bombasColocadas; i < 6; i++) {
            while (true) {
                int f = random.nextBoolean() ? filaExtra1 : filaExtra2;
                int c = random.nextInt(10);
                if (fichas[f][c] == null) {
                    Ficha bomba = fichasBando[33 + i];
                    fichas[f][c] = bomba;
                    tableroBotones[f][c].setIcon(Cambiartamano(bomba.getIcono(), 60, 63));
                    break;
                }
            }
        }

        int filaR1 = esVillano ? 6 : 2;
        int filaR2 = esVillano ? 7 : 3;
        for (Ficha ficha : fichasBando) {
            if (ficha.getRango() == 2) {
                while (true) {
                    int f = random.nextBoolean() ? filaR1 : filaR2;
                    int c = random.nextInt(10);
                    if (fichas[f][c] == null) {
                        fichas[f][c] = ficha;
                        tableroBotones[f][c].setIcon(Cambiartamano(ficha.getIcono(), 60, 63));
                        break;
                    }
                }
            }
        }

        int filaMin = esVillano ? 6 : 0;
        int filaMax = esVillano ? 9 : 3;
        for (Ficha ficha : fichasBando) {

            boolean colocada = false;
            for (int f = filaMin; f <= filaMax; f++) {
                for (int c = 0; c < 10; c++) {
                    if (fichas[f][c] == ficha) {
                        colocada = true;
                        break;
                    }
                }
                if (colocada) {
                    break;
                }
            }

            if (!colocada) {
                while (true) {
                    int f = filaMin + random.nextInt(filaMax - filaMin + 1);
                    int c = random.nextInt(10);
                    if (fichas[f][c] == null) {
                        fichas[f][c] = ficha;
                        tableroBotones[f][c].setIcon(Cambiartamano(ficha.getIcono(), 60, 63));
                        break;
                    }
                }
            }
        }
    }

   public void terminarJuego(String tipoResultado, int puntuacionFinal, String nombreUsuarioGanador, String faccionGanadora, String nombreUsuarioPerdedor, String faccionPerdedora) {
        this.dispose();

        if (gameMenu != null) {
            Logica.juego registroPartida = new Logica.juego(nombreUsuarioGanador, faccionGanadora, nombreUsuarioPerdedor, faccionPerdedora, tipoResultado, puntuacionFinal);
            gameMenu.partidaTerminada(registroPartida, puntuacionFinal);
        } else {
            JOptionPane.showMessageDialog(null, "Partida terminada: " + tipoResultado + " con " + puntuacionFinal + " puntos.");
        }
    }
 
private int contarFichasRestantes(String turno) {
        int contador = 0;
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                Ficha ficha = fichas[fila][columna];
                if (ficha != null && ficha.getTipo().equals(turno) && ficha.getRango() != 15 && ficha.getRango() != 20) {
                    contador++;
                }
            }
        }
        return contador;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        continuar = new javax.swing.JButton();
        resultadovillano = new javax.swing.JLabel();
        resultadoheroe = new javax.swing.JLabel();
        conteobatalla = new javax.swing.JLabel();
        VillanoBatalla = new javax.swing.JLabel();
        VS = new javax.swing.JLabel();
        HeroeBatalla = new javax.swing.JLabel();
        Fondopanelpelea = new javax.swing.JLabel();
        rendirse = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        b40 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b47 = new javax.swing.JButton();
        b48 = new javax.swing.JButton();
        b49 = new javax.swing.JButton();
        b50 = new javax.swing.JButton();
        b51 = new javax.swing.JButton();
        b52 = new javax.swing.JButton();
        b53 = new javax.swing.JButton();
        b54 = new javax.swing.JButton();
        b55 = new javax.swing.JButton();
        b56 = new javax.swing.JButton();
        b57 = new javax.swing.JButton();
        b58 = new javax.swing.JButton();
        b59 = new javax.swing.JButton();
        b60 = new javax.swing.JButton();
        b61 = new javax.swing.JButton();
        b62 = new javax.swing.JButton();
        b63 = new javax.swing.JButton();
        b64 = new javax.swing.JButton();
        b65 = new javax.swing.JButton();
        b66 = new javax.swing.JButton();
        b67 = new javax.swing.JButton();
        b68 = new javax.swing.JButton();
        b69 = new javax.swing.JButton();
        b70 = new javax.swing.JButton();
        b71 = new javax.swing.JButton();
        b72 = new javax.swing.JButton();
        b73 = new javax.swing.JButton();
        b74 = new javax.swing.JButton();
        b75 = new javax.swing.JButton();
        b76 = new javax.swing.JButton();
        b77 = new javax.swing.JButton();
        b78 = new javax.swing.JButton();
        b79 = new javax.swing.JButton();
        b80 = new javax.swing.JButton();
        b81 = new javax.swing.JButton();
        b82 = new javax.swing.JButton();
        b83 = new javax.swing.JButton();
        b84 = new javax.swing.JButton();
        b85 = new javax.swing.JButton();
        b86 = new javax.swing.JButton();
        b87 = new javax.swing.JButton();
        b88 = new javax.swing.JButton();
        b89 = new javax.swing.JButton();
        b90 = new javax.swing.JButton();
        b91 = new javax.swing.JButton();
        b92 = new javax.swing.JButton();
        b93 = new javax.swing.JButton();
        b94 = new javax.swing.JButton();
        b95 = new javax.swing.JButton();
        b96 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b97 = new javax.swing.JButton();
        ficharevelar = new javax.swing.JLabel();
        b98 = new javax.swing.JButton();
        b99 = new javax.swing.JButton();
        b100 = new javax.swing.JButton();
        panelheroes = new javax.swing.JPanel();
        tituloheroes = new javax.swing.JLabel();
        heroe5 = new javax.swing.JLabel();
        heroe29 = new javax.swing.JLabel();
        heroe14 = new javax.swing.JLabel();
        heroe31 = new javax.swing.JLabel();
        heroe6 = new javax.swing.JLabel();
        heroe32 = new javax.swing.JLabel();
        heroe2 = new javax.swing.JLabel();
        heroe11 = new javax.swing.JLabel();
        heroe9 = new javax.swing.JLabel();
        heroe7 = new javax.swing.JLabel();
        heroe1 = new javax.swing.JLabel();
        heroe23 = new javax.swing.JLabel();
        heroe30 = new javax.swing.JLabel();
        heroe27 = new javax.swing.JLabel();
        heroe4 = new javax.swing.JLabel();
        heroe15 = new javax.swing.JLabel();
        heroe22 = new javax.swing.JLabel();
        heroe10 = new javax.swing.JLabel();
        heroe25 = new javax.swing.JLabel();
        heroe21 = new javax.swing.JLabel();
        heroe16 = new javax.swing.JLabel();
        heroe19 = new javax.swing.JLabel();
        heroe20 = new javax.swing.JLabel();
        heroe8 = new javax.swing.JLabel();
        heroe26 = new javax.swing.JLabel();
        heroe12 = new javax.swing.JLabel();
        heroe17 = new javax.swing.JLabel();
        heroe24 = new javax.swing.JLabel();
        heroe33 = new javax.swing.JLabel();
        heroe18 = new javax.swing.JLabel();
        heroe3 = new javax.swing.JLabel();
        heroe28 = new javax.swing.JLabel();
        heroe13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelvillanos = new javax.swing.JPanel();
        villano1 = new javax.swing.JLabel();
        villano1a = new javax.swing.JLabel();
        villano2a = new javax.swing.JLabel();
        villano4a = new javax.swing.JLabel();
        villano3a = new javax.swing.JLabel();
        villano5a = new javax.swing.JLabel();
        villano6a = new javax.swing.JLabel();
        villano7a = new javax.swing.JLabel();
        villano8a = new javax.swing.JLabel();
        villanoa9 = new javax.swing.JLabel();
        villanoa10 = new javax.swing.JLabel();
        villanoa11 = new javax.swing.JLabel();
        villanoa12 = new javax.swing.JLabel();
        villanoa13 = new javax.swing.JLabel();
        villanoa14 = new javax.swing.JLabel();
        villanoa15 = new javax.swing.JLabel();
        villanoa16 = new javax.swing.JLabel();
        villanoa17 = new javax.swing.JLabel();
        villanoa18 = new javax.swing.JLabel();
        villanoa19 = new javax.swing.JLabel();
        villanoa20 = new javax.swing.JLabel();
        villanoa21 = new javax.swing.JLabel();
        villanoa22 = new javax.swing.JLabel();
        villanoa23 = new javax.swing.JLabel();
        villanoa24 = new javax.swing.JLabel();
        villanoa25 = new javax.swing.JLabel();
        villanoa26 = new javax.swing.JLabel();
        villanoa27 = new javax.swing.JLabel();
        villanoa28 = new javax.swing.JLabel();
        villanoa29 = new javax.swing.JLabel();
        villanoa34 = new javax.swing.JLabel();
        villanoa31 = new javax.swing.JLabel();
        villanoa32 = new javax.swing.JLabel();
        villanoa30 = new javax.swing.JLabel();
        Doradofondo = new javax.swing.JLabel();
        Doradofondoheroes = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        continuar.setBackground(new java.awt.Color(0, 0, 0));
        continuar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        continuar.setForeground(new java.awt.Color(255, 255, 255));
        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        getContentPane().add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 540, 100, 50));
        getContentPane().add(resultadovillano, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 190, 140, 100));

        resultadoheroe.setBackground(new java.awt.Color(102, 255, 102));
        resultadoheroe.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        resultadoheroe.setForeground(new java.awt.Color(102, 255, 102));
        getContentPane().add(resultadoheroe, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 140, 100));

        conteobatalla.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        conteobatalla.setForeground(new java.awt.Color(255, 255, 255));
        conteobatalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(conteobatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 200, 90));
        getContentPane().add(VillanoBatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 290, 170, 150));
        getContentPane().add(VS, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 100, 80));
        getContentPane().add(HeroeBatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 170, 150));
        getContentPane().add(Fondopanelpelea, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 1141, -1));

        rendirse.setBackground(new java.awt.Color(0, 0, 0));
        rendirse.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rendirse.setForeground(new java.awt.Color(255, 255, 255));
        rendirse.setText("Retirarse");
        rendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendirseActionPerformed(evt);
            }
        });
        getContentPane().add(rendirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        b3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b3.setForeground(new java.awt.Color(204, 204, 0));
        b3.setContentAreaFilled(false);
        b3.setPreferredSize(new java.awt.Dimension(50, 23));
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 710, 60, 60));

        b2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b2.setForeground(new java.awt.Color(204, 204, 0));
        b2.setContentAreaFilled(false);
        b2.setPreferredSize(new java.awt.Dimension(50, 23));
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 710, 60, 60));

        b4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b4.setForeground(new java.awt.Color(204, 204, 0));
        b4.setContentAreaFilled(false);
        b4.setPreferredSize(new java.awt.Dimension(50, 23));
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 710, 60, 60));

        b5.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b5.setForeground(new java.awt.Color(204, 204, 0));
        b5.setContentAreaFilled(false);
        b5.setPreferredSize(new java.awt.Dimension(50, 23));
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b5MouseEntered(evt);
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 710, 60, 60));

        b6.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b6.setForeground(new java.awt.Color(204, 204, 0));
        b6.setContentAreaFilled(false);
        b6.setPreferredSize(new java.awt.Dimension(50, 23));
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b6MouseEntered(evt);
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 710, 60, 60));

        b7.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b7.setForeground(new java.awt.Color(204, 204, 0));
        b7.setContentAreaFilled(false);
        b7.setPreferredSize(new java.awt.Dimension(50, 23));
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b7MouseEntered(evt);
            }
        });
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 710, 60, 60));

        b8.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b8.setForeground(new java.awt.Color(204, 204, 0));
        b8.setContentAreaFilled(false);
        b8.setPreferredSize(new java.awt.Dimension(50, 23));
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b8MouseEntered(evt);
            }
        });
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 710, 60, 60));

        b9.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b9.setForeground(new java.awt.Color(204, 204, 0));
        b9.setContentAreaFilled(false);
        b9.setPreferredSize(new java.awt.Dimension(50, 23));
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b9MouseEntered(evt);
            }
        });
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 710, 60, 60));

        b10.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b10.setForeground(new java.awt.Color(204, 204, 0));
        b10.setContentAreaFilled(false);
        b10.setPreferredSize(new java.awt.Dimension(50, 23));
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b10MouseEntered(evt);
            }
        });
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 710, 60, 60));

        b11.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b11.setForeground(new java.awt.Color(204, 204, 0));
        b11.setContentAreaFilled(false);
        b11.setPreferredSize(new java.awt.Dimension(50, 23));
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b11MouseEntered(evt);
            }
        });
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 60, 60));

        b12.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b12.setForeground(new java.awt.Color(204, 204, 0));
        b12.setContentAreaFilled(false);
        b12.setPreferredSize(new java.awt.Dimension(50, 23));
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b12MouseEntered(evt);
            }
        });
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, 60, 60));

        b13.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b13.setForeground(new java.awt.Color(204, 204, 0));
        b13.setContentAreaFilled(false);
        b13.setPreferredSize(new java.awt.Dimension(50, 23));
        b13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b13MouseEntered(evt);
            }
        });
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, 60, 60));

        b14.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b14.setForeground(new java.awt.Color(204, 204, 0));
        b14.setContentAreaFilled(false);
        b14.setPreferredSize(new java.awt.Dimension(50, 23));
        b14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b14MouseEntered(evt);
            }
        });
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, 60, 60));

        b15.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b15.setForeground(new java.awt.Color(204, 204, 0));
        b15.setContentAreaFilled(false);
        b15.setPreferredSize(new java.awt.Dimension(50, 23));
        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b15MouseEntered(evt);
            }
        });
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 630, 60, 60));

        b16.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b16.setForeground(new java.awt.Color(204, 204, 0));
        b16.setContentAreaFilled(false);
        b16.setPreferredSize(new java.awt.Dimension(50, 23));
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b16MouseEntered(evt);
            }
        });
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 630, 60, 60));

        b17.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b17.setForeground(new java.awt.Color(204, 204, 0));
        b17.setContentAreaFilled(false);
        b17.setPreferredSize(new java.awt.Dimension(50, 23));
        b17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b17MouseEntered(evt);
            }
        });
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        getContentPane().add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 630, 60, 60));

        b18.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b18.setForeground(new java.awt.Color(204, 204, 0));
        b18.setContentAreaFilled(false);
        b18.setPreferredSize(new java.awt.Dimension(50, 23));
        b18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b18MouseEntered(evt);
            }
        });
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        getContentPane().add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 640, 60, 60));

        b19.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b19.setForeground(new java.awt.Color(204, 204, 0));
        b19.setContentAreaFilled(false);
        b19.setPreferredSize(new java.awt.Dimension(50, 23));
        b19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b19MouseEntered(evt);
            }
        });
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        getContentPane().add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 640, 60, 60));

        b21.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b21.setForeground(new java.awt.Color(204, 204, 0));
        b21.setContentAreaFilled(false);
        b21.setPreferredSize(new java.awt.Dimension(50, 23));
        b21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b21MouseEntered(evt);
            }
        });
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        getContentPane().add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 60, 60));

        b22.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b22.setForeground(new java.awt.Color(204, 204, 0));
        b22.setContentAreaFilled(false);
        b22.setPreferredSize(new java.awt.Dimension(50, 23));
        b22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b22MouseEntered(evt);
            }
        });
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        getContentPane().add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 60, 60));

        b23.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b23.setForeground(new java.awt.Color(204, 204, 0));
        b23.setContentAreaFilled(false);
        b23.setPreferredSize(new java.awt.Dimension(50, 23));
        b23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b23MouseEntered(evt);
            }
        });
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        getContentPane().add(b23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 60, 60));

        b24.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b24.setForeground(new java.awt.Color(204, 204, 0));
        b24.setContentAreaFilled(false);
        b24.setPreferredSize(new java.awt.Dimension(50, 23));
        b24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b24MouseEntered(evt);
            }
        });
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        getContentPane().add(b24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 60, 60));

        b25.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b25.setForeground(new java.awt.Color(204, 204, 0));
        b25.setContentAreaFilled(false);
        b25.setPreferredSize(new java.awt.Dimension(50, 23));
        b25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b25MouseEntered(evt);
            }
        });
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        getContentPane().add(b25, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 60, 60));

        b26.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b26.setForeground(new java.awt.Color(204, 204, 0));
        b26.setContentAreaFilled(false);
        b26.setPreferredSize(new java.awt.Dimension(50, 23));
        b26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b26MouseEntered(evt);
            }
        });
        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b26ActionPerformed(evt);
            }
        });
        getContentPane().add(b26, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 60, 60));

        b27.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b27.setForeground(new java.awt.Color(204, 204, 0));
        b27.setContentAreaFilled(false);
        b27.setPreferredSize(new java.awt.Dimension(50, 23));
        b27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b27MouseEntered(evt);
            }
        });
        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        getContentPane().add(b27, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 60, 60));

        b28.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b28.setForeground(new java.awt.Color(204, 204, 0));
        b28.setContentAreaFilled(false);
        b28.setPreferredSize(new java.awt.Dimension(50, 23));
        b28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b28MouseEntered(evt);
            }
        });
        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        getContentPane().add(b28, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 550, 60, 60));

        b29.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b29.setForeground(new java.awt.Color(204, 204, 0));
        b29.setContentAreaFilled(false);
        b29.setPreferredSize(new java.awt.Dimension(50, 23));
        b29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b29MouseEntered(evt);
            }
        });
        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        getContentPane().add(b29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 550, 60, 60));

        b30.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b30.setForeground(new java.awt.Color(204, 204, 0));
        b30.setContentAreaFilled(false);
        b30.setPreferredSize(new java.awt.Dimension(50, 23));
        b30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b30MouseEntered(evt);
            }
        });
        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b30ActionPerformed(evt);
            }
        });
        getContentPane().add(b30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 550, 60, 60));

        b31.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b31.setForeground(new java.awt.Color(204, 204, 0));
        b31.setContentAreaFilled(false);
        b31.setPreferredSize(new java.awt.Dimension(50, 23));
        b31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b31MouseEntered(evt);
            }
        });
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        getContentPane().add(b31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 60, 60));

        b32.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b32.setForeground(new java.awt.Color(204, 204, 0));
        b32.setBorderPainted(false);
        b32.setContentAreaFilled(false);
        b32.setPreferredSize(new java.awt.Dimension(50, 23));
        b32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b32MouseEntered(evt);
            }
        });
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        getContentPane().add(b32, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 60, 60));

        b33.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b33.setForeground(new java.awt.Color(204, 204, 0));
        b33.setContentAreaFilled(false);
        b33.setPreferredSize(new java.awt.Dimension(50, 23));
        b33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b33MouseEntered(evt);
            }
        });
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });
        getContentPane().add(b33, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 60, 60));

        b34.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b34.setForeground(new java.awt.Color(204, 204, 0));
        b34.setContentAreaFilled(false);
        b34.setPreferredSize(new java.awt.Dimension(50, 23));
        b34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b34MouseEntered(evt);
            }
        });
        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34ActionPerformed(evt);
            }
        });
        getContentPane().add(b34, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 60, 60));

        b35.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b35.setForeground(new java.awt.Color(204, 204, 0));
        b35.setContentAreaFilled(false);
        b35.setPreferredSize(new java.awt.Dimension(50, 23));
        b35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b35MouseEntered(evt);
            }
        });
        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b35ActionPerformed(evt);
            }
        });
        getContentPane().add(b35, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 60, 60));

        b36.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b36.setForeground(new java.awt.Color(204, 204, 0));
        b36.setContentAreaFilled(false);
        b36.setPreferredSize(new java.awt.Dimension(50, 23));
        b36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b36MouseEntered(evt);
            }
        });
        b36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b36ActionPerformed(evt);
            }
        });
        getContentPane().add(b36, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 60, 60));

        b37.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b37.setForeground(new java.awt.Color(204, 204, 0));
        b37.setContentAreaFilled(false);
        b37.setPreferredSize(new java.awt.Dimension(50, 23));
        b37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b37MouseEntered(evt);
            }
        });
        b37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b37ActionPerformed(evt);
            }
        });
        getContentPane().add(b37, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 60, 60));

        b38.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b38.setForeground(new java.awt.Color(204, 204, 0));
        b38.setContentAreaFilled(false);
        b38.setPreferredSize(new java.awt.Dimension(50, 23));
        b38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b38MouseEntered(evt);
            }
        });
        b38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b38ActionPerformed(evt);
            }
        });
        getContentPane().add(b38, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 60, 60));

        b39.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b39.setForeground(new java.awt.Color(204, 204, 0));
        b39.setContentAreaFilled(false);
        b39.setPreferredSize(new java.awt.Dimension(50, 23));
        b39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b39MouseEntered(evt);
            }
        });
        b39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b39ActionPerformed(evt);
            }
        });
        getContentPane().add(b39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 470, 60, 60));

        b40.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b40.setForeground(new java.awt.Color(204, 204, 0));
        b40.setContentAreaFilled(false);
        b40.setPreferredSize(new java.awt.Dimension(50, 23));
        b40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b40MouseEntered(evt);
            }
        });
        b40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b40ActionPerformed(evt);
            }
        });
        getContentPane().add(b40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 470, 60, 60));

        b42.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b42.setForeground(new java.awt.Color(204, 204, 0));
        b42.setContentAreaFilled(false);
        b42.setPreferredSize(new java.awt.Dimension(50, 23));
        b42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b42MouseEntered(evt);
            }
        });
        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b42ActionPerformed(evt);
            }
        });
        getContentPane().add(b42, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 60, 60));

        b43.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b43.setForeground(new java.awt.Color(204, 204, 0));
        b43.setContentAreaFilled(false);
        b43.setPreferredSize(new java.awt.Dimension(50, 23));
        b43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b43MouseEntered(evt);
            }
        });
        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b43ActionPerformed(evt);
            }
        });
        getContentPane().add(b43, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 60, 60));

        b44.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b44.setForeground(new java.awt.Color(204, 204, 0));
        b44.setContentAreaFilled(false);
        b44.setPreferredSize(new java.awt.Dimension(50, 23));
        b44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b44MouseEntered(evt);
            }
        });
        b44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b44ActionPerformed(evt);
            }
        });
        getContentPane().add(b44, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 60, 60));

        b45.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b45.setForeground(new java.awt.Color(204, 204, 0));
        b45.setContentAreaFilled(false);
        b45.setPreferredSize(new java.awt.Dimension(50, 23));
        b45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b45MouseEntered(evt);
            }
        });
        b45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b45ActionPerformed(evt);
            }
        });
        getContentPane().add(b45, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 60, 60));

        b46.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b46.setForeground(new java.awt.Color(204, 204, 0));
        b46.setContentAreaFilled(false);
        b46.setPreferredSize(new java.awt.Dimension(50, 23));
        b46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b46MouseEntered(evt);
            }
        });
        b46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b46ActionPerformed(evt);
            }
        });
        getContentPane().add(b46, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 60, 60));

        b47.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b47.setForeground(new java.awt.Color(204, 204, 0));
        b47.setContentAreaFilled(false);
        b47.setPreferredSize(new java.awt.Dimension(50, 23));
        b47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b47MouseEntered(evt);
            }
        });
        b47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b47ActionPerformed(evt);
            }
        });
        getContentPane().add(b47, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 60, 60));

        b48.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b48.setForeground(new java.awt.Color(204, 204, 0));
        b48.setContentAreaFilled(false);
        b48.setPreferredSize(new java.awt.Dimension(50, 23));
        b48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b48MouseEntered(evt);
            }
        });
        b48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b48ActionPerformed(evt);
            }
        });
        getContentPane().add(b48, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, 60, 60));

        b49.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b49.setForeground(new java.awt.Color(204, 204, 0));
        b49.setContentAreaFilled(false);
        b49.setPreferredSize(new java.awt.Dimension(50, 23));
        b49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b49MouseEntered(evt);
            }
        });
        b49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b49ActionPerformed(evt);
            }
        });
        getContentPane().add(b49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 400, 60, 60));

        b50.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b50.setForeground(new java.awt.Color(204, 204, 0));
        b50.setContentAreaFilled(false);
        b50.setPreferredSize(new java.awt.Dimension(50, 23));
        b50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b50MouseEntered(evt);
            }
        });
        b50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b50ActionPerformed(evt);
            }
        });
        getContentPane().add(b50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 400, 60, 60));

        b51.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b51.setForeground(new java.awt.Color(204, 204, 0));
        b51.setContentAreaFilled(false);
        b51.setPreferredSize(new java.awt.Dimension(50, 23));
        b51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b51MouseEntered(evt);
            }
        });
        b51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b51ActionPerformed(evt);
            }
        });
        getContentPane().add(b51, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 60, 60));

        b52.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b52.setForeground(new java.awt.Color(204, 204, 0));
        b52.setContentAreaFilled(false);
        b52.setPreferredSize(new java.awt.Dimension(50, 23));
        b52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b52MouseEntered(evt);
            }
        });
        b52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b52ActionPerformed(evt);
            }
        });
        getContentPane().add(b52, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 60, 60));

        b53.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b53.setForeground(new java.awt.Color(204, 204, 0));
        b53.setContentAreaFilled(false);
        b53.setPreferredSize(new java.awt.Dimension(50, 23));
        b53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b53MouseEntered(evt);
            }
        });
        b53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b53ActionPerformed(evt);
            }
        });
        getContentPane().add(b53, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 60, 60));

        b54.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b54.setForeground(new java.awt.Color(204, 204, 0));
        b54.setContentAreaFilled(false);
        b54.setPreferredSize(new java.awt.Dimension(50, 23));
        b54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b54MouseEntered(evt);
            }
        });
        b54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b54ActionPerformed(evt);
            }
        });
        getContentPane().add(b54, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 60, 60));

        b55.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b55.setForeground(new java.awt.Color(204, 204, 0));
        b55.setContentAreaFilled(false);
        b55.setPreferredSize(new java.awt.Dimension(50, 23));
        b55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b55MouseEntered(evt);
            }
        });
        b55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b55ActionPerformed(evt);
            }
        });
        getContentPane().add(b55, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 60, 60));

        b56.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b56.setForeground(new java.awt.Color(204, 204, 0));
        b56.setContentAreaFilled(false);
        b56.setPreferredSize(new java.awt.Dimension(50, 23));
        b56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b56MouseEntered(evt);
            }
        });
        b56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b56ActionPerformed(evt);
            }
        });
        getContentPane().add(b56, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 60, 60));

        b57.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b57.setForeground(new java.awt.Color(204, 204, 0));
        b57.setContentAreaFilled(false);
        b57.setPreferredSize(new java.awt.Dimension(50, 23));
        b57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b57MouseEntered(evt);
            }
        });
        b57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b57ActionPerformed(evt);
            }
        });
        getContentPane().add(b57, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 60, 60));

        b58.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b58.setForeground(new java.awt.Color(204, 204, 0));
        b58.setContentAreaFilled(false);
        b58.setPreferredSize(new java.awt.Dimension(50, 23));
        b58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b58MouseEntered(evt);
            }
        });
        b58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b58ActionPerformed(evt);
            }
        });
        getContentPane().add(b58, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, 60, 60));

        b59.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b59.setForeground(new java.awt.Color(204, 204, 0));
        b59.setContentAreaFilled(false);
        b59.setPreferredSize(new java.awt.Dimension(50, 23));
        b59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b59MouseEntered(evt);
            }
        });
        b59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b59ActionPerformed(evt);
            }
        });
        getContentPane().add(b59, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 60, 60));

        b60.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b60.setForeground(new java.awt.Color(204, 204, 0));
        b60.setContentAreaFilled(false);
        b60.setPreferredSize(new java.awt.Dimension(50, 23));
        b60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b60MouseEntered(evt);
            }
        });
        b60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b60ActionPerformed(evt);
            }
        });
        getContentPane().add(b60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 320, 60, 60));

        b61.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b61.setForeground(new java.awt.Color(204, 204, 0));
        b61.setContentAreaFilled(false);
        b61.setPreferredSize(new java.awt.Dimension(50, 23));
        b61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b61MouseEntered(evt);
            }
        });
        b61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b61ActionPerformed(evt);
            }
        });
        getContentPane().add(b61, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 60, 60));

        b62.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b62.setForeground(new java.awt.Color(204, 204, 0));
        b62.setContentAreaFilled(false);
        b62.setPreferredSize(new java.awt.Dimension(50, 23));
        b62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b62MouseEntered(evt);
            }
        });
        b62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b62ActionPerformed(evt);
            }
        });
        getContentPane().add(b62, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 60, 60));

        b63.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b63.setForeground(new java.awt.Color(204, 204, 0));
        b63.setContentAreaFilled(false);
        b63.setPreferredSize(new java.awt.Dimension(50, 23));
        b63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b63MouseEntered(evt);
            }
        });
        b63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b63ActionPerformed(evt);
            }
        });
        getContentPane().add(b63, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 60, 60));

        b64.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b64.setForeground(new java.awt.Color(204, 204, 0));
        b64.setContentAreaFilled(false);
        b64.setPreferredSize(new java.awt.Dimension(50, 23));
        b64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b64MouseEntered(evt);
            }
        });
        b64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b64ActionPerformed(evt);
            }
        });
        getContentPane().add(b64, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 60, 60));

        b65.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b65.setForeground(new java.awt.Color(204, 204, 0));
        b65.setContentAreaFilled(false);
        b65.setPreferredSize(new java.awt.Dimension(50, 23));
        b65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b65MouseEntered(evt);
            }
        });
        b65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b65ActionPerformed(evt);
            }
        });
        getContentPane().add(b65, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 60, 60));

        b66.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b66.setForeground(new java.awt.Color(204, 204, 0));
        b66.setContentAreaFilled(false);
        b66.setPreferredSize(new java.awt.Dimension(50, 23));
        b66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b66MouseEntered(evt);
            }
        });
        b66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b66ActionPerformed(evt);
            }
        });
        getContentPane().add(b66, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 60, 60));

        b67.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b67.setForeground(new java.awt.Color(204, 204, 0));
        b67.setContentAreaFilled(false);
        b67.setPreferredSize(new java.awt.Dimension(50, 23));
        b67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b67MouseEntered(evt);
            }
        });
        b67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b67ActionPerformed(evt);
            }
        });
        getContentPane().add(b67, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 60, 60));

        b68.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b68.setForeground(new java.awt.Color(204, 204, 0));
        b68.setContentAreaFilled(false);
        b68.setPreferredSize(new java.awt.Dimension(50, 23));
        b68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b68MouseEntered(evt);
            }
        });
        b68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b68ActionPerformed(evt);
            }
        });
        getContentPane().add(b68, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, 60, 60));

        b69.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b69.setForeground(new java.awt.Color(204, 204, 0));
        b69.setContentAreaFilled(false);
        b69.setPreferredSize(new java.awt.Dimension(50, 23));
        b69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b69MouseEntered(evt);
            }
        });
        b69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b69ActionPerformed(evt);
            }
        });
        getContentPane().add(b69, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, 60, 60));

        b70.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b70.setForeground(new java.awt.Color(204, 204, 0));
        b70.setContentAreaFilled(false);
        b70.setPreferredSize(new java.awt.Dimension(50, 23));
        b70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b70MouseEntered(evt);
            }
        });
        b70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b70ActionPerformed(evt);
            }
        });
        getContentPane().add(b70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 240, 60, 60));

        b71.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b71.setForeground(new java.awt.Color(204, 204, 0));
        b71.setContentAreaFilled(false);
        b71.setPreferredSize(new java.awt.Dimension(50, 23));
        b71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b71MouseEntered(evt);
            }
        });
        b71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b71ActionPerformed(evt);
            }
        });
        getContentPane().add(b71, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 60, 60));

        b72.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b72.setForeground(new java.awt.Color(204, 204, 0));
        b72.setContentAreaFilled(false);
        b72.setPreferredSize(new java.awt.Dimension(50, 23));
        b72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b72MouseEntered(evt);
            }
        });
        b72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b72ActionPerformed(evt);
            }
        });
        getContentPane().add(b72, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 60, 60));

        b73.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b73.setForeground(new java.awt.Color(204, 204, 0));
        b73.setContentAreaFilled(false);
        b73.setPreferredSize(new java.awt.Dimension(50, 23));
        b73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b73MouseEntered(evt);
            }
        });
        b73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b73ActionPerformed(evt);
            }
        });
        getContentPane().add(b73, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 60, 60));

        b74.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b74.setForeground(new java.awt.Color(204, 204, 0));
        b74.setContentAreaFilled(false);
        b74.setPreferredSize(new java.awt.Dimension(50, 23));
        b74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b74MouseEntered(evt);
            }
        });
        b74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b74ActionPerformed(evt);
            }
        });
        getContentPane().add(b74, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 60, 60));

        b75.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b75.setForeground(new java.awt.Color(204, 204, 0));
        b75.setContentAreaFilled(false);
        b75.setPreferredSize(new java.awt.Dimension(50, 23));
        b75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b75MouseEntered(evt);
            }
        });
        b75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b75ActionPerformed(evt);
            }
        });
        getContentPane().add(b75, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 60, 60));

        b76.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b76.setForeground(new java.awt.Color(204, 204, 0));
        b76.setContentAreaFilled(false);
        b76.setPreferredSize(new java.awt.Dimension(50, 23));
        b76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b76MouseEntered(evt);
            }
        });
        b76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b76ActionPerformed(evt);
            }
        });
        getContentPane().add(b76, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 60, 60));

        b77.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b77.setForeground(new java.awt.Color(204, 204, 0));
        b77.setContentAreaFilled(false);
        b77.setPreferredSize(new java.awt.Dimension(50, 23));
        b77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b77MouseEntered(evt);
            }
        });
        b77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b77ActionPerformed(evt);
            }
        });
        getContentPane().add(b77, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 60, 60));

        b78.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b78.setForeground(new java.awt.Color(204, 204, 0));
        b78.setContentAreaFilled(false);
        b78.setPreferredSize(new java.awt.Dimension(50, 23));
        b78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b78MouseEntered(evt);
            }
        });
        b78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b78ActionPerformed(evt);
            }
        });
        getContentPane().add(b78, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, 60, 60));

        b79.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b79.setForeground(new java.awt.Color(204, 204, 0));
        b79.setContentAreaFilled(false);
        b79.setPreferredSize(new java.awt.Dimension(50, 23));
        b79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b79MouseEntered(evt);
            }
        });
        b79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b79ActionPerformed(evt);
            }
        });
        getContentPane().add(b79, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, 60, 60));

        b80.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b80.setForeground(new java.awt.Color(204, 204, 0));
        b80.setContentAreaFilled(false);
        b80.setPreferredSize(new java.awt.Dimension(50, 23));
        b80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b80MouseEntered(evt);
            }
        });
        b80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b80ActionPerformed(evt);
            }
        });
        getContentPane().add(b80, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 160, 60, 60));

        b81.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b81.setForeground(new java.awt.Color(204, 204, 0));
        b81.setContentAreaFilled(false);
        b81.setPreferredSize(new java.awt.Dimension(50, 23));
        b81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b81ActionPerformed(evt);
            }
        });
        getContentPane().add(b81, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 60, 60));

        b82.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b82.setForeground(new java.awt.Color(204, 204, 0));
        b82.setContentAreaFilled(false);
        b82.setPreferredSize(new java.awt.Dimension(50, 23));
        b82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b82MouseEntered(evt);
            }
        });
        b82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b82ActionPerformed(evt);
            }
        });
        getContentPane().add(b82, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 60, 60));

        b83.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b83.setForeground(new java.awt.Color(204, 204, 0));
        b83.setContentAreaFilled(false);
        b83.setPreferredSize(new java.awt.Dimension(50, 23));
        b83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b83MouseEntered(evt);
            }
        });
        b83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b83ActionPerformed(evt);
            }
        });
        getContentPane().add(b83, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 60, 60));

        b84.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b84.setForeground(new java.awt.Color(204, 204, 0));
        b84.setContentAreaFilled(false);
        b84.setPreferredSize(new java.awt.Dimension(50, 23));
        b84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b84MouseEntered(evt);
            }
        });
        b84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b84ActionPerformed(evt);
            }
        });
        getContentPane().add(b84, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 60, 60));

        b85.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b85.setForeground(new java.awt.Color(204, 204, 0));
        b85.setContentAreaFilled(false);
        b85.setPreferredSize(new java.awt.Dimension(50, 23));
        b85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b85MouseEntered(evt);
            }
        });
        b85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b85ActionPerformed(evt);
            }
        });
        getContentPane().add(b85, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 60, 60));

        b86.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b86.setForeground(new java.awt.Color(204, 204, 0));
        b86.setContentAreaFilled(false);
        b86.setPreferredSize(new java.awt.Dimension(50, 23));
        b86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b86MouseEntered(evt);
            }
        });
        b86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b86ActionPerformed(evt);
            }
        });
        getContentPane().add(b86, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 60, 60));

        b87.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b87.setForeground(new java.awt.Color(204, 204, 0));
        b87.setContentAreaFilled(false);
        b87.setPreferredSize(new java.awt.Dimension(50, 23));
        b87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b87MouseEntered(evt);
            }
        });
        b87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b87ActionPerformed(evt);
            }
        });
        getContentPane().add(b87, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 60, 60));

        b88.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b88.setForeground(new java.awt.Color(204, 204, 0));
        b88.setContentAreaFilled(false);
        b88.setPreferredSize(new java.awt.Dimension(50, 23));
        b88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b88MouseEntered(evt);
            }
        });
        b88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b88ActionPerformed(evt);
            }
        });
        getContentPane().add(b88, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 60, 60));

        b89.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b89.setForeground(new java.awt.Color(204, 204, 0));
        b89.setContentAreaFilled(false);
        b89.setPreferredSize(new java.awt.Dimension(50, 23));
        b89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b89MouseEntered(evt);
            }
        });
        b89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b89ActionPerformed(evt);
            }
        });
        getContentPane().add(b89, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 60, 60));

        b90.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b90.setForeground(new java.awt.Color(204, 204, 0));
        b90.setContentAreaFilled(false);
        b90.setPreferredSize(new java.awt.Dimension(50, 23));
        b90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b90MouseEntered(evt);
            }
        });
        b90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b90ActionPerformed(evt);
            }
        });
        getContentPane().add(b90, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 90, 60, 60));

        b91.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b91.setForeground(new java.awt.Color(204, 204, 0));
        b91.setContentAreaFilled(false);
        b91.setPreferredSize(new java.awt.Dimension(50, 23));
        b91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b91MouseEntered(evt);
            }
        });
        b91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b91ActionPerformed(evt);
            }
        });
        getContentPane().add(b91, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 60, 60));

        b92.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b92.setForeground(new java.awt.Color(204, 204, 0));
        b92.setContentAreaFilled(false);
        b92.setPreferredSize(new java.awt.Dimension(50, 23));
        b92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b92MouseEntered(evt);
            }
        });
        b92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b92ActionPerformed(evt);
            }
        });
        getContentPane().add(b92, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 60, 60));

        b93.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b93.setForeground(new java.awt.Color(204, 204, 0));
        b93.setContentAreaFilled(false);
        b93.setPreferredSize(new java.awt.Dimension(50, 23));
        b93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b93MouseEntered(evt);
            }
        });
        b93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b93ActionPerformed(evt);
            }
        });
        getContentPane().add(b93, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 60, 60));

        b94.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b94.setForeground(new java.awt.Color(204, 204, 0));
        b94.setContentAreaFilled(false);
        b94.setPreferredSize(new java.awt.Dimension(50, 23));
        b94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b94MouseEntered(evt);
            }
        });
        b94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b94ActionPerformed(evt);
            }
        });
        getContentPane().add(b94, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 60, 60));

        b95.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b95.setForeground(new java.awt.Color(204, 204, 0));
        b95.setContentAreaFilled(false);
        b95.setPreferredSize(new java.awt.Dimension(50, 23));
        b95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b95MouseEntered(evt);
            }
        });
        b95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b95ActionPerformed(evt);
            }
        });
        getContentPane().add(b95, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 60, 60));

        b96.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b96.setForeground(new java.awt.Color(204, 204, 0));
        b96.setContentAreaFilled(false);
        b96.setPreferredSize(new java.awt.Dimension(50, 23));
        b96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b96MouseEntered(evt);
            }
        });
        b96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b96ActionPerformed(evt);
            }
        });
        getContentPane().add(b96, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 60, 60));

        b41.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b41.setForeground(new java.awt.Color(204, 204, 0));
        b41.setContentAreaFilled(false);
        b41.setPreferredSize(new java.awt.Dimension(50, 23));
        b41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b41MouseEntered(evt);
            }
        });
        b41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b41ActionPerformed(evt);
            }
        });
        getContentPane().add(b41, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 60, 60));

        b20.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b20.setForeground(new java.awt.Color(204, 204, 0));
        b20.setContentAreaFilled(false);
        b20.setPreferredSize(new java.awt.Dimension(50, 23));
        b20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b20MouseEntered(evt);
            }
        });
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        getContentPane().add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 630, 60, 60));

        b1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b1.setForeground(new java.awt.Color(204, 204, 0));
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setPreferredSize(new java.awt.Dimension(50, 23));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 710, 60, 60));

        b97.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b97.setForeground(new java.awt.Color(204, 204, 0));
        b97.setContentAreaFilled(false);
        b97.setPreferredSize(new java.awt.Dimension(50, 23));
        b97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b97MouseEntered(evt);
            }
        });
        b97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b97ActionPerformed(evt);
            }
        });
        getContentPane().add(b97, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 60, 60));
        getContentPane().add(ficharevelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 100, 130));

        b98.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b98.setForeground(new java.awt.Color(204, 204, 0));
        b98.setContentAreaFilled(false);
        b98.setPreferredSize(new java.awt.Dimension(50, 23));
        b98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b98MouseEntered(evt);
            }
        });
        b98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b98ActionPerformed(evt);
            }
        });
        getContentPane().add(b98, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 60, 60));

        b99.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b99.setForeground(new java.awt.Color(204, 204, 0));
        b99.setContentAreaFilled(false);
        b99.setPreferredSize(new java.awt.Dimension(50, 23));
        b99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b99MouseEntered(evt);
            }
        });
        b99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b99ActionPerformed(evt);
            }
        });
        getContentPane().add(b99, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 60, 60));

        b100.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b100.setForeground(new java.awt.Color(204, 204, 0));
        b100.setContentAreaFilled(false);
        b100.setPreferredSize(new java.awt.Dimension(50, 23));
        b100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b100MouseEntered(evt);
            }
        });
        b100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b100ActionPerformed(evt);
            }
        });
        getContentPane().add(b100, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 60, 60));

        javax.swing.GroupLayout panelheroesLayout = new javax.swing.GroupLayout(panelheroes);
        panelheroes.setLayout(panelheroesLayout);
        panelheroesLayout.setHorizontalGroup(
            panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelheroesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloheroes, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelheroesLayout.createSequentialGroup()
                        .addComponent(heroe1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heroe2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(heroe4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelheroesLayout.createSequentialGroup()
                        .addComponent(heroe5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heroe6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelheroesLayout.createSequentialGroup()
                        .addComponent(heroe9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heroe10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelheroesLayout.createSequentialGroup()
                        .addComponent(heroe13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heroe14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelheroesLayout.createSequentialGroup()
                        .addComponent(heroe17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heroe18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelheroesLayout.createSequentialGroup()
                        .addComponent(heroe21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heroe22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelheroesLayout.createSequentialGroup()
                        .addComponent(heroe25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heroe26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe28, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelheroesLayout.createSequentialGroup()
                        .addComponent(heroe29, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heroe30, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(heroe31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heroe32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelheroesLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(heroe33, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelheroesLayout.setVerticalGroup(
            panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelheroesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloheroes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heroe1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heroe5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heroe9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heroe13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heroe17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heroe21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe22, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heroe25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe26, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe27, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe28, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelheroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heroe29, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe32, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heroe30, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(heroe33, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelheroes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 40, 250, 710));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel5.setMinimumSize(new java.awt.Dimension(400, 400));
        jLabel5.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 980, 770));

        javax.swing.GroupLayout panelvillanosLayout = new javax.swing.GroupLayout(panelvillanos);
        panelvillanos.setLayout(panelvillanosLayout);
        panelvillanosLayout.setHorizontalGroup(
            panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelvillanosLayout.createSequentialGroup()
                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelvillanosLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(villanoa34, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelvillanosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(villano1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelvillanosLayout.createSequentialGroup()
                                .addComponent(villano1a, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(villano2a, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villano3a, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(villano4a, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelvillanosLayout.createSequentialGroup()
                                .addComponent(villano5a, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(villano6a, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villano7a, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villano8a, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelvillanosLayout.createSequentialGroup()
                                .addComponent(villanoa9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(villanoa10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villanoa11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villanoa12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelvillanosLayout.createSequentialGroup()
                                .addComponent(villanoa13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(villanoa14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villanoa15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villanoa16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelvillanosLayout.createSequentialGroup()
                                .addComponent(villanoa17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(villanoa18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villanoa19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villanoa20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelvillanosLayout.createSequentialGroup()
                                .addComponent(villanoa21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(villanoa22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villanoa23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(villanoa24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelvillanosLayout.createSequentialGroup()
                                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelvillanosLayout.createSequentialGroup()
                                        .addComponent(villanoa25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(villanoa26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelvillanosLayout.createSequentialGroup()
                                        .addComponent(villanoa29, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(villanoa30, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(72, 72, 72)
                                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelvillanosLayout.createSequentialGroup()
                                        .addComponent(villanoa27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(villanoa28, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelvillanosLayout.createSequentialGroup()
                                        .addComponent(villanoa31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(villanoa32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelvillanosLayout.setVerticalGroup(
            panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelvillanosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(villano1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villano1a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villano2a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villano3a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villano4a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villano5a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villano6a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villano7a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villano8a, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villanoa9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villanoa13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villanoa17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villanoa21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa22, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villanoa25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa26, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa27, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa28, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelvillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villanoa29, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa32, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villanoa30, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(villanoa34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(panelvillanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 710));
        getContentPane().add(Doradofondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 270, 770));
        getContentPane().add(Doradofondoheroes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 270, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        Click(0, 0);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        Click(0, 1);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        Click(0, 2);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        Click(0, 3);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        Click(0, 4);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        Click(0, 5);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        Click(0, 6);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        Click(0, 7);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        Click(0, 8);
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        Click(0, 9);
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        Click(1, 0);
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        Click(1, 1);
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        Click(1, 2);
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        Click(1, 3);
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        Click(1, 4);
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        Click(1, 5);
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        Click(1, 6);
    }//GEN-LAST:event_b17ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        Click(1, 7);
    }//GEN-LAST:event_b18ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        Click(1, 8);
    }//GEN-LAST:event_b19ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        Click(1, 9);
    }//GEN-LAST:event_b20ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        Click(2, 1);
    }//GEN-LAST:event_b22ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        Click(2, 2);
    }//GEN-LAST:event_b23ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        Click(2, 3);
    }//GEN-LAST:event_b24ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        Click(2, 4);
    }//GEN-LAST:event_b25ActionPerformed

    private void b26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b26ActionPerformed
        Click(2, 5);
    }//GEN-LAST:event_b26ActionPerformed

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b27ActionPerformed
        Click(2, 6);
    }//GEN-LAST:event_b27ActionPerformed

    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28ActionPerformed
        Click(2, 7);
    }//GEN-LAST:event_b28ActionPerformed

    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b29ActionPerformed
        Click(2, 8);
    }//GEN-LAST:event_b29ActionPerformed

    private void b30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b30ActionPerformed
        Click(2, 9);
    }//GEN-LAST:event_b30ActionPerformed

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31ActionPerformed
        Click(3, 0);
    }//GEN-LAST:event_b31ActionPerformed

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b32ActionPerformed
        Click(3, 1);
    }//GEN-LAST:event_b32ActionPerformed

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b33ActionPerformed
        Click(3, 2);
    }//GEN-LAST:event_b33ActionPerformed


    private void b34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b34ActionPerformed
        Click(3, 3);
    }//GEN-LAST:event_b34ActionPerformed

    private void b35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b35ActionPerformed
        Click(3, 4);
    }//GEN-LAST:event_b35ActionPerformed

    private void b36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b36ActionPerformed
        Click(3, 5);
    }//GEN-LAST:event_b36ActionPerformed

    private void b37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b37ActionPerformed
        Click(3, 6);
    }//GEN-LAST:event_b37ActionPerformed

    private void b38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b38ActionPerformed
        Click(3, 7);
    }//GEN-LAST:event_b38ActionPerformed

    private void b39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b39ActionPerformed
        Click(3, 8);
    }//GEN-LAST:event_b39ActionPerformed

    private void b40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b40ActionPerformed
        Click(3, 9);
    }//GEN-LAST:event_b40ActionPerformed

    private void b41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b41ActionPerformed
        Click(4, 0);
    }//GEN-LAST:event_b41ActionPerformed

    private void b42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b42ActionPerformed
        Click(4, 1);
    }//GEN-LAST:event_b42ActionPerformed

    private void b43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b43ActionPerformed
        Click(4, 2);
    }//GEN-LAST:event_b43ActionPerformed

    private void b44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b44ActionPerformed
        Click(4, 3);
    }//GEN-LAST:event_b44ActionPerformed

    private void b45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b45ActionPerformed
        Click(4, 4);
    }//GEN-LAST:event_b45ActionPerformed

    private void b46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b46ActionPerformed
        Click(4, 5);
    }//GEN-LAST:event_b46ActionPerformed

    private void b47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b47ActionPerformed
        Click(4, 6);
    }//GEN-LAST:event_b47ActionPerformed

    private void b48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b48ActionPerformed
        Click(4, 7);
    }//GEN-LAST:event_b48ActionPerformed

    private void b49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b49ActionPerformed
        Click(4, 8);
    }//GEN-LAST:event_b49ActionPerformed

    private void b50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b50ActionPerformed
        Click(4, 9);
    }//GEN-LAST:event_b50ActionPerformed

    private void b51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b51ActionPerformed
        Click(5, 0);
    }//GEN-LAST:event_b51ActionPerformed

    private void b52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b52ActionPerformed
        Click(5, 1);
    }//GEN-LAST:event_b52ActionPerformed

    private void b53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b53ActionPerformed
        Click(5, 2);
    }//GEN-LAST:event_b53ActionPerformed

    private void b54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b54ActionPerformed
        Click(5, 3);
    }//GEN-LAST:event_b54ActionPerformed

    private void b55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b55ActionPerformed
        Click(5, 4);
    }//GEN-LAST:event_b55ActionPerformed

    private void b56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b56ActionPerformed
        Click(5, 5);
    }//GEN-LAST:event_b56ActionPerformed

    private void b57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b57ActionPerformed
        Click(5, 6);
    }//GEN-LAST:event_b57ActionPerformed

    private void b58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b58ActionPerformed
        Click(5, 7);
    }//GEN-LAST:event_b58ActionPerformed

    private void b59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b59ActionPerformed
        Click(5, 8);
    }//GEN-LAST:event_b59ActionPerformed

    private void b60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b60ActionPerformed
        Click(5, 9);
    }//GEN-LAST:event_b60ActionPerformed

    private void b61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b61ActionPerformed
        Click(6, 0);
    }//GEN-LAST:event_b61ActionPerformed

    private void b62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b62ActionPerformed
        Click(6, 1);
    }//GEN-LAST:event_b62ActionPerformed

    private void b63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b63ActionPerformed
        Click(6, 2);
    }//GEN-LAST:event_b63ActionPerformed

    private void b64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b64ActionPerformed
        Click(6, 3);
    }//GEN-LAST:event_b64ActionPerformed

    private void b65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b65ActionPerformed
        Click(6, 4);
    }//GEN-LAST:event_b65ActionPerformed

    private void b66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b66ActionPerformed
        Click(6, 5);
    }//GEN-LAST:event_b66ActionPerformed

    private void b67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b67ActionPerformed
        Click(6, 6);
    }//GEN-LAST:event_b67ActionPerformed

    private void b68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b68ActionPerformed
        Click(6, 7);
    }//GEN-LAST:event_b68ActionPerformed

    private void b69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b69ActionPerformed
        Click(6, 8);
    }//GEN-LAST:event_b69ActionPerformed

    private void b70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b70ActionPerformed
        Click(6, 9);
    }//GEN-LAST:event_b70ActionPerformed

    private void b72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b72ActionPerformed
        Click(7, 1);
    }//GEN-LAST:event_b72ActionPerformed

    private void b73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b73ActionPerformed
        Click(7, 2);
    }//GEN-LAST:event_b73ActionPerformed

    private void b74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b74ActionPerformed
        Click(7, 3);
    }//GEN-LAST:event_b74ActionPerformed

    private void b75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b75ActionPerformed
        Click(7, 4);
    }//GEN-LAST:event_b75ActionPerformed

    private void b76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b76ActionPerformed
        Click(7, 5);
    }//GEN-LAST:event_b76ActionPerformed

    private void b77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b77ActionPerformed
        Click(7, 6);
    }//GEN-LAST:event_b77ActionPerformed

    private void b78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b78ActionPerformed
        Click(7, 7);
    }//GEN-LAST:event_b78ActionPerformed

    private void b79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b79ActionPerformed
        Click(7, 8);
    }//GEN-LAST:event_b79ActionPerformed

    private void b80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b80ActionPerformed
        Click(7, 9);
    }//GEN-LAST:event_b80ActionPerformed

    private void b81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b81ActionPerformed
        Click(8, 0);
    }//GEN-LAST:event_b81ActionPerformed

    private void b82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b82ActionPerformed
        Click(8, 1);
    }//GEN-LAST:event_b82ActionPerformed

    private void b83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b83ActionPerformed
        Click(8, 2);
    }//GEN-LAST:event_b83ActionPerformed

    private void b84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b84ActionPerformed
        Click(8, 3);
    }//GEN-LAST:event_b84ActionPerformed

    private void b85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b85ActionPerformed
        Click(8, 4);
    }//GEN-LAST:event_b85ActionPerformed

    private void b86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b86ActionPerformed
        Click(8, 5);
    }//GEN-LAST:event_b86ActionPerformed

    private void b87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b87ActionPerformed
        Click(8, 6);
    }//GEN-LAST:event_b87ActionPerformed

    private void b88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b88ActionPerformed
        Click(8, 7);
    }//GEN-LAST:event_b88ActionPerformed

    private void b89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b89ActionPerformed
        Click(8, 8);
    }//GEN-LAST:event_b89ActionPerformed

    private void b90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b90ActionPerformed
        Click(8, 9);
    }//GEN-LAST:event_b90ActionPerformed

    private void b91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b91ActionPerformed
        Click(9, 0);
    }//GEN-LAST:event_b91ActionPerformed

    private void b92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b92ActionPerformed
        Click(9, 1);
    }//GEN-LAST:event_b92ActionPerformed

    private void b93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b93ActionPerformed
        Click(9, 2);
    }//GEN-LAST:event_b93ActionPerformed

    private void b94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b94ActionPerformed
        Click(9, 3);
    }//GEN-LAST:event_b94ActionPerformed

    private void b95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b95ActionPerformed
        Click(9, 4);
    }//GEN-LAST:event_b95ActionPerformed

    private void b96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b96ActionPerformed
        Click(9, 5);
    }//GEN-LAST:event_b96ActionPerformed

    private void b97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b97ActionPerformed
        Click(9, 6);
    }//GEN-LAST:event_b97ActionPerformed

    private void b98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b98ActionPerformed
        Click(9, 7);
    }//GEN-LAST:event_b98ActionPerformed

    private void b99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b99ActionPerformed
        Click(9, 8);
    }//GEN-LAST:event_b99ActionPerformed

    private void b100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b100ActionPerformed
        Click(9, 9);
    }//GEN-LAST:event_b100ActionPerformed

    private void b71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b71ActionPerformed
        Click(7, 0);
    }//GEN-LAST:event_b71ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        Click(2, 0);
    }//GEN-LAST:event_b21ActionPerformed

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
conteobatalla.setVisible(false);
    conteobatalla.setText("");
    conteobatalla.setIcon(null);
    continuar.setVisible(false);
    Fondopanelpelea.setVisible(false);
    HeroeBatalla.setVisible(false);
    VillanoBatalla.setVisible(false);
    VS.setVisible(false);
    resultadoheroe.setVisible(false);
    resultadovillano.setVisible(false);

    // Determinar el resultado de la batalla
    boolean ganaficha1 = false;
    if (ficha1.getRango() == 1 && ficha2.getRango() == 10) { // Espía vs. Mariscal
        ganaficha1 = true;
    } else if (ficha1.getRango() > ficha2.getRango()) {
        ganaficha1 = true;
    }

    // Actualizar el tablero basado en el resultado
    if (ficha1.getRango() == ficha2.getRango()) { // Empate
        Colocareliminado(ficha1, Cambiartamano(ficha1.getIcono(), 46, 58));
        Colocareliminado(ficha2, Cambiartamano(ficha2.getIcono(), 46, 58));
        fichas[filaficha1][colficha1] = null;
        fichas[filaficha2][colficha2] = null;
        tableroBotones[filaficha1][colficha1].setIcon(null);
        tableroBotones[filaficha2][colficha2].setIcon(null);
    } else if (ganaficha1) { // Gana Ficha 1
        Colocareliminado(ficha2, Cambiartamano(ficha2.getIcono(), 46, 58));
        fichas[filaficha1][colficha1] = null;
        fichas[filaficha2][colficha2] = ficha1; // La ficha ganadora se mueve
        tableroBotones[filaficha1][colficha1].setIcon(null);
        tableroBotones[filaficha2][colficha2].setIcon(Cambiartamano(ficha1.getIcono(), 60, 63));
    } else { // Gana Ficha 2 (la defensora)
        Colocareliminado(ficha1, Cambiartamano(ficha1.getIcono(), 46, 58));
        fichas[filaficha1][colficha1] = null;
        tableroBotones[filaficha1][colficha1].setIcon(null);
    }

    // --- FINALIZAR TURNO POST-BATALLA ---
    turno = turno.equals("Heroes") ? "Villanos" : "Heroes";
    actualizarTitulo();
    
    if (Cuentas.gameMode.equals("Classic")) {
         ocultarFichas();
    } else {
        revelarFichas();
    }
    
    limpiarpintados();
    fichaseleccionada = null;
    Batalla = false;

    // Verificar condiciones de fin de juego
    if (!vermovimientos()) {
        String ganadorNombreusuario = usuarioActual.getUsuario();
        String ganadorBandofaccion = userFaction;
        String perdedorNombreusuario = gameMenu.getOpponentUser().getUsuario();
        String perdedorBandofaccion = opponentFaction;

        JOptionPane.showMessageDialog(this,
            perdedorBandofaccion + " no tiene movimientos posibles\nFin del juego.",
            "Juego terminado",
            JOptionPane.INFORMATION_MESSAGE);
        terminarJuego("NO_MOVES", -3, ganadorNombreusuario, ganadorBandofaccion, perdedorNombreusuario, perdedorBandofaccion);
    } else if (contarFichasRestantes(turno) == 0) {
        String ganadorNombreusuario = turno.equals("Heroes") ? gameMenu.getOpponentUser().getUsuario() : usuarioActual.getUsuario();
        String ganadorBandofaccion = turno.equals("Heroes") ? opponentFaction : userFaction;
        String perdedorNombreusuario = turno.equals("Heroes") ? usuarioActual.getUsuario() : gameMenu.getOpponentUser().getUsuario();
        String perdedorBandofaccion = turno;

        JOptionPane.showMessageDialog(this, "Todos los " + perdedorBandofaccion + " han sido eliminados\nFin del juego.", "Juego terminado", JOptionPane.INFORMATION_MESSAGE);
        terminarJuego("ALL_PIECES_DESTROYED", 3, ganadorNombreusuario, ganadorBandofaccion, perdedorNombreusuario, perdedorBandofaccion);
    }
    
    }//GEN-LAST:event_continuarActionPerformed

    private void b91MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b91MouseEntered
  
    }//GEN-LAST:event_b91MouseEntered

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
      
    }//GEN-LAST:event_b1MouseEntered

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
    
    }//GEN-LAST:event_b2MouseEntered

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
         
    }//GEN-LAST:event_b3MouseEntered

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
       
    }//GEN-LAST:event_b4MouseEntered

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseEntered
    
    }//GEN-LAST:event_b5MouseEntered

    private void b6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseEntered
        
    }//GEN-LAST:event_b6MouseEntered

    private void b7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseEntered
      
    }//GEN-LAST:event_b7MouseEntered

    private void b8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseEntered
     
    }//GEN-LAST:event_b8MouseEntered

    private void b9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseEntered
       
    }//GEN-LAST:event_b9MouseEntered

    private void b10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b10MouseEntered
       
    }//GEN-LAST:event_b10MouseEntered

    private void b11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MouseEntered
        
    }//GEN-LAST:event_b11MouseEntered

    private void b12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseEntered
     
    }//GEN-LAST:event_b12MouseEntered

    private void b13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b13MouseEntered
      
    }//GEN-LAST:event_b13MouseEntered

    private void b14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b14MouseEntered
      
    }//GEN-LAST:event_b14MouseEntered

    private void b15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MouseEntered
    
    }//GEN-LAST:event_b15MouseEntered

    private void b16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MouseEntered
        
    }//GEN-LAST:event_b16MouseEntered

    private void b17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b17MouseEntered
     
    }//GEN-LAST:event_b17MouseEntered

    private void b18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b18MouseEntered
      
    }//GEN-LAST:event_b18MouseEntered

    private void b19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b19MouseEntered
    
    }//GEN-LAST:event_b19MouseEntered

    private void b20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b20MouseEntered
 
    }//GEN-LAST:event_b20MouseEntered

    private void b21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b21MouseEntered
       
    }//GEN-LAST:event_b21MouseEntered

    private void b22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b22MouseEntered
     
    }//GEN-LAST:event_b22MouseEntered

    private void b23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b23MouseEntered
   
    }//GEN-LAST:event_b23MouseEntered

    private void b24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b24MouseEntered
    
    }//GEN-LAST:event_b24MouseEntered

    private void b25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b25MouseEntered
       
    }//GEN-LAST:event_b25MouseEntered

    private void b26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b26MouseEntered
     
    }//GEN-LAST:event_b26MouseEntered

    private void b27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b27MouseEntered
      
    }//GEN-LAST:event_b27MouseEntered

    private void b28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b28MouseEntered
   
    }//GEN-LAST:event_b28MouseEntered

    private void b29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b29MouseClicked
      
    }//GEN-LAST:event_b29MouseClicked

    private void b29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b29MouseEntered
    
    }//GEN-LAST:event_b29MouseEntered

    private void b30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b30MouseEntered
   
    }//GEN-LAST:event_b30MouseEntered

    private void b31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b31MouseEntered
      
    }//GEN-LAST:event_b31MouseEntered

    private void b32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b32MouseEntered
          
    }//GEN-LAST:event_b32MouseEntered

    private void b33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b33MouseEntered
          
    }//GEN-LAST:event_b33MouseEntered

    private void b34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b34MouseEntered
        
    }//GEN-LAST:event_b34MouseEntered

    private void b35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b35MouseEntered
        
    }//GEN-LAST:event_b35MouseEntered

    private void b36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b36MouseEntered
        
    }//GEN-LAST:event_b36MouseEntered

    private void b37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b37MouseEntered
        
    }//GEN-LAST:event_b37MouseEntered

    private void b38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b38MouseEntered
        
    }//GEN-LAST:event_b38MouseEntered

    private void b39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b39MouseEntered
       
    }//GEN-LAST:event_b39MouseEntered

    private void b40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b40MouseEntered
       
    }//GEN-LAST:event_b40MouseEntered

    private void b42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b42MouseEntered
         
    }//GEN-LAST:event_b42MouseEntered

    private void b43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b43MouseEntered
   
    }//GEN-LAST:event_b43MouseEntered

    private void b44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b44MouseEntered
     
    }//GEN-LAST:event_b44MouseEntered

    private void b45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b45MouseEntered
   
    }//GEN-LAST:event_b45MouseEntered

    private void b46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b46MouseEntered
   
    }//GEN-LAST:event_b46MouseEntered

    private void b47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b47MouseEntered
     
    }//GEN-LAST:event_b47MouseEntered

    private void b48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b48MouseEntered
     
    }//GEN-LAST:event_b48MouseEntered

    private void b49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b49MouseEntered
   
    }//GEN-LAST:event_b49MouseEntered

    private void b50MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b50MouseEntered
      
    }//GEN-LAST:event_b50MouseEntered

    private void b51MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b51MouseEntered
  
    }//GEN-LAST:event_b51MouseEntered

    private void b52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b52MouseEntered
      
    }//GEN-LAST:event_b52MouseEntered

    private void b53MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b53MouseEntered
     
    }//GEN-LAST:event_b53MouseEntered

    private void b54MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b54MouseEntered
     
    }//GEN-LAST:event_b54MouseEntered

    private void b55MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b55MouseEntered
     
    }//GEN-LAST:event_b55MouseEntered

    private void b56MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b56MouseEntered
       
    }//GEN-LAST:event_b56MouseEntered

    private void b57MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b57MouseEntered
    
    }//GEN-LAST:event_b57MouseEntered

    private void b58MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b58MouseEntered
     
    }//GEN-LAST:event_b58MouseEntered

    private void b59MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b59MouseEntered
       
    }//GEN-LAST:event_b59MouseEntered

    private void b60MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b60MouseEntered
       
    }//GEN-LAST:event_b60MouseEntered

    private void b61MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b61MouseEntered
     
    }//GEN-LAST:event_b61MouseEntered

    private void b62MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b62MouseEntered
        
    }//GEN-LAST:event_b62MouseEntered

    private void b63MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b63MouseEntered
      
    }//GEN-LAST:event_b63MouseEntered

    private void b64MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b64MouseEntered
      
    }//GEN-LAST:event_b64MouseEntered

    private void b65MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b65MouseEntered
     
    }//GEN-LAST:event_b65MouseEntered

    private void b66MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b66MouseEntered
     
    }//GEN-LAST:event_b66MouseEntered

    private void b67MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b67MouseEntered
    
    }//GEN-LAST:event_b67MouseEntered

    private void b68MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b68MouseEntered
      
    }//GEN-LAST:event_b68MouseEntered

    private void b69MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b69MouseEntered
       
    }//GEN-LAST:event_b69MouseEntered

    private void b70MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b70MouseEntered
      
    }//GEN-LAST:event_b70MouseEntered

    private void b71MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b71MouseEntered
      
    }//GEN-LAST:event_b71MouseEntered

    private void b72MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b72MouseEntered
     
    }//GEN-LAST:event_b72MouseEntered

    private void b73MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b73MouseEntered
       
    }//GEN-LAST:event_b73MouseEntered

    private void b74MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b74MouseEntered
  
    }//GEN-LAST:event_b74MouseEntered

    private void b75MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b75MouseEntered
        
    }//GEN-LAST:event_b75MouseEntered

    private void b76MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b76MouseEntered
         
    }//GEN-LAST:event_b76MouseEntered

    private void b77MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b77MouseEntered
     
    }//GEN-LAST:event_b77MouseEntered

    private void b78MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b78MouseEntered
        
    }//GEN-LAST:event_b78MouseEntered

    private void b79MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b79MouseEntered
    
    }//GEN-LAST:event_b79MouseEntered

    private void b80MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b80MouseEntered
       
    }//GEN-LAST:event_b80MouseEntered

    private void b82MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b82MouseEntered
       
    }//GEN-LAST:event_b82MouseEntered

    private void b83MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b83MouseEntered
      
    }//GEN-LAST:event_b83MouseEntered

    private void b84MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b84MouseEntered
      
    }//GEN-LAST:event_b84MouseEntered

    private void b85MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b85MouseEntered
     
    }//GEN-LAST:event_b85MouseEntered

    private void b86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b86MouseEntered
      
    }//GEN-LAST:event_b86MouseEntered

    private void b87MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b87MouseEntered
        
    }//GEN-LAST:event_b87MouseEntered

    private void b88MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b88MouseEntered
         
    }//GEN-LAST:event_b88MouseEntered

    private void b89MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b89MouseEntered
       
    }//GEN-LAST:event_b89MouseEntered

    private void b90MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b90MouseEntered
        
    
    }//GEN-LAST:event_b90MouseEntered

    private void b92MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b92MouseEntered
       
    }//GEN-LAST:event_b92MouseEntered

    private void b93MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b93MouseEntered
        
    }//GEN-LAST:event_b93MouseEntered

    private void b94MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b94MouseEntered
         
    }//GEN-LAST:event_b94MouseEntered

    private void b95MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b95MouseEntered
         
    }//GEN-LAST:event_b95MouseEntered

    private void b96MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b96MouseEntered
   
    }//GEN-LAST:event_b96MouseEntered

    private void b41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b41MouseEntered
        
    }//GEN-LAST:event_b41MouseEntered

    private void b97MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b97MouseEntered
      
    }//GEN-LAST:event_b97MouseEntered

    private void b98MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b98MouseEntered
      
    }//GEN-LAST:event_b98MouseEntered

    private void b99MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b99MouseEntered
        
    }//GEN-LAST:event_b99MouseEntered

    private void b100MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b100MouseEntered
       
    }//GEN-LAST:event_b100MouseEntered

    private void rendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendirseActionPerformed
      if (usuarioActual == null || gameMenu == null || gameMenu.getOpponentUser() == null) {
        JOptionPane.showMessageDialog(this,
            "Error: No se puede realizar esta acción porque la partida no se inició desde el menú principal.\n" +
            "Por favor, inicie el juego a través de la ventana de Login.",
            "Error de Partida",
            JOptionPane.ERROR_MESSAGE);
        return; 
    }

    int confirmacion = JOptionPane.showConfirmDialog(
        this,
        "¿Está seguro de que desea retirarse del juego?\n" +
        "Su oponente ganará la partida y recibirá 3 puntos.",
        "Confirmar Retiro",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE
    );

    if (confirmacion == JOptionPane.YES_OPTION) {
        
        String ganadorBandofaccion;
        String perdedorBandofaccion;
        String ganadorNombreusuario;
        String perdedorNombreusuario;

        if (turno.equals(userFaction)) {
            perdedorBandofaccion = userFaction;
            perdedorNombreusuario = usuarioActual.getUsuario();
            ganadorBandofaccion = opponentFaction;
            ganadorNombreusuario = gameMenu.getOpponentUser().getUsuario();
        } else {
            perdedorBandofaccion = opponentFaction;
            perdedorNombreusuario = gameMenu.getOpponentUser().getUsuario();
            ganadorBandofaccion = userFaction;
            ganadorNombreusuario = usuarioActual.getUsuario();
        }
        
        terminarJuego("RETREAT", 3, ganadorNombreusuario, ganadorBandofaccion, perdedorNombreusuario, perdedorBandofaccion);
    }
    }//GEN-LAST:event_rendirseActionPerformed

    
    private ImageIcon Cambiartamano(ImageIcon icono, int ancho, int alto) {
        Image imagen = icono.getImage();
        Image imgmod = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        return new ImageIcon(imgmod);
    }

    private void Colocareliminado(Ficha ficha, ImageIcon icono) {

        if (ficha.getTipo().equals("Heroes")) {
            for (int i = 0; i < heroeseliminados.length; i++) {
                if (heroeseliminados[i].getIcon() == null) {
                    heroeseliminados[i].setIcon(Cambiartamano(icono, 46, 58));
                    break;
                }
            }
        } else if (ficha.getTipo().equals("Villanos")) {
            for (int i = 0; i < villanoseliminados.length; i++) {
                if (villanoseliminados[i].getIcon() == null) {
                    villanoseliminados[i].setIcon(Cambiartamano(icono, 46, 58));
                    break;
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Doradofondo;
    private javax.swing.JLabel Doradofondoheroes;
    private javax.swing.JLabel Fondopanelpelea;
    private javax.swing.JLabel HeroeBatalla;
    private javax.swing.JLabel VS;
    private javax.swing.JLabel VillanoBatalla;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b100;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b38;
    private javax.swing.JButton b39;
    private javax.swing.JButton b4;
    private javax.swing.JButton b40;
    private javax.swing.JButton b41;
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JButton b44;
    private javax.swing.JButton b45;
    private javax.swing.JButton b46;
    private javax.swing.JButton b47;
    private javax.swing.JButton b48;
    private javax.swing.JButton b49;
    private javax.swing.JButton b5;
    private javax.swing.JButton b50;
    private javax.swing.JButton b51;
    private javax.swing.JButton b52;
    private javax.swing.JButton b53;
    private javax.swing.JButton b54;
    private javax.swing.JButton b55;
    private javax.swing.JButton b56;
    private javax.swing.JButton b57;
    private javax.swing.JButton b58;
    private javax.swing.JButton b59;
    private javax.swing.JButton b6;
    private javax.swing.JButton b60;
    private javax.swing.JButton b61;
    private javax.swing.JButton b62;
    private javax.swing.JButton b63;
    private javax.swing.JButton b64;
    private javax.swing.JButton b65;
    private javax.swing.JButton b66;
    private javax.swing.JButton b67;
    private javax.swing.JButton b68;
    private javax.swing.JButton b69;
    private javax.swing.JButton b7;
    private javax.swing.JButton b70;
    private javax.swing.JButton b71;
    private javax.swing.JButton b72;
    private javax.swing.JButton b73;
    private javax.swing.JButton b74;
    private javax.swing.JButton b75;
    private javax.swing.JButton b76;
    private javax.swing.JButton b77;
    private javax.swing.JButton b78;
    private javax.swing.JButton b79;
    private javax.swing.JButton b8;
    private javax.swing.JButton b80;
    private javax.swing.JButton b81;
    private javax.swing.JButton b82;
    private javax.swing.JButton b83;
    private javax.swing.JButton b84;
    private javax.swing.JButton b85;
    private javax.swing.JButton b86;
    private javax.swing.JButton b87;
    private javax.swing.JButton b88;
    private javax.swing.JButton b89;
    private javax.swing.JButton b9;
    private javax.swing.JButton b90;
    private javax.swing.JButton b91;
    private javax.swing.JButton b92;
    private javax.swing.JButton b93;
    private javax.swing.JButton b94;
    private javax.swing.JButton b95;
    private javax.swing.JButton b96;
    private javax.swing.JButton b97;
    private javax.swing.JButton b98;
    private javax.swing.JButton b99;
    private javax.swing.JLabel conteobatalla;
    private javax.swing.JButton continuar;
    private javax.swing.JLabel ficharevelar;
    private javax.swing.JLabel heroe1;
    private javax.swing.JLabel heroe10;
    private javax.swing.JLabel heroe11;
    private javax.swing.JLabel heroe12;
    private javax.swing.JLabel heroe13;
    private javax.swing.JLabel heroe14;
    private javax.swing.JLabel heroe15;
    private javax.swing.JLabel heroe16;
    private javax.swing.JLabel heroe17;
    private javax.swing.JLabel heroe18;
    private javax.swing.JLabel heroe19;
    private javax.swing.JLabel heroe2;
    private javax.swing.JLabel heroe20;
    private javax.swing.JLabel heroe21;
    private javax.swing.JLabel heroe22;
    private javax.swing.JLabel heroe23;
    private javax.swing.JLabel heroe24;
    private javax.swing.JLabel heroe25;
    private javax.swing.JLabel heroe26;
    private javax.swing.JLabel heroe27;
    private javax.swing.JLabel heroe28;
    private javax.swing.JLabel heroe29;
    private javax.swing.JLabel heroe3;
    private javax.swing.JLabel heroe30;
    private javax.swing.JLabel heroe31;
    private javax.swing.JLabel heroe32;
    private javax.swing.JLabel heroe33;
    private javax.swing.JLabel heroe4;
    private javax.swing.JLabel heroe5;
    private javax.swing.JLabel heroe6;
    private javax.swing.JLabel heroe7;
    private javax.swing.JLabel heroe8;
    private javax.swing.JLabel heroe9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelheroes;
    private javax.swing.JPanel panelvillanos;
    private javax.swing.JButton rendirse;
    private javax.swing.JLabel resultadoheroe;
    private javax.swing.JLabel resultadovillano;
    private javax.swing.JLabel tituloheroes;
    private javax.swing.JLabel villano1;
    private javax.swing.JLabel villano1a;
    private javax.swing.JLabel villano2a;
    private javax.swing.JLabel villano3a;
    private javax.swing.JLabel villano4a;
    private javax.swing.JLabel villano5a;
    private javax.swing.JLabel villano6a;
    private javax.swing.JLabel villano7a;
    private javax.swing.JLabel villano8a;
    private javax.swing.JLabel villanoa10;
    private javax.swing.JLabel villanoa11;
    private javax.swing.JLabel villanoa12;
    private javax.swing.JLabel villanoa13;
    private javax.swing.JLabel villanoa14;
    private javax.swing.JLabel villanoa15;
    private javax.swing.JLabel villanoa16;
    private javax.swing.JLabel villanoa17;
    private javax.swing.JLabel villanoa18;
    private javax.swing.JLabel villanoa19;
    private javax.swing.JLabel villanoa20;
    private javax.swing.JLabel villanoa21;
    private javax.swing.JLabel villanoa22;
    private javax.swing.JLabel villanoa23;
    private javax.swing.JLabel villanoa24;
    private javax.swing.JLabel villanoa25;
    private javax.swing.JLabel villanoa26;
    private javax.swing.JLabel villanoa27;
    private javax.swing.JLabel villanoa28;
    private javax.swing.JLabel villanoa29;
    private javax.swing.JLabel villanoa30;
    private javax.swing.JLabel villanoa31;
    private javax.swing.JLabel villanoa32;
    private javax.swing.JLabel villanoa34;
    private javax.swing.JLabel villanoa9;
    // End of variables declaration//GEN-END:variables

}
