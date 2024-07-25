package exercise_2;

import enums.Dipartimento;

import java.util.Random;

//ATTRIBUTI
public abstract class Dipendente {
    private byte matricola;
    private double stipendio;
    private Dipartimento dipartimento;
    private double oreLavorate;
    private double pagaOraria;


    // COSTRUTTORI
    public Dipendente(Dipartimento dipartimento, double pagaOraria, double oreLavorate) {
        Random random = new Random();
        this.matricola = (byte) random.nextInt(100);
        this.dipartimento = dipartimento;
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }

    //METODI
    public double calculateSalary() {
        return stipendio = pagaOraria * oreLavorate;
    }

    public byte getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(double oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    public double getPagaOraria() {
        return pagaOraria;
    }

    public void setPagaOraria(double pagaOraria) {
        this.pagaOraria = pagaOraria;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "Matricola=" + matricola +
                ", Stipendio=" + "€" + stipendio +
                ", Dipartimento=" + dipartimento +
                ", Ore Lavorate=" + oreLavorate +
                ", Paga Oraria=" + "€" + pagaOraria +
                '}';
    }
}
