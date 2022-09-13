
import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // ARRAYS
        // ======================================================
        // 1. Create an array of characters of your SURNAME.
        char[] apple = { 'V', 'A', 'L', 'E', 'N', 'C', 'I','A' };

        // 2. Display each character of your SURNAME on each line.
        for (int i = 0; i < apple.length; i++) {
            System.out.println(apple[i]);
        }

        // 3. Display the first character of your SURNAME.
        System.out.println(apple[0]);

        // 4. Display the last character of your SURNAME.
        System.out.println(apple[7]);

        // 5. Display the character of your SURNAME in reverse order.
        for (int i = apple.length - 1; i >= 0; i--) {
            System.out.println(apple[i]);
        }

        // Linked List
        // ======================================================
         // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
        LinkedList<String> studentnumber = new LinkedList<>();

        studentnumber.add("1");
        studentnumber.add("0");
        studentnumber.add("2");
        studentnumber.add("8");
        studentnumber.add("3");
        studentnumber.add("0");

        System.out.println(studentnumber);

        // 2. Add an asterisk (*) to the head/front of the Linked list.
        studentnumber.addFirst("*");

        // System.out.println(Surname);

        // 3. Add an asterisk (*) to the tail/end of the Linked list.
        studentnumber.addLast("*");

        // 4. Display the Linked list.
        System.out.print(studentnumber);

        // 5. Display the last character of the Linked list
        System.out.println(studentnumber.get(7));

        // 6. Replace the last character of the Linked list with "!";
        studentnumber.set(7, "!");

        // 7. Remove the first character of the Linked list
        studentnumber.remove(0);

        // 8. Display the LinkedList
        System.out.println(studentnumber);

        // Stack
        // ======================================================
        // 1. Create a Stack of characters of your SURNAME

        Stack<String> Surname = new Stack<>();

        Surname.push("V");
        Surname.push("A");
        Surname.push("L");
        Surname.push("E");
        Surname.push("N");
        Surname.push("C");
        Surname.push("I");
        Surname.push("A");

        // 2. Print the Stack
        System.out.println(Surname);

         // 3. Add a "INF214" to the stack.
        Surname.push(" ");
        Surname.push("I");
        Surname.push("N");
        Surname.push("F");
        Surname.push("2");
        Surname.push("1");
        Surname.push("4");

        // 4. Print the Stack
        System.out.println(Surname);

         // 5. Remove "INF214"
        Surname.pop();
        Surname.pop();
        Surname.pop();
        Surname.pop();
        Surname.pop();
        Surname.pop();

        // 6. Add "CCDATRCL-INF214".
        Surname.push("C");
        Surname.push("C");
        Surname.push("D");
        Surname.push("A");
        Surname.push("T");
        Surname.push("R");
        Surname.push("C");
        Surname.push("L");
        Surname.push("-");
        Surname.push("I");
        Surname.push("N");
        Surname.push("F");
        Surname.push("2");
        Surname.push("1");
        Surname.push("4");

        // 6. Print the Stack
        System.out.println(Surname);
    }
}
