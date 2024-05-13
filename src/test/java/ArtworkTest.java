import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Picasso");
        artwork = new Artwork("Flower",100,artist);
    }

    @Test
    public void canGetArtworkTitle() {
        String result = artwork.getArtworkTitle();
        assertThat(result).isEqualTo("Flower");
    }

    @Test
    public void canGetArtist() {
        Artist result = artwork.getArtist();
        assertThat(result).isEqualTo(artist);
    }

    @Test
    public void canGetPrice() {
        int result = artwork.getPrice();
        assertThat(result).isEqualTo(100);
    }

    @Test
    public void canSetPrice() {
        artwork.setPrice(200);
        int result = artwork.getPrice();
        assertThat(result).isEqualTo(200);
    }






}
