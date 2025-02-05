import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieService movieService = new MovieService();

        while (true) {
            System.out.println("\n🎥 Movie Management System 🎥");
            System.out.println("1. Add Movie");
            System.out.println("2. View All Movies");
            System.out.println("3. Search Movie");
            System.out.println("4. Delete Movie");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Movie Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Release Year: ");
                    int year = scanner.nextInt();
                    movieService.addMovie(title, genre, year);
                    break;
                case 2:
                    movieService.displayMovies();
                    break;
                case 3:
                    System.out.print("Enter Movie Title to Search: ");
                    String searchTitle = scanner.nextLine();
                    movieService.searchMovie(searchTitle);
                    break;
                case 4:
                    System.out.print("Enter Movie ID to Delete: ");
                    int id = scanner.nextInt();
                    movieService.deleteMovie(id);
                    break;
                case 5:
                    System.out.println("📽️ Exiting... Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}
public static void main(String[] args) {
    Movie m = new Movie("Inception", "Sci-Fi", 2010);
    m.display();
}
