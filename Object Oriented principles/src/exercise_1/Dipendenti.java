package exercise_1;

import enums.Dipartimento;
import interface_personal.OreLavorate;

import java.util.Random;

public class Dipendenti implements OreLavorate {
    //ATTRIBUTI
    private final byte matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    //COSTRUTTORI
    public Dipendenti(Dipartimento dipartimento) {
        Random random = new Random();
        this.matricola = (byte) random.nextInt(100);
        this.stipendio = 0.0;
        this.dipartimento = dipartimento;


    }

    //METODI
    public void calcoloStipendio(double orePresenze, double pagaOraria) {
        this.stipendio = orePresenze * pagaOraria;
        System.out.println("€" + " " + this.stipendio);
    }

    public byte getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendenti{" +
                "Matricola =" + matricola +
                ", Stipendio =" + "€" + " " + stipendio +
                ", Dipartimento ='" + dipartimento + '\'' +
                '}';
    }
}
