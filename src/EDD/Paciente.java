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
    private String cveP;
    private char status;
    private String vigencia;

    /**
     * @return the cveP
     */
    public String getCveP()
    {
        return cveP;
    }

    /**
     * @param cveP the cveP to set
     */
    public void setCveP(String cveP)
    {
        this.cveP = cveP;
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
