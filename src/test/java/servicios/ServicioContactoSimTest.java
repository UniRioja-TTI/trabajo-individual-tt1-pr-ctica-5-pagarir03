package servicios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import modelo.Entidad;

public class ServicioContactoSimTest {

    @Test
    public void testGetEntitiesNoEsVacio() {
        
        ServicioContactoSim servicio = new ServicioContactoSim();
       
        List<Entidad> lista = servicio.getEntities();
        assertNotNull(lista, "La lista no debería ser nula");
        assertTrue(lista.size() > 0, "La lista debería tener al menos una entidad");
    }

    @Test
    public void testSolicitarSimulationDevuelveUnTokenValido() {
        ServicioContactoSim servicio = new ServicioContactoSim();
       
        int token = servicio.solicitarSimulation(null);
        assertTrue(token > 0, "El token debería ser un número positivo");
    }
}