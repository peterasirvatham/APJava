package edu.basic;

public class JavaOperatorPrecedence {

	public static void main(String[] args) {
        // 1. Parentheses ()
        int result1 = (2 + 3) * 4;
        System.out.println("1. Parentheses (): " + result1); // 20

        // 2. Postfix ++ --
        int x = 5;
        int result2 = x++;
        System.out.println("2. Postfix ++: x=" + x + ", result=" + result2); // x=6, result=5

        // 3. Unary ++ -- + - ~ !
        int a = 10;
        boolean flag = false;
        System.out.println("3. Unary ++, ! : ++a = " + (++a) + ", !flag = " + (!flag)); // 11, true

        // 4. Multiplicative *, /, %
        int result4 = 10 * 2 / 4 % 3; // (10*2)=20 → 20/4=5 → 5%3=2
        System.out.println("4. Multiplicative *, /, %: " + result4); // 2

        // 5. Additive +, -
        int result5 = 8 + 4 - 3; // 9
        System.out.println("5. Additive +, -: " + result5); // 9

        // 6. Shift <<, >>, >>>
        int result6 = 8 >> 1; // 4
        System.out.println("6. Shift >>: " + result6); // 4

        // 7. Relational <, <=, >, >=, instanceof
        boolean result7 = 5 < 10;
        String str = "Hello";
        System.out.println("7. Relational <, instanceof: " + result7 + ", " + (str instanceof String)); // true, true

        // 8. Equality ==, !=
        int b = 5;
        System.out.println("8. Equality ==: " + (a == b)); // false

        // 9. Bitwise AND &
        int result9 = 5 & 3; // 1
        System.out.println("9. Bitwise AND &: " + result9);

        // 10. Bitwise XOR ^
        int result10 = 5 ^ 3; // 6
        System.out.println("10. Bitwise XOR ^: " + result10);

        // 11. Bitwise OR |
        int result11 = 5 | 3; // 7
        System.out.println("11. Bitwise OR |: " + result11);

        // 12. Logical AND &&
        boolean result12 = (5 > 3) && (2 < 4);
        System.out.println("12. Logical AND &&: " + result12); // true

        // 13. Logical OR ||
        boolean result13 = (5 > 10) || (2 < 4);
        System.out.println("13. Logical OR ||: " + result13); // true

        // 14. Ternary ?:
        int max = (a > b) ? a : b;
        System.out.println("14. Ternary ?: max = " + max); // a=11, b=5 → 11

        // 15. Assignment =, +=, -=, etc.
        int z = 10;
        z += 5;
        System.out.println("15. Assignment +=: " + z); // 15

 
    }
}
