package exercise_2;

import enums.Dipartimento;

public class Main {
    public static void main(String[] args) {
        //DIRIGENTI
        Dirigente dirigenteAmministrativo = new Dirigente(Dipartimento.AMMINISTRAZIONE, 60.00, 150);
        Dirigente dirigenteVendite = new Dirigente(Dipartimento.VENDITA, 50.00, 135);
        Dirigente dirigenteProduzione = new Dirigente(Dipartimento.PRODUZIONE, 40.00, 160);
        //DIPENDENTI FULLTIME
        DipendenteFullTime dipendenteFullTimeAmministrazione = new DipendenteFullTime(Dipartimento.AMMINISTRAZIONE, 14, 150);
        DipendenteFullTime dipendenteFullTimeVendita = new DipendenteFullTime(Dipartimento.VENDITA, 10, 122);
        DipendenteFullTime dipendenteFullTimeProduzione = new DipendenteFullTime(Dipartimento.PRODUZIONE, 9, 165);
        //DIPENDENTI PARTTIME
        DipendentePartTime dipendentePartTimeAmministrazione = new DipendentePartTime(Dipartimento.AMMINISTRAZIONE, 14, 75);
        DipendentePartTime dipendentePartTimeVendita = new DipendentePartTime(Dipartimento.VENDITA, 10, 60);
        DipendentePartTime dipendentePartTimeProduzione = new DipendentePartTime(Dipartimento.PRODUZIONE, 8, 40);

        Dipendente[] dipendentiAssunti = {
                dirigenteAmministrativo,
                dirigenteVendite,
                dirigenteProduzione,
                dipendenteFullTimeAmministrazione,
                dipendenteFullTimeVendita,
                dipendenteFullTimeProduzione,
                dipendentePartTimeAmministrazione,
                dipendentePartTimeVendita,
                dipendentePartTimeProduzione
        };
        double sommaTotaleStipendi = 0;
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        for (int i = 0; i < dipendentiAssunti.length; i++) {
            dipendentiAssunti[i].calculateSalary();
            System.out.println(dipendentiAssunti[i]);

            double stipendio = dipendentiAssunti[i].getStipendio();
            sommaTotaleStipendi += stipendio;
        }
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("il totale degli stipendi di tutti gli dipendenti e: € " + sommaTotaleStipendi);

    }
}