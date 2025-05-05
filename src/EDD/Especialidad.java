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

<<<<<<< HEAD
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

    /**
     * @return the cveE
     */
    public String getCveE()
=======
    public Especialidad()
>>>>>>> Max
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

<<<<<<< HEAD
    /**
     * @param noCamas the noCamas to set
     */
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

=======
    private int noCamas;
>>>>>>> Max
}
