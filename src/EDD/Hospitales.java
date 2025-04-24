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

    /**
     * @return the cveH
     */
    public String getCveH()
    {
        return cveH;
    }

    /**
     * @param cveH the cveH to set
     */
    public void setCveH(String cveH)
    {
        this.cveH = cveH;
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
    private String cveH;
    private String dir;
    private int nivel;
}
