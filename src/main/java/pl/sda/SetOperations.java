package pl.sda;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {
    public static void main(String[] args) {



        System.out.println("HashSet:");
        Set<String> set = new HashSet<String>();
        fillSet(set);
        showSet(set);

        System.out.println();

        System.out.println("TreeSet:");
        set = new TreeSet<String>(new SizeComparator());
        fillSet(set);
        showSet(set);
        System.out.println();

        System.out.println("LinkedHashSet:");
        set = new LinkedHashSet<String>();
        fillSet(set);
        showSet(set);
    }

    /**
     * *Syświetla wszystkie elementy zbioru korzystając z for-each
     *
     * @param set zbiór do wyświetlenia
     */

    private static void showSet(Set<String> set) {
        for (String string : set) {
            System.out.println(string);
        }


    }


    /**
     * Wstawia do zbioru elementy: Adam,Beata,Celina,Dariusz,Eliza,Fraciszek
     *
     * @param set zbiór do uzupełnienia
     */

    private static void fillSet(Set<String> set) {

        set.add("Beata");
        set.add("Adam");
        set.add("Celina");
        set.add("Dariusz");
        set.add("Franciszek");
        set.add("Eliza");


    }
}
