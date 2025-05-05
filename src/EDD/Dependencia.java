/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author aange
 */
public class Dependencia extends Datos
{
    private char tipo;

    public Dependencia()
    {
    }

    public Dependencia(char tipo, String nombre)
    {
        super(0, nombre);
        this.tipo = tipo;
    }

    public String getCveD()
    {
        return String.format("D%03d", getCve());
    }

    /**
     * @return the tipo
     */
    public char getTipo()
    {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo)
    {
        this.tipo = tipo;
    }
    
    
}
