package org.example1.acessoDados;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConexao {
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.sql.Properties;
    import java.io.InputStream;
    import java.io.FileInputStream;

    public class DatabaseConnection{
        private static Connection connection = null;

        private static Connection getConnection(){
            if(connection == null){
                try{
                    Properties props = new Properties();
                    InputStream input = new FileInputStream("src/main/resources/database.properties");
                    props.load(input);

                    String url = props.getProperty("db.url");
                    connection = DriverManager.getConnection(url);
                    System.out.println("Conexãp com SQLite completa");
                } catch (Expection e) {
                    System.err.println("Erro para conectar com o SQLite: " + e.getMessage())
                }
            }
            return connection;
        }

        public static void closeConnection(){
            if(connection != null) {
                try {
                    connection.close();
                    connection = null;
                } catch (SQLException e) {
                    System.err.println("Erro para fechar s conexão: " + getMessage());
                }
            }
        }
    }
}
