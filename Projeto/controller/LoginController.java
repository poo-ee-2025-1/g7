import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class LoginController {

    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;

    private List<Usuario> usuarios;

    public LoginController() {
        // Inicializa a lista de usuários cadastrados no sistema
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("João Silva", "Técnico", 1, "joao@email.com", "1234"));
        usuarios.add(new Usuario("Maria Lima", "Engenheira", 2, "maria@email.com", "abcd"));
    }

    @FXML
    void handleLoginButtonAction(ActionEvent event) {
        String email = emailField.getText();
        String senha = passwordField.getText();
        Usuario usuarioLogado = null;

        // Tenta autenticar o usuário
        for (Usuario u : usuarios) {
            if (u.autenticar(email, senha)) {
                usuarioLogado = u;
                break;
            }
        }

        if (usuarioLogado != null) {
            // Se o login for bem-sucedido, fecha a janela de login e abre a principal
            try {
                // Pega a janela atual (de login) para poder fechá-la
                Stage currentStage = (Stage) emailField.getScene().getWindow();
                currentStage.close();

                // Carrega o FXML da tela principal
                FXMLLoader loader = new FXMLLoader(getClass().getResource("MainApp.fxml"));
                Parent root = loader.load();

                // Pega o controller da nova tela para passar o usuário logado
                MainAppController mainController = loader.getController();
                mainController.initData(usuarioLogado);

                // Abre a nova janela
                Stage mainStage = new Stage();
                mainStage.setTitle("Painel de Monitoramento");
                mainStage.setScene(new Scene(root, 600, 400));
                mainStage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // Se o login falhar, exibe uma mensagem de erro
            statusLabel.setText("Falha no login: email ou senha incorretos.");
        }
    }
}
