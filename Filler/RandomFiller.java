package Filler;


import Interfaces.LinkedList;

import java.util.Random;

public class RandomFiller {
    Random rand = new Random();
    public Object fill(LinkedList<Integer> list, int upperbound){
        for (int i = 0; i < 5000; i++) {
            int int_random = rand.nextInt(upperbound);
            list.add(int_random);
        }
        return list;
    }
}
