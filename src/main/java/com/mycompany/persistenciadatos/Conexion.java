/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistenciadatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ohmyfi
 */
public class Conexion {
    
    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/labtwitter","root","9PM8tv$h#$*e");
            System.out.println(":::CONEXION EXITOSA CON LA BASE DE DATOS:::");
        }catch(SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
    
}