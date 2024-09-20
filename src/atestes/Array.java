package atestes;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<Double> lista = new ArrayList<>(); // obs: para usar com inteiro é necessario usar Integer
        lista.add(2.2);
        lista.add(2.3);
        System.out.println(lista.get(0));
        System.out.println(lista);

        List<Object> listaaa = new ArrayList<>();
        listaaa.add("CU");
        listaaa.add(2);
        listaaa.add(0.1);
        System.out.println(listaaa);


    }
}
