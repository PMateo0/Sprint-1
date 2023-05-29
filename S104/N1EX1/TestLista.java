package S104.N1EX1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class TestLista {

    private static ListaMeses listaMeses = new ListaMeses();

    @Test
    public  void assertEqualsSize() {
        assertEquals(listaMeses.getMeses().size(),12);


    }
    @Test
    public  void assertNotNullTry(){
        assertNotNull(listaMeses.getMeses());
    }

    @Test
    public  void assertEqualsTry(){
        assertEquals(listaMeses.getIndex(),"Agosto");
    }
}
