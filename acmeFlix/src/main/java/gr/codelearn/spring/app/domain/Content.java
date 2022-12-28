package gr.codelearn.spring.app.domain;


import gr.codelearn.spring.app.domain.enumeration.Genre;

import java.util.ArrayList;

public class Content extends BaseModel{
    private String title;
    private int datePublish;
    private int rating;
    private int ageRestriction;
    private int timeStreamed;
    private ArrayList<Genre> genres;
    private ArrayList<String> actors;

}
