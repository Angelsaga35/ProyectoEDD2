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
//        Dependenicas
        
         NodoML nC = new NodoML("Dependencias", "Dependencias");
         NodoML nC1 = new NodoML("Hospitales", "Hospitales");
         NodoML nC2 = new NodoML("Especialidades", "Especialidades");
         NodoML nC3 = new NodoML("Pacientes", "Pacientes");
//        Dependenicas
         NodoML n1 = new NodoML("ISSEMYM", "ISSEMYM");
        NodoML n2 = new NodoML("ISEM", "ISEM");
        NodoML n3 = new NodoML("IMSS", "IMSS");
//        Hospitales
        NodoML n4 = new NodoML("Adolfo López Mateos", "Adolfo López Mateos");
        NodoML n16 = new NodoML("Mónica Pretelini Sáenz", "Mónica Pretelini Sáenz");
        NodoML n17 = new NodoML("Nicolás San Juan", "Nicolás San Juan");
        NodoML n15 = new NodoML("José Vicente Villada", "José Vicente Villada");
        NodoML n5 = new NodoML("José María Rodríguez", "José María Rodríguez");
        NodoML n6 = new NodoML("FIL", "FIL");
//        Especialidad
        NodoML n7 = new NodoML("CON", "CON");
        NodoML n8 = new NodoML("CHE", "CHE");
        NodoML n9 = new NodoML("ODO", "ODO");
//        Pacientes
        NodoML n10 = new NodoML("ISW", "ISW");
        NodoML n11 = new NodoML("IPI", "IPI");
        NodoML n12 = new NodoML("IPL", "IPL");
        NodoML n13 = new NodoML("EDD", "EDD");
        NodoML n14 = new NodoML("PRG", "PRG");
        
        MultiLista m = new MultiLista();
        
        String s[]={"Dependencias"};
        m.setR(m.inserta(nC, m.getR(), s, 0));
        m.setR(m.inserta(nC1, m.getR(), s, 0));
        m.setR(m.inserta(nC2, m.getR(), s, 0));
        m.setR(m.inserta(nC3, m.getR(), s, 0));
        System.out.println(m.desp(m.getR(),  ""));
        s= new String[2];
        
        s[0]="Dependencias";
        m.setR(m.inserta(n1, m.getR(), s, 0));
        m.setR(m.inserta(n2, m.getR(), s, 0));
        m.setR(m.inserta(n3, m.getR(), s, 0));
        System.out.println(m.desp(m.getR(),  ""));
        s[1]="Hospitales";
        m.setR(m.inserta(n4, m.getR(), s, 0));
        m.setR(m.inserta(n16, m.getR(), s, 0));
        m.setR(m.inserta(n17, m.getR(), s, 0));
        m.setR(m.inserta(n15, m.getR(), s, 0));
        m.setR(m.inserta(n5, m.getR(), s, 0));
        m.setR(m.inserta(n6, m.getR(), s, 0));
        s= new String[3];
            s[2]="Especialidades";
        m.setR(m.inserta(n7, m.getR(), s, 0));
        m.setR(m.inserta(n8, m.getR(), s, 0));
        m.setR(m.inserta(n9, m.getR(), s, 0));
        s= new String[4];
        s[3]="Pacientes";
        m.setR(m.inserta(n10, m.getR(), s, 0));
        m.setR(m.inserta(n11, m.getR(), s, 0));
        m.setR(m.inserta(n12, m.getR(), s, 0));
        
Manipula ma = new Manipula();
Dependencia d = new Dependencia("0001", 'a', 1, "juan");
ma.insertaD("Dependencia", d );

        
    }
    
}
