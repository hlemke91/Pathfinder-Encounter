/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hayden.enountergenerator.dao;

import com.sg.hayden.encountergenerator.dtos.Monster;
import com.sg.hayden.encountergenerator.dtos.Terrain;

/**
 *
 * @author Hayden
 */
public interface MonsterDao {
    public Monster getMonster(Terrain t, int XP);
}
