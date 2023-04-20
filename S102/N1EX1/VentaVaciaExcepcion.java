package S102.N1EX1;

public class VentaVaciaExcepcion extends IndexOutOfBoundsException {

        public VentaVaciaExcepcion() {

            super("The sales queue is empty");
        }


}
