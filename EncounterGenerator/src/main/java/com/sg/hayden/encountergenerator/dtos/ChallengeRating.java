/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hayden.encountergenerator.dtos;

/**
 *
 * @author Hayden
 */
public enum ChallengeRating {

    ONE(1,400),TWO(2,600),THREE(3,800),FOUR(4,1200),FIVE(5,1600),SIX(6,2400),SEVEN(7,3200),EIGHT(8,4800),NINE(9,6400),
    TEN(10,9600),ELEVEN(11,12800),TWELVE(12,19200),THIRTEEN(13,25600),FOURTEEN(14,38400),FIFTEEN(25,51200),SIXTEEN(16,76800),
    SEVENTEEN(17,102400),EIGHTEEN(18,153600),NINTEEN(19,204800),TWENTY(20,307200),TWENTYONE(21,409600),TWENTYTWO(22,614400),TWENTYTHREE(23,819200),
    TWENTYFOUR(24,1228800),TWENTYFIVE(25,1638400),TWENTYSIX(26,2457600),TWENTYSEVEN(27,3276800),TWENTYEIGHT(28,4915200),TWENTYNINE(29,6553600),THIRTY(30,9830400);

   private int number;
    private int XP;


ChallengeRating(int num,int experience){
    this.number=num;
    this.XP=experience;
}

public int getXP(){
return XP;
}

public int getNumber(){
    return number;
}
}
