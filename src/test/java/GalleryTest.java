import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Artist artist;
    Artwork artwork;
    Gallery gallery;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Picasso");
        artwork = new Artwork("Flower", 100, artist);
        gallery = new Gallery("Tate Modern");
    }

    @Test
    public void canGetGalleryName() {
        String result = gallery.getGalleryName();
        assertThat(result).isEqualTo("Tate Modern");
    }

    @Test
    public void canGetTill() {
        int result = gallery.getTill();
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void canSetTill() {
        gallery.setTill(100);
        int result = gallery.getTill();
        assertThat(result).isEqualTo(100);
    }

    @Test
    public void canAddStock(){
        gallery.addStock(artwork);
        ArrayList<Artwork> result = gallery.getStock();
        assertThat(result.get(0)).isEqualTo(artwork);
    }

    @Test
    public void canGetStock(){
        ArrayList<Artwork> result = gallery.getStock();
        assertThat(result.isEmpty()).isEqualTo(true);
    }

    @Test
    public void canRemoveArtworkFromStock(){
        gallery.addStock(artwork);
        gallery.removeArtworkFromStock("Flower", artwork);
        assertThat(gallery.getStock().isEmpty()).isEqualTo(true);
    }
}
