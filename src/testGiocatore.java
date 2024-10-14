import java.util.Scanner;

public class TestGiocatore {
    static Giocatore [] squadra = new Giocatore [100];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int indice = 0;
        int scelta=0;
        int goal;
        int sugador;
        String nome;
        Boolean capitano;
        do{
            System.out.println("1 - aggiungere un giocatore alla squadra");
            System.out.println("2 - visualizzare tutti i giocatori della squadra");
            System.out.println("3 - modificare i dati di un giocatore a scelta");
            System.out.println("4 - cancellare un giocatore dalla squadra");
            System.out.println("5 - visualizzare i giocatori che hanno realizzato più di 5 goal.");
            System.out.println("6 - visualizzare il nome del capitano");
            System.out.println("7 - assegnare il ruolo di capitano in modo casuale se non ancora presente");
            System.out.println("0 - ESCI");
            scelta=in.nextInt();

            switch(scelta) {
                case 1:
                    System.out.println("dammi numero goal");
                    goal = in.nextInt();
                    if(goal<0){
                        System.out.println("i goal non possono essere negativi");
                        break;
                    }else {
                        in.nextLine();
                        System.out.println("dammi nome");
                        nome = in.nextLine();
                        in.nextLine();
                        System.out.println("dimmi se è capitano(true/false)");
                        capitano = in.nextBoolean();
                        in.nextLine();
                        aggiuntaGiocatore(goal, nome, capitano, indice);
                        indice++;
                        break;
                    }
                case 2:
                    for (int i = 0; i < indice; i++) {
                        System.out.println(stampa(i));
                    }

                    break;
                case 3:
                    System.out.println("di quale giocatore vorresti modificare i dati?");
                    sugador = in.nextInt();
                    System.out.println("dammi nuovo numero goal");
                    goal = in.nextInt();
                    if(goal<0){
                        System.out.println("i goal non possono essere negativi");
                        break;
                    }else {
                        in.nextLine();
                        System.out.println("dammi nuovo nome");
                        nome = in.nextLine();
                        in.nextLine();
                        System.out.println("dimmi se è capitano(true/false)");
                        capitano = in.nextBoolean();
                        in.nextLine();
                        modifica(sugador, goal, nome, capitano);
                        break;
                    }
                case 4:

                    break;
                case 5:

                case 6 :
                    System.out.println(trovaCapitano(squadra, indice));
                    break;
                case 7 :

                case 8 :
                    System.out.println("arrivederci");
                    break;

            }
        }while (scelta !=0);
    }



    public static void aggiuntaGiocatore(int Goal, String Nome, Boolean Capitano, int indice){
        squadra [indice] = new Giocatore(Goal,Nome,Capitano);
    }
    public static String stampa(int i){
        String giocatore="";
        giocatore=giocatore+squadra [i].getNome() + "\t" + squadra [i].getGol() + "\t" +squadra [i].getCapitano() + "\t";
        return giocatore;
    }
    public static void modifica(int giocatore, int nuovoGoal, String nuovoNome, Boolean nuovoCapitano){
        squadra[giocatore].setGol(nuovoGoal);
        squadra[giocatore].setNome(nuovoNome);
        squadra[giocatore].setCapitano(nuovoCapitano);
    }
    public void cancellazione(){

    }
    public static String trovaCapitano(Giocatore[]gt, int indice){
        String capitan="";
        for(int i=0; i<indice; i++){
            if(gt[i].getCapitano()) {
                capitan = capitan + gt[i].getNome() + " è il capitano";
            }else{
                capitan = capitan +"capitano non trovato";
            }
        }return capitan;
    }
}

