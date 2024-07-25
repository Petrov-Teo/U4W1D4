package exercise_2;

import enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {


    public DipendenteFullTime(Dipartimento dipartimento, double pagaOraria, double oreLavorate) {
        super(dipartimento, pagaOraria, oreLavorate);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }
}
