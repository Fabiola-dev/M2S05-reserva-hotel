import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        int numQuarto = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o número do quarto"));
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataEntrada = formato.parse(JOptionPane.showInputDialog(null,"Digite a data de entrada:"));
        Date dataSaida = formato.parse(JOptionPane.showInputDialog(null,"Digite a data de saída:"));

    }
}