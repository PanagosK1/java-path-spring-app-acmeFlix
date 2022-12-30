package gr.codelearn.spring.app.domain;

import org.springframework.context.annotation.Profile;

import java.util.ArrayList;

public class Views extends BaseModel{

    private double sDuration;

    private Profile profile;

    //to-do
    private ArrayList<Content> contentView;

    private Content content;

}