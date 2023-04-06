/*Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
asd
zxc
qwe
print
qwe
zxc
asd
[]
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Sem4_task3 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        Scanner sn = new Scanner(System.in);
        String st = "";

        while (true){
            System.out.println("Введите строку");
            st = sn.nextLine();
            if (st.equals("print")){
//                for (int i = dq.size()-1; i >= 0; i--) {
//                    System.out.println(dq.removeLast());
//                }
                while (!dq.isEmpty()){
                    System.out.println(dq.removeLast());
                }
                break;
            } else {
                dq.addLast(st);
            }

        }
        sn.close();
    }
}