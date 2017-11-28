/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hayden.encountergenerator.service;

import com.sg.hayden.encountergenerator.dtos.ChallengeRating;
import com.sg.hayden.encountergenerator.dtos.Encounter;
import com.sg.hayden.encountergenerator.dtos.Monster;
import com.sg.hayden.encountergenerator.dtos.Terrain;
import com.sg.hayden.enountergenerator.dao.MonsterDao;

/**
 *
 * @author Hayden
 */
public class EncounterGenerator {
    MonsterDao dao;
    
    public Encounter generateEncounter(Terrain t,ChallengeRating cr ){
        Encounter e = new Encounter();
    int xp = cr.getXP();
    ChallengeRating prev;
    while(e.getXP()<xp){
        Monster m = dao.getMonster(t,xp);
        e.addMonster(m);
    }
        
        return e;
    }
    
    
}
