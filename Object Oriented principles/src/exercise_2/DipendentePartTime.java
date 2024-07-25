package exercise_2;

import enums.Dipartimento;

public class DipendentePartTime extends Dipendente {


    public DipendentePartTime(Dipartimento dipartimento, double pagaOraria, double oreLavorate) {
        super(dipartimento, pagaOraria, oreLavorate);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }
}
