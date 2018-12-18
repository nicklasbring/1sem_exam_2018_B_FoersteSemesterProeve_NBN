import java.io.File;
import java.time.Instant;
import java.util.Date;

public class Media {

    //Data felter for at oprette et medie
    private int assetId;
    private String name;
    private Date created = new Date();
    private String fileName;

    /* Constructor der der giver et id til et nyt medie.
    Den bruger metoden 'generate' fra MediaId klassen.
    For at få et oprettelsestidspunkt, bruges den
    indbyggede klasse Date
     */
    public Media() {
        assetId = MediaID.generate();
        created = Date.from(Instant.now());
    }

    //Getters and setters for medieopretning
    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    //Metode der printer oplysninger om mediet
    public String toString() {
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}