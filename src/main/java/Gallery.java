import java.util.ArrayList;

public class Gallery {

//    Properties

    private String name;
    private int till;
    private ArrayList<Artwork> stock;

//    Constructor

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public String getGalleryName() {
        return this.name;
    }

    public int getTill() {
        return this.till;
    }

    public ArrayList<Artwork> getStock() {
        return this.stock;
    }

    public void setTill(int amount) {
        this.till += amount;
    }

    public void setStock(ArrayList<Artwork> stock) {
        this.stock = stock;

    }
}
