package com.company;

/**
 * Created by student2 on 18.11.16.
 */
public class Limitintellect extends Intellect {
    private int limit;
    public Limitintellect(int limit){
    this.limit=limit;}

    @Override
    public Command decide(int score){
        if(score<limit)

        return Command.HIT;
        else
            return Command.STAND;
    }
}
