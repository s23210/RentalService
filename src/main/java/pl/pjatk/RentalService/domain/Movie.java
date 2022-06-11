package pl.pjatk.RentalService.domain;

public class Movie {
    private Integer id;
    private String title;
    private String description;
    private Genres genre;
    private Boolean isAvailable = false;

    public Movie(Integer id, String title, String description, Genres genre, Boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public Movie() {
    }

    public Movie(Integer id, String title, String description, Genres genre) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Enum getGenre() {
        return genre;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
