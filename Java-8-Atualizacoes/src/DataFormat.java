import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataFormat{
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
    
    //////////////////////////////////////////////////////////////////////////////////////

        LocalDate amanha = LocalDate.of(2025, 3, 3);
        Period periodo = Period.between(hoje, amanha);
        System.out.println(periodo);
    
    //////////////////////////////////////////////////////////////////////////////////////

        int anos = amanha.getYear() - hoje.getYear();
        System.out.println(anos);
    
    //////////////////////////////////////////////////////////////////////////////////////

        LocalDate depoisDeAmanha = amanha.plusDays(1);
        System.out.println(depoisDeAmanha);

    //////////////////////////////////////////////////////////////////////////////////////

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yy");
        String valorFormatado = amanha.format(formatar);
        System.out.println(valorFormatado);

    //////////////////////////////////////////////////////////////////////////////////////

        DateTimeFormatter formatarComHora = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatarComHora));

    }
    
}
