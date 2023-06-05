package Entidades;

import Excecoes.ExcecaoDominio;

import java.util.Date;

public class Reserva {
    private Date dataEntrada;
    private Date dataSaida;
    private int numeroQuarto;
    public Reserva(Date dataEntrada, Date dataSaida, int numeroQuarto) throws ExcecaoDominio {
        Date dataHoje = new Date();
        if (dataEntrada.before(dataHoje) || dataSaida.before(dataHoje)){
            throw new ExcecaoDominio("Erro: Reservas não podem ser feitas para datas anteriores ao dia de hoje.");
        }
        if (dataSaida.before(dataEntrada)) {
            throw new ExcecaoDominio("Erro: Data de saída não pode ser anterior a data de entrada.");
        }
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.numeroQuarto = numeroQuarto;
    }

    public int getNumeroQuarto() {return numeroQuarto;}
    public void setNumeroQuarto(int numeroQuarto) {this.numeroQuarto = numeroQuarto;}
    public Date getDataEntrada() {return dataEntrada;}
    public void setDataEntrada(Date dataEntrada) {this.dataEntrada = dataEntrada;}
    public Date getDataSaida() {return dataSaida;}
    public void setDataSaida(Date dataSaida) {this.dataSaida = dataSaida;}

    public static void controleReservas(Date dataEntrada, Date dataSaida) {

    }
}
