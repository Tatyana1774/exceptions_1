//Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
package homework2;

import java.sql.Array;

public class mainTwo {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {2, 4, 8, 3, 5, 7, 1, 9, 6};
            double catchedRes1 = intArray[8] / d; //если нужен результат деления не на ноль, тогда в значение d вставить любое другое целое число
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
