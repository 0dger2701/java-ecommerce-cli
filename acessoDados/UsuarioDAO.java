package org.example1.acessoDados;

import modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    public Usuario buscarEmail(String email){
        String sql = "SELECT * FROM usuarios WHERE email = ?";
        Usuario usuario = null;

        try (Connection conn = DatabaseConexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql))
    }
}
