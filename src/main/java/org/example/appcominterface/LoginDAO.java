package org.example.appcominterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    //Metodo que conecta com o banco e autentica se usuario e senha conferem
    public boolean autenticar(String nomeDigitado, String senhaDigitada) {
        String sql = "SELECT senha from usuarios WHERE nome = ?";
        try (
                Connection conn = DatabaseConfig.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, nomeDigitado);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String senhaDoBanco = rs.getString("senha");
                    if (senhaDigitada.equals(senhaDoBanco))
                        return true; //senha correta
                    else {
                        return false;//senha incorreta
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao autenticar usuário", e);
        }
        return false;
    }
}