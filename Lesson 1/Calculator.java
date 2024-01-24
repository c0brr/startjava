public class Calculator {
    public static void main(String[] args) {
        int num1 = 27;
        int num2 = 3;
        char operation = '^';
        if (operation == '+') {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 / num2));
        } else if (operation == '%') {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 % num2));
        } else if (operation == '^') {
            int copyNum1 = num1;
            for (int i = 1; i < num2; i++) {
                copyNum1 *= num1;
            }
            System.out.println(num1 + " " + operation + " " + num2 + " = " + copyNum1);
        }
    }
}