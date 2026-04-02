package servicios;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import interfaces.InterfazContactoSim;
import modelo.Entidad;
import modelo.DatosSolicitud;
import modelo.DatosSimulation;

@Service
public class ServicioContactoSim implements InterfazContactoSim {

    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        return (int) (Math.random() * 10000);
    }

    @Override
    public List<Entidad> getEntities() {
        List<Entidad> lista = new ArrayList<>();
        
       
        Entidad e1 = new Entidad();
        e1.setId(1);
        e1.setName("Procesador Cuántico");
        lista.add(e1);
        
        
        Entidad e2 = new Entidad();
        e2.setId(2);
        e2.setName("Simulador Atmosférico");
        lista.add(e2);
        
        return lista;
    }
    

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return null; 
    }

    @Override
    public boolean isValidEntityId(int id) {
        return true;
    }
}