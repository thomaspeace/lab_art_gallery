public class Artwork {

//    Properites

    private String title;
    private Artist artist;
    private int price;

//    Constructor

    public Artwork(String title, int price, Artist artist){
        this.title = title;
        this.price = price;
        this.artist = artist;
    }

    public String getArtworkTitle() {
        return this.title;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }



}
