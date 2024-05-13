import java.util.ArrayList;

public class Customer {

//    Properties

    private String name;
    private int wallet;
    private ArrayList<Artwork> artCollection;

//    Constructor

    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }

    public String getCustomerName() {
        return this.name;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void buyArtwork(String nameOfArt, Gallery gallery, Artwork artwork) {

        this.wallet -= artwork.getPrice();
        gallery.setTill(artwork.getPrice());

        gallery.removeArtworkFromStock(nameOfArt, artwork);

        this.artCollection.add(artwork);

    }

    public ArrayList<Artwork> getArtCollection() {
        return this.artCollection;
    }


}


