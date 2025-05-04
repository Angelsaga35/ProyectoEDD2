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
    static int contP = 0;

    public Paciente( char status, String vigencia, int cve, String nombre)
    {
        super(cve, nombre);
        contP++;
        this.cveP = String.valueOf(contP);
        String y="P";
        for (int i = 0; i <3-cveP.length() ; i++)
        {
            y+=0;
        }
        y+=cveP;
        this.cveP = y;
        this.status = status;
        this.vigencia = vigencia;
    }
    
    

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

    @Override
    public void setNombre(String nombre)
    {
        super.setNombre(nombre); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombre()
    {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCve(int cve)
    {
        super.setCve(cve); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCve()
    {
        return super.getCve(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString()
    {
        
        
        
        return "Paciente{" + "cveP=" + cveP + ", status=" + status + ", vigencia=" + vigencia + '}';
    }

   
    
    
    
}
