public class Billede extends Media {

    //Klassevariabler
    private String filtypePic;
    private int bredde;
    private int hoejde;
    private String picFotografNavn;

    @Override
    public void logToConsol(){
        System.out.println("klasse = Billede");
        System.out.println("billede filtype = " + filtypePic);
        System.out.println("pixelBredde = " + bredde);
        System.out.println("pixelHoejde = " + hoejde);
        System.out.println("fotografens navn = " + picFotografNavn);
    }
}
