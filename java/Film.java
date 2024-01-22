import java.util.ArrayList;

public class Film {
    static ArrayList<Film> names = new ArrayList<>();
    static int num = 0;
    private int id;
    private String name;
    private int duration;
    private int date;
    private String genre;
    private String producer;

    public Film(String name, int dur, int date, String genre, String prod) {
        this.name = name;
        this.duration = dur;
        this.date = date;
        this.genre = genre;
        this.producer = prod;
        this.id = ++num;
        names.add(this);
    }

    public void getInfo() {
        System.out.printf("id: %d   Name: %s; Duration: %d min; Date: %d; Genre: %s; Producer: %s\n",
                                   this.id ,this.name, this.duration, this.date, this.genre, this.producer);
    }

    public static void getFilms() {
        for (Film _film : names) {
            _film.getInfo();;
        }
    }

    public static void search(String search) {
        for (Film _film : names) {
            if (_film.name.toLowerCase().contains(search.toLowerCase())) {
                _film.getInfo();
            }
        }
    }
}
