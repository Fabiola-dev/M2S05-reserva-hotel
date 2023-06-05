import Entidades.Reserva;
import Excecoes.ExcecaoDominio;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        //formato para datas de entrada
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataEntrada = formato.parse(JOptionPane.showInputDialog(null,"Digite a data de entrada (dd/mm/aaaa):"));
            Date dataSaida = formato.parse(JOptionPane.showInputDialog(null,"Digite a data de saída (dd/mm/aaaa):"));
            int numQuarto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do quarto"));

            Reserva novaReserva = new Reserva(dataEntrada, dataSaida, numQuarto);
        } catch (ExcecaoDominio e){
            System.out.println(e.getMessage());
        } catch (ParseException e){
            System.out.println("Erro: formato da data errado.");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
}