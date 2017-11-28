package com.sg.hayden.encountergenerator.dtos;

import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hayden
 */
public class Encounter {
    protected double ChallengeRating;
    protected Terrain terrain;
    protected Climate climate;
    protected ArrayList<String> loot;
    protected ArrayList<Monster> monsters = new ArrayList<Monster>();
    int experiencePoints;
    
    public void addMonster(Monster m){       
        monsters.add(m);
    }
    
    public int getXP(){
        int xp = 0;
        for(Monster m:monsters){
            xp+=m.getXP();
        }
        return xp;
    }
}
