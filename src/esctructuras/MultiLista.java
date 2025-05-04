    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esctructuras;

/**
 *
 * @author Mauro S S
 */
public class MultiLista
{

    private static NodoML r;
    private boolean b= false;

    /**
     * @return the r
     */
    public NodoML getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoML r)
    {
        this.r = r;
    }

    public NodoML inserta(NodoML obj, NodoML r, String[] s,
            int nivel)
    {
        if (nivel == s.length - 1)
        {
            ListasDLC ld = new ListasDLC();
            ld.setR(r);
            ld.insertar(obj);
            b=true;
            return ld.getR();          
        } else
        {
            NodoML aux = busca(r, s[nivel]);
            if (aux != null)
            {
                aux.setAbj(inserta(obj, aux.getAbj(), s, nivel + 1));
                if (b)
                {
                    obj.setArb(aux);
                    b=false;
                }    
            }
            return r;
        }
    }
    
    public void elimina(NodoML[] obj, NodoML r, String[] s,
            int nivel)
    {
        if (nivel == s.length - 1)
        {
            ListasDLC ld = new ListasDLC();
            ld.setR(r);
            obj[1]=ld.elimina(s[nivel]);
            obj[1].setArb(null);
            obj[0]= ld.getR();
        } else
        {
            NodoML aux = busca(r, s[nivel]);
            if (aux != null)
            {
                elimina(obj, aux.getAbj(), s, nivel + 1);
                aux.setAbj(obj[0]);
            }
            obj[0]=r;
        }
    }
    

    public NodoML busca(NodoML r, String s)
    {
        NodoML aux = r;
        while (aux != null)
        {
            if (aux.getEt().equals(s))
            {
                return aux;
            } else
            {
                if (aux.getEt().compareTo(s) > 0)
                {
                    return null;
                }
                aux = aux.getSig();
            }
        }
        return null;
    }

    
    public String desp(NodoML r, String t)
    {
        String s= "";
        while (r != null)
        {
            if (r.getArb()!= null)
            {
                s+=  t+ r.getEt() + "==>" +r.getArb().getEt()+"\n" +desp(r.getAbj(),t+"\t");
            } else
            {
                s+=  t+ r.getEt() + "\n" +desp(r.getAbj(),t+"\t");
            }
            r= r.getSig();
        }
        return s;
    }
}


