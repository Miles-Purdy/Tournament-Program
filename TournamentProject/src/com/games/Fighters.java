package com.games;

import java.util.ArrayList;

public class Fighters {

    private String name;
    private int id;


    public Fighters (String name,int id) {
        this.name = getClass().getName();
        this.id = id;
    }

    public String getName(){return name;}

    public int getId (){return id;}



}
