/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author USUARIO
 */
public class MultilistaHospitales {
    private NodoDependencia inicio;
    private NodoDependencia listaAuxiliarRemodelacion;
    
    public static class NodoRemodelacion {
        String cveHospitalOriginal;
        String cveHospitalTemporal;
        NodoRemodelacion siguiente;
        
        public NodoRemodelacion(String original, String temporal) {
            this.cveHospitalOriginal = original;
            this.cveHospitalTemporal = temporal;
            this.siguiente = null;
        }
    }

    public void ponerHospitalEnRemodelacion(String cveHospital) {
       
        NodoHospital hospitalARemodelar = buscarHospital(cveHospital);
        
        if (hospitalARemodelar == null) {
            throw new IllegalArgumentException("Hospital no encontrado");
        }
        
        if (estaEnRemodelacion(cveHospital)) {
            throw new IllegalStateException("El hospital ya está en remodelación");
        }
        
        NodoHospital hospitalTemporal = obtenerHospitalTemporal();
        String cveTemporal = hospitalTemporal.getDato().getCveH();
        

        moverPacientes(hospitalARemodelar, hospitalTemporal);
        

        agregarARemodelacion(cveHospital, cveTemporal);
        

        vaciarHospital(hospitalARemodelar);
    }
    
    private boolean estaEnRemodelacion(String cveHospital) {
        NodoRemodelacion aux = listaAuxiliarRemodelacion;
        while (aux != null) {
            if (aux.cveHospitalOriginal.equals(cveHospital)) {
                return true;
            }
            aux = aux.siguiente;
        }
        return false;
    }
    
    private void agregarARemodelacion(String original, String temporal) {
        NodoRemodelacion nuevo = new NodoRemodelacion(original, temporal);
        if (listaAuxiliarRemodelacion == null) {
            listaAuxiliarRemodelacion = nuevo;
        } else {
            NodoRemodelacion actual = listaAuxiliarRemodelacion;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    
    private NodoHospital buscarHospitalEnRemodelacion(String cveOriginal) {
        NodoRemodelacion aux = listaAuxiliarRemodelacion;
        while (aux != null) {
            if (aux.cveHospitalOriginal.equals(cveOriginal)) {
                return buscarHospital(aux.cveHospitalTemporal);
            }
            aux = aux.siguiente;
        }
        return null;
    }
    

    public NodoHospital obtenerHospitalRedireccionado(String cveHospital) {
        if (estaEnRemodelacion(cveHospital)) {
            return buscarHospitalEnRemodelacion(cveHospital);
        }
        return buscarHospital(cveHospital);
    }
    
    private void moverPacientes(NodoHospital origen, NodoHospital destino) {
        NodoEspecialidad especialidadOrigen = origen.getAbajo();
        if (especialidadOrigen == null) return;
        
        do {
            NodoPaciente paciente = especialidadOrigen.getAbajo();
            while (paciente != null) {
                NodoPaciente siguiente = paciente.getSiguiente();
                

                NodoEspecialidad especialidadDestino = buscarOcrearEspecialidadEnHospital(
                    destino, especialidadOrigen.getDato().getCveE());
                

                conectarPacienteAEspecialidad(paciente, especialidadDestino);
                
                paciente = siguiente;
            }
            
            especialidadOrigen = especialidadOrigen.getSiguiente();
        } while (especialidadOrigen != origen.getAbajo());
    }
    
    private void vaciarHospital(NodoHospital hospital) {
        NodoEspecialidad especialidad = hospital.getAbajo();
        if (especialidad == null) return;
        
        do {
            NodoEspecialidad siguiente = especialidad.getSiguiente();
            especialidad.setAbajo(null);
            especialidad = siguiente;
        } while (especialidad != hospital.getAbajo());
    }
    
}
