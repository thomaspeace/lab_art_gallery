import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {


    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Picasso");
    }

    @Test
    public void canGetArtistName() {
        String result = artist.getArtistName();
        assertThat(result).isEqualTo("Picasso");
    }

    @Test
    public void canSetArtistName() {
        artist.setArtistName("Van Gogh");
        String result = artist.getArtistName();
        assertThat(result).isEqualTo("Van Gogh");
    }



}
