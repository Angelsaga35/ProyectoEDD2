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

    /**
     * @return the cveE
     */
    public String getCveE()
    {
        return cveE;
    }

    /**
     * @param cveE the cveE to set
     */
    public void setCveE(String cveE)
    {
        this.cveE = cveE;
    }

    /**
     * @return the noCamas
     */
    public int getNoCamas()
    {
        return noCamas;
    }

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
        String y="";
        for (int i = 0; i <3-cveE.length() ; i++)
        {
            y+=0;
        }
        y+=cveE;
        y+="E"+y;
        return "Especialidad{" + "cveE=" + y + ", noCamas=" + noCamas + '}';
    }

    
}
