public class Main {

    public static final String SOFTWARE_VERSION = "0.1.0";
    public static final String MEDIA_MAPPE = "media/";

    public static void main(String[] args) {

        /* Her køres test metoden i test klassen
        som her vil vise vores nye medie
         */
        Test.test();

        Media consoleLogTest = new Media();
        consoleLogTest.setName("TesterLigeMetoden");
        consoleLogTest.setFileName("VirkerDenMon");
        consoleLogTest.logToConsol();

        Video consoleTest = new Video();
        consoleTest.logToConsol();

    }
}

