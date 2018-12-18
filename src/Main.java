import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
        primaryStage.setTitle("MediaGui");
        primaryStage.setScene(new Scene(root, 525, 275));
        primaryStage.show();
    }

    public static final String SOFTWARE_VERSION = "0.1.0";
    public static final String MEDIA_MAPPE = "media/";

    public static void main(String[] args) {

        launch(args);

        /* Her køres test metoden i test klassen
        som her vil vise vores nye medie
         */
        Test.test();

        //Her tester jeg din oprindelige metode 'logToConsol' fra media klassen
        Media consoleLogTest = new Media();
        consoleLogTest.setName("TesterLigeMetoden");
        consoleLogTest.setFileName("VirkerDenMon");
        consoleLogTest.logToConsol();

        //Her tester jeg jeg min override metode 'logToConsol'
        Video consoleTest = new Video();
        consoleTest.logToConsol();

        //Her tester jeg min metode der viser alle filnavnene fra "media/"
        logMediaFolder(MEDIA_MAPPE);

        //Her tester jeg metoden som returnere filerne som et array
        readMediaFolder(MEDIA_MAPPE);

        //Her tester jeg min metode der, sortere og instantiere objekter
        readMediaFolderExt(MEDIA_MAPPE);
    }

    //Dette er min metode der viser alle filnavnene fra mappen 'media'
    public static void logMediaFolder(String folderNavn) {

        File folder = new File(folderNavn);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {
                folderNavn = listOfFiles[i].getName();
                System.out.println(folderNavn);

            }
        }
    }

    /*Min metode der tager filerne fra mappen 'media' og
    returnere dem som et fil array
     */
    public static File[] readMediaFolder(String folderNavn) {

        File folder = new File(folderNavn);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {
                folderNavn = listOfFiles[i].getName();
                System.out.println(folderNavn);
            }
        }
        return listOfFiles;
    }


    /* Metode der kigger alle filerne igennem og instantiere dem
    alt afhængigt af hvilken objekt type de tilhører.
   */
    public static File[] readMediaFolderExt(String folderNavn) {

        File folder = new File(folderNavn);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {
                String strings = listOfFiles[i].toString();

                if (strings.contains(".jpg") || strings.contains(".png") || strings.contains(".gif")) {
                    Billede billede = new Billede();
                    System.out.println("Nyt Billede objekt blev instantieret");
                } else if (strings.contains(".mp4") || strings.contains(".m4v") || strings.contains(".mov")) {
                    Video video = new Video();
                    System.out.println("Nyt Video objekt blev instantieret");
                } else if (strings.contains(".txt")) {
                    Artikel artikel = new Artikel();
                    System.out.println("Nyt Artikel objekt blev instantieret");
                } else System.out.println("Fil ikke godnkendt");

            }

        }
        return listOfFiles;
    }

}
