package servicios;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

public class ServicioEnviarEmailsTest {

    @Test
    public void testEnviarEmailDevuelveTrue() {
        ServicioEnviarEmailsImp servicio = new ServicioEnviarEmailsImp(LoggerFactory.getLogger(ServicioEnviarEmailsImp.class));
        
        boolean resultado = servicio.enviarEmail(null, "test@example.com");
        
        assertTrue(resultado, "El envío de email debería devolver true");
    }
}