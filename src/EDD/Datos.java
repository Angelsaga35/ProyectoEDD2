/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import java.io.Serializable;

/**
 *
 * @author aange
 */
public abstract class Datos implements Serializable
{
    public static final long SVUID=1L;
    private int cve;
    private String nombre;
    private static int contador = 1; // Contador estático para generar claves

    public Datos()
    {
        this.cve = contador++;
    }

    public Datos(int cve, String nombre)
    {
        this();
        this.nombre = nombre;
    }

    /**
     * @return the cve
     */
    public int getCve()
    {
        return cve;
    }

    /**
     * @param cve the cve to set
     */
    public void setCve(int cve)
    {
        this.cve = cve;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}