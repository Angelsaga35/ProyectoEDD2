package EDD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aange
 */
public class Hospitales extends Datos
{
    private String dir;
    private int nivel;

<<<<<<< HEAD
    private String cveH;
    private String dir;
    private int nivel;
    static int contH = 0;

    public Hospitales( String dir, int nivel, int cve, String nombre)
    {
        super(cve, nombre);
        contH++;
        this.cveH = String.valueOf(contH);
        String y="H";
        for (int i = 0; i <3-cveH.length() ; i++)
        {
            y+=0;
        }
        y+=cveH;
        this.cveH = y;
        this.dir = dir;
        this.nivel = nivel;
    }

    
    /**
     * @return the cveH
     */
    public String getCveH()
=======
    public Hospitales()
>>>>>>> Max
    {
    }

    public Hospitales(String dir, int nivel, String nombre)
    {
        super(0, nombre);
        this.dir = dir;
        this.nivel = nivel;
    }

    public String getCveH()
    {
        return String.format("H%03d", getCve());
    }

    /**
     * @return the dir
     */
    public String getDir()
    {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(String dir)
    {
        this.dir = dir;
    }

    /**
     * @return the nivel
     */
    public int getNivel()
    {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

<<<<<<< HEAD
    @Override
    public String toString()
    {
        
        return "Hospitales{" + "cveH=" + cveH + ", dir=" + dir + ", nivel=" + nivel + '}';
    }
    

=======
>>>>>>> Max
}
