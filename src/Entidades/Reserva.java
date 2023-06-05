package Entidades;

import Excecoes.ExcecaoDominio;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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


    public static long qdadeDiasDeEstadia(Date dataSaida, Date dataEntrada) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        long diferenca = dataSaida.getTime() - dataEntrada.getTime();

        TimeUnit time = TimeUnit.DAYS;
        long noitesEstadia = time.convert(diferenca, TimeUnit.MILLISECONDS);
        return noitesEstadia;
    }

    @Override
    public String toString() {
        return "Reserva:\n " +
                "Número do quarto: " + numeroQuarto +
                "\n Data de entrada: " + dataEntrada +
                "\n Data de saida=" + dataSaida;
    }

//    public void imprimirReservas() {
//        ArrayList<Reserva> reservas = new ArrayList<>();
//        if (reservas.size() == 0) System.out.println("Lista de reservas vazia.");
//        else for (int i = 0; i < reservas.size(); i++) {
//            Reserva reserva = (Reserva) reservas.get(i);
//            System.out.println("\t" + i + ": " + "Reserva:\n " +
//                    "\n Número do quarto: " + reserva.getNumeroQuarto() +
//                    "\n Data de entrada: " + reserva.getDataEntrada() +
//                    "\n Data de saida: " + reserva.getDataSaida() +
//                    "\n Período de estadia: " );
//        }
//        System.out.println();
//    }

    public void imprimirInfoReserva() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Reserva:\n " +
                "Número do quarto: " + numeroQuarto +
                "\n Data de entrada: " + formato.format(dataEntrada) +
                "\n Data de saida: " + formato.format(dataSaida) +
                "\n Período da estadia: " + qdadeDiasDeEstadia(dataSaida, dataEntrada) + " noites."
        );

    }
}
