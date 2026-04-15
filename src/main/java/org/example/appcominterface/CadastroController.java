package org.example.appcominterface;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class CadastroController {
    @FXML
    TextField txtNome;
    @FXML
    TextField txtEmail;
    @FXML
    PasswordField Senha;
    @FXML
    PasswordField Confirmar;
    @FXML
    Button btnVoltar;
    @FXML
    Button btnCriar;

    @FXML
    Label erroUsuario;
    @FXML
    Label erroEmail;
    @FXML
    Label erroSenha;
    @FXML
    Label erroConfirmar;

    public void validarCampos(){
        if (txtNome.getText().isBlank()){
            erroUsuario.setText("Preenchimento obrigatório");
            erroUsuario.setVisible(true);
        }
        if (txtEmail.getText().isBlank()){
            erroEmail.setText("Preenchimento obrigatório");
            erroEmail.setVisible(true);
        }
        if (Senha.getText().isBlank()){
            erroSenha.setText("Preenchimento obrigatório");
            erroSenha.setVisible(true);
        }
    }

    @FXML
    protected void onVoltarClick() throws IOException {
        HelloApplication.trocadorDeTelas("hello-view.fxml");
    }
    @FXML
    public void onCriarClick() {

        String usuario = txtNome.getText();
        String email = txtEmail.getText();
        String senha = Senha.getText();
        String confirmarSenha = Confirmar.getText();

        validarCampos();

        CadastroDAO dao = new CadastroDAO();

        /*if(usuario.isBlank()|| senha.isBlank() || email.isBlank() || confirmarSenha.isBlank()){
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Campos obrigatórios");
            alerta.setHeaderText(null);
            alerta.setContentText("Preenchimento dos campos com * é obrigatório");
            alerta.showAndWait();
            return;
        }*/

        if (!(senha.equals(confirmarSenha))){
            /*Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Senhas diferente");
            alerta.setHeaderText(null);
            alerta.setContentText("Senhas não conferem tente novamente");
            alerta.showAndWait();

            return;*/
            erroConfirmar.setText("Senhas não conferem");
        }

    }
}
