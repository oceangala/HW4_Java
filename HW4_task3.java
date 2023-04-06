import java.util.Scanner;
import java.util.Stack;

//В калькулятор добавьте возможность отменить последнюю операцию.
public class HW4_task3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Stack<Double> myStack = new Stack<>();
        while (true) {
            System.out.print("Введите первое число: ");
            Double a = sn.nextDouble();
            System.out.println();
            //StringBuilder line = new StringBuilder();

            myStack.push(a);

            while (!myStack.isEmpty()) {
                System.out.print("Введите знак арифметического действия или команду Отмена: ");

                String st = sn.next();
                if ((st.toLowerCase().equals("отмена"))) {
                    myStack.pop();
                    if (!myStack.isEmpty())
                    System.out.println(myStack.lastElement());
                    else break;

                } else {
                    System.out.println();
                    System.out.print("Введите число: ");
                    Double b = sn.nextDouble();
                    System.out.println();
                    a = myStack.lastElement();


                    if (st.equals("+")) {
                        System.out.println(a + " + " + b + " = " + (a + b));
                        myStack.push(a + b);
                        System.out.println(myStack.lastElement());
                    }
                    if (st.equals("-")) {
                        System.out.println(a + " - " + b + " = " + (a - b));
                        myStack.push(a - b);
                        System.out.println(myStack.lastElement());
                    }
                    if (st.equals("/")) {
                        System.out.println(a + " / " + b + " = " + (a / b));
                        myStack.push(a / b);
                        System.out.println(myStack.lastElement());
                    }
                    if (st.equals("*")) {
                        System.out.println(a + " * " + b + " = " + (a * b));
                        myStack.push(a * b);
                    }

                }

            }
            System.out.println("Начнем с начала!");
        }
    }
}