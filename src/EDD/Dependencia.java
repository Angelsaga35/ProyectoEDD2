/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author aange
 */
public class Dependencia extends Datos
{
    private String cveD;
    private char tipo;

    public Dependencia()
    {
    }

    public Dependencia(String cveD, char tipo, int cve, String nombre)
    {
        super(cve, nombre);
        this.cveD = cveD;
        this.tipo = tipo;
    }
    
    

    /**
     * @return the cveD
     */
    public String getCveD()
    {
        return cveD;
    }

    /**
     * @param cveD the cveD to set
     */
    public void setCveD(String cveD)
    {
        this.cveD = cveD;
    }

    /**
     * @return the tipo
     */
    public char getTipo()
    {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo)
    {
        this.tipo = tipo;
    }
    
    
}
