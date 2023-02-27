public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 1;

    public SmartTV () {

    }
    
    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligarDesligar(){
        setLigada(!ligada);
    }

    public int aumentarDiminuirVolume(int volumeAtual) {
        setVolume(volumeAtual);
        return volume;
    }

    public int mudarCanal(int numCanal){
        setCanal(numCanal);
        return canal;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ligada: " + isLigada() + " Canal: " + getCanal() + " Volume: " + getVolume();
    }
}
