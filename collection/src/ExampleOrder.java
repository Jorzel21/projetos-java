import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleOrder {
    public static void main(String[] args) {
        List<Cat> myCats = new ArrayList<>(){{
            add(new Cat("Tom", 15, "Black"));
            add(new Cat("Simba", 6, "Gray"));
            add(new Cat("Simba", 11, "Yellow"));
        }};

        System.out.println("Ordem de inserção:");
        System.out.println(myCats);

        System.out.println("Ordem de aleatória:");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("Ordem de Nome");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("Ordem de Idade");
        myCats.sort(new ComparatorAge());
        System.out.println(myCats);

        System.out.println("Ordem de Cor");
        myCats.sort(new ComparatorColour());
        System.out.println(myCats);

        System.out.println("Ordem de Nome/Cor/Idade");
        myCats.sort(new ComparatorNameColourAge());
        System.out.println(myCats);
    }
}

class Cat implements Comparable<Cat>{
    private String name;
    private Integer age;
    private  String colour;

    public Cat(String name, Integer age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return  this.getName().compareToIgnoreCase(cat.getName());
    }
}

class ComparatorAge implements Comparator<Cat>{

    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class ComparatorColour implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getColour().compareToIgnoreCase(o2.getColour());
    }
}

class ComparatorNameColourAge implements Comparator<Cat>{
    @Override
    public int compare(Cat cat1, Cat cat2) {
        int name = cat1.getName().compareToIgnoreCase(cat2.getName());
        if(name != 0)
            return name;

        int colour = cat1.getColour().compareToIgnoreCase(cat2.getColour());
        if(colour != 0)
            return colour;
        else
            return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}