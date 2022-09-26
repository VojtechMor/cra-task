package com.vojtech.cra.item;

public class MyFact {
    private String subject;
    private String adjective;
    private Matches matches;

    // Setters and Getters generated for all properties
    public Matches getMatches() {
        return matches;
    }

    public void setMatches(Matches awesomeThings) {
        this.matches = awesomeThings;
    }

    public String getSubject() {
        return subject;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }
}
