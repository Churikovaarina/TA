package Timer;

import Interfaces.LinkedList;

public class Timer {

    public final static int INSERTION_FRONT = 1;
    public final static int INSERTION_AGN = 2;
    public final static int INSERTION_END = 3;
    public final static int DELETION_FRONT = 4;
    public final static int DELETION_AGN = 5;
    public final static int DELETION_END = 6;
    public final static int INDEXING = 7;

    public double timer(int Method, LinkedList<Integer> list) {

        double startTime;
        double endTime;

        switch (Method) {
            case INSERTION_FRONT -> {
                startTime = System.nanoTime();
                for (int i = 1; i <=1000 ; i++) {
                    list.addFirst(7);
                }
                endTime = System.nanoTime();
            }
            case INSERTION_AGN -> {
                startTime = System.nanoTime();
                for (int i = 1; i <=1000 ; i++) {
                    list.addAt(50,0);
                }
                endTime = System.nanoTime();
            }
            case INSERTION_END -> {
                startTime = System.nanoTime();
                for (int i = 1; i <=1000 ; i++) {
                    list.add(10);
                }
                endTime = System.nanoTime();
            }
            case DELETION_FRONT -> {
                startTime = System.nanoTime();
                for (int i = 1; i <=1000 ; i++) {
                    list.deleteFirst();
                }
                endTime = System.nanoTime();
            }
            case DELETION_AGN -> {
                startTime = System.nanoTime();
                for (int i = 1; i <=1000 ; i++) {
                    list.deleteAt(500);
                }
                endTime = System.nanoTime();
            }
            case DELETION_END -> {
                startTime = System.nanoTime();
                for (int i = 1; i <=1000 ; i++) {
                    list.deleteLast();
                }
                endTime = System.nanoTime();
            }
            case INDEXING -> {
                startTime = System.nanoTime();
                for (int i = 1; i <=1000 ; i++) {
                    list.indexOf(12);
                }
                endTime = System.nanoTime();
            }
            default -> {
                startTime = -1;
                endTime = 0;
            }
        }

        return endTime-startTime;
    }
}

