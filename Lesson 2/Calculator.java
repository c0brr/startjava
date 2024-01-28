class Calculator {
    private int num1;
    private int num2;
    private char operation;
    private int result;
    private boolean isOperationAvalible = true;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        switch (operation) {
            case '+': 
                result = num1 + num2;
                break;
            case '-': 
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("\nДанная операция не поддерживается");
                isOperationAvalible = false;
        }
        if (isOperationAvalible == true) {
            System.out.println("\nРезультат: " + result);
        }
        System.out.println();
    }
}