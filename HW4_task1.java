import java.util.LinkedList;
import java.util.Random;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void),
который вернет “перевернутый” список.
 */
public class HW4_task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++)  ll.add(rand.nextInt(0, 10));
        System.out.println(ll);
        System.out.println(reverse(ll));
    }
    static LinkedList<Integer> reverse(LinkedList<Integer> ll) {
        LinkedList<Integer> newLL = new LinkedList<>();
        for (int i = ll.size()-1; i >=0; i--) {
                newLL.add(ll.get(i));
            }
        return newLL;
    }
}