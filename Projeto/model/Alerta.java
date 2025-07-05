import java.time.LocalDate;

public class Alerta {
    private String mensagem;
    private LocalDate dataAlerta;
    private Equipamento equipamento;

    public Alerta(String mensagem, Equipamento equipamento) {
        this.mensagem = mensagem;
        this.dataAlerta = LocalDate.now();
        this.equipamento = equipamento;
    }

    public String getMensagem() {
        return "Data: " + dataAlerta +
               "\nEquipamento: " + equipamento.nome +
               "\nTipo: " + equipamento.tipo +
               "\nMensagem: " + mensagem;
    }
}
