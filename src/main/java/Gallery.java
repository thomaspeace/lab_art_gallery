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

    public void addStock(Artwork artwork) {
        this.stock.add(artwork);
    }

    public void removeArtworkFromStock(String nameOfArt, Artwork artwork){
        for(int i = 0; i < this.stock.size(); i++){
            if(this.stock.get(i).getArtworkTitle().equals(nameOfArt)){
                this.stock.remove(i);
            }
        }
    }

    public int stockTake() {
        int totalStock = 0;

        for(int i=0; i < this.stock.size(); i++) {
            totalStock += this.stock.get(i).getPrice();
        }
        return totalStock;
    }

}
