public class MainSmartTv {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual da TV: " + smartTv.canal);
        System.out.println("Volume atual da TV: " + smartTv.volume);
        System.out.println("----------------------------------");
        smartTv.ligarTv();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(32);
        smartTv.aumentarCanal();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual da TV: " + smartTv.canal);
        System.out.println("Volume atual da TV: " + smartTv.volume);
        System.out.println("----------------------------------");
        smartTv.ligarTv();
        smartTv.diminuirVolume();
        smartTv.diminuirCanal();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual da TV: " + smartTv.canal);
        System.out.println("Volume atual da TV: " + smartTv.volume);
        System.out.println("----------------------------------");
    }
}