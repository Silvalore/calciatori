public class Giocatore {
    private String nome;
    private boolean capitano;
    private int gol;

    public Giocatore(String nomeGiocatore, boolean isCapitano, int goal) {
        setNome(nome);
        setCapitano(capitano);
        setGol(gol);
    }

    public Giocatore(String nomeGiocatore) {
        setNome(nome);
    }

    public Giocatore(int goal) {
        setGol(gol);
    }

    public Giocatore(boolean isCapitano) {
        setCapitano(capitano);
    }

    public Giocatore(String nomeGiocatore, boolean isCapitano) {
        setNome(nome);
        setCapitano(capitano);
    }

    public Giocatore(String nomeGiocatore, int goal) {
        setNome(nome);
        setGol(gol);
    }

    public Giocatore(boolean isCapitano, int goal) {
        setCapitano(capitano);
        setGol(gol);
    }

    public Giocatore() {
        setNome(nome);
        setCapitano(capitano);
        setGol(gol);

    }

    public String getNome() {
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
        if(gol<0){

        }
        else{
            setGol(gol);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
