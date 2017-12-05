/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hayden.enountergenerator.dao;

import com.sg.hayden.encountergenerator.dtos.Monster;
import com.sg.hayden.encountergenerator.dtos.Terrain;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Hayden
 */
public class MonsterDaoMySQL implements MonsterDao{
    
     private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Monster getMonster(Terrain t, int XP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
