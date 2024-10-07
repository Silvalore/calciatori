public class Giocatore {
    private String nome;
    private boolean capitano;
    private int gol;

public Giocatore( String nomeGiocatore, boolean isCapitano, int goal){
    nome= nomeGiocatore;
    capitano=isCapitano;
    gol=goal;
}
public Giocatore(String nomeGiocatore){
    nome= nomeGiocatore;
}
    public Giocatore(int goal){
        gol=goal;
    }
    public Giocatore(boolean isCapitano){
        capitano=isCapitano;
    }
    public Giocatore(String nomeGiocatore,boolean isCapitano){
        nome= nomeGiocatore;
        capitano=isCapitano;
    }
    public Giocatore( String nomeGiocatore,int goal){
        nome= nomeGiocatore;
        gol=goal;
    }
    public Giocatore(  boolean isCapitano, int goal){
        capitano=isCapitano;
        gol=goal;
    }
    public Giocatore(){

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
