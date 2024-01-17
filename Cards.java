package com.example.flashcards;

public class Cards {
    private String question, picture, additional, answer, explanation, theme;
    private final String id;

    public Cards(String question, String picture, String additional, String answer, String explanation, String theme, String id) {
        this.question = question;
        this.picture = picture;
        this.additional = additional;
        this.answer = answer;
        this.explanation = explanation;
        this.theme = theme;
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public String getPicture() {
        return picture;
    }

    public String getAdditional() {
        return additional;
    }

    public String getAnswer() {
        return answer;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getTheme() {
        return theme;
    }

    public String getId() {
        return id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
