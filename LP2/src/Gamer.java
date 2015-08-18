/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2_03g12_lab2;

import java.io.Serializable;

/**
 *
 * @author 41440927
 */
public class Gamer implements Serializable{
    
    private String name;
    private int max_score;
    private int last_score;
    
    public Gamer (String name, int max_score, int last_score){
        this.name=name;
        this.max_score=max_score;
        this.last_score=last_score;
    }
    public int getLast_score(){
        return last_score;
    }
    public int getMax_score(){
        return max_score;
    }
    public String getName(){
        return name;
    }
    
    
    @Override
    public String toString() {
        return "Gamer{" + "name=" + name + ", max_score=" + max_score + ", last_score=" + last_score + '}';
    }
    
    
}
