import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PainelEletrico extends Equipamento {
    private boolean poeiraAcumulada;
    
    public PainelEletrico(String nome, int ID, LocalDate dataInstalação) {
        super(nome, ID, dataInstalação);
        this.tipo = "Painel Elétrico";
        this.vidaUtil = 15;
        this.ultimaVerificação = dataInstalação;
        this.frequenciaManutenções = 12;
        this.poeiraAcumulada = false;
    }
    
    @Override
    public void simularFalha () {
        LocalDate dataHoje = LocalDate.now();
        long meses = ChronoUnit.MONTHS.between(ultimaVerificação, dataHoje);
        
        if (meses > 6) {
            poeiraAcumulada = true;
            System.out.println("Atenção! Limpeza do painel elétrico solicitada!");
            Equipamento.registrarProblema();
        } else {
            System.out.println("Limpeza do painel elétrico em dia!");
        }
    }
}
