import java.sql.SQLOutput;
import java.util.*;

public class ExampleOrderCollectionsPairs {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");
        Map<String, Book> myBooks = new HashMap<>(){{
            put("Hawking, Stephen", new Book("Uma Breve História do tempo", 236));
            put("Duhigg, Charles", new Book("O poder do Hábito", 308));
            put("Harari, Yuval Noah", new Book("21 Lições para o século 21", 432));
        }};

        for(Map.Entry<String,Book> book : myBooks.entrySet()){
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        };

        System.out.println("Ordem de inserção");
        Map<String, Book> myBooks2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Book("Uma Breve História do tempo", 236));
            put("Duhigg, Charles", new Book("O poder do Hábito", 308));
            put("Harari, Yuval Noah", new Book("21 Lições para o século 21", 432));
        }};
        for(Map.Entry<String,Book> book : myBooks2.entrySet()){
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        };

        System.out.println("Ordem alfabética autores");
        Map<String, Book> myBooks3 = new TreeMap<>(myBooks);
        for(Map.Entry<String,Book> book : myBooks3.entrySet()){
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        };

        System.out.println("Ordem alfabética do nomes dos livros");
        Set<Map.Entry<String, Book>> myBooks4 = new TreeSet<>(new ComparatorName());
        myBooks4.addAll(myBooks.entrySet());
        System.out.println(myBooks4);

        System.out.println("Ordem por número de página");
    }
}
class Book {
    private String name;
    private Integer pages;

    public Book(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && pages.equals(book.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages);
    }

    public String getName() {
        return name;
    }

    public Integer getPages() {
        return pages;
    }
}

class ComparatorName implements Comparator<Map.Entry<String,Book>>{

    @Override
    public int compare(Map.Entry<String, Book> o1, Map.Entry<String, Book> o2) {
        return o1.getValue().getName().compareToIgnoreCase(o2.getValue().getName());
    }
}