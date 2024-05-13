import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){
        customer = new Customer("John", 100);
        gallery = new Gallery("Abc");
        artist = new Artist("Picasso");
        artwork = new Artwork("Flower",50, artist);
    }

    @Test
    public void canGetName() {
        String result = customer.getCustomerName();
        assertThat(result).isEqualTo("John");
    }

    @Test
    public void canGetWallet() {
        int result = customer.getWallet();
        assertThat(result).isEqualTo(100);
    }

    @Test
    public void canBuyArtworkAndChangeWallet() {
        customer.buyArtwork("Flower", gallery, artwork);
        int result = customer.getWallet();
        assertThat(result).isEqualTo(50);
    }

    @Test
    public void canGetArtCollection() {
        ArrayList<Artwork> result = customer.getArtCollection();
        assertThat(result.isEmpty()).isEqualTo(true);
    }

    @Test
    public void canBuyArtworkAndChangeArtCollection() {
        customer.buyArtwork("Flower", gallery, artwork);
        ArrayList<Artwork> result = customer.getArtCollection();
        assertThat(result.get(0)).isEqualTo(artwork);
    }




}
