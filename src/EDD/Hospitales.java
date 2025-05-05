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

    public Hospitales()
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

}
