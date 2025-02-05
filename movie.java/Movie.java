class Movie {
    private static int idCounter = 1; // Auto-increment ID
    private int id;
    private String title;
    private String genre;
    private int releaseYear;

    // Constructor
    public Movie(String title, String genre, int releaseYear) {
        this.id = idCounter++; // Assign and increment ID
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    // Getters (for accessing movie details)
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getReleaseYear() { return releaseYear; }

    // Display movie details
    public void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Genre: " + genre + ", Year: " + releaseYear);
    }
}
