package exercise_1;

import enums.Dipartimento;

public class Main {
    public static void main(String[] args) {
        Dipendenti dipendente1 = new Dipendenti(Dipartimento.AMMINISTRAZIONE);
        Dipendenti dipendente2 = new Dipendenti(Dipartimento.VENDITA);
        Dipendenti dipendente3 = new Dipendenti(Dipartimento.PRODUZIONE);
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("dipendente1");
        dipendente1.calcoloStipendio(150, 8.50);
        System.out.println(dipendente1);
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("dipendente2");
        dipendente2.calcoloStipendio(88, 5.50);
        System.out.println(dipendente2);
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("dipendente3");
        dipendente3.calcoloStipendio(65, 3.48);
        System.out.println(dipendente3);
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");

        Dipendenti[] dipendentiArray = {dipendente1, dipendente2, dipendente3};

        for (int i = 0; i < dipendentiArray.length; i++) {
            System.out.println(dipendentiArray[i]);
        }
        System.out.println(dipendente1.getStipendio() + dipendente2.getStipendio() + dipendente3.getStipendio());

    }


}