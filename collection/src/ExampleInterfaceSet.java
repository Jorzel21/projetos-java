import java.util.*;

public class ExampleInterfaceSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto de notas e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.5, 5d, 7d, 0d, 2.5));

        System.out.println(notas.toString());

        System.out.println("Confira se a nota 4.5 está na lista: "+ notas.contains(5d));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos valores: "+ soma);
        System.out.println("Exiba a média dos valores: "+ (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        Double soma2 = 0d;
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7)
                iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("APAGUE TODA A LISTA: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Exiba todas as notas nas ordem que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(7.5);
        notas2.add(2d);
        notas2.add(9.5);
        notas2.add(0.5);
        notas2.add(3d);
        notas2.add(4d);
        notas2.add(1d);
        System.out.println(notas2);

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
    }
}
