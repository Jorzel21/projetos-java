import java.util.*;

public class ExampleList {
    public static void main(String[] args) {
        System.out.println("Criando uma lista de doubles");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(7.5);
        notas.add(9d);
        notas.add(2d);
        notas.add(4.5);
        notas.add(0d);
        notas.add(8.5);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 7.5: "+ notas.indexOf(7.5));

        System.out.println("Adicione na lista a nota 8.0 na posição 4.  ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 4.5 pela nota 6.0  ");

        notas.set(notas.indexOf(4.5), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 4.5 está na lista: "+ notas.contains(4.5));


        System.out.println("Exiba a terceira nota adicionada: "+ notas.get(2));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: "+ soma);
        System.out.println("Exiba a média dos valores: "+ (soma/notas.size()));

        System.out.println("Remova a nota 0: "+ soma);
        notas.remove(0d);
        System.out.println(notas);

        notas.remove(0);
        System.out.println("Remova a nota da posição 0");
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


    }
}
