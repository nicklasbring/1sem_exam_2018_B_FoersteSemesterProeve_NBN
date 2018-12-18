import javafx.scene.image.Image;
import javax.imageio.ImageTypeSpecifier;

public class Artikel extends Media {

    //Klassevariabler
    private String forfatterNavn;
    private String artikeltekst;
    private Image billede;

    @Override
    public void logToConsol() {
        System.out.println("klasse = Artikel");
        System.out.println("forfatterens navn  = " + forfatterNavn);
        System.out.println("artikeltekst = " + artikeltekst);
        System.out.println("billede = " + billede);
    }

}
