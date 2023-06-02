package Entidades;

import java.util.Date;

public class Reserva {
    private int numeroQuarto;
    private Date dataEntrada;
    private Date dataSaida;

    public Reserva(int numeroQuarto, Date dataEntrada, Date dataSaida) {
        this.numeroQuarto = numeroQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public int getNumeroQuarto() {return numeroQuarto;}
    public void setNumeroQuarto(int numeroQuarto) {this.numeroQuarto = numeroQuarto;}
    public Date getDataEntrada() {return dataEntrada;}
    public void setDataEntrada(Date dataEntrada) {this.dataEntrada = dataEntrada;}
    public Date getDataSaida() {return dataSaida;}
    public void setDataSaida(Date dataSaida) {this.dataSaida = dataSaida;}
}
