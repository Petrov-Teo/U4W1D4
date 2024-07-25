package exercise_2;

import enums.Dipartimento;

public class Dirigente extends Dipendente {


    public Dirigente(Dipartimento dipartimento, double pagaOraria, double oreLavorate) {
        super(dipartimento, pagaOraria, oreLavorate);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }
}
