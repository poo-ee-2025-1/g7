import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Gerador extends Equipamento {
    private double horasUsado = 0.0;
    private double limiteHoras = 500.0;
    private double horasDia = 3.0;
    
    public Gerador(String nome, int ID, LocalDate dataInstalação) {
        super(nome, ID, dataInstalação);
        this.tipo = "Gerador";
        this.vidaUtil = 15;
        this.ultimaVerificação = dataInstalação;
        this.frequenciaManutenções = 12;
    }
    
    @Override
    public void simularFalha() {
        LocalDate dataHoje = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(ultimaVerificação, dataHoje);
        horasUsado = horasUsado + (dias * horasDia);
        
        System.out.println("Horas usadas até agora: " + horasUsado + " h");
        
        if (horasUsado > limiteHoras) {
            System.out.println("Atenção! O limite de horas do " + nome + " ultrapassou o limite permitido em " + (horasUsado - limiteHoras) + " horas! Realizar manutenção urgente!");
            Equipamento.registrarProblema();
        } else {
            System.out.println("Uso do " + nome + " dentro do limite de horas estabelecido!");
        }
    }
}
