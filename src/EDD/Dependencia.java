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
    static int cont = 0;

    public Dependencia()
    {
    }

    public Dependencia(char tipo, int cve, String nombre)
    {

        super(cve, nombre);
        cont++;
        this.cveD = String.valueOf(cont);
        String y = "D";
        for (int i = 0; i < 3 - cveD.length(); i++)
        {
            y += 0;
        }
        y += cveD;
        this.cveD = y;
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

    @Override
    public String toString()
    {
        String y = "";
        for (int i = 0; i < 3 - cveD.length(); i++)
        {
            y += 0;
        }
        y += cveD;
        y += "D" + y;
        return "Dependencia{" + "cveD=" + y + ", tipo=" + tipo + '}';
    }

}
