public class Video extends Media {

    //Klassevariabler
    private String filtypeVid;
    private int laengdeISekunder;
    private String oploesning;
    private String vidFotografNavn;

    @Override
    public void logToConsol(){
        System.out.println("klasse = Video");
        System.out.println("video filtype = " +filtypeVid);
        System.out.println("Laengde = " + laengdeISekunder/60);
        System.out.println("Oploesning = " + oploesning);
        System.out.println("fotografens navn = " + vidFotografNavn);
    }
}
