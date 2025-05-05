/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esctructuras;

/**
 *
 * @author aange
 */
public class NodoML<T>
{

    private T obj;
    private String et;
    private NodoML sig=null, ant=null,abj=null, arb=null;

    public NodoML(T obj, String et)
    {
        this.obj = obj;
        this.et = et;
    }

    

    /**
     * @return the sig
     */
    public NodoML getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(NodoML sig)
    {
        this.sig = sig;
    }

    /**
     * @return the obj
     */
    public T getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T obj)
    {
        this.obj = obj;
    }

    /**
     * @return the et
     */
    public String getEt()
    {
        return et;
    }

    /**
     * @param et the et to set
     */
    public void setEt(String et)
    {
        this.et = et;
    }

    /**
     * @return the abj
     */
    public NodoML getAbj()
    {
        return abj;
    }

    /**
     * @param abj the abj to set
     */
    public void setAbj(NodoML abj)
    {
        this.abj = abj;
    }

    public NodoML getAnt()
    {
        return ant;
    }

    public void setAnt(NodoML ant)
    {
        this.ant = ant;
    }

    /**
     * @return the arrib
     */
    public NodoML getArb()
    {
        return arb;
    }

    /**
     * @param arrib the arrib to set
     */
    public void setArb(NodoML arrib)
    {
        this.arb = arb;
    }
    
    

}