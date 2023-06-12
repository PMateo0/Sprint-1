package S104.N1EX3;

import jdk.jfr.Name;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestListaOutOfBounds {

    int [] lista = {1,2,3};
    @Test
    @Name("index out of bounds by asking a higher number than list size")
    void lanzaError() {
            assertThrows(ArrayIndexOutOfBoundsException.class,()-> ListaOutOfBounds.getInteger(5, lista));
        }
}
