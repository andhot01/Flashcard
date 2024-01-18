package com.example.flashcards;

import java.util.List;

public class Logic {
    private Dao dao = new Dao();

    public void loadTutorial(){
        dao.loadTutorial();
    }

    public List<Cards> loadTrivia(){
        List<Cards> cardsTr = dao.loadTrivia();
        return cardsTr;
    }

    public void loadSpanish(){
        dao.loadSpanish();
    }

    public void loadAnki(){
        dao.loadAnki();
    }

    public void loadPost4(){
        dao.loadPost4();
    }

    public void loadPost5(){
        dao.loadPost5();
    }

    public void loadPost6(){
        dao.loadPost6();
    }

    public void loadPost7(){
        dao.loadPost7();
    }
}
