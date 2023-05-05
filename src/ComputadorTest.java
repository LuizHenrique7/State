import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputadorTest {

        Computador computador;

        @BeforeEach
        public void setUp() { computador = new Computador();}

        @Test
        public void naoDeveLigarComputadorLigado() {
            computador.setEstado(ComputadorEstadoLigado.getInstance());
            assertFalse(computador.ligar());
        }

        @Test
        public void deveLigarComputadorMontado() {
            computador.setEstado(ComputadorEstadoMontado.getInstance());
            assertTrue(computador.ligar());
            assertEquals(ComputadorEstadoLigado.getInstance(), computador.getEstado());
        }

        @Test
        public void deveDesligarigarComputadorLigado() {
            computador.setEstado(ComputadorEstadoLigado.getInstance());
            assertTrue(computador.desligar());
            assertEquals(ComputadorEstadoDesligado.getInstance(), computador.getEstado());
        }

        @Test
        public void deveAtualizarComputadorLigado() {
            computador.setEstado(ComputadorEstadoLigado.getInstance());
            assertTrue(computador.atualizar());
            assertEquals(ComputadorEstadoAtualizado.getInstance(), computador.getEstado());
        }

        @Test
        public void deveSuspenderComputadorLigado() {
            computador.setEstado(ComputadorEstadoLigado.getInstance());
            assertTrue(computador.esperar());
            assertEquals(ComputadorEstadoEspera.getInstance(), computador.getEstado());
        }
}
