package exercise_1;

public class Main {
    public static void main(String[] args) {
        Dipendenti dipendente1 = new Dipendenti(AMMINISTRAZIONE);
        Dipendenti dipendente2 = new Dipendenti();
        Dipendenti dipendente3 = new Dipendenti();
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("dipendente1");
        dipendente1.calcoloStipendio(150, 8.50);
        System.out.println(dipendente1);
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        dipendente2.calcoloStipendio(88, 5.50);
        System.out.println(dipendente2);
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        dipendente1.calcoloStipendio(65, 3.48);
        System.out.println(dipendente3);
    }


}