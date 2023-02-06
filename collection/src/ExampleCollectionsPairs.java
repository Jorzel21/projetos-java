import com.sun.source.tree.Tree;

import java.util.*;

public class ExampleCollectionsPairs {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos" +
                " e os seus respectivos valores: ");
        Map<String, Double>  carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l:");
        carrosPopulares.put("Gol", 15.2);

        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo onix está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("Onix"));

        System.out.println("Exiba o consumo do uno: ");
        System.out.println(carrosPopulares.get("Uno") + " km/l");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumo =  carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("Exiba o modelo mais econômico e seu consumo:");
        Double maxConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries =  carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries
             ) {
            if(entry.getValue().equals(maxConsumo))
                modeloMaisEficiente = entry.getKey();
        }

        System.out.println("Modelo mais eficiente: "+ modeloMaisEficiente+ " - "
        +maxConsumo + " km/l");

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double minConsumo = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry: entries
        ) {
            if(entry.getValue().equals(minConsumo))
                modeloMenosEficiente = entry.getKey();
        }

        System.out.println("Modelo menos eficiente: "+ modeloMenosEficiente+ " - "
                +minConsumo + " km/l");

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média: "+ (soma/carrosPopulares.size() ));


        System.out.println("Remova os modelos com consumo igual a 15.6 km/l:");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()){
            if (iterator2.next().equals(15.6)) iterator2.remove();
        }

        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem que foram informados: ");

        Map<String, Double>  carrosPopulares2 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares2);

        Map<String, Double>  carrosPopulares3 = new TreeMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares3);

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        System.out.println("Confira se está vazio: "+carrosPopulares.isEmpty());
    }
}
