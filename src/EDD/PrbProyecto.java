/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EDD;

import esctructuras.MultiLista;
import esctructuras.NodoML;

/**
 *
 * @author aange
 */
public class PrbProyecto
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MultiLista m = new MultiLista();
        String s[] =
        {
            "Dependencias"
        };
        Manipula ma = new Manipula();
        Dependencia d = new Dependencia('a', 1, "ISSEMYM");
        s[0] = "Dependencias";
        ma.insertaD(d, s, "ISSEMYM");
        System.out.println(m.desp(m.getR(),  ""));

    }

}
