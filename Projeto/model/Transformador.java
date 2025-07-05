import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Transformador extends Equipamento {
    private double desgasteTotal = 0;
    private double desgastePercentual = 2.5;
    
    public Transformador(String nome, int ID, LocalDate dataInstalação) {
        super(nome, ID, dataInstalação);
        this.tipo = "Transformador";
        this.vidaUtil = 20;
        this.ultimaVerificação = dataInstalação;
        this.frequenciaManutenções = 15;
    }
    
    @Override
    public void simularFalha() {
        LocalDate dataHoje = LocalDate.now();
        long meses = ChronoUnit.MONTHS.between(ultimaVerificação, dataHoje);
        desgasteTotal = desgasteTotal + (meses * desgastePercentual);
        
        System.out.println("Desgaste total até agora: " + desgasteTotal + "%");
        
        if (desgasteTotal >= 100) {
            System.out.println("Transformador estragado! Substituição urgente!");
            Equipamento.registrarProblema();
        } else if (desgasteTotal > 70) {
            System.out.println("Transformador altamente desgastado! Manutenção recomendada!");
            Equipamento.registrarProblema();
        } else {
            System.out.println("Transformador em boas condições!");
        }
    }
}
