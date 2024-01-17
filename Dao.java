package com.example.flashcards;

import java.sql.*;
public class Dao {
    private Connection con;

    public Dao() {
        try{
            con = DriverManager.getConnection("jdbc:sqlserver://10.176.111.34:1433;database=FlashcardAndra;userName=CSe2023t_t_3;password=CSe2023tT3#23;encrypt=true;trustServerCertificate=true");

        } catch (SQLException e) {
            System.err.println("Cannot connect to database:" + e.getErrorCode() + e.getMessage());
        }
        System.out.println("Connected to database...");
    }

}
