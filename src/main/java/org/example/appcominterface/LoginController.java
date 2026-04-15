package org.example.appcominterface;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class LoginController {
    @FXML
    TextField txtUsuario;
    @FXML
    PasswordField txtSenha;
    @FXML
    Button btnLogin;
    @FXML
    Label saudacao;
    @FXML
    Hyperlink cadastro;

    @FXML
    protected void irParaTelaCadastro() throws IOException{
        HelloApplication.trocadorDeTelas("TelaCadastro.fxml");
    }
    @FXML
    protected void onButtonLoginClick(){
        LoginDAO usuario = new LoginDAO();

        String usuarioDigitado = txtUsuario.getText();
        String senhaDigitado = txtSenha.getText();

        boolean autenticado = usuario.autenticar(usuarioDigitado, senhaDigitado);

        if (autenticado == true){
            saudacao.setText("Usuário e senha corretos!");
        }
        else{
            saudacao.setText("Usuário ou senha incorretos!");
        }
    }

}
