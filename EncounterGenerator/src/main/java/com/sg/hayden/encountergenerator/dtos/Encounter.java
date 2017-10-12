package com.sg.hayden.encountergenerator.dtos;

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
    protected int ChallengeRating;
    protected Environment environment;
    protected ArrayList<String> loot;
    protected ArrayList<Monster> monsters;
    int experiencePoints;
}
