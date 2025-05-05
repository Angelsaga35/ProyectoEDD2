/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author aange
 */
public class Paciente extends Datos
{
    private char status;
    private String vigencia;

    public Paciente()
    {
    }

    public Paciente(char status, String vigencia, String nombre)
    {
        super(0, nombre);
        this.status = status;
        this.vigencia = vigencia;
    }

    public String getCveP()
    {
        return String.format("P%03d", getCve());
    }
    /**
     * @return the status
     */
    public char getStatus()
    {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(char status)
    {
        this.status = status;
    }

    /**
     * @return the vigencia
     */
    public String getVigencia()
    {
        return vigencia;
    }

    /**
     * @param vigencia the vigencia to set
     */
    public void setVigencia(String vigencia)
    {
        this.vigencia = vigencia;
    }
    
}
