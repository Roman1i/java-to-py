import java.util.Scanner;

public class Logic {
    private static boolean flag = true;
    private static Scanner scan = new Scanner(System.in);

    public static void Start() {

        Film PF = new Film("Pulp Fiction", 165, 1994, "Criminal, Drama", "Quentin Tarantino");
        Film Alien = new Film("Alien", 111, 1979, "Sci-Fi, Horror", "Ridley Scott");
        Film VDN = new Film("Vase de noces", 80, 1974, "Horror, Drama", "Thierry Zeno");

        while (flag) {
            System.out.print("1. Поиск\n2. Список фильмов\n3. Выйти\n\nВведите номер: ");
            Integer operation = scan.nextInt();
            switch (operation) {
                case (1):
                    System.out.print("Введите запрос:");
                    Scanner sc = new Scanner(System.in);
                    String request = sc.nextLine();
                    Film.search(request);
                    continue;
                case (2):
                    Film.getFilms();
                    continue;
                case (3):
                    flag = false;
                    continue;
            }
        }
    }
}
