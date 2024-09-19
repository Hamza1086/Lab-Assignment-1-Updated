
public class Artwork{

    private String title;
    private int yearCreated;
    private Artist artist;

    Artwork(String title, int year, Artist art) {
        this.title = title;
        this.yearCreated = year;
        this.artist = art;
    }

    Artwork(String title, int year) {
        this.title = title;
        this.yearCreated = year;
        this.artist = new Artist("Unknown");
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public String getTitle() {
        return title;
    }

    public void setYearCreated(int y) {
        this.yearCreated = y;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void setArtist(Artist a) {
        this.artist = a;
    }

    public Artist getArtist() {
        return artist;
    }

    public void displayInfo() {
        System.out.println("Title: "+title);
        System.out.println("Year: "+yearCreated);
        System.out.println("Artist Name: "+artist.getName());

    }

    public Artwork createShallowCopy(Artwork other){
    
        Artwork a1 = new Artwork(other.getTitle(),other.getYearCreated(),other.getArtist());
        return a1;   

    }


}


