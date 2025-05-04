/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import esctructuras.MultiLista;
import esctructuras.NodoML;

/**
 *
 * @author aange
 */
public class Manipula
{

    MultiLista m = new MultiLista();

    public void insertaD(Dependencia obj, String s[], String nomb)
    {
        NodoML n = new NodoML(obj, nomb);
        s[0] = "Dependencias";
        m.setR(m.inserta(n, m.getR(), s, 0));

    }

    public void insertaH(String nom, Hospitales obj, String s[])
    {
        NodoML n = new NodoML(obj, nom);

        if (s[0] != null)
        {
            s[0] = "Dependencias";
            m.setR(m.inserta(n, m.getR(), s, 0));
        } else
        {
            
            s = new String[2];
            s[0] = "Dependencias";
            NodoML n2 = new NodoML("Hospitales", "Hospitales");
            m.setR(m.inserta(n2, m.getR(), s, 0));
            m.setR(m.inserta(n, m.getR(), s, 0));
        }

    }

    public void insertaE(String nom, Especialidad obj, String s[])
    {
        NodoML n = new NodoML(obj, nom);
        

        if (s[1] != null)
        {
            s[1] = "Hospitales";
            m.setR(m.inserta(n, m.getR(), s, 0));
        } else
        {
            s = new String[3];
            s[1] = "Hospitales";
            NodoML n2 = new NodoML("Especialidades", "Especialidades");
            m.setR(m.inserta(n2, m.getR(), s, 0));
            m.setR(m.inserta(n, m.getR(), s, 0));
            
        }

    }

    public void insertaP(String nom, Paciente obj, String s[])
    {
        NodoML n = new NodoML(obj, nom);
        if (s[3] != null)
        {
            s[3] = "Especialidades";
            m.setR(m.inserta(n, m.getR(), s, 0));
        } else
        {
            s = new String[4];
            s[3] = "Especialidades";
            NodoML n2 = new NodoML("Dependencia", "Dependencia");
            m.setR(m.inserta(n2, m.getR(), s, 0));
            m.setR(m.inserta(n, m.getR(), s, 0));
        }

    }

    public void elimina(String s[], String caso, String opc)
    {
        switch (opc)
        {
            case "Dependencia":
                s[0] = caso;
                NodoML obj1[] = new NodoML[2];
                m.elimina(obj1, m.getR(), s, 0);
                m.setR(obj1[0]);
                break;
            case "Hospitales":

                break;
            case "Especialidades":

                break;
            case "Pacientes":

                break;

            default:
                System.out.println("No se elimino nada");
        }
        s[2] = "EDD";
        NodoML obj1[] = new NodoML[2];

        m.elimina(obj1, m.getR(), s, 0);
        m.setR(obj1[0]);
        System.out.println(obj1[1].getEt());
    }

}
