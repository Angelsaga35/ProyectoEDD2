/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esctructuras;

/**
 *
 * @author aange
 */
public class ListasDLC<T>
{

    public NodoML r = null;

    public NodoML getR()
    {
        return r;
    }

    public void setR(NodoML r)
    {
        this.r = r;
    }

    public void insertar(NodoML n)
    {
        //para ver si hay algo que insertar
        if (n != null)
        {
            NodoML aux=r;
            //insertar algo por primera vez
            if (aux == null)
            {
                r = n;//d=n?
                r.setSig(n);
                r.setAnt(n); //para apuntar al mismo dato y poder hacer la circularidad
            } else
            {
                if (n.getEt().compareTo(r.getSig().getEt()) <= 0 || n.getEt().compareTo(r.getEt()) >= 0) //getD=getEt? D=Dato
                {
                    n.setSig(r.getSig());
                    n.setAnt(r); //conectar el que llega
                    r.getSig().setAnt(n); //para puntar al nuevo dato
                    r.setSig(n); //para dar circularidad
                    if (n.getEt().compareTo(r.getEt()) >= 0) //para insertar al final
                    {
                        r = n;
                    }
                } else
                {
                    aux = r.getSig(); //siguiente de r siempre es el primer elemento
                    boolean b = false;
                    while (!b) //para insertar en medio
                    {
                        if (n.getEt().compareTo(aux.getSig().getEt()) < 0)
                        {
                            n.setSig(aux.getSig());
                            n.setAnt(aux);
                            aux.setSig(n);
                            aux.getSig().getSig().setAnt(n);
                            b = true;
                        } else
                        {
                            aux = aux.getSig();
                        }
                    }
                }
            }

        } 
    }

    public NodoML elimina(String et) //(int dato)
    {
        NodoML aux, nodoEliminado=null;
        if (r==null)
        {
            System.out.println("No hay elementos en la lista");
        } else
        {
            //cuando el dato a eliminar es mayor al ultimo elemento de la lista
            if (r.getEt().compareTo(et) <0  || r.getSig().getEt().compareTo(et) > 0) 
            {
                System.out.println("Dato no encontrado desde el inicio de la lista");
                
            } else
            {
                //eliminar el primero de la lista
                if (r.getSig().getEt().equals(et))
                {
                    nodoEliminado=r.getSig();
                    r.setSig(nodoEliminado.getSig());
                    r.getSig().setAnt(r);
                    if (r==nodoEliminado)
                    {
                        r=null;
                    }
                    nodoEliminado.setSig(null);
                    nodoEliminado.setAnt(null);
                } else
                {
                    aux = r.getSig();
                    boolean b=false;
                    while (aux!=r&&!b)
                    {
                        if (aux.getSig().getEt().equals(et))
                        {
                            nodoEliminado=aux.getSig();
                            aux.setSig(nodoEliminado.getSig());
                            aux.getSig().setAnt(aux);
                            if (nodoEliminado==r)
                            {
                                r=aux;
                            }
                            nodoEliminado.setSig(null);
                            nodoEliminado.setAnt(null);
                            b=true;
                        } else
                        {
                            if (aux.getSig().getEt().compareTo(et)>0)
                            {
                                break;
                            } else
                            {
                                aux=aux.getSig();
                            }
                        }
                    }
                    if (!b)
                    {
                        System.out.println("Dato no encontrado en la lista");
                    }
                }
            }
        }
        return nodoEliminado;
    }

    public void recorrido()
    {
        if (r != null)
        {
            NodoML aux = r.getSig();
            do
            {
                System.out.println(aux.getEt());
                aux = aux.getSig();
            } while (aux != r.getSig()); //para dar la circularidad
        } else
        {
            System.out.println("No hay datos en la lista");
        }
    }

    public void recorridoInverso()
    {
        if (r != null)
        {
            NodoML aux = r;
            do
            {
                System.out.println(aux.getEt());
                aux=aux.getAnt();
            } while (aux!=r); //como empezó en r, al llegar a r quiere decir que ya dio la vuelta completa
        } else
        {
            System.out.println("No hay datos en la lsita");
        }
    }

    public String desp()
    {
        String s = "";
        if (r != null)
        {
            NodoML<T> aux = r.getSig();
            do
            {
                s += aux.getEt() + "\t";
                aux = aux.getSig();
            } while (aux != r.getSig());
        } else
        {
            s = "No hay datos";
        }
        return s;
    }
}