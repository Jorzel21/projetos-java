package StreamAPI;

import java.util.*;
import java.util.function.Function;

public class RefactorOrderMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");
        Map<Integer, Contact> agenda = new HashMap<>(){{
            put(1, new Contact("João", 5555));
            put(5, new Contact("Maria", 1111));
            put(3, new Contact("Pedro", 2222));
        }};

        System.out.println(agenda);

        System.out.println("Ordem de inserção");
        Map<Integer, Contact> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contact("João", 5555));
            put(5, new Contact("Maria", 1111));
            put(3, new Contact("Pedro", 2222));
        }};

        System.out.println(agenda1);

        System.out.println("Ordem de Id");
        Map<Integer, Contact> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contact> entry : agenda2.entrySet()
             ) {
            System.out.println(entry.getKey() + " - "+ entry.getValue().getName());
        }

        System.out.println("Ordem número telefone");
        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>() {
            @Override
            public int compare(Map.Entry<Integer, Contact> contact1, Map.Entry<Integer, Contact> contact2) {
                return Integer.compare(contact1.getValue().getNumber(), contact2.getValue().getNumber());
            }
        });
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contact> entry : set
             ) {
            System.out.println(entry.getValue().getNumber() +" - "+ entry.getValue().getName());
        }
        System.out.println(" ----------- ");
        Set<Map.Entry<Integer, Contact>> set2 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contact>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contact> cont) {
                        return cont.getValue().getNumber();
                    }
                }
        ));
        set2.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contact> entry : set2
        ) {
            System.out.println(entry.getValue().getNumber() +" - "+ entry.getValue().getName());
        }

        System.out.println(" ----------- ");
        Set<Map.Entry<Integer, Contact>> set3 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumber()));
        set3.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contact> entry : set3
        ) {
            System.out.println(entry.getValue().getNumber() +" - "+ entry.getValue().getName());
        }

        System.out.println(" ---------------------------- ");
        System.out.println("Ordem nome de contato");

    }
}
