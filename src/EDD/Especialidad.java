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
    private String cveE;
    private int noCamas;
    static int contE = 0;

    public Especialidad(int noCamas, int cve, String nombre)
    {
        super(cve, nombre);
        contE++;
        this.cveE = String.valueOf(contE);
        String y = "E";
        for (int i = 0; i < 3 - cveE.length(); i++)
        {
            y += 0;
        }
        y += cveE;
        this.cveE = y;
        this.noCamas = noCamas;
    }


    public Especialidad(int noCamas, String nombre)
    {
        super(0, nombre);
        this.noCamas = noCamas;
    }

    public String getCveE()
    {
        return cveE;
    }

    /**
     * @return the noCamas
     */
    public int getNoCamas()
    {
        return noCamas;
    }

    public void setNoCamas(int noCamas)
    {
        this.noCamas = noCamas;
    }

    @Override
    public String toString()
    {
        String y = "";
        for (int i = 0; i < 3 - cveE.length(); i++)
        {
            y += 0;
        }
        y += cveE;
        y += "E" + y;
        return "Especialidad{" + "cveE=" + y + ", noCamas=" + noCamas + '}';
    }
}