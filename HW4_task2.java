import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/*2) Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class HW4_task2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(0, 10));
        }
        System.out.println(list);

        while (!list.isEmpty()){
            System.out.println("Введите номер команды: \n" +
                    "1 поместить элемент в конец очереди\n" +
                    "2 показать первый элемент из очереди и удалить его\n" +
                    "3 показать первый элемент из очереди, не удаляя\n"+
                    "4 выход.");

            Integer command = sn.nextInt();
            if(command<1 || command>4) System.out.println("Введите число от 1 до 4");
            if(command==4) break;
            else {
                switch (command){
                    case 1:
                        enqueue(list);
                        break;
                    case 2:
                        System.out.println(dequeue(list));
                        System.out.println(list);
                        break;
                    default:
                        System.out.println(first(list));
                        System.out.println(list);
                    }

                }

            }

        sn.close();
        }


    static void enqueue(LinkedList ll) {
        System.out.println("Введите значение нового элемента:");
        Scanner sc = new Scanner(System.in);
        ll.add(sc.nextInt());
        System.out.println(ll);
    }
    static Integer dequeue(LinkedList<Integer> ll) {
//        Integer a  = ll.get(0);
        return ll.remove(0);
        }

    static Integer first(LinkedList<Integer> ll) {
        return ll.get(0);
    }

}