public class Customer {

//    Properties

    private String name;
    private int wallet;

//    Constructor

    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
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
//        gallery.setStock(gallery.getStock().remove());
    }

}
