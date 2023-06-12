package S104.N1EX3;


public class ListaOutOfBounds {


    public static void getException(Integer[] list, int position) throws ArrayIndexOutOfBoundsException{

        try{
            System.out.println(list[position]);

        }catch(ArrayIndexOutOfBoundsException e){

            throw new ArrayIndexOutOfBoundsException();
        }

    }



}
