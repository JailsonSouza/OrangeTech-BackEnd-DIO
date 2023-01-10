
public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 89;

    public void ligarTv() {
        ligada = true;
    }

    public void desligarTv() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }
    
    public void diminuirVolume() {
        volume--;
    }
    
    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }
    
    public int mudarCanal(int novoCanal) {
        canal = novoCanal;
        return canal;
    }

}
