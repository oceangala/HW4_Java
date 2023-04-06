/*1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 100000 элементов.
Сравните с предыдущим.*/


import java.util.ArrayList;
import java.util.LinkedList;

public class Sem4_task1 {
    public static void main(String[] args) {

        ArrayList <Integer> arrList = new ArrayList<>(100000);
        long startA = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrList.add(0, i);
        }
        long stopA = System.currentTimeMillis();
        System.out.println("ArrayList "+(stopA-startA));


        LinkedList <Integer> arrLink = new LinkedList<>();
        long startL = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrLink.add(0, i);
        }
        long stopL = System.currentTimeMillis();
        System.out.println("LinkedList "+(stopL-startL));
    }
}