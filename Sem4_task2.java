import java.util.LinkedList;
import java.util.Scanner;

/*Реализовать консольное приложение, которое:
        Принимает от пользователя строку вида
        text
        сохранить text в связный список.
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
        Работать до тех пор, пока не введен stop
        asd
        [asd]
        cvbn
        [asd, cvbn]
        g
        [asd, cvbn, g]
        print~1
        cvbn
        [asd,g]
        */
public class Sem4_task2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        while (true) {
            System.out.println("Введите текст");
            String st = sn.nextLine();
            if (st.toLowerCase().equals("stop")){
                break;
            } else if (st.contains("print~")){
                int index = Integer.parseInt(st.split("~")[1]);
                System.out.println(list.get(index));
                list.remove(index);
                System.out.println(list);
            } else {
                list.add(st);
            }
        }
        sn.close();
    }
}