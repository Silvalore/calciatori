public class Giocatore {
    private String nome;
    private boolean capitano;
    private int gol;

public Giocatore( String nomeGiocatore, boolean isCapitano, int goal){
    nome= nomeGiocatore;
    capitano=isCapitano;
    gol=goal;
}
public String getNome(){
    return nome;
    }

    public int getGol() {
        return gol;
    }

    public boolean getCapitano() {
        return capitano;
    }

    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
