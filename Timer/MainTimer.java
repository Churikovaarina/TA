package Timer;

import BilaterallyLinkedList.BilaterallyLinkedList;
import CircularLinkedList.CircularLinkedList;
import Filler.RandomFiller;
import UnilaterallyLinkedList.UnilaterallyLinkedList;

public class MainTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        RandomFiller filler = new RandomFiller();
        //BilaterallyLinkedList
        BilaterallyLinkedList<Integer> test1 = new BilaterallyLinkedList<Integer>();
        filler.fill(test1,1000);
        System.out.println("BilaterallyLinkedList: ");
        System.out.println("insertion(front): " + timer.timer(Timer.INSERTION_FRONT,test1) + " ns");
        System.out.println("insertion(a.g.n): " + timer.timer(Timer.INSERTION_AGN,test1) + " ns");
        System.out.println("insertion(end): " + timer.timer(Timer.INSERTION_END,test1) + " ns");
        System.out.println("deletion(front): " + timer.timer(Timer.DELETION_FRONT,test1) + " ns");
        System.out.println("deletion(a.g.n): " + timer.timer(Timer.DELETION_AGN,test1) + " ns");
        System.out.println("deletion(end): " + timer.timer(Timer.DELETION_END,test1) + " ns");
        System.out.println("indexing: " + timer.timer(Timer.INDEXING,test1) + " ns");
        //UnilaterallyLinkedList
        UnilaterallyLinkedList<Integer> test2 = new UnilaterallyLinkedList<Integer>();
        filler.fill(test2,1000);
        System.out.println("\nUnilaterallyLinkedList: ");
        System.out.println("insertion(front): " + timer.timer(Timer.INSERTION_FRONT,test2) + " ns");
        System.out.println("insertion(a.g.n): " + timer.timer(Timer.INSERTION_AGN,test2) + " ns");
        System.out.println("insertion(end): " + timer.timer(Timer.INSERTION_END,test2) + " ns");
        System.out.println("deletion(front): " + timer.timer(Timer.DELETION_FRONT,test2) + " ns");
        System.out.println("deletion(a.g.n): " + timer.timer(Timer.DELETION_AGN,test2) + " ns");
        System.out.println("deletion(end): " + timer.timer(Timer.DELETION_END,test2) + " ns");
        System.out.println("indexing: " + timer.timer(Timer.INDEXING,test2) + " ns");
        //CircularLinkedList
        System.out.println("\nCircularLinkedList: ");
        CircularLinkedList<Integer> test3 = new CircularLinkedList<Integer>();
        filler.fill(test3,1000);
        System.out.println("insertion(front): " + timer.timer(Timer.INSERTION_FRONT,test3) + " ns");
        System.out.println("insertion(a.g.n): " + timer.timer(Timer.INSERTION_AGN,test3) + " ns");
        System.out.println("insertion(end): " + timer.timer(Timer.INSERTION_END,test3) + " ns");
        System.out.println("deletion(front): " + timer.timer(Timer.DELETION_FRONT,test3) + " ns");
        System.out.println("deletion(a.g.n): " + timer.timer(Timer.DELETION_AGN,test3) + " ns");
        System.out.println("deletion(end): " + timer.timer(Timer.DELETION_END,test3) + " ns");
        System.out.println("indexing: " + timer.timer(Timer.INDEXING,test3) + " ns");
    }
}
