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

}
