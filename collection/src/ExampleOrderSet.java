import java.util.*;

public class ExampleOrderSet {
    public static void main(String[] args) {
        System.out.println("Ordem aleatório:");
        Set<Serie> series = new HashSet<>(){{
           add(new Serie("Thas 70's show", "Comedy", 25));
           add(new Serie("GOT", "Fantasy", 60));
           add(new Serie("Dark", "Drama", 60));

        }};

        for (Serie serie: series
             ) {
            System.out.println(serie.getName() + " - "+ serie.getGenre() + " - " + serie.getEpisodeTime());
        }

        System.out.println("Ordem de inserção");
        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("Thas 70's show", "Comedy", 25));
            add(new Serie("GOT", "Fantasy", 60));
            add(new Serie("Dark", "Drama", 60));

        }};

        for (Serie serie: series2
        ) {
            System.out.println(serie.getName() + " - "+ serie.getGenre() + " - " + serie.getEpisodeTime());
        }

        System.out.println("Ordem natural (TEMPO DE EPISODIO)");
        Set<Serie> series3 = new TreeSet<>(series);
        for (Serie serie: series3
        ) {
            System.out.println(serie.getName() + " - "+ serie.getGenre() + " - " + serie.getEpisodeTime());
        }

        System.out.println("Ordem NOME/GÊNERO/TEMPOEPISODIO");
        Set<Serie> series4 = new TreeSet<>(new ComparatoNameGenreEpisodeTime());
        series4.addAll(series);
        for (Serie serie: series4
        ) {
            System.out.println(serie.getName() + " - "+ serie.getGenre() + " - " + serie.getEpisodeTime());
        }
    }
}

class Serie implements Comparable<Serie> {
    private String name;
    private String genre;
    private Integer episodeTime;

    public Serie(String name, String genre, Integer episodeTime) {
        this.name = name;
        this.genre = genre;
        this.episodeTime = episodeTime;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getEpisodeTime() {
        return episodeTime;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", episodeTime=" + episodeTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return name.equals(serie.name) && genre.equals(serie.genre) && episodeTime.equals(serie.episodeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, episodeTime);
    }

    @Override
    public int compareTo(Serie o) {
        int episodeTime = Integer.compare(this.getEpisodeTime(), o.getEpisodeTime());
        if(episodeTime != 0)
            return episodeTime;

        return this.getGenre().compareTo(o.getGenre());
    }
}

class ComparatoNameGenreEpisodeTime implements Comparator<Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
        int name = o1.getName().compareTo(o2.getName());

        if(name != 0) return name;

        int genre = o1.getGenre().compareTo(o2.getGenre());
        if(genre != 0) return  genre;

        return Integer.compare(o1.getEpisodeTime(), o2.getEpisodeTime());
    }
}
