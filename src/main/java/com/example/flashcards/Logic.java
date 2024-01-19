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
/*gentages for resterende 6 metoder fra dao
På samme måde laves metoder tilsvarende til dao for redigering og sletning af kort
 */
}
