

public class Main{

    public static void main(String[] args) {

        Artist artist1 = new Artist("Hamza");

        Artwork art1 = new Artwork("OOP", 2004,artist1);

        Artwork art2 = new Artwork("OOP", 2004);

        art2.setTitle("C Language");
        art2.setYearCreated(2010);

        art1.displayInfo();
        System.out.println("-----");
        art2.displayInfo();
        



    }
}