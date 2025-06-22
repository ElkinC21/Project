package project;




import javax.swing.ImageIcon;

public class Ficha {

    private String Nombre;
    private ImageIcon Icono;
    private String Tipo;
    private int Rango;
    private boolean movio;

   
    

    public Ficha() {}

    public Ficha(String Nombre, ImageIcon Icono, String Tipo, int Rango) {
        this.Nombre = Nombre;
        this.Icono = Icono;
        this.Tipo = Tipo;
        this.Rango = Rango;
        this.movio = false;
    }

    public String getNombre() { 
        return Nombre; }
    public ImageIcon getIcono() { 
        return Icono; }
    public String getTipo() { 
        return Tipo; }
    public int getRango() { 
        return Rango; }
    

    public void setNombre(String nombre) { 
        this.Nombre = nombre; }
    public void setIcono(ImageIcon icono) { this.Icono = icono; }
    public void setTipo(String tipo) { this.Tipo = tipo; }
    public void setRango(int rango) { this.Rango = rango; }
    

    

       
 }


