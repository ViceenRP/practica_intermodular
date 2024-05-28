/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




package medactema14.practica_intermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class Conexionbbdd {
    // Configuración de la conexión a la base de datos MySQL
    String url = "jdbc:mysql://localhost:3306/practica_intermodular";
    String usuario = "root";
    String contraseña = "Med@c";
    
    // Sentencias SQL    
    String sqlPlaneta = "SELECT * FROM planetas WHERE nombre = '";
    String sqlSol = "SELECT * FROM Sol";
    public String[] conectarConsultaMarte(String planeta){
        String[] marte = new String[8];
        try {
            
            sqlPlaneta += planeta + "'";
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            ResultSet resultados = statement.executeQuery(sqlPlaneta);
            
            while (resultados.next()) {
                // Obtener los valores de las columnas
                marte[0] = resultados.getString("radio");
                marte[1] = resultados.getString("distancia_sol");
                marte[2] = resultados.getString("periodo_orbital");
                marte[3] = resultados.getString("temperatura");
                marte[4] = resultados.getString("tipo");
                marte[5] = resultados.getString("num_satelites");
                marte[6] = resultados.getString("fecha_creacion");
            }
           
            statement.close();
            conexion.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        return marte;
    }
    public String[] conectarConSol(){
        String[] sol = new String[6];
        try{
            Connection conexion = DriverManager.getConnection(url,usuario,contraseña);
            Statement statement = conexion.createStatement();
            ResultSet resultados = statement.executeQuery(sqlSol);
            while (resultados.next()) {
                sol[0] = resultados.getString("tipo");
                sol[1] = resultados.getString("radio");
                sol[2] = resultados.getString("temperatura");
                sol[3] = resultados.getString("distancia_tierra");
                sol[4] = resultados.getString("composicion");
                //.computeIfAbsent
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return sol;
    }
} 

