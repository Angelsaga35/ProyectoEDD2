/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esctructuras;

/**
 *
 * @author aange
 */
public class Nodo<T>
{

    private T obj;
    private String et;
    private Nodo sig = null, ant = null;

    public Nodo(T obj, String et)
    {
        this.obj = obj;
        this.et = et;
    }

    /**
     * @return the sig
     */
    public Nodo getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Nodo sig)
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
    public Nodo getAnt()
    {
        return ant;
    }

    public void setAnt(Nodo ant)
    {
        this.ant = ant;
    }

}
