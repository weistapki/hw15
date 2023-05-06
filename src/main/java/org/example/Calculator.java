package org.example;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java -jar Calculator.jar <value1> <value2> <operation>");
            System.out.println("Operations: +, -, *, /");
            System.exit(1);
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String operation = args[2];

        int result = 0;

        switch (operation) {
            case "+" -> result = sum(a, b);
            case "-" -> result = subtract(a, b);
            case "*" -> result = multiply(a, b);
            case "/" -> result = divide(a, b);
            default -> {
                System.out.println("Invalid operation: " + operation);
                System.exit(1);
            }
        }
        System.out.println(result);
    }
    private static int sum(int a, int b) {
        return a + b;
    }
    private static int subtract(int a, int b) {
        return a - b;
    }
    private static int multiply(int a, int b) {
        return a * b;
    }
    private static int divide(int a, int b) {
        return a / b;
    }
}
