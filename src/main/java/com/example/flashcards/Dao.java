package com.example.flashcards;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {
    private Connection con;
    private int totalCardsT, tCTr, tCS, tCA, tC4, tC5, tC6, tC7;
    private List<Cards> cardsT, cardsTr, cardsS, cardsA, cards4, cards5, cards6, cards7;

    public Dao() {
        try{
            con = DriverManager.getConnection("jdbc:sqlserver://10.176.111.34:1433;database=FlashcardAndra;userName=CSe2023t_t_3;password=CSe2023tT3#23;encrypt=true;trustServerCertificate=true");

        } catch (SQLException e) {
            System.err.println("Cannot connect to database:" + e.getErrorCode() + e.getMessage());
        }
        System.out.println("Connected to database...");

        this.cardsT = new ArrayList<>();
        this.cardsTr = new ArrayList<>();
        this.cardsS = new ArrayList<>();
        this.cardsA = new ArrayList<>();
        this.cards4 = new ArrayList<>();
        this.cards5 = new ArrayList<>();
        this.cards6 = new ArrayList<>();
        this.cards7 = new ArrayList<>();
    }

    public List<Cards> loadTutorial(){
        try{
            Statement database = con.createStatement();
            String sql = "SELECT * FROM Cards";
            ResultSet rs = database.executeQuery(sql);

            while (rs.next()) {
                String question     = rs.getString("question");
                String picture      = rs.getString("picture");
                String additional   = rs.getString("additional");
                String answer       = rs.getString("answer");
                String explanation  = rs.getString("explanation");
                String theme        = rs.getString("theme");
                String id           = rs.getString("id");

                Cards card = new Cards(question, picture, additional, answer, explanation, theme, id);
                cardsT.add(card);
                totalCardsT++;
            }
        } catch (SQLException e){
            System.out.println("Error");
        }
        return cardsT;
    }

    public List<Cards> loadTrivia(){
        try{
            Statement database = con.createStatement();
            String sql = "SELECT * FROM Post1";
            ResultSet rs = database.executeQuery(sql);

            while (rs.next()) {
                String question     = rs.getString("question");
                String picture      = rs.getString("picture");
                String additional   = rs.getString("additional");
                String answer       = rs.getString("answer");
                String explanation  = rs.getString("explanation");
                String theme        = rs.getString("theme");
                String id           = rs.getString("id");

                Cards card = new Cards(question, picture, additional, answer, explanation, theme, id);
                cardsTr.add(card);
                tCTr++;
            }
        } catch (SQLException e){
            System.out.println("Error");
        }
        return cardsTr;
    }
/*samme kode gentages for de resterende 6 tabeller, med tabel navn og tilsvarende counter og arraylist navn
på samme skulle der være 16 forskellige metoder til at opdatere og slette kort i de forskellige sæt
 */

}
