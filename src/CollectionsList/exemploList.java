package CollectionsList;

import java.util.LinkedList;
import java.util.List;

public class exemploList {
    public static void main(String[] args) {

        List<Double> notas2 = new LinkedList<Double>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);
        System.out.println("Primeira nota: " + notas2.get(0));
        System.out.println("Remover a nota: " + notas2.remove(0));
        System.out.println(notas2);
    }
}
