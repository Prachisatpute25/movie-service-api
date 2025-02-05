class MovieService {
    private Movie[] movies = new Movie[100]; // Array to store movies
    private int count = 0; // Keeps track of the number of movies

    // Add a new movie
    public void addMovie(String title, String genre, int releaseYear) {
        if (count < movies.length) {
            movies[count++] = new Movie(title, genre, releaseYear);
            System.out.println("✅ Movie added successfully!");
        } else {
            System.out.println("❌ Movie storage is full!");
        }
    }

    // Display all movies
    public void displayMovies() {
        if (count == 0) {
            System.out.println("No movies available.");
            return;
        }
        System.out.println("\n🎬 Movie List:");
        for (int i = 0; i < count; i++) {
            movies[i].display();
        }
    }

    // Search movie by title
    public void searchMovie(String title) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (movies[i].getTitle().equalsIgnoreCase(title)) {
                movies[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ Movie not found.");
        }
    }

    // Delete movie by ID
    public void deleteMovie(int id) {
        for (int i = 0; i < count; i++) {
            if (movies[i].getId() == id) {
                movies[i] = movies[count - 1]; // Replace with last movie
                movies[count - 1] = null; // Remove duplicate reference
                count--;
                System.out.println("✅ Movie deleted successfully!");
                return;
            }
        }
        System.out.println("❌ Movie not found.");
    }
}
