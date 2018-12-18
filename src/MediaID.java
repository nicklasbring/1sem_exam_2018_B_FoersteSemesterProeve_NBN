import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {

    //Data felt som bruges til at oprette nyt id i generate metoden
    private static int latestId = 100;

    //Metode som generere et nyt id til et medie
    public static int generate() {

        //Opretter en ny txt fil
        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);

        //exception handling
        try {

            //Opretter et nyt filereader objekt og initialiserer det med 'file'
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                //Opretter et nyt scanner objekt og initialiserer det med 'file'
                Scanner scanner = new Scanner(file);
                //latestid = en int som scanneren fanger
                latestId = (int) scanner.nextInt();
            }
            //inkrementere
            latestId++;

            //Opretter et nyt filewriter objekt og initialiserer det med 'file'
            FileWriter fileWriter = new FileWriter(file);
            //Tager latestid og laver den om til en String og skriver den til filen
            fileWriter.write(Integer.toString(latestId));
            //Bruger fileWriters close metode
            fileWriter.close();

            //Hvis undtagelsen fanges, skal systemet printe en stacktrace
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        //Returnere latestid
        return latestId;
    }

}