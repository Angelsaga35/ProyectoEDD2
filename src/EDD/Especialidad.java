/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author aange
 */
public class Especialidad extends Datos
{

    public Especialidad()
    {
    }

    public Especialidad(int noCamas, String nombre)
    {
        super(0, nombre);
        this.noCamas = noCamas;
    }

    public String getCveE()
    {
        return String.format("E%03d", getCve());
    }

    /**
     * @return the noCamas
     */
    public int getNoCamas()
    {
        return noCamas;
    }

    private int noCamas;
}
