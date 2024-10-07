import java.util.Scanner;

public class testGiocatore {
    public static void main(String[] args) {
        int scelta;
        Scanner in = new Scanner(System.in);
        Giocatore[] squadra = new Giocatore[10];
        do {
            System.out.println("scegli tra una di queste funzionalità");
            System.out.println("1: aggiungere un giocatore alla squadra, controllando che non ci sia più di un capitano");
            System.out.println("2: visualizzare tutti i giocatori della squadra");
            System.out.println("3: modificare i dati di un giocatore a scelta ");
            System.out.println("4: cancellare un giocatore dalla squadra ");
            System.out.println("5: visualizzare i giocatori che hanno realizzato più di 5 goal.");
            System.out.println("6: visualizzare il nome del capitano");
            System.out.println("7: assegnare il ruolo di capitano in modo casuale se non ancora presente");
            System.out.println("0: fine");
            scelta = in.nextInt();

        } while (scelta != 0);
        switch (scelta) {
            case 1:
                System.out.println("nome giocatore nuovo:");

                break;
            case 2:
                for (int i = 0; i < squadra.length; i++) {
                    System.out.println(squadra[i]);
                }
                break;
            case 3:
                System.out.println("");
                for (int i = 0; i < squadra.length; i++) {

                }

        }
    }
}