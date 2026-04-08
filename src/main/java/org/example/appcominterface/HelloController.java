package org.example.appcominterface;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField txtUsuario;
    @FXML
    PasswordField txtSenha;
    @FXML
    Button btnLogin;
    @FXML
    Label saudacao;

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
